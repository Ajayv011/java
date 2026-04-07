public class s3 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        String str3 = new String("hello");
        // System.out.println(str1 == str2); // true
        // System.out.println(str1 == str3); // false
        // System.out.println(str1.equals(str3)); // true
        System.out.println(str1.replace("l", "x")); // hexxo
        System.out.println(str1.replace("ello", "aiya")); // haiya
        System.out.println(str1.contains("ll")); // true
        System.out.println(str1.contains("xx")); // false
        System.out.println(str1.startsWith("he")); // true
        System.out.println(str1.startsWith("hi")); // false
        System.out.println(str1.endsWith("lo")); // true
        System.out.println(str1.endsWith("hi")); // false
        System.out.println(str1.indexOf("l")); // 2
        System.out.println(str1.indexOf("x")); // -1
        System.out.println(str1.lastIndexOf("l")); // 3
        System.out.println(str1.lastIndexOf("x")); // -1


    }

}
