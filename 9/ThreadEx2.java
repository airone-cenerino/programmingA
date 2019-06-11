class ThreadXX2 extends Thread {
  MessagePrint m = null;

  public ThreadXX2(MessagePrint nm) {
    super();
    m = nm;
  }

  public void run() {
    while(true) {
      m.message("XX");
    } 
  }
}

class ThreadYY2 extends Thread {
  MessagePrint m = null;

  public ThreadYY2(MessagePrint nm) {
    super();
    m = nm;
  }

  public synchronized void run() {
    while(true) {
      m.message("YY");
    }
  }
}

class MessagePrint {
  public synchronized void message(String text) {
    notifyAll();
    System.out.println(text);
    try {   
      wait();
    } catch (InterruptedException e) {
    }  
  }
}

public class ThreadEx2 {
  public static void main(String[] args) {
    MessagePrint m = new MessagePrint();
    new ThreadXX2(m).start();
    new ThreadYY2(m).start();
  }
}
