package 观察者模式;

public class Test {
    public static void main(String[] args) {
        Title title = new Title();
        Reader1 reader1 = new Reader1(title);
        Reader2 reader2 = new Reader2(title);
        title.dataChange(1, 2, 3);
    }
}
