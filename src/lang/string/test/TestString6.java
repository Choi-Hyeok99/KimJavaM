package lang.string.test;

public class TestString6 {
    public static void main(String[] args) {

        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";

        // 코드 작성

        int count = 0;
        int i = str.indexOf(key);
        while (i >= 0) {
            i = str.indexOf(key, i + 1);
            count++;
        }
        System.out.println("count: " + count);
    }
}