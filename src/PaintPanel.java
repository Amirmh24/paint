import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class PaintPanel extends JPanel {
    private ArrayList<Component> shapes = new ArrayList<>();

    @Override

    public void paintComponent(Graphics g) {
        super.paintComponent( g );
        setBackground( Color.white );
        for (int i = 0; i < shapes.size(); i++) {

            if (shapes.get( i ) instanceof Circle) {
                ((Circle) shapes.get( i )).draw( g, ((Circle) shapes.get( i )).getColor(),((Circle) shapes.get( i )).getStro(),((Circle) shapes.get( i )).getThick());
            }
            if (shapes.get( i ) instanceof Rectangle) {
                ((Rectangle) shapes.get( i )).draw( g, ((Rectangle) shapes.get( i )).getColor(),((Rectangle) shapes.get( i )).getStro(),((Rectangle) shapes.get( i )).getThick());
            }
            if (shapes.get( i ) instanceof Line) {
                ((Line) shapes.get( i )).draw( g, ((Line) shapes.get( i )).getColor());
            }
            if (shapes.get( i ) instanceof Img) {
                ((Img) shapes.get( i )).draw( g );
            }
        }
    }

    public PaintPanel() {
    }

    public ArrayList<Component> getShapes() {
        return shapes;
    }

    public void setShapes(ArrayList<Component> shapes) {
        this.shapes = shapes;
    }
}

