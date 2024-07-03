package lang.wrapper.test;

public class WrapperTest3 {
    public static void main(String[] args) {

        String str = "100";

        // String --> Integer
        Integer i = Integer.valueOf(str);
        System.out.println("i = " + i);

        // Integer -> int
        int intValue = i.intValue();
        System.out.println("intValue = " + intValue);

        // int => Integer
        Integer integer = Integer.valueOf(intValue);
        System.out.println("integer = " + integer);

    }
}
