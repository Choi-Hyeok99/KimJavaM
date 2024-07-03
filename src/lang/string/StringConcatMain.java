package lang.string;

public class StringConcatMain {
    public static void main(String[] args) {

        String a = "hello"; //x001
        String b= "java"; // x002

        String result1 = a.concat(b);
        String result2 = a + b; // Java에서는 특별하게 String끼리 연산 가능 ( 다른 곳은 안됌 )
        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
    }
}
