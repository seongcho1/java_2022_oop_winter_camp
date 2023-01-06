package command;

import java.util.HashMap;

public class RemoteControl {
  HashMap<Integer, Command[]> commands = new HashMap<>();

  public void setCommand(int key, Command onCommand, Command offCommand) {
    Command[] commandPair = new Command[2];
    commandPair[0] = onCommand;
    commandPair[1] = offCommand;

    commands.put(key, commandPair);
  }

  public void onButtonWasPushed(int key) {
    if (commands.containsKey(key)) {
      commands.get(key)[0].execute();
    } else {
      System.out.println("key(" + key + ") is not defined!");
    }
  }

  public void offButtonWasPushed(int key) {
    if (commands.containsKey(key)) {
      commands.get(key)[1].execute();
    } else {
      System.out.println("key(" + key + ") is not defined!");
    }
  }
}
