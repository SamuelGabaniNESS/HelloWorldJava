import dev.samo.Animal;
import dev.samo.Bird;

import javax.naming.InvalidNameException;
import java.io.*;
import java.util.*;
import java.util.stream.Stream;


public class Main{
    public static void main(String[] args){
//        double b = Double.parseDouble(String.format(Locale.US,"%.6f",5.65231257));
//        System.out.println(String.format("%.6f",5.65231257) +","+ b);
//        int a = 5;
//        System.out.format("value of a is %d",a);
//        System.out.println("Enter the temperature: ");
//        Scanner sc = new Scanner(System.in);
//        int temperature = sc.nextInt();
//        System.out.println("The input temperature is : "+ temperature);
//        System.out.println("Write name: ");
//        String name = sc.next().trim();
//        System.out.println("You wrote name: "+name);
//        skuska s = new skuska();
        String[] str = {"Ahoj","Samo","Tomas","auto","lietadlo"};
        String result = smash(str);
        System.out.println(result);

        Employee employee1 = new Employee("Samo",2,1000);
        employee1.printDetails();
        Employee employee2 = new Employee("Ivan",10,3000);
        employee2.printDetails();

        employee1.setExperience(3);
        employee1.setSalary(1200);
        employee1.printDetails();

        Car c1 = new Car("Skoda","Rapid",100.0f,10000);
        c1.printCarDetails();
        Car c2 = new Car("Ferrari","F50");
        c2.printCarDetails();

        Car c3 = new Car("Skoda","Rapid",100.0f,10000);
        System.out.println(c1.equals(c3));

//        Skuska s = new Skuska();

        Animal a = new Animal(5);
        Bird b = new Bird(4);
        a.print();
        b.print();

//        System.out.println(a.p);

        Automobile sedan = new Sedan("Honda","Civic",21000.0);
        System.out.println("Sedan make: " + sedan.getMake());
        System.out.println("Sedan model: " + sedan.getModel());
        System.out.println("Sedan price: " + sedan.getPrice());
        System.out.println("Sedan: " + sedan);

        System.out.println("sedan is an instance of Sedan: "+(sedan instanceof Sedan));
        System.out.println("sedan is an instance of Automobile"+(sedan instanceof  Automobile));
        System.out.println("--".repeat(30));
        Automobile toyota = new Sedan("Toyota","Camry",24000.0);
        System.out.println("Honda safety program: "+sedan.safetyAssessmentProgram);
        System.out.println("Toyota safety program: "+toyota.safetyAssessmentProgram);
        System.out.println("Automobile safety program: "+Automobile.safetyAssessmentProgram);
        System.out.println("Sedan safety program: "+Sedan.safetyAssessmentProgram);

        System.out.println("--".repeat(30));
        Automobile huracan = new Lamborghini("Huracan",78000.0,320);
        SportsCar aventador = new Lamborghini("Aventador",127000.0,350);

        System.out.println("Huracan: "+huracan);
        System.out.println("Aventador: "+aventador);

        System.out.println("Huracan in an instance of Lamborghini: "+(huracan instanceof Lamborghini));
        System.out.println("Huracan is an instance of SportsCar: "+(huracan instanceof SportsCar));
        System.out.println("Huracan is an instance of Automobile: "+(huracan instanceof Automobile));

        System.out.println("Aventador in an instance of Lamborghini: "+(aventador instanceof Lamborghini));
        System.out.println("Aventador is an instance of SportsCar: "+(aventador instanceof SportsCar));
        System.out.println("Aventador is an instance of Automobile: "+(aventador instanceof Automobile));
        System.out.println("--".repeat(30));

        System.out.println(((Lamborghini) aventador).getReleaseDate());
        System.out.println(huracan.getReleaseDate());
        System.out.println("Sedan release date: " + sedan.getReleaseDate());
        System.out.println("--".repeat(30));

        int[] arr = {1,2,3,4,5};
        try{
//            System.out.println(arr[5]);
            arr[4] = 2/0;
        }catch (ArrayIndexOutOfBoundsException ae){
            System.out.println("AE");
            ae.printStackTrace();
        }catch (Exception e){
            System.out.println("E");
            System.out.println(e.getMessage());
        }
        Date d = new Date();
        System.out.println(d);
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(String.valueOf(calendar.getTime()).split(" ")[1]);


        String fileText = "";
        try {
            FileReader file = new FileReader("C:\\Users\\P3503633\\Desktop\\myproject\\HelloWorldJava\\ucenie\\text.txt");
            int c = file.read();
            while ( c != -1){
                fileText += (char)c;
                c = file.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(fileText);

        System.out.println("---------------");
        try {
            Scanner sc = new Scanner(
                    new FileReader("C:\\Users\\P3503633\\Desktop\\myproject\\HelloWorldJava\\ucenie\\text.txt"));
            String sentence = sc.nextLine();
            System.out.println(sentence);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("-".repeat(50));
        File file = new File("C:\\Users\\P3503633\\Desktop\\myproject\\HelloWorldJava\\ucenie\\text.txt");
        File fileIn = new File("C:\\Users\\P3503633\\Desktop\\myproject\\HelloWorldJava\\ucenie\\text.txt");
        File fileOut = new File("C:\\Users\\P3503633\\Desktop\\myproject\\HelloWorldJava\\ucenie\\writetext.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String st = null;
            while((st = br.readLine())!=null){
                System.out.println(st);
            }
        }catch (IOException e){
            System.out.println("Catching exception: "+e);
        }

        System.out.println("-".repeat(50));
        try(
                BufferedReader br = new BufferedReader(new FileReader(fileIn));
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut));
                ){
            bw.write("This is another copy!");
            String st = null;
            while((st = br.readLine()) != null){
                System.out.println(st);
                bw.write(st+"\n");
            }
        }catch (IOException e){
            System.out.println("Catching exception: "+e);
        }

        System.out.println(sedan instanceof Automobile);

//        System.out.println("Enter your GPA to check your eligibility for admission: ");
//        Scanner inputGPA = new Scanner(System.in);
//        float gpa = inputGPA.nextFloat();
//        inputGPA.close();
//        validateGPA(gpa);
        intermediateFunction("loony_Samuel", 3.3f);
//        intermediateFunction("lazy_Samuel", 3.1f);
//        intermediateFunction("loony_Samuel", 5.3f);
        userRequest("loony_corn","sum");
//        userRequest("lazy_corn","sum");


        ArrayList<Flyable> arrayList = new ArrayList();
        arrayList.addAll(List.of(new Item(),new Item2(),new Item(),new Item2()));
        for(Flyable f : arrayList){
            f.fly();
        }

        for(int i=1;i<=6;i++) {
            System.out.print(fibonacciFunc(i)+",");
        }


    }

    public static int fibonacciFunc(int i){
        return i==1 ? 0 : (i==2 ? 1 : (fibonacciFunc(i-2)+fibonacciFunc(i-1)));
    }

    public static void userRequest(String userId,String operation){
        if(userId.startsWith("loony_")){
            System.out.println("The username checks out...");
        }else{
            throw new InvalidUsernameException("The username is not in the correct format");
        }

        System.out.format("\nThe user %s has requested the %s operation.\n",userId,operation);
    }

    public static void intermediateFunction(String userId,float gpa){
        try {
            validateStudent(userId,gpa);
        }catch (IllegalArgumentException | InvalidNameException e){
            System.out.println("An exception was thrown: "+e.getClass());
            e.printStackTrace();
        }
    }

    public static void validateStudent(String userId,float gpa) throws InvalidNameException, IllegalArgumentException{
        if(userId.startsWith("loony_")) System.out.println("The username check out...");
        else throw new InvalidNameException("The username is not in the correct format");

        if(gpa>0 && gpa<=4.33) System.out.println("That is a valid GPA. Processing eligibility...");
        else throw new IllegalArgumentException("Sorry. A GPA must have a value between 0 and 4.33.");

    }

    public static void validateGPA(float gpa) throws IllegalArgumentException{
        if(gpa>0 && gpa<=4.33){
            System.out.println("That is a valid GPA. Processing eligibility...");
        }else{
            throw new IllegalArgumentException("Sorry. A GPA must have a value between 0 and 4.33.");
        }
    }

    public static String smash(String... words){
        if(words.length==0) return "";
        String result = "";
        for(int i = 0;i<words.length-1;i++){
            result += words[i]+" ";
        }
        return result + words[words.length-1];
    }
}