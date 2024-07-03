package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {

        String email = "hello@example.com";
        String[] split = email.split("@");
        String id = split[0];
        String em = split[1];

        System.out.println("ID: " + id );
        System.out.println("Email : " + em);
    }
}
