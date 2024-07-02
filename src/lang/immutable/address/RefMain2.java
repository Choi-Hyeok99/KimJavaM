package lang.immutable.address;

public class RefMain2 {
    public static void main(String[] args) {

        ImmutableAddress a = new ImmutableAddress("서울");
        ImmutableAddress b = a; // 참조값 대입을 막을 수 있는 방법이 없다.
        System.out.println("a = " + a); // 서울
        System.out.println("b = " + b); // 서울

       // b.setValue("부산"); // b의 값을 부산으로 변경해야함.
        b = new ImmutableAddress("부산"); // 추가  ( 실수 방지 )
        System.out.println("부산 -> b");
        System.out.println("a = " + a); // 서울
        System.out.println("b = " + b); // 부산

    }
}