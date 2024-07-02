package lang.immutable.change;

public class ImmutableMain2 {
    public static void main(String[] args) {

        ImmutableObj obj1 = new ImmutableObj(10);
        obj1.add(20);

        // 실행결과 : 10 아무것도 처리되지 않은 것 처럼 보인다. 반환 겂을 받아야 값이 변경된다.
        System.out.println("obj1 = " + obj1.getValue());

    }
}
