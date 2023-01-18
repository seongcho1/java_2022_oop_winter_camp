package flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class BigChar {

  private ArrayList<String> data;
  private char c;

  public BigChar(char c) {
    data = new ArrayList<>();
    this.c = c;

    FileReader fr = null;
    BufferedReader br = null;
    String fileName = "./week06/data/big" + c + ".txt";

    try {
      fr = new FileReader(fileName);
      br = new BufferedReader(fr);

      for (int i=0; i<8; i++) {
        data.add(br.readLine());
      }

    } catch (IOException e) {
      //e.printStackTrace();
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
    if (data.isEmpty()) {
      System.out.print(c + "?");
    } else {
      for (String datum : data) {
        System.out.println(datum);
      }
    }
  }

}
