public class User implements Runnable {

    private final int ENABLING = 6;
    private final int USER_PAUSE = 1500;
     private final boolean ON_BUTTON = true;


    @Override
    public void run() {
        for (int i = 0; i < ENABLING; i++) {
            if (!Game.button) {
                Game.button = ON_BUTTON;
                System.out.println("Пользователь нажал на кнопку");
                try {
                    Thread.sleep(USER_PAUSE);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
