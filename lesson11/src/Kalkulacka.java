import javax.naming.directory.InvalidAttributesException;
import java.io.IOException;

public class Kalkulacka {
    public void delenie(int a, int b) throws SorryDelisNulouException{
        //throw new IOException();
        if(b!=0) {
            System.out.println(a / b);
        }else{
            //throw new ArithmeticException();
            throw new SorryDelisNulouException();
        }
    }
}
