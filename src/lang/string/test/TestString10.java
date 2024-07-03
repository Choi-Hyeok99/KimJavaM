package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {

        String fruits = "apple,banana,mango";

        // 코드 작성

        String[] fr = fruits.split(",");
        for (String fruit : fr) {
            System.out.println(fruit);
        }

        // 더하기
        String join = String.join("->", fr);
        System.out.println("join :  " + join);


    }
}
