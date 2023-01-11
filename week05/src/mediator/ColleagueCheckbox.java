package mediator;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColleagueCheckbox extends Checkbox implements ItemListener, Colleague {
  private Mediator mediator;

  public ColleagueCheckbox(String caption, CheckboxGroup checkboxGroup, Boolean state) {
      super(caption, state);
      this.setCheckboxGroup(checkboxGroup);
  }
  public void setMediator(Mediator mediator) {
    this.mediator = mediator;
  }
  public void setColleagueEnabled(boolean enabled) {
      setEnabled(enabled);
  }
  @Override
  public void itemStateChanged(ItemEvent e) {
    System.out.println("" + e);
    //System.exit(0);
    mediator.colleagueChanged(this);
  }
}
