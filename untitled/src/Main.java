import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(vratPismena("text"));
    }

    public static HashMap<String,Integer> vratPismena(String text){
        HashMap<String,Integer> result = new HashMap<>();
        for(int i=0;i<text.length();i++){
            if(result.containsKey(String.valueOf(text.charAt(i)))){
                result.put(String.valueOf(text.charAt(i)),result.get(String.valueOf(text.charAt(i)))+1);
            }else{
                result.put(String.valueOf(text.charAt(i)),1);
            }
        }
        return result;
    }
}