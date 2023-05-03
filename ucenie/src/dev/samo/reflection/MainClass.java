package dev.samo.reflection;

import org.json.JSONObject;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;
import java.net.http.HttpClient;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Objects;

public class MainClass {
    private final static String path = "/Users/P3503633/Desktop/myproject/HelloWorldJava/outside_project/";


    public static void main(String[] args) throws ClassNotFoundException,NoSuchMethodException, IllegalAccessException,
            InvocationTargetException,InstantiationException {
//    public static void main(String[] args) throws ClassNotFoundException{
//    public static void main(String[] args){
        System.out.println("System or Application class loader");
        System.out.println("Employee class loader: " + Employee.class.getClassLoader());
        System.out.println();

        System.out.println("Platform class loader");
        System.out.println("ResultSet class loader: "+ResultSet.class.getClassLoader());
        System.out.println("HttpClient class loader: "+HttpClient.class.getClassLoader());
        System.out.println();

        System.out.println("Bootstrap class loader");
        System.out.println("Math class loader: "+Math.class.getClassLoader());
        System.out.println("ArrayList class loader: "+ ArrayList.class.getClassLoader());
        System.out.println();

        System.out.println("System or Application class loader");
        System.out.println("JSONObject class loader: "+ JSONObject.class.getClassLoader());
        System.out.println();

        ClassLoader platformClassLoader = ResultSet.class.getClassLoader();
        ClassLoader appClassLoader = Employee.class.getClassLoader();
        System.out.println(appClassLoader);
        System.out.println(appClassLoader.getParent());
        System.out.println(appClassLoader.getParent().getParent());

//        Class<?> someClass = Class.forName("dev.samo.reflection.Department",true,
//                Employee.class.getClassLoader());
        System.out.println("Application class loader");
        ClassLoader applicationClassLoader = Employee.class.getClassLoader();
        System.out.println("App class loader: "+applicationClassLoader);

        ClassLoader platClassLoader = applicationClassLoader.getParent();
        System.out.println("Platform class loader: "+platClassLoader);
//        applicationClassLoader.loadClass("dev.samo.reflection.Department");

        Class<?> someClass = applicationClassLoader.loadClass("org.json.JSONObject");
        System.out.println("JSONObject: "+someClass);
//        someClass = platClassLoader.loadClass("org.json.JSONObject");
//        System.out.println("JSONObject: "+someClass);


        System.out.println("Load files from outside project");
        ClassLoader fileSystemClassLoader = new FileSystemClassLoader(path);
        Class<?> studentClass = fileSystemClassLoader.loadClass("dev.samo.university.Student");
        System.out.println(studentClass);
        System.out.println();
        System.out.println("Instantiate student object not referenced by the project");
        Object student = studentClass.getConstructor(String.class,String.class,String.class)
                .newInstance("Janice","Columbia","Computer Scienece");
        // ne overrideli sme toString
        System.out.println(student);
        System.out.println();

        Class<?> courseClass = fileSystemClassLoader.loadClass("dev.samo.university.Course");
        System.out.println(courseClass);
        Object course = courseClass.getConstructor(String.class,String.class)
                .newInstance("Data Structures and Algorithm","Computer Science");
        System.out.println(course);

        System.out.println();

        float num1 = 10f;
        float num2 = 20f;
        System.out.println(num1*num2);

        // JSHELL
        // /help
        // /vars - get all variables
        // /exit - exit jshell
        // {} viac riadkov
        // funkcie ako v normalnej jave
        // /methods - vrati vsetky metody
        // /types - vrati classy
    }
}
