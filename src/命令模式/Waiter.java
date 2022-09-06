package 命令模式;

import java.util.ArrayList;

public class Waiter {
  private ArrayList<Command> commands = new ArrayList();

  public void addCommand(Command command) {
    commands.add(command);
  }
  public void execute(){
    for (Command command : commands) {
      command.execute();
    }
  }
}
