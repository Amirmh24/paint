import java.awt.*;
import java.util.Random;

public class Spray extends Thread {
    Point go;
    PaintPanel P;
    int stroke;
    Color color;
    Random r=new Random(  );

    public Spray(PaintPanel P, Point go,int stroke,Color color) {
        this.P = P;
        this.go = go;
        this.stroke=stroke;
        this.color=color;
    }
    @Override
    public void run() {
        int xf0=-20*stroke+r.nextInt(40*stroke);
        int yf0=-20*stroke+r.nextInt(40*stroke);
        int xf1=-10*stroke+r.nextInt(20*stroke);
        int yf1=-10*stroke+r.nextInt(20*stroke);
        int xf2=-5*stroke+r.nextInt(10*stroke);
        int yf2=-5*stroke+r.nextInt(10*stroke);
        P.getShapes().add( new Circle( go.x+xf0-1,go.y+yf0-1, go.x+xf0+1,go.y+yf0+1,color,color,stroke) );
        P.getShapes().add( new Circle( go.x+xf1-1,go.y+yf1-1, go.x+xf1+1,go.y+yf1+1,color,color,stroke) );
        P.getShapes().add( new Circle( go.x+xf2-1,go.y+yf2-1, go.x+xf2+1,go.y+yf2+1,color,color,stroke) );
        try {
            sleep( 1 );
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        P.repaint(  );
    }
}
