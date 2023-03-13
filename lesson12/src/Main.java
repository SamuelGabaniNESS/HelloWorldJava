import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // abstraktne classy poskytuju vseobecnu zakladnu implementaciu pre dediace classy
        // classa moze dedit len jednu classu, ale moze implementovat hocikolko interfaceov (14 mil.+)
        // v interface ma kazda metoda -> public abstract
        // interface moze mat aj atribut pricom maju tri neviditelne modifikatory: public static final (konstanta)

        // od java 8 sa daju implementovat default metody -> default znamena ze tuto metodu uz aj implementujeme ale nemoze menit atributy
        // ak su 2 rovanke default metody v roznych interfaceoch, tak musime overrideovat danu metodu

        // od java 11 mozeme mat private metody (predtym len public), nemusi byt default

        // od java 14 mozeme mat static metody
        Movable i = new Item();
        i.move();
        ((Flameable)i).pullOutFlame();
        Item i2 = new Item();
        i2.pullOutFlame();
        i2.putOnFlame();
        System.out.println(Movable.maximumDistance);
        i.introduceYourself();

        //List je interface, zatial co LinkedList je implementacia
        List<Integer> l = new LinkedList<>();
        l.add(10);
        Deque<Integer> s = new LinkedList<>();
        s.push(10);
        System.out.println(l);
        System.out.println(s);

        // objekt recordu je immutable
        Book b = new Book("Samo G","Java",100);
        System.out.println(b);

        Car myCar = new Car("Ferrari");
        Car.Emission myEmission = myCar.new Emission(100);
        myEmission.describe();
        Car.Engine myEngine = new Car.Engine(150);
        myEngine.describe();
    }
}