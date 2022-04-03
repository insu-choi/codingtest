package algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class P9663 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    /* 문제 설명 */
    /*
N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
     */

    /* input 예시 */
    /*
8
     */

    /* output 예시 */
    /*
92
     */

    /* 문제 접근 방법 */
    /*
N 최대값 15
15!에 가지치기(?)
     */

    /* 문제 주요 변수 */
    static int N;
    static int[] selected;
    static int answer = 0;
    /* input */
    static void input() {
        N = scan.nextInt();
        selected = new int[N];
    }

    static boolean isValid(int index, int i) {
        for (int j = 0; j < index; j++) {
            if (selected[j] == i)
                return false;
            if (Math.abs(j - index) == Math.abs(selected[j] - i))
                return false;
        }
        return true;
    }

    static void rec_func(int index) {
        if (index == N) {
            answer++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isValid(index, i)) {
                selected[index] = i;
                rec_func(index + 1);
                selected[index] = 0;
            }
        }
    }

    /* solve problem */
    static void pro() {
        rec_func(0);
        sb.append(answer);
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
