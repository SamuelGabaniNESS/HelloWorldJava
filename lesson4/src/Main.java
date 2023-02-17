public class Main {
    public static void main(String[] args) {
        //Primitive types: byte,short,int,long,float,double,boolean,char
        //Reference / Object types: String
        byte a = 127;
        int var1 = 10;
        float var2 = 0.2f;
        String text = "OK";
        boolean isOk= false;
        boolean isRaining = true;
        if(a!=20) {
            isOk = true;
        }
        if(isOk && isRaining) {
            System.out.println("Hi Mark" + (++a - var1 + var2) + " is " + text + (a<var1?" mensie":" vacsie"));
        }else{
            System.out.println("Else");
        }
        for(int i=0;i<5;i++){
            System.out.println(i);
        }

    }
}