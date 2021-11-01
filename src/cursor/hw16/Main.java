package cursor.hw16;

public class Main {

    public static void main(String[] args) {

        Table table = new Table();
        ThreadClass thread1 = new ThreadClass("Thread1", table);
        ThreadClass thread2 = new ThreadClass("Thread2", table);

        thread1.start();
        thread2.start();
    }
}
