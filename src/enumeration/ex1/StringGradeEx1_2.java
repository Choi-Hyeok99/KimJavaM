package enumeration.ex1;



public class StringGradeEx1_2 {
    public static void main(String[] args) {

        int price = 10000;
        // 결과는 똑같음

        DiscountServie discountServie = new DiscountServie();

        // 존재하지 않는 등급
        int vip = discountServie.discount("VIP",price);
        System.out.println("VIP 등급의 할인 금액 : " + vip);

        // 오타
        int diamondd = discountServie.discount("DIAMONDD", price);
        System.out.println("DIAMONDD 등급의 할인 금액 " + diamondd);

        // 소문자 입력
        int gold = discountServie.discount("gold", price);
        System.out.println("gold 등급의 할인 금액 : "+ gold);

    }
}