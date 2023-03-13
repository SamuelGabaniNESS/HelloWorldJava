public interface Movable {
    int maximumDistance = 100;
    void move();

    default void introduceYourself(){
        System.out.println("Im bob");
    }

    private void m(){
        System.out.println("ahoj");
    }

    public static void m2(){

    }
}
