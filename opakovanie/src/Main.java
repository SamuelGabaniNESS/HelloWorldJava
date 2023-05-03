import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static final ArrayList<Integer> arr = new ArrayList<>();
    public static final int i = 5;
    public static void main(String[] args) {
        System.out.println("Hello world!");
        arr.add(1);
        arr.add(2);
        System.out.println(arr);
        Object[] objarr = {"String",1,3,2.2,"ok",new Object(),null};
        System.out.println(Arrays.deepToString(objarr));
//        arr = new ArrayList<>(); - nemozne
//        i = 6; nemozne lebo je to final value, nie final reference ako ArrayList

        Integer x = 4;
        Integer y = 4;
        String a = "a";
        String b = "a";
        System.out.println(x.hashCode()*a.hashCode() == y.hashCode()*b.hashCode());

        BMW.a();
    }
}