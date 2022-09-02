package 策略模式;

public class Person {
    Transportation transportation;
    public Person(Transportation transportation1) {
        transportation=transportation1;
    }
    public void goOutByWhat() {
        transportation.goOut();
    }
}
