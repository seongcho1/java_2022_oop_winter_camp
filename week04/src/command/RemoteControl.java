package command;

import java.util.ArrayList;
import java.util.HashMap;

public class RemoteControl {

  private HashMap<Integer, ArrayList<Command>> commands;

  public RemoteControl() {
    commands = new HashMap<>();
  }

  public void onButtonWasPushed(int i) {
    if (commands.containsKey(i) == false) {
      System.out.println("key " + i  + " is not registered yet.");
      return;
    }

    ArrayList<Command> pair;
    pair = commands.get(i);
    pair.get(0).execute();
  }

  public void offButtonWasPushed(int i) {
    if (commands.containsKey(i) == false) {
      System.out.println("key " + i  + " is not registered yet.");
      return;
    }

    ArrayList<Command> pair;
    pair = commands.get(i);
    pair.get(1).execute();
  }

  public void setCommand(int i, Command onCommand, Command offCommand) {
    ArrayList<Command> pair = new ArrayList<>();
    pair.add(onCommand);
    pair.add(offCommand);
    commands.put(i, pair);
  }

  @Override
  public String toString() {
    return "RemoteControl [commands=" + commands + "]";
  }
}
