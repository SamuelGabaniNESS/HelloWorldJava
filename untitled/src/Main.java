import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(vratPismena("text"));
        System.out.println("-".repeat(30));
        System.out.println(vratPismena2("alphaomega"));
        System.out.println("-".repeat(30));
        System.out.println(vratPismena3("alphaomega"));
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

    public static HashMap<Character,Integer> vratPismena2(String text){
        HashMap<Character,Integer> result = new HashMap<>();
        for(int i=0;i<text.length();i++){
            if(result.containsKey(text.charAt(i))){
                result.put(text.charAt(i),result.get(text.charAt(i))+1);
            }
            else{
                result.put(text.charAt(i),1);
            }
        }
        return result;
    }

    public static HashMap<Character,Integer> vratPismena3(String text){
        HashMap<Character,Integer> result = new HashMap<>();
        for(int i=0;i<text.length();i++){
            result.put(text.charAt(i), (result.containsKey(text.charAt(i))) ? result.get(text.charAt(i))+1 : 1);
        }
        return result;
    }
}