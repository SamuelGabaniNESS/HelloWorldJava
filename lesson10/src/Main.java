import com.academy.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Strings
        String s = " Samuel" + " Gabani ";
        System.out.println(s);
        System.out.println(s.length());
        System.out.println(s.trim());
        System.out.println(s.trim().equals("Jan"));
        System.out.println(s.trim().substring(7,10));
        String meno = "Samuel";
        meno.toUpperCase(); //nezmeni objekt meno ale vytvori novy objekt
        //meno = meno.toUpperCase();
        System.out.println(meno);

        String meno2 = "Samuel Gabani";
        String meno3 = "Jan";
        String meno4 = "Samuel";
        String meno5 = meno2.substring(0,6).intern(); //intern vklada retazce do string poolu
        System.out.println(meno.equals(meno4));
        System.out.println(meno == meno5);

        //Final
        List<String> authors = new ArrayList<>();
        authors.add("Ivan");
        authors.add("Jan");
        Book kniha1 = new Book("John Smith",120, authors); //Arrays.asList("Ivan","Jan") - vytvoril by
        //sa nemenny List, pricom by padol nas program
        kniha1.describe();

        //Exceptions
        try {
            System.out.println("zaciatok");
            String a = null;
            a.toLowerCase();
            List<String> l = new ArrayList<>();
            l.get(10);
            System.out.println("koniec");
        }catch (NullPointerException e){
            System.out.println("Vznikla chyba - null hodnota");
//        }catch (IndexOutOfBoundsException e){
//            System.out.println("Vznikla chyba - index out of bounds");
        }catch (Exception e){
            System.out.println("Vznikla chyba");
        }finally {
            System.out.println("Vykona sa tak ci tak");
        }
//        try{
//            System.out.println("ok");
//        }
//        finally{
//            System.out.println("da sa");
//        }
        System.out.println("Po chybe");

    }
}