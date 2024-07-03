package lang.string.method;

public class StringComparisonMain {
    public static void main(String[] args) {

        String str1 = "Hello, Java!"; // 대문자 일부 있음
        String str2 = "hello, java!"; // 대문자 없음 모두 소문자
        String str3 = "Hello, World!";

        System.out.println("str1 equals str2 :" + str1.equals(str2)); // str1 equals str2 :false
        System.out.println("str1 equalsIgnoreCase str2 : " + str1.equalsIgnoreCase(str2)); // str1 equalsIgnoreCase str2 : true

        System.out.println("'b' compareTo 'a' : " + "b".compareTo("a")); // 'b' compareTo 'a' : 1 ( 사전적으로 1개 차이 )
        System.out.println("'b' compareTo 'a' : " + "c".compareTo("a")); // 'b' compareTo 'a' : 2
        System.out.println("'b' compareTo 'a' : " + "a".compareTo("b")); // 'b' compareTo 'a' : -1
        System.out.println("str1 compareTo str3 : " + str1.compareTo(str3)); // str1 compareTo str3 : -13
        System.out.println("str1 compareToIgnoreCase str2 : " + str1.compareToIgnoreCase(str2)); // str1 compareToIgnoreCase str2 : 0


        System.out.println("str1 start with 'Hello : " +  str1.startsWith("Hello")); // true
        System.out.println("str1 start with 'Hello : " +  str1.endsWith("Java!")); // true




    }
}
