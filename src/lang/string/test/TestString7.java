package lang.string.test;

public class TestString7 {
    public static void main(String[] args) {
        String original = "      Hello Java   ";

        // 코드 작성 ( 공백 제거 )

        String result = original.trim();
        System.out.println("result = " + result);

        String result2 = original.strip();
        System.out.println("strip = " + result2);

    }
}
