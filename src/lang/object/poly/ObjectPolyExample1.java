package lang.object.poly;

public class ObjectPolyExample1 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Car car = new Car();

        action(dog);
        action(car);

    }

    private static void action(Object obj){
      //  obj.sound(); // 컴파일 오류 , Object sound()가 없다. Object는 최종 부모이므로 더는 올라가서 찾을 수 없다.
      //  obj.move();  // 컴파일 오류 , Object move()가 없다.

        // 객체에 맞는 다운캐스팅 필요 Object는 최종부모이기때문에 다운캐스팅을 통해 sound().move()를 찾아 호출한다. ( Object에 속하지 않은 메서드 )
        if(obj instanceof Dog dog){
            dog.sound();
        } else if(obj instanceof Car car){
            car.move();
        }
    }
}
