package cursor.hw16;

public class ThreadClass extends Thread {
    private static int counter = 1;
    private final String threadName;
    private final Table table;

    public ThreadClass(String threadName, Table table) {
        this.table = table;
        this.threadName = threadName;
    }

    @Override
    public void run() {
        synchronized (this.table) {
            for (int i = 1; i < 11; i++) {
                table.notify();

                System.out.println(threadName + " - " + counter++);

                try {
                    if (i != 10) {
                        table.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
