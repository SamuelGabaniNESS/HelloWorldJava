public record Book(String author,String title, int numberOfPages){
    //toto java doda automaticky za koniec konstruktoru
    public Book{
        System.out.println("Konstruujem objekt");
    }

    //dalsi konstruktor pridavanu k tomu co vytvori, vzdy vytvori ten zakladny
    public Book(String author, String title){
        //ako prvy argument musi volat zakladny konstruktor
        this(author,title,100);
        System.out.println("Konstruujem");
    }

//    public Book(String author, String title, int numberOfPages){
//        //pri tomto nemozu byt ostatne konstruktory kedze prepisujeme ten co vygeneroval record
//        this.author = author;
//        this.title = title;
//        this.numberOfPages = numberOfPages;
//        System.out.println("Konstruujem");
//    }

    public void describe(){
        System.out.println("describe");
    }
}
