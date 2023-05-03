package dev.samo.main;

import java.io.FileReader;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Objects;

public class Main {
    private static String[] stringArray = new String[5];
    private static int lastIndex = 0;

    private static void addString(String element){
        if(lastIndex>=stringArray.length){
            System.out.println("Cannot add element, no room in array!");
            return;
        }
        stringArray[lastIndex++] = element;
    }

    private static void deleteString(int index){
        if(index>=stringArray.length){
            System.out.println("Index out of bounds, cannot delete element");
            return;
        }
        stringArray[index] = null;
        int currentIndex = index;
        for(int i=currentIndex;i<stringArray.length - 1;i++){
            stringArray[currentIndex] = stringArray[currentIndex + 1];
            currentIndex++;
        }
        stringArray[stringArray.length-1] = null;
        lastIndex--;
    }

    public static void main(String[] args) {

        int[][] multiDimensionalArray = new int[3][4];
        System.out.println("String representation of outer array");
        System.out.println(Arrays.toString(multiDimensionalArray));
//        System.out.println(Arrays.deepToString(multiDimensionalArray));
        multiDimensionalArray[0][0] = 100;
        multiDimensionalArray[1][1] = 200;
        multiDimensionalArray[2][2] = 300;
        for(int[] intArr : multiDimensionalArray){
            System.out.println(Arrays.toString(intArr));
        }

        int[][][] multiDArray = new int[3][4][2];
        for(int[][] int2dArray : multiDArray){
            System.out.print("[");
            for(int[] intA : int2dArray){
                System.out.print(Arrays.toString(intA));
            }
            System.out.println("]");
        }
        System.out.println("-".repeat(60));
        String[][] multiStringArr = new String[2][3];
        multiStringArr[1][2] = "Harry";
        multiStringArr[0][1] = "Ron";
        multiStringArr[1][0] = "Hermione";
        for(String[] stringArr : multiStringArr){
            System.out.println(Arrays.toString(stringArr));
        }

        //JAGGED ARRAY
        String[][] multiDStringArray = new String[3][];
        multiDStringArray[0] = new String[3];
        multiDStringArray[1] = new String[]{"Ok","Nah"};
        multiDStringArray[2] = new String[4];
        for(String[] stringArr : multiDStringArray){
            System.out.println(Arrays.toString(stringArr));
        }

//        addString("Amazon");
//        System.out.println(Arrays.toString(stringArray));
//        addString("Skillsoft");
//        System.out.println(Arrays.toString(stringArray));
//        addString("SumTotal");
//        System.out.println(Arrays.toString(stringArray));
//        addString("Suzuki");
//        System.out.println(Arrays.toString(stringArray));
//        addString("Toyota");
//        System.out.println(Arrays.toString(stringArray));
//        deleteString(2);
//        System.out.println(Arrays.toString(stringArray));
//        addString("Ford");
//        System.out.println(Arrays.toString(stringArray));

//        int[] intArray = new int[4];
//        intArray[1] = 10;
//        intArray[2] = 20;
//        float[] floatArray = new float[6];
//        floatArray[3] = 10.5f;
//        floatArray[4] = 20.5f;
//        String[] stringArray = new String[7];
//        stringArray[1] = "Good";
//        stringArray[2] = "Morning";
//        Date[] dateArray = new Date[10];
//        dateArray[1] = Calendar.getInstance().getTime();
//        dateArray[2] = Calendar.getInstance().getTime();
//        System.out.println(Arrays.toString(dateArray));
//
//        System.out.println("intArray instanceof Object: "+(intArray instanceof Object));
//        System.out.println("floatArray instanceof Object: "+(floatArray instanceof Object));
//        System.out.println("StringArray instanceof Object: "+(stringArray instanceof Object));
//        System.out.println("DateArray instanceof Object: "+(dateArray instanceof Object));
//
//        for(int i =0;i<intArray.length;i++){
//            System.out.format("intArray[%d]: %s\n",i,intArray[i]);
//        }
//
//        Object[] mixedArray = {"Amazon",100.0f,23,true};


//        System.out.println("Array of integers: "+intArray);
//        System.out.println("getClass() representation: "+intArray.getClass());
//        System.out.println("toString() representation: "+intArray.toString()+"\n");
//        System.out.println("toString representation: "+ Arrays.toString(intArray)+"\n");
//
//        float[] floatArray = new float[6];
//        floatArray[0] = 10.5f;
//        floatArray[3] = 20.5f;
//        System.out.println("Array of floats: "+floatArray);
//        System.out.println("getClass() representation: "+floatArray.getClass());
//        System.out.println("toString() representation: "+floatArray.toString()+"\n");
//        System.out.println("toString representation: "+ Arrays.toString(floatArray)+"\n");
//
//        String[] stringArray = new String[7];
//        stringArray[1] = "Good";
//        stringArray[2] = "Morning";
//        System.out.println("Array of floats: "+stringArray);
//        System.out.println("getClass() representation: "+stringArray.getClass());
//        System.out.println("toString() representation: "+stringArray.toString()+"\n");
//        System.out.println("toString representation: "+ Arrays.toString(stringArray)+"\n");


    }
}