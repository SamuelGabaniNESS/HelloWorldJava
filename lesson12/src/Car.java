public class Car {
    private String manufacturer;
    public Car(String manufacturer){
        this.manufacturer = manufacturer;
    }

    //existencia classy emission je podmienena existenciou classy Car
    public class Emission{
        private int value;
        public Emission(int value){
            this.value = value;
        }
        public void describe(){
            System.out.println("Car produced by "+manufacturer+" Emission: "+this.value);
        }
    }

    public static class Engine{
        private int horsePower;
        public Engine(int horsePower){
            this.horsePower = horsePower;
        }

        public void describe(){
            System.out.println("Engine has horse power: "+horsePower);
        }
    }
}
