package command;

import java.util.HashMap;

public class RemoteControl {

  private HashMap<Integer,Command[]> commands;

  public RemoteControl() {
    commands = new HashMap<>();
  }

  public void onButtonWasPushed(int i) {
    if (commands.containsKey(i) == false) {
      System.out.println("key " + i  + " is not registered yet.");
      return;
    }

    Command[] pair = new Command[2];
    pair = commands.get(i);
    pair[0].execute();
  }

  public void offButtonWasPushed(int i) {
    if (commands.containsKey(i) == false) {
      System.out.println("key " + i  + " is not registered yet.");
      return;
    }

    Command[] pair = new Command[2];
    pair = commands.get(i);
    pair[1].execute();
  }

  public void setCommand(int i, Command onCommand, Command offCommand) {
    Command[] pair = new Command[2];
    pair[0] = (onCommand);
    pair[1] = (offCommand);
    commands.put(i, pair);
  }

  @Override
  public String toString() {
    return "RemoteControl [commands=" + commands + "]";
  }
}
