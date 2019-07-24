class MyList {
    int data;
    MyList next;
}

class ThreadStack {
   MyList ls = null;

    void push(int x) {
        synchronized (this) {
            MyList t = ls;
            ls = new MyList();
            ls.data = x;
            ls.next = t;
        }
    }

    int pop() {
        int t;
        synchronized (this) {
            if (ls == null) return -1;
            t = ls.data;
            ls = ls.next;
        }
        return t;
    }

    void printElts() {
        int x;
        System.out.println("BEGIN");
        while ((x=pop()) != -1) {
            System.out.println(x);
        }
    }
}

public class ThreadMain extends Thread {
    boolean mode;
    ThreadStack st;

    ThreadMain(ThreadStack s, boolean m) { 
	st = s; 
	mode = m; 
    }

    public void run() {
        if (mode) {
            for (int i=0; i < 3; i++) {
                st.push(i);
            }
        } else {
            for (int i=0; i < 3; i++) {
                st.pop();
            }
        }
    }

    public static void main(String [] args) {
        ThreadStack st = new ThreadStack();
        ThreadMain t1 = new ThreadMain(st,true); //##3##
        ThreadMain t2 = new ThreadMain(st,false); //##4##
    
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {}
        st.printElts();
        System.out.println("END");
    }
}
