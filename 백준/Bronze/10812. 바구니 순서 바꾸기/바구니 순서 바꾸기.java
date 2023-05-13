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
        Deque<Integer> deque = new ArrayDeque<>();
        Integer[] lst = IntStream.range(1,b[0]+1).boxed().toArray(Integer[]::new);
        deque.addAll(List.of(lst));
        for(int i = 0 ; i<t; i++){
            Integer[] inp  = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).boxed().toArray(Integer[]::new);

            Deque<Integer> first = new ArrayDeque<>();
            Deque<Integer> last = new ArrayDeque<>();
            for(int j=0; j<inp[0]-1; j++)first.offerFirst(deque.poll());
            for(int j = inp[1]; j<b[0]; j++) last.offerFirst(deque.pollLast());
            int iter = inp[2]-inp[0];
            for(int j =0; j<iter; j++) deque.offerLast(deque.poll());

            for(Integer x : first) deque.offerFirst(x);
            for(Integer x : last ) deque.offerLast(x);

        }
        for(Integer x : deque) System.out.print(x.toString()+" ");


    }
}

