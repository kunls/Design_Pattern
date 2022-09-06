package 适配器模式;

/**
 * 明明new的是Chick对象,引用类型却是Duck类型,调用duck的方法实际上却是执行的chick的方法
 * 这就成功地将Chick伪装成了Duck
 */
public class Test {
    public static void main(String[] args) {
        Duck duck = new DuckAdaptor(new Turkey());
        duck.gaga();
        duck.fly();
    }
}
