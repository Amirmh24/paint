import java.awt.*;

public class Rectangle extends Component {
    private int x0;
    private int y0;
    private int x1;
    private int y1;
    private int w;
    private int h;
    private int thick;
    private Color color;
    private MoveThread mt;
    private GrowThread gt;
    private Color stro;
    private GrowRRThread grrt;
    private MoveRRThread mrrt;

    public GrowRRThread getGrrt() {
        return grrt;
    }

    public void setGrrt(GrowRRThread grrt) {
        this.grrt = grrt;
    }

    public MoveRRThread getMrrt() {
        return mrrt;
    }

    public void setMrrt(MoveRRThread mrrt) {
        this.mrrt = mrrt;
    }

    public Color getStro() {
        return stro;
    }

    public void setStro(Color stro) {
        this.stro = stro;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setH(int h) {
        this.h = h;
    }

    public MoveThread getMt() {
        return mt;
    }

    public void setMt(MoveThread mt) {
        this.mt = mt;
    }

    public GrowThread getGt() {
        return gt;
    }

    public void setGt(GrowThread gt) {
        this.gt = gt;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public void setX1(int a) {
        this.x1 = a;
        w = x1 - x0;
        h = y1 - y0;
    }

    public void setY1(int b) {
        this.y1 = b;
        w = x1 - x0;
        h = y1 - y0;
    }
    public int getThick() {
        return thick;
    }

    public void setThick(int thick) {
        this.thick = thick;
    }

    public int getX0() {
        return x0;
    }

    public int getY0() {
        return y0;
    }

    public int getX1() {
        return x1;
    }

    public int getY1() {
        return y1;
    }

    public int getW() {
        return Math.abs( x1 - x0 );
    }

    public int getH() {
        return Math.abs( y1 - y0 );
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Rectangle(int vx0, int vy0, int vx1, int vy1, Color color, Color stro,int thick) {
        if (vx1 > vx0) {
            this.x1 = vx1;
            this.x0 = vx0;
        }
        if (vx1 < vx0) {
            this.x1 = vx0;
            this.x0 = vx1;
        }
        if (vy1 > vy0) {
            this.y1 = vy1;
            this.y0 = vy0;
        }
        if (vy1 < vy0) {
            this.y1 = vy0;
            this.y0 = vy1;
        }
        w = x1 - x0;
        h = y1 - y0;
        this.color = color;
        this.stro = stro;
        this.thick=thick;
    }



    public void draw(Graphics gg, Color c, Color stro, int thickness) {
        thickness=thickness/2;
        gg.setColor( stro );
        gg.fillRect( x0 - thickness, y0 - thickness, w + 2*thickness, h + 2*thickness );
        gg.setColor( c );
        gg.fillRect( x0, y0, w, h );
    }
}
