package 适配器模式;

public class DuckAdaptor implements Duck{
    private Chick chick;

    public DuckAdaptor(Chick chick) {
        this.chick = chick;
    }
    @Override
    public void gaga() {
        chick.creak();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            chick.fly();
        }
    }
}
