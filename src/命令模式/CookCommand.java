package 命令模式;

public class CookCommand implements Command{
    Chef chef;

  public CookCommand(Chef chef) {
      this.chef=chef;
  }


    @Override
    public void execute() {
      chef.cooking();
    }
}
