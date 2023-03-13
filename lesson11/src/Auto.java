public class Auto extends Vozidlo{
    private int pocetEmisiiCO2;

    public Auto(String manufacturer, int pocetEmisiiCO2) {
        super(manufacturer);
        this.pocetEmisiiCO2 = pocetEmisiiCO2;
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("Emisie: "+this.pocetEmisiiCO2);
    }


    public void zapni(){
        System.out.println("Zapol som auto");
    }
}
