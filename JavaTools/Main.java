import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;
import java.util.*;
import java.util.Map.Entry;
import java.io.*;
import java.util.regex.Pattern;
import GuavaTools.*;


public class Main {
    /* Run:
        * Diamond
     */
    static class FastReader{

        BufferedReader br;
        StringTokenizer st;

        public FastReader(){
            try{
                br = new BufferedReader(new FileReader("input.txt"));
                PrintStream out = new PrintStream(new FileOutputStream("output.txt"));
                System.setOut(out);
            } catch (Exception e){
                br = new BufferedReader(new InputStreamReader(System.in));
            }
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() { return Integer.parseInt(next()); }

        long nextLong() { return Long.parseLong(next()); }

        double nextDouble() { return Double.parseDouble(next());  }
    
        String nextLine() {
            String str = "";
            try {
                 str = br.readLine();
            }
            catch (IOException e) {
                 e.printStackTrace();
            }
            return str;
        }
    }
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        
    //    Guava i = new Guava();
      
    //    FastReader scan =new FastReader();


        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println("Runtime : " + totalTime);
        
    }    
}
