public class Item extends GenericItem implements Movable, Flameable{

    @Override
    public void move() {
        System.out.println("I'm moving know");
    }

    @Override
    public void putOnFlame() {
        System.out.println("Heeelp, I'm burning");
    }

    @Override
    public void pullOutFlame() {
        System.out.println("Thank God it stopped");
    }
}
