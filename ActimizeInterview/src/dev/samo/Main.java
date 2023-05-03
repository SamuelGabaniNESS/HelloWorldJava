package dev.samo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Array;
import java.sql.Time;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    static HashMap<Integer,Integer> fib_cache = new HashMap<>();
    public static void main(String[] args) {
        for(int i=0;i<20;i++){
            System.out.println(fibonacci(i));
        }
        Calendar c = Calendar.getInstance();
        System.out.println(c.getTimeInMillis());
        System.out.println(fibonacci(21));
        c = Calendar.getInstance();
        System.out.println(c.getTimeInMillis());
        System.out.println(fibonacci(3));
        c = Calendar.getInstance();
        System.out.println(c.getTimeInMillis());

        System.out.println(knapsack(4,new int[]{2,3,1},new int[]{2,1,3},3));

        String fileText = "";
        File file = new File("text.txt");
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
            String line = null;
            while((line = br.readLine()) != null){
                fileText += line+"\n";
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println(fileText);



    }
    public static int fibonacci(int n){
        if(fib_cache.containsKey(n)){
            return fib_cache.get(n);
        }
        if(n<=1){
            return n;
        }
        fib_cache.put(n,fibonacci(n-1)+fibonacci(n-2));
        return fib_cache.get(n);
    }

    public static int knapsack(int W, int[] wt, int[] val, int n){
        int[][] K = new int[n+1][W+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                K[i][j] = 0;
            }
        }
        for(int i=0;i<n+1;i++){
            for(int j = 0;j<W+1;j++){
                if(i==0 || j==0){
                    K[i][j] = 0;
                }else if(wt[i-1] <= j){
                    K[i][j] = Math.max(val[i-1] + K[i-1][j-wt[i-1]],K[i-1][j]);
                }else{
                    K[i][j] = K[i-1][j];
                }
            }
        }
        System.out.println(Arrays.deepToString(K));
        return K[n][W];

    }
}