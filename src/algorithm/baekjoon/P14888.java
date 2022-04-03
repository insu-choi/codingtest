package algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class P14888 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    /* 문제 설명 */
    /*
N개의 수와 N-1개의 연산자가 주어졌을 때,
만들 수 있는 식의 결과가 최대인 것과 최소인 것을 구하는 프로그램을 작성하시오.
     */

    /* input 예시 */
    /*
2
5 6
0 0 1 0
     */

    /* output 예시 */
    /*
30
30
     */

    /* 문제 접근 방법 */
    /*
N은 최대 11, 연산자 개수는 최대 10,
중복 없이 순서있게 10! = 약 360만
     */

    /* 문제 주요 변수 */
    static int N;
    static int[] numbers;
    // + - * /
    static int[] operations;

    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;

    /* input */
    static void input() {
        N = scan.nextInt();
        numbers = new int[N];
        for (int i = 0; i < N; i++) {
            numbers[i] = scan.nextInt();
        }
        operations = new int[4];
        for (int i = 0; i < 4; i++) {
            operations[i] = scan.nextInt();
        }
    }

    static int calculation(int a, int b, int oper) {
        if (oper == 0) {
            return a + b;
        }
        else
        if (oper == 1)
            return a - b;
        else
        if (oper == 2)
            return a * b;
        else
            return a / b;
    }

    static void rec_func(int index, int sum) {
        if (index == N - 1) {
            max = Math.max(max, sum);
            min = Math.min(min, sum);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operations[i] > 0) {
                operations[i]--;
                rec_func(index + 1, calculation(sum, numbers[index + 1], i));
                operations[i]++;
            }
        }
    }

    /* solve problem */
    static void pro() {
        rec_func(0, numbers[0]);
        sb.append(max).append("\n").append(min);
    }

    public static void main(String[] args) {
        input();
        pro();
        System.out.println(sb.toString());
    }


    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public FastReader(String s) throws FileNotFoundException {
            br = new BufferedReader(new FileReader(new File(s)));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }
}
