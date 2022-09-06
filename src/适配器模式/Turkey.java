package 适配器模式;

public class Turkey implements Chick{
    @Override
    public void creak() {
        System.out.println("zhizhi ...");
    }

    @Override
    public void fly() {
        System.out.println("fly ...");
    }
}
