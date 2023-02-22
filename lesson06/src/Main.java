public class Main {
    public static void main(String[] args) {
        Car myBMW = new Car("BMW",20,"Blue");
        Car neighborMercedes = new Car("Mercedes",55,"Silver");
        Car anotherCar = new Car();
        anotherCar.increaseSpeed();
        myBMW.describe();
        neighborMercedes.describe();
        anotherCar.describe();
        System.out.println("=".repeat(30));
        myBMW.areYouSpeeding(50);
        neighborMercedes.areYouSpeeding();
        int cs = myBMW.getCurrentSpeed();
        System.out.println(cs);

        myBMW.showSpeed(120);
        anotherCar.describe();

        Book book = new Book();

        int b = 4;
        Integer a = 5;


    }
}