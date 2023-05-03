public class Employee {
    private String name ="";
    private double experience = 0.0;
    private double salary = 0.0;

    public Employee(String name,double experience, double salary){
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public void printDetails(){
        System.out.println("\nIn printDetails()");
        System.out.println(" Name: "+name+"\n Years of Experience: "+experience+"\n Salary: "+salary);
        return;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
