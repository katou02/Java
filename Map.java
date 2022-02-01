import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Map<String, Integer> prefs = new HashMap<String, Integer>();
        prefs.put("日本", 255);  
        prefs.put("韓国", 1261);
        prefs.put("アメリカ", 181);

        System.out.println(prefs.get("韓国"));  

        int Japan = prefs.get("日本"); 
        System.out.println(Japan);

        prefs.put("日本", 1500);  //解説①
        System.out.println(prefs.get("日本"));

        prefs.remove("韓国"); 
        System.out.println(prefs.size());  

    }
}