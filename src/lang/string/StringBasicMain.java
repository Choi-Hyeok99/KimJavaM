package lang.string;

public class StringBasicMain {
    public static void main(String[] args) {
        // String 참조형
        String str1 = "hello";  // 기존
        String str2 = new String("hello"); // 변경

        System.out.println(str1);
        System.out.println(str2);

    }
}
