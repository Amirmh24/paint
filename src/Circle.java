import java.awt.*;

public class Circle extends Component {
    private int x0;
    private int y0;
    private int x1;
    private int y1;
    private int x11;
    private int y11;
    private int r;
    private int thick;
    private Color color;
    private Color stro;
    private MoveThread mt;
    private GrowThread gt;
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

    public int getThick() {
        return thick;
    }

    public void setThick(int thick) {
        this.thick = thick;
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

    public int getX11() {
        return x11;
    }

    public void setX11(int x11) {
        this.x11 = x11;
    }

    public int getY11() {
        return y11;
    }

    public void setY11(int y11) {
        this.y11 = y11;
    }

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    public int getX0() {
        return x0;
    }

    public void setX0(int x0) {
        this.x0 = x0;
    }

    public int getY0() {
        return y0;
    }

    public void setY0(int y0) {
        this.y0 = y0;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
        int a1 = Math.abs( (x1 - x0) / 3 * 2 );
        int a2 = Math.abs( (y1 - y0) / 3 * 2 );
        r = (int) Math.sqrt( a1 * a1 + a2 * a2 );
        x11 = x0 + r;
        y11 = y0 + r;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
        int a1 = Math.abs( (x1 - x0) / 3 * 2 );
        int a2 = Math.abs( (y1 - y0) / 3 * 2 );
        r = (int) Math.sqrt( a1 * a1 + a2 * a2 );
        x11 = x0 + r;
        y11 = y0 + r;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public Color getStro() {
        return stro;
    }

    public void setStro(Color stro) {
        this.stro = stro;
    }

    public Circle(int vx0, int vy0, int vx1, int vy1, Color color, Color stro, int thick) {

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
        int a1 = Math.abs( (x1 - x0) / 3 * 2 );
        int a2 = Math.abs( (y1 - y0) / 3 * 2 );
        r = (int) Math.sqrt( a1 * a1 + a2 * a2 );
        x11 = x0 + r;
        y11 = y0 + r;
        this.color = color;
        this.stro = stro;
        this.thick = thick;
    }

    public void draw(Graphics gg, Color c, Color stro, int thickness) {
        thickness = thickness / 2;
        gg.setColor( stro );
        gg.fillOval( x0 - thickness, y0 - thickness, r + 2 * thickness, r + 2 * thickness );
        gg.setColor( c );
        this.color = c;
        gg.fillOval( x0, y0, r, r );


    }

}
