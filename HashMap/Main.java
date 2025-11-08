import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Map <String, String> data = new HashMap<>(); 
        int i = Math.abs("name".hashCode()) % 4;
        int e = Math.abs("email".hashCode()) % 4;
        int p = Math.abs("phone".hashCode()) % 4;
        int p_i = Math.abs("password".hashCode()) % 4;
        //
        // 0 - {email : ""}
        // 2 - {phone : ""}
        // 3 - {password : "adgs", next :  3 - {name : "adsv", next : null}
        System.out.println(i);
        System.out.println(e);
        System.out.println(p);
        System.out.println(p_i);
        data.put("name", "abc");
        data.put("email", "abc@gmail.com");
        data.put("phone", "123");
        data.put("password", "Abc@123");
        String nm = data.get("name");
        String em = data.get("email");
        String im = data.get("image");

        System.out.println(nm);
        System.out.println(em);
        System.out.println(im);
        // System.out.println(data);
    }
}