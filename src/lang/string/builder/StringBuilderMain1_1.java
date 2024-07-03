package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println(sb);

        sb.insert(2,"Java"); // 만약 2면 ABJavaCD
        System.out.println(sb); // ABCDJava

        sb.delete(4,8);
        System.out.println("delete = " + sb); // ABJa

        sb.reverse();
        System.out.println("reverse = " + sb); // aJBA

        // StringBuilder => String  ( 가변 -> 불변 )
        String string = sb.toString();
        System.out.println("string : " + string);


    }
}
