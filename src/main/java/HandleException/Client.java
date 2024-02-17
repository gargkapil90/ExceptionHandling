package HandleException;

import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) throws Exception {
        //System.out.println(1/0);
        List<Integer> list = List.of(12, 45, 22, 555,44,39);
        System.out.println(list.stream().filter(x -> x%2 == 0).reduce(0, (val, ele) -> val + ele));

        Doer doing = new Doer(4);
        doing.doSomething();
    }
}
