public class Sedan extends ConceptCar{
    private Double price;

    public Sedan(String make,String model,Double price){
        super(make,model);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return price;
    }

    @Override
    public String getReleaseDate(){
        return Automobile.getFormattedCalendarString();
    }

    @Override
    public String toString(){
        return String.format("Make: %s\nModel: %s\nPrice: %s\n",getMake(),getModel(),price);
    }
}
