import java.util.ArrayList;
import java.util.List;

public class p1 {
    public static void main(String[] args){
        List<Integer> elements = new ArrayList<>();

        for( int i = 0; i < 5; i++){
            elements.add(i);
        }

        int sum = 0;

        for(int i : elements){
            sum += i;
        }

        System.out.println(sum);
    }
}
