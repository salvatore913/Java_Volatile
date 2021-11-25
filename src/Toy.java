public class Toy implements  Runnable {

    private final boolean OFF_BUTTON = false;

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()) {
            if (Game.button) {
                Game.button = OFF_BUTTON;
                System.out.println("Монстр вылез из коробки и отжал кнопку");
            }
        }
        System.out.println();
        System.out.println("Пользователь наигрался, game over");
    }
}

