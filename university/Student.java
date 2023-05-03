package dev.samo.university;

public class Student {
    private final String name;
    private final String university;
    private final String major;

    public Student(String name,String university,String major){
        this.name = name;
        this.university = university;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getUniversity() {
        return university;
    }

    public String getMajor() {
        return major;
    }
}
