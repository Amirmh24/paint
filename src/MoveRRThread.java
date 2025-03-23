import java.awt.*;

public class MoveRRThread extends Thread {
    private MoveThread mb;
    private MoveThread ms;

    public MoveRRThread(PaintPanel P, Component s, Point go) {

        this.mb = new MoveThread( P, s, go );
        Point go1=new Point(  );
        go1.setLocation( -go.x,-go.y );
        this.ms = new MoveThread( P, s, go1 );

    }

    public MoveThread getMb() {
        return mb;
    }

    public void setMb(MoveThread mb) {
        this.mb = mb;
    }

    public MoveThread getMs() {
        return ms;
    }

    public void setMs(MoveThread ms) {
        this.ms = ms;
    }

    @Override
    public void run() {
        while (true) {
            mb.run();
            while (mb.isAlive()) {
                try {
                    sleep( 100 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            ms.run();
            while (ms.isAlive()) {
                try {
                    sleep( 100 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
