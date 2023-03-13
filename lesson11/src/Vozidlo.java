// z abstraktnej classy nemozme vytvorit objekt
// abstraktna classa nemoze byt final, nakolko by sme nemohli vytvorit objekt ani by ju nikto nemohol dedit
public abstract class Vozidlo {
    private String manufacturer;

    public Vozidlo(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void describe(){
        System.out.println("Moje vozidlo je znacky "+this.manufacturer);
    }

    public abstract void zapni();
}
