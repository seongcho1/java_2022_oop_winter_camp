package proxy;

public class PrinterProxy implements Printable {
  private String name; // 이름
  private Printer real; // "본인"

  public PrinterProxy(String name) { // 생성자
    this.name = name;
  }

  public synchronized void setPrinterName(String name) { // 이름의 설정
    //Todo
    System.out.println("proxy : setPrinterName()");
    this.name = name;
    if (real != null) {
      real.setPrinterName(name);
    }

  }

  public String getPrinterName() { // 이름의 취득
    System.out.println("proxy : getPrinterName()");
    return name;
  }
  public void print(String string) { // 표시
    // ToDo
    if (real == null) {
      this.realize();
    }

    real.print(string);


  }
  private synchronized void realize() { // "본인"을 생성
    //Todo
    real = new Printer(name);

  }
}
