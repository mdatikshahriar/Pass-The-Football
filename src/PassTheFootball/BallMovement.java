package PassTheFootball;

public class BallMovement {

    private static int x = 10;
    private static int y = 6;

    public BallMovement(int x, int y) {

        BallMovement.x = x;
        BallMovement.y = y;
    }

    public static int getX() {
        return x;
    }

    public static void setX(int x) {
        BallMovement.x = x;
    }

    public static int getY() {
        return y;
    }

    public static void setY(int y) {
        BallMovement.y = y;
    }
}
