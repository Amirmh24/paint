import java.awt.*;

public class Img extends Component {
    private int x0;
    private int y0;
    private int x1;
    private int y1;
    private Image img;
    private MoveThread mt;
    private GrowThread gt;
    private int w;
    private int h;
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
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getW(){
        return Math.abs( x1-x0 );
    }

    public int getH(){ return Math.abs( y1-y0 ); }

    public Img(int vx0, int vy0, int vx1, int vy1, Image img) {

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

        this.img = img.getScaledInstance( Math.abs( x1 - x0 ), Math.abs( y1 - y0 ), Image.SCALE_DEFAULT );
    }
    public int getWidth(){ return Math.abs( x1-x0 ); }

    public int getHieght(){
        return Math.abs( y1-y0 );
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public void draw(Graphics gg) {
        gg.drawImage( this.getImg(), x0, y0, null );

    }
}
