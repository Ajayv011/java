import java.util.*;

public class s1 {
    public static void main(String[] args) {
        String str = "hello";
        System.out.println(str);
        String str2 = "world";
        System.out.println(str2);
        String str3 = str + " " + str2;
        System.out.println(str3);
        String str4 = "hello world";
        System.out.println(str4);
        System.out.println(str3.equals(str4));
        System.out.println(str3 == str4);
        System.out.println(str3.equalsIgnoreCase(str4));
        System.out.println(str3.toUpperCase());
        System.out.println(str3.toLowerCase());
        System.out.println(str3.length());
        System.out.println(str3.charAt(0));
        System.out.println(str3.indexOf("o"));
        System.out.println(str3.substring(0, 5));
        System.out.println(str3.replace("o", "a"));
        System.out.println(str3.contains("world"));
        System.out.println(str3.startsWith("hello"));
        System.out.println(str3.endsWith("world"));
        System.out.println(str3.trim());

    }

}
