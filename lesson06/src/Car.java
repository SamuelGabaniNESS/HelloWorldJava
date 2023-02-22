public class Car {
    private String brand;
    private int currentSpeed;
    private String color;

    public Car(String brand,int currentSpeed,String color){
        this.brand = brand;
        this.currentSpeed = currentSpeed;
        this.color = color;
    }

    public Car(){
        this("Audi",0,"Black");
    }

    public void describe(){
        System.out.println(this.color + " " + this.brand + " is going " + this.currentSpeed + "km/h.");
    }

    public void areYouSpeeding(int speedLimit){
        if(currentSpeed>speedLimit){
            System.out.println("You are going too fast!");
        }else{
            System.out.println("You are good :D");
        }
    }

    public void areYouSpeeding(){
        System.out.println("I will find out for you");
        areYouSpeeding(50);
    }

    public int getCurrentSpeed(){
        return currentSpeed;
    }

    public void showSpeed(int currentSpeed){
        System.out.println("Speed is "+currentSpeed);
    }

    public void increaseSpeed(){
        if(currentSpeed<250){
            currentSpeed += 10;
        }
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

}
