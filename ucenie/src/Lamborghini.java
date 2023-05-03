public class Lamborghini implements Automobile,SportsCar{
    private String make;
    private String model;
    private Double price;

    private float topSpeed;

    public Lamborghini(String model,Double price,float topSpeed){
        this.make = "Lamborghini";
        this.model = model;
        this.price = price;
        this.topSpeed = topSpeed;
    }
    @Override
    public String getMake() {
        return make;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public float getTopSpeed() {
        return 0;
    }

    @Override
    public String toString(){
        return String.format("Make: %s\nModel: %s\nPrice: %s\nTop Speed: %s",make,model,price,topSpeed);
    }
}
