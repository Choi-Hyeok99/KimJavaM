package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {

        String str = "100";

        // String --> Integer
        Integer i = Integer.valueOf(str);
        System.out.println("i = " + i);

        // Integer -> int
        int intValue = i;
        System.out.println("intValue = " + intValue);

        // int => Integer
        Integer integer = intValue;
        System.out.println("integer = " + integer);

    }
}
