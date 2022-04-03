package algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class P15650 {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    /* 문제 설명 */
    /*
https://www.acmicpc.net/problem/15650
1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
고른 수열은 오름차순이어야 한다.

중복 없이
순서 상관 없이
     */

    /* input 예시 */
    /*
4 2
     */

    /* 문제 접근 방법 */
    /*

     */

    /* 문제 주요 변수 */
    static int N;
    static int M;
    static int[] selected;

    /* input */
    static void input() {
        N = scan.nextInt();
        M = scan.nextInt();
        selected = new int[M];
    }

    static void rec_func(int index, int start) {
        if (index == M) {
            for (int i = 0; i < M; i++) {
                sb.append(selected[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = start; i < N; i++) {
            selected[index] = i + 1;
            rec_func(index + 1, i + 1);
            selected[index] = 0;
        }
    }

    /* solve problem */
    static void pro() {
        rec_func(0, 0);
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
