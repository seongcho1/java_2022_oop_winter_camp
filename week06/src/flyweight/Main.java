package flyweight;

import java.io.IOException;

public class Main {
  public static void main(String[] args) {

    //String currentPath = new java.io.File(".").getCanonicalPath();
    //System.out.println("Current dir:" + currentPath);

    BigString bs = new BigString("123abc123");
    bs.print();
  }
}




