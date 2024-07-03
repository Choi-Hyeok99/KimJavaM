package lang.wrapper;

public class AutoboxingMain1 {
    public static void main(String[] args) {

        // Primitive(기본형) -> Wrapper
        int value = 8;
        Integer boxedValue = Integer.valueOf(value);
        Integer boxedValue1 = value; // 오토 박싱

        // Wrapper -> Primitive(기본형)
        int unboxedValue = boxedValue.intValue();
        int unboxedValue2 = boxedValue; // 오토 언박싱

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);
    }
}
