import java.awt.*;

public class MoveThread extends Thread {
    Component shape;
    Point go;
    PaintPanel P;

    public MoveThread(PaintPanel P, Component s, Point go) {
        this.shape = s;
        this.P = P;
        this.go = go;
    }

    public Point getGo() {
        return go;
    }

    public void setGo(Point go) {
        this.go = go;
    }

    @Override
    public void run() {

        if (Math.abs( go.x ) >= Math.abs( go.y )) {
            double ss = -((double) (go.y) / (double) (go.x));
            if (go.x >= 0) {
                if (shape instanceof Circle) {
                    for (int i = 0; i < go.x; i++) {
                        ((Circle) shape).setX0( ((Circle) shape).getX0() + i );
                        ((Circle) shape).setY0( ((Circle) shape).getY0() + (int) (ss * i) );
                        ((Circle) shape).setX1( ((Circle) shape).getX1() + i );
                        ((Circle) shape).setY1( ((Circle) shape).getY1() + (int) (ss * i) );
                        try {
                            sleep( 100 );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        P.repaint();
                    }
                }
                if (shape instanceof Rectangle) {
                    for (int i = 0; i < go.x; i++) {
                        ((Rectangle) shape).setX0( ((Rectangle) shape).getX0() + i );
                        ((Rectangle) shape).setY0( ((Rectangle) shape).getY0() + (int) (i * ss) );
                        ((Rectangle) shape).setX1( ((Rectangle) shape).getX1() + i );
                        ((Rectangle) shape).setY1( ((Rectangle) shape).getY1() + (int) (ss * i) );

                        try {
                            sleep( 100 );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        P.repaint();
                    }
                }
                if (shape instanceof Img) {
                    for (int i = 0; i < go.x; i++) {
                        ((Img) shape).setX0( ((Img) shape).getX0() + i );
                        ((Img) shape).setY0( ((Img) shape).getY0() + (int) (i * ss) );
                        ((Img) shape).setX1( ((Img) shape).getX1() + i );
                        ((Img) shape).setY1( ((Img) shape).getY1() + (int) (i * ss) );
                        try {
                            sleep( 100 );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        P.repaint();
                    }
                }
            }
            if (go.x < 0) {
                if (shape instanceof Circle) {
                    for (int i = 0; i < -go.x; i++) {
                        ((Circle) shape).setX0( ((Circle) shape).getX0() - i );
                        ((Circle) shape).setY0( ((Circle) shape).getY0() - (int) (ss * i) );
                        ((Circle) shape).setX1( ((Circle) shape).getX1() - i );
                        ((Circle) shape).setY1( ((Circle) shape).getY1() - (int) (ss * i) );
                        try {
                            sleep( 100 );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        P.repaint();
                    }
                }
                if (shape instanceof Rectangle) {
                    for (int i = 0; i < -go.x; i++) {
                        ((Rectangle) shape).setX0( ((Rectangle) shape).getX0() - i );
                        ((Rectangle) shape).setY0( ((Rectangle) shape).getY0() - (int) (i * ss) );
                        ((Rectangle) shape).setX1( ((Rectangle) shape).getX1() - i );
                        ((Rectangle) shape).setY1( ((Rectangle) shape).getY1() - (int) (ss * i) );

                        try {
                            sleep( 100 );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        P.repaint();
                    }
                }
                if (shape instanceof Img) {
                    for (int i = 0; i < -go.x; i++) {
                        ((Img) shape).setX0( ((Img) shape).getX0() - i );
                        ((Img) shape).setY0( ((Img) shape).getY0() - (int) (i * ss) );
                        ((Img) shape).setX1( ((Img) shape).getX1() - i );
                        ((Img) shape).setY1( ((Img) shape).getY1() - (int) (i * ss) );
                        try {
                            sleep( 100 );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        P.repaint();
                    }
                }
            }
        } else {
            double ss = ((double) (go.x) / (double) (go.y));
            if (go.y >= 0) {
                if (shape instanceof Circle) {
                    for (int i = 0; i < go.y; i++) {
                        ((Circle) shape).setX0( ((Circle) shape).getX0() + (int) (ss * i) );
                        ((Circle) shape).setY0( ((Circle) shape).getY0() - i );
                        ((Circle) shape).setX1( ((Circle) shape).getX1() + (int) (ss * i) );
                        ((Circle) shape).setY1( ((Circle) shape).getY1() - i );
//
                        try {
                            sleep( 100 );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        P.repaint();
                    }
                }
                if (shape instanceof Rectangle) {
                    for (int i = 0; i < go.y; i++) {
                        ((Rectangle) shape).setX0( ((Rectangle) shape).getX0() + (int) (ss * i) );
                        ((Rectangle) shape).setY0( ((Rectangle) shape).getY0() - i );
                        ((Rectangle) shape).setX1( ((Rectangle) shape).getX1() + (int) (ss * i) );
                        ((Rectangle) shape).setY1( ((Rectangle) shape).getY1() - i );
                        try {
                            sleep( 100 );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        P.repaint();
                    }
                }
                if (shape instanceof Img) {
                    for (int i = 0; i < go.y; i++) {
                        ((Img) shape).setX0( ((Img) shape).getX0() + (int) (ss * i) );
                        ((Img) shape).setY0( ((Img) shape).getY0() - i );
                        ((Img) shape).setX1( ((Img) shape).getX1() + (int) (ss * i) );
                        ((Img) shape).setY1( ((Img) shape).getY1() - i );

                        try {
                            sleep( 100 );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        P.repaint();
                    }
                }
            }
            if (go.y < 0) {
                if (shape instanceof Circle) {
                    for (int i = 0; i < -go.y; i++) {
                        ((Circle) shape).setX0( ((Circle) shape).getX0() - (int) (ss * i) );
                        ((Circle) shape).setY0( ((Circle) shape).getY0() + i );
                        ((Circle) shape).setX1( ((Circle) shape).getX1() - (int) (ss * i) );
                        ((Circle) shape).setY1( ((Circle) shape).getY1() + i );
//
                        try {
                            sleep( 100 );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        P.repaint();
                    }
                }
                if (shape instanceof Rectangle) {
                    for (int i = 0; i < -go.y; i++) {
                        ((Rectangle) shape).setX0( ((Rectangle) shape).getX0() - (int) (ss * i) );
                        ((Rectangle) shape).setY0( ((Rectangle) shape).getY0() + i );
                        ((Rectangle) shape).setX1( ((Rectangle) shape).getX1() - (int) (ss * i) );
                        ((Rectangle) shape).setY1( ((Rectangle) shape).getY1() + i );
                        try {
                            sleep( 100 );
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        P.repaint();
                    }
                }
                if (shape instanceof Img) {
                    for (int i = 0; i < -go.y; i++) {
                        ((Img) shape).setX0( ((Img) shape).getX0() - (int) (ss * i) );
                        ((Img) shape).setY0( ((Img) shape).getY0() + i );
                        ((Img) shape).setX1( ((Img) shape).getX1() - (int) (ss * i) );
                        ((Img) shape).setY1( ((Img) shape).getY1() + i );
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
}


