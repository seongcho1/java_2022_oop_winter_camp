package visitor;

import java.util.Iterator;

public class ListVisitor extends Visitor {
  private String currentDir = "";

  @Override
  public void visit(File file) {
    System.out.println(currentDir + "/" + file);
  }

  @Override
  public void visit(Directory directory) {

    System.out.println(currentDir + "/" + directory);
    //and then, visitint items in the dir by accepting them in the loop
    String dirBackup = currentDir;
    currentDir = currentDir + "/" + directory.getName();
		Iterator it = directory.iterator();
    while (it.hasNext()) {
      Entry entry = (Entry)it.next();
      entry.accept(this);
    }
    currentDir = dirBackup;

  }

}
