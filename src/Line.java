import java.awt.*;

public class Line extends Component {
    private int x0;
    private int y0;
    private int x1;
    private int y1;
private int str;
    private Color color;

    public Line(int x0, int y0, int x1, int y1, Color color, int str) {
        this.x0 = x0;
        this.y0 = y0;
        this.x1 = x1;
        this.y1 = y1;
        this.color = color;
        this.str=str;

    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX0() { return x0; }

    public int getY0() {
        return y0;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void draw(Graphics gg, Color c) {
        Graphics2D g2 = (Graphics2D) gg;
        g2.setColor( c );
        g2.setStroke( new BasicStroke( str ) );
        g2.drawLine( x0, y0, x1, y1 );

    }

}
