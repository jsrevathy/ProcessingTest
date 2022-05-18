import processing.core.PApplet;

public class TryProcessing extends PApplet {

    public static final int WIDTH = 320;
    public static final int height = 240;
    public static final int HEIGHT = height;
    public static final int DIAMETER = 30;
    public static final int SCREEN_WIDTH = 1000;
    public static final int SCREEN_HEIGHT = 1000;
    int x1=0,x2=0,x3=0,x4=0;

    public static void main(String[] args) { PApplet.main("TryProcessing", args); } // java calls it

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

        ellipse(x1, SCREEN_HEIGHT/6, DIAMETER,DIAMETER);

        x1++;
    }

    private void drawCircleTwo() {

        ellipse(x2, (SCREEN_HEIGHT*2)/6, DIAMETER,DIAMETER);
        x2 +=2;
    }

    private void drawCircleThree() {

        ellipse(x3, (SCREEN_HEIGHT*3)/6, DIAMETER,DIAMETER);
        x3 +=3;
    }

    private void drawCircleFour() {

        ellipse(x4, (SCREEN_HEIGHT*4)/6, DIAMETER,DIAMETER);
        x4 +=4;
    }

    private void paintWhite() {
        background(255);
    }
}