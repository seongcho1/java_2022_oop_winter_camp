package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BigChar {
  char c;
  ArrayList<String> list;

  public BigChar(char c) {
    this.c = c;

    FileReader fr = null;
    BufferedReader br = null;

    try {
      fr = new FileReader("./data/big"+ c + ".txt");
      br = new BufferedReader(fr);

      list = new ArrayList<String>();

      String line;
      while ((line = br.readLine()) != null) {
        list.add(line);
      }
    } catch (IOException e) {
    } finally {
     try {
      if (fr != null)
        fr.close();
      if (br != null)
        br.close();

     } catch (IOException e) {
      e.printStackTrace();
     }
    }
  }

  public void print() {
    if (list != null) {
      for(String l: list) {
        System.out.printf("%s\n", l);
      }
    }else {
      System.out.printf("%c?", c);
    }
  }
}
