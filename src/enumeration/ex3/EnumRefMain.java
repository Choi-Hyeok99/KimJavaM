package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {

        System.out.println("class BASIC = " + Grade.BASIC.getClass());
        System.out.println("class GOLD = " + Grade.GOLD.getClass());
        System.out.println("class DIAMOND = " + Grade.DIAMOND.getClass());


        System.out.println("ref BASIC = " + refValue(Grade.BASIC));
        System.out.println("ref GOLD = " + refValue(Grade.GOLD));
        System.out.println("ref DIAMOND = " + refValue(Grade.DIAMOND));
    }

    // 참조 값 보는 메서드 ( 참고로 열거형은 toString()을 재정의 하기 떄문에 참조값을 직접 확인할 수 없다. 그래서 refValue()를 생성 )
    private static String refValue(Grade grade){
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
