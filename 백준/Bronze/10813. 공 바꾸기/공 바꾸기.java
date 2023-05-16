import java.util.*;
import java.io.*;
import java.util.stream.IntStream;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a  = br.readLine().split(" ");
        Integer[] b = new Integer[2];
        for(int i =0; i <2; i++){
            b[i] = Integer.parseInt(a[i]);
        }
        Integer t = b[1];
        Integer x ;
        Integer y;
        Integer[] lst = new Integer[b[0]+1];
        for (int i =0; i<=b[0]; i++) lst[i] = i;
        for(int i =0; i <t; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x = Integer.parseInt(st.nextToken());
            y =  Integer.parseInt(st.nextToken());
            Integer temp = lst[x];
            lst[x] = lst[y];
            lst[y] = temp;
        }
        for(int i =1; i<lst.length;i ++) System.out.print(lst[i]+" ");

    }
}

