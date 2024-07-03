package lang.string.equals;

public class StringEqualsMain1 {
    public static void main(String[] args) {

        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("new String() == 비교 " + ( str1 == str2));
        System.out.println("new String() equals 비교 " + ( str1.equals(str2)));
        // 결과 값
//        new String() == 비교 false
//        new String() equals 비교 true

        String str3 = "hello";
        String str4 = "hello";  // 문자열 풀 덕분에 메모리 줄이고 시간도 줄어 성능 최적화
        System.out.println("리터럴 == 비교 : " + (str3 == str4));
        System.out.println("리터럴 equals 비교 : " + (str3.equals(str4)));
        // 결과 값
//        리터럴 == 비교 : true
//        리터럴 equals 비교 : true

        // 풀(Pool) 자원이 모여있는 곳을 의미한다. 공용 자원을 모아둔 곳을 뜻한다.

    }
}
