import java.util.Scanner;

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

        Scanner sc = new Scanner(System.in);
        System.out.print("Write number of day:");
        int day = sc.nextInt();

        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Chyba");
                break;
        }

        String den = switch(day){
            //case 1 -> "Pondelok";
            case 1:
                System.out.println("Monday");
                yield "Pondelok";
            case 2:
                System.out.println("Tuesday");
                yield "Utorok";
            case 3:
                System.out.println("Wednesday");
                yield "Streda";
            case 4:
                System.out.println("Thursday");
                yield "Stvrtok";
            case 5:
                System.out.println("Friday");
                yield "Piatok";
            case 6:
                System.out.println("Saturday");
                yield "Sobota";
            case 7:
                System.out.println("Sunday");
                yield "Nedela";
            default:
                System.out.println("Chybna value");
                yield "Chyba";
        };
        System.out.println(den);

        while (var1>7){
            System.out.println(var1);
            var1--;
        }
        for(var j = 0;j<3;j++){
            System.out.println(j);
        }



        Car car = new Car("Skoda","Rapid",4,200,4);
        //System.out.println(car.getName()+" "+car.getModel());
        System.out.println(car);
    }


}

class Car{
    private int wheels;
    private int horsePower;
    private int doors;
    private String name;
    private String model;
    public Car(String name,String model,int wheels, int horsePower, int doors){
        this.name = name;
        this.model = model;
        this.wheels = wheels;
        this.horsePower = horsePower;
        this.doors = doors;
    }

    @Override
    public String toString() {
        return this.name+" "+this.model+
                " have "+this.wheels+
                " wheels and "+this.doors+
                " doors. It have "+this.horsePower+
                " horse power.";
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}