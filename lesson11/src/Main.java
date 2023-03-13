import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        //chytat exception, nie errory

//        m();
//        throw  new ArithmeticException();
//        Kalkulacka k = new Kalkulacka();
//        try {
//            k.delenie(20,0);
//            System.out.println("Podarilo sa vydelit");
//        }catch (Exception e){
//            System.out.println("Nepodarilo sa vydelit");
//            //e.printStackTrace();
//        }

//        try {
//            throw new IOException();
//        }catch (IOException e){
//            System.out.println("IO chyba");
//        }


//        throw new NullPointerException();

        Vozidlo v = new Auto("BMW",100);
        v.describe();

        //Vozidlo v2 = new Vozidlo("Ferrari");

    }

    public static void m(){
        try{
            System.out.println("Pred Exception");
            //if(true) throw  new ArithmeticException();
            String a = null;
            a.toLowerCase();
            int b = 10/0;
            System.out.println("Po Exception");
        }catch (Exception exc){
            System.out.println(exc.getCause());
            System.out.println(exc.getMessage());
            System.out.println(exc.getStackTrace()[0]);
            //throw exc;
        }finally {
            System.out.println("Urobil som este nieco navyse");
        }
    }
}