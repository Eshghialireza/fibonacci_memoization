import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        System.out.println("fibonacci recursive --> \n"+"n ="+n+"\n f("+n+") ="+f(n)+" loop count ="+count_f);
        System.out.println("-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-0-");
        System.out.println("fibonacci memoization recursive --> \n"+"n ="+n+"\n fm("+n+") ="+fm(n)+" loop count ="+count_fm);
        System.out.println("as you can see memoized way is so faster! ");
    }

    static Map<Integer, Integer> memory = new HashMap<>();
    static int count_f = 0;
    static int count_fm = 0;

    //recursive
    public static int f(int n) {
        count_f++;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return f(n - 1) + f(n - 2);
        //0-1-1-2-3-5-8-13-21-34-55
    }

    public static int fm(int n) {
        count_fm++;
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (memory.containsKey(n))
            return memory.get(n);
        memory.put(n, fm(n - 1) + fm(n - 2));
        return memory.get(n);
        //0-1-1-2-3-5-8-13-21-34-55
    }
}
