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

    try {
      FileReader fr = new FileReader("./data/big"+ c + ".txt");
      BufferedReader br = new BufferedReader(fr);

      list = new ArrayList<String>();

      String line;
      while ((line = br.readLine()) != null) {
        list.add(line);
      }
    } catch (IOException e) {
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
