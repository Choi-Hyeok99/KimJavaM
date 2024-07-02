package lang.immutable.address;

public class ImmutableAddress {

    // 안바뀌는 불변
    // 변하지 않는 필드
    private final String value;


    public ImmutableAddress(String value){
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
