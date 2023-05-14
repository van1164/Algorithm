import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] first = br.readLine().split(" ");
        Integer[] lst= new Integer[2];
        lst[0] = Integer.parseInt(first[0]);
        lst[1] = Integer.parseInt(first[1]);
        Integer[] box = new Integer[lst[0]+1];
        Arrays.fill(box,0);
        for(int i=0; i<lst[1]; i++){
            String[] second = br.readLine().split(" ");
            Integer[] secondint = Arrays.stream(second).map(Integer::parseInt).toArray(Integer[]::new);
            for(int j = secondint[0]; j<=secondint[1]; j++ ) box[j] = secondint[2];
        }

        for(int i =1; i <box.length; i++) System.out.print(box[i]+" ");

    }
}