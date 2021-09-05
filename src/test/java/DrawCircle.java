import processing.core.PApplet;
public class DrawCircle {
    int x,y,speed;
    public static final int DIAMETER = 10;
    PApplet stretch;
    public DrawCircle(PApplet stretch,int width,int height,int speed)
    {
        x=width;
        y=height;
        this.speed=speed;
        this.stretch=stretch;
    }

    public void draw() {
        stretch.ellipse(x,y,DIAMETER,DIAMETER);
        x+=speed;
    }

}
