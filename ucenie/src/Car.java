import java.util.Objects;

public class Car {
    private String name;
    private String type;
    private float mpg;
    private int price;

    public Car(String name){
        this.name = name;
    }

    public Car(String name,String type){
        this(name);
        this.type = type;
    }

    public Car(String name,String type, float mpg){
        this(name,type);
        this.mpg = mpg;
    }

    public Car(String name, String type,float mpg, int price){
        this(name,type,mpg);
        this.price = price;
    }

    public static void ok(){
        System.out.println("");
    }

    public void printCarDetails(){
        System.out.printf("%s %s has mpg %.1f for price - %d\n",name,type,mpg,price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,type,mpg,price);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(this == obj){
            return true;
        }

        if(!(obj instanceof Car)){
            return false;
        }
        Car c = (Car) obj;
        if(this.name.equals(c.name) &&
                this.type.equals(c.type) &&
                this.mpg == c.mpg &&
                this.price == c.price){
            return true;
        }else{
            return false;
        }
    }
}
