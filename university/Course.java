package dev.samo.university;

public class Course {
    private final String name;
    private final String major;

    public Course(String name, String major){
        this.name = name;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString(){
        return String.format("Course Name: %s, Major: %s",name,major);
    }
}
