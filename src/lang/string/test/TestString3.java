package lang.string.test;

public class TestString3 {
    public static void main(String[] args) {

        String str = "hello.txt";


        // 코드 작성 ( 내 풀이 )
        int result = str.indexOf(".txt");
        System.out.println(result);

        // 코드작성 ( 정답 )
        String str1 = "hello.txt";
        int index = str1.indexOf(".txt");
        System.out.println("index : " + index);


    }
}
