package dev.samo;

public class Animal {
    protected int num;
    protected int p=10;
    public Animal(int num){
        this.num = num;
    }

    public void print(){
        System.out.println(num);
    }
}
