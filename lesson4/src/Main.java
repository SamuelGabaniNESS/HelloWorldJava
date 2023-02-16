public class Main {
    public static void main(String[] args) {
        //Primitive types: byte,short,int,long,float,double,boolean,char
        //Reference / Object types: String
        byte a = 20;
        int var1 = 10;
        float var2 = 0.2f;
        String text = "OK";
        boolean isOk= false;
        if(a==20) {
            isOk = true;
        }
        if(isOk) {
            System.out.println("Hi Mark" + (a + var1 + var2) + " is " + text);
        }

    }
}