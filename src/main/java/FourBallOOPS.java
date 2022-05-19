import processing.core.PApplet;

public class FourBallOOPS extends DrawCircle {


    public static void main(String[] args) { PApplet.main("FourBallOOPS", args);
        DrawCircle obj = new DrawCircle();
        obj.draw();
    }
}

class DrawCircle extends PApplet{

    public static final int DIAMETER = 10;
    public static final int SCREEN_WIDTH = 640;
    public static final int SCREEN_HEIGHT = 320;
    int x1 = 0, x2 = 0, x3 = 0, x4 = 0;


    @Override
    public void settings() {
        super.settings(); // called by processing
        size(SCREEN_WIDTH, SCREEN_HEIGHT);
    }

    @Override
    public void setup() {   // called by processor
        //ellipse(WIDTH/2, HEIGHT/2,100,100); // code smells - refactoring
    }

    @Override
    public void draw() {
        //paintWhite();
        drawCircleOne();
        drawCircleTwo();
        drawCircleThree();
        drawCircleFour();
    }

    private void drawCircleOne() {

        ellipse(x1, SCREEN_HEIGHT / 5, DIAMETER, DIAMETER);

        x1++;
    }

    private void drawCircleTwo() {

        ellipse(x2, (SCREEN_HEIGHT * 2) / 5, DIAMETER, DIAMETER);
        x2 += 2;
    }

    private void drawCircleThree() {

        ellipse(x3, (SCREEN_HEIGHT * 3) / 5, DIAMETER, DIAMETER);
        x3 += 3;
    }

    private void drawCircleFour() {

        ellipse(x4, (SCREEN_HEIGHT * 4) / 5, DIAMETER, DIAMETER);
        x4 += 4;
    }

    private void paintWhite() {
        background(255);
    }
}