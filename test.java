import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class test {
    public static void main(String[]args) {
        HashMap<Integer, Integer> testing = new HashMap<Integer, Integer>();
        int sum = 0;

        testing.put(1,10);
        testing.put(2, 10);
        testing.put(3, 10);

        for (int a : testing.keySet()) {
            sum += testing.get(a);
        }

        System.out.println(sum);
    }
}
