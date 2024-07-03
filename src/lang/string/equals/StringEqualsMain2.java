package lang.string.equals;

public class StringEqualsMain2 {

    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("메서드 호출 비교1 : " + isSame(str1, str2));

        String str3 = "hello";
        String str4 = "hello";

        System.out.println("메서드 호출 비교2 : " + isSame(str3 , str4));

//        메서드 호출 비교1 : false
//        메서드 호출 비교2 : true
        // 문자열 비교는 항상 Equals로 하자. ( 동등성 비교 )
    }

    private static boolean isSame(String x , String y){
        return  x==y;
    }
}
