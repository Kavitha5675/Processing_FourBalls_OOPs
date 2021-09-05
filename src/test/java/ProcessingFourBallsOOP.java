import processing.core.PApplet;
public class ProcessingFourBallsOOP extends processing.core.PApplet {

    public static final int WIDTH = 360;
    public static final int HEIGHT = 360;

    public static void main(String[] args)
    {
        PApplet.main("ProcessingFourBallsOOP",args);
    }
    DrawCircle draw_circle1=new DrawCircle(this,0,HEIGHT/5,1);
    DrawCircle draw_circle2=new DrawCircle(this,0,2*HEIGHT/5,2);
    DrawCircle draw_circle3=new DrawCircle(this,0,3*HEIGHT/5, 3);
    DrawCircle draw_circle4=new DrawCircle(this,0,4*HEIGHT/5, 4);
    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);

    }

    @Override
    public void setup() {
        super.setup();

    }

    @Override
    public void draw() {
        draw_circle1.draw();
        draw_circle2.draw();
        draw_circle3.draw();
        draw_circle4.draw();

    }
}
