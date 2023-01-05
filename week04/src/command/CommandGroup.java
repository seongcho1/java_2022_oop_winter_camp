package command;

import java.util.ArrayList;

public class CommandGroup implements Command {
  private ArrayList<Command> commands;

  public CommandGroup() {
    commands = new ArrayList<>();
  }

  public void add(Command command) {
    commands.add(command);
  }

  public void remove(Command command) {
    commands.remove(command);
  }

  @Override
  public void execute() {
    for (Command command : commands) {
      command.execute();
    }

  }

}
