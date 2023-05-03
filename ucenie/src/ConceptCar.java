public abstract class ConceptCar implements Automobile{
    private String make;
    private String model;

    public ConceptCar(String make,String model){
        this.make = make;
        this.model = model;
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
    public abstract Double getPrice();

    // we make it abstract so it have to be implemented on not abstract class
    @Override
    public abstract String getReleaseDate();
}
