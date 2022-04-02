package algorithm.baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class PBase {
    static FastReader scan = new FastReader();
    static StringBuilder sb = new StringBuilder();

    /* 문제 설명 */
    /*

     */

    /* input 예시 */
    /*

     */

    /* 문제 접근 방법 */
    /*

     */

    /* 문제 주요 변수 */
    static int N;

    /* input */
    static void input() {

    }

    /* solve problem */
    static void pro() {

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
