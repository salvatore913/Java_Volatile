public class Game {

    public static volatile boolean button;

    public static void main(String[] args) {
        Thread threadUser = new Thread(new User());
        Thread threadToy = new Thread(new Toy());
        threadUser.start();
        threadToy.start();
        try {
            threadUser.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadToy.interrupt();
    }
}