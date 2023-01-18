package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BigChar {

  private ArrayList<String> data;

  public BigChar(char c) {
    data = new ArrayList<>();
    FileReader fr = null;
    BufferedReader br = null;

    try {

    } catch (IOException e) {
      e.printStackTrace();
    } finally {
      if (fr != null)
        fr.close();
    }





  }










  public void print() {
  }

}
