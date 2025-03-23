import java.awt.*;

public class GrowThread extends Thread {
    Component shape;
    double XX;
    PaintPanel P;
    double X;

    public double getX() {
        return X;
    }

    public void setX(double X) {
        this.X = X;
    }

    public GrowThread(PaintPanel P, Component s, double a) {
        this.shape = s;
        this.P = P;
        this.X = a;
        if (shape instanceof Circle) {
            this.XX = ((Circle) shape).getR() * a;
        }
        if (shape instanceof Rectangle) {
            this.XX = ((Rectangle) shape).getW() * a;
        }
        if (shape instanceof Img) {
            this.XX = ((Img) shape).getW() * a;
        }
    }

    @Override
    public void run() {
        if (this.X > 1) {
            if (shape instanceof Circle) {
                for (int i = 0; i < XX - ((Circle) shape).getR(); i++) {
                    ((Circle) shape).setX0( ((Circle) shape).getX0() - i );
                    ((Circle) shape).setY0( ((Circle) shape).getY0() - i );
                    ((Circle) shape).setX1( ((Circle) shape).getX1() + 2 * i );
                    ((Circle) shape).setY1( ((Circle) shape).getY1() + 2 * i );
                    try {
                        sleep( 100 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    P.repaint();
                }
            }
            if (shape instanceof Rectangle) {
                double ss = ((double) (((Rectangle) shape).getH())) / ((double) (((Rectangle) shape).getW()));
                for (int i = 0; i < XX - (((Rectangle) shape).getW()); i++) {
                    ((Rectangle) shape).setX0( ((Rectangle) shape).getX0() - i );
                    ((Rectangle) shape).setY0( ((Rectangle) shape).getY0() - (int) (i * ss) );
                    ((Rectangle) shape).setX1( ((Rectangle) shape).getX1() + 2 * i );
                    ((Rectangle) shape).setY1( ((Rectangle) shape).getY1() + 2 * (int) (i * ss) );
                    try {
                        sleep( 100 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    P.repaint();
                }
            }
            if (shape instanceof Img) {
                double ss = ((double) (((Img) shape).getH())) / ((double) (((Img) shape).getW()));
                for (int i = 0; i < XX - (((Img) shape).getW()); i++) {
                    ((Img) shape).setX0( ((Img) shape).getX0() - i );
                    ((Img) shape).setY0( ((Img) shape).getY0() - (int) (i * ss) );
                    ((Img) shape).setX1( ((Img) shape).getX1() + 2 * i );
                    ((Img) shape).setY1( ((Img) shape).getY1() + 2 * (int) (i * ss) );
                    try {
                        sleep( 100 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    P.repaint();
                }
            }
        }else{
            if (shape instanceof Circle) {
                for (int i = 0; i < ((Circle) shape).getR()-XX; i++) {
                    ((Circle) shape).setX0( ((Circle) shape).getX0() + i );
                    ((Circle) shape).setY0( ((Circle) shape).getY0() + i );
                    ((Circle) shape).setX1( ((Circle) shape).getX1() - 2 * i );
                    ((Circle) shape).setY1( ((Circle) shape).getY1() - 2 * i );
                    try {
                        sleep( 100 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    P.repaint();
                }
            }
            if (shape instanceof Rectangle) {
                double ss = ((double) (((Rectangle) shape).getH())) / ((double) (((Rectangle) shape).getW()));
                for (int i = 0; i < (((Rectangle) shape).getW())-XX; i++) {
                    ((Rectangle) shape).setX0( ((Rectangle) shape).getX0() + i );
                    ((Rectangle) shape).setY0( ((Rectangle) shape).getY0() + (int) (i * ss) );
                    ((Rectangle) shape).setX1( ((Rectangle) shape).getX1() - 2 * i );
                    ((Rectangle) shape).setY1( ((Rectangle) shape).getY1() - 2 * (int) (i * ss) );
                    try {
                        sleep( 100 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    P.repaint();
                }
            }
            if (shape instanceof Img) {
                double ss = ((double) (((Img) shape).getH())) / ((double) (((Img) shape).getW()));
                for (int i = 0; i < (((Img) shape).getW())-XX; i++) {
                    ((Img) shape).setX0( ((Img) shape).getX0() + i );
                    ((Img) shape).setY0( ((Img) shape).getY0() + (int) (i * ss) );
                    ((Img) shape).setX1( ((Img) shape).getX1() - 2 * i );
                    ((Img) shape).setY1( ((Img) shape).getY1() - 2 * (int) (i * ss) );
                    try {
                        sleep( 100 );
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    P.repaint();
                }
            }

        }
    }
}
