package 命令模式;

public class Main {
  public static void main(String[] args) {
    Chef chef = new Chef();
    Waiter waiter = new Waiter();
    Command cookCommand = new CookCommand(chef);
    waiter.addCommand(cookCommand);
    waiter.execute();
  }
}
