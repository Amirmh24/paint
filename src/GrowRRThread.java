import java.awt.*;

public class GrowRRThread extends Thread {
    private GrowThread gb;
    private GrowThread gs;

    public GrowRRThread(PaintPanel P, Component s, double a) {
        if(a>0) {
            this.gb = new GrowThread( P, s, a );
            this.gs = new GrowThread( P, s, 1 );
        } else {
            this.gb = new GrowThread( P, s, 1 );
            this.gs = new GrowThread( P, s,a );
        }
    }

    public GrowThread getGb() {
        return gb;
    }

    public void setGb(GrowThread gb) {
        this.gb = gb;
    }

    public GrowThread getGs() {
        return gs;
    }

    public void setGs(GrowThread gs) {
        this.gs = gs;
    }

    @Override
    public void run() {
        while (true) {
            gb.run();

            while (gb.isAlive()) {
                try {
                    sleep( 100 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            gs.run();
            while (gs.isAlive()) {
                try {
                    sleep( 100 );
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

