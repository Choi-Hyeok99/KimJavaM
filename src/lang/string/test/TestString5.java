package lang.string.test;

public class TestString5 {
    public static void main(String[] args) {

        String str = "hello.txt";
        String ext = ".txt";

        // 코드 작성
        int extIndex = str.indexOf(ext);
        String fileName = str.substring(0, extIndex);
        String exName = str.substring(extIndex);

        System.out.println(fileName);
        System.out.println(exName);


    }
}
