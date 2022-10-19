// https://onlinejudge.org/index.php?option=com_onlinejudge&Itemid=8&page=show_problem&problem=1492
// 10551 - Basic Remains

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class BasicRemains {
    public static void main(String[] args) {
        BasicRemains ob = new BasicRemains();
        ob.run();
    }

    public void run() {
        while (true) {
            int base = nextInt();
            if (base == 0) break;
            BigInteger p = new BigInteger(next(), base);
            BigInteger m = new BigInteger(next(), base);
            out.println(p.mod(m).toString(base));
        }
        out.close();
    }


    // ------------------

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st;
    PrintWriter out = new PrintWriter(System.out);

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

}
