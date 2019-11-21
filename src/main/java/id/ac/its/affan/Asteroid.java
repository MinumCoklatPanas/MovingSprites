package id.ac.its.affan;

public class Asteroid extends Sprite {

    private final int ASTEROID_SPEED = 2;

    public Asteroid(int x, int y) {
        super(x, y);

        initAsteroid();
    }

    private void initAsteroid() {

        loadImage("src/resources/asteroid.png");
        getImageDimensions();
    }

    public void move() {

        x -= ASTEROID_SPEED;
        if (x <= -100) {
            visible = false;
        }
    }
}
