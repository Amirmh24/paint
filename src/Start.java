import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Start extends JFrame implements MouseListener, MouseMotionListener {
    JPanel shapePanel = new JPanel();
    JPanel animationPanel = new JPanel();
    JPanel downPanel = new JPanel();
    JPanel contentpane = (JPanel) getContentPane();

    JLabel details = new JLabel();
    JLabel em2 = new JLabel();
    JLabel shapePropertyLabel = new JLabel();
    JLabel animLabel = new JLabel();
    JLabel toolsLabel = new JLabel();
    JLabel shapesLabel = new JLabel();
    JLabel width = new JLabel();
    JLabel wid = new JLabel();
    JLabel height = new JLabel();
    JLabel hei = new JLabel();
    JLabel radius = new JLabel();
    JLabel rad = new JLabel();
    JLabel picture = new JLabel();
    JLabel pic = new JLabel();
    JLabel grow1 = new JLabel();
    JLabel g1 = new JLabel();
    JLabel move1 = new JLabel();
    JLabel m1 = new JLabel();

    JButton[][] map = new JButton[3][3];
    PaintPanel paintPanel = new PaintPanel();
    String a = null;
    ArrayList<GrowThread> growThreads = new ArrayList<GrowThread>();
    ArrayList<MoveThread> moveThreads = new ArrayList<MoveThread>();
    ArrayList<GrowRRThread> growRRThreads = new ArrayList<GrowRRThread>();
    ArrayList<MoveRRThread> moveRRThreads = new ArrayList<MoveRRThread>();
    Icon circleIcon = new ImageIcon( "circleIcon.jpg" );
    Icon lineIcon = new ImageIcon( "lineIcon.jpg" );
    Icon rectangleIcon = new ImageIcon( "rectangleIcon.jpg" );
    Icon playIcon = new ImageIcon( "playIcon.jpg" );
    Icon stopIcon = new ImageIcon( "stopIcon.jpg" );
    Icon imageIcon = new ImageIcon( "imageIcon.jpg" );
    Icon moveIcon = new ImageIcon( "moveIcon.jpg" );
    Icon colorIcon = new ImageIcon( "colorIcon.jpg" );
    Icon eraseIcon = new ImageIcon( "eraseIcon.jpg" );
    Icon clearallIcon = new ImageIcon( "clearallIcon.jpg" );
    Icon pencilIcon = new ImageIcon( "pencilIcon.jpg" );
    Icon sizeIcon = new ImageIcon( "sizeIcon.jpg" );
    Icon animemoveIcon = new ImageIcon( "animemoveIcon.jpg" );
    Icon animegrowIcon = new ImageIcon( "animegrowIcon.jpg" );
    Icon animemoveRRIcon = new ImageIcon( "animemoveRRIcon.jpg" );
    Icon animegrowRRIcon = new ImageIcon( "animegrowRRIcon.jpg" );
    Icon animechangeIcon = new ImageIcon( "animechangeIcon.jpg" );
    Icon mouseIcon = new ImageIcon( "mouseIcon.jpg" );
    Icon sprayIcon = new ImageIcon( "sprayIcon.jpg" );
    Icon zzsunIcon = new ImageIcon( "zzsunIcon.jpg" );
    Icon zzstarIcon = new ImageIcon( "zzstarIcon.jpg" );
    Icon zzmoonIcon = new ImageIcon( "zzmoonIcon.jpg" );
    Icon zzcloudIcon = new ImageIcon( "zzcloudIcon.jpg" );
    Icon zzeyeIcon = new ImageIcon( "zzeyeIcon.jpg" );
    Icon zzrainbowIcon = new ImageIcon( "zzrainbowIcon.jpg" );
    Icon zzleafIcon = new ImageIcon( "zzleafIcon.jpg" );
    Icon zzflowerIcon = new ImageIcon( "zzflowerIcon.jpg" );
    Icon zzheartIcon = new ImageIcon( "zzheartIcon.jpg" );
    Image stick;
    Component selectedShape;
    Component moveShape;
    Component drawingShape;
    Random random = new Random();
    Spray spray;
    int x0, x1, y0, y1;
    int xc, yc, dx, dy;
    int xdraw, ydraw;
    int kook = 0;
    int doo = 0;
    int stroke = 4;
    int estroke = 55;
    Image img, imgc;
    Line line;
    Color colorChoosed = new Color( 200, 200, 200 );
    Color strokeChoosed = new Color( 0, 0, 0 );
    boolean stop = false;

    public Start() throws HeadlessException {
        this.contentpane = (JPanel) getContentPane();
        shapePanel.setBackground( new Color( 113, 113, 113 ) );
        animationPanel.setBackground( new Color( 113, 113, 113 ) );
        shapePanel.setBorder( BorderFactory.createEmptyBorder( 0, 5, 0, 5 ) );
        animationPanel.setBorder( BorderFactory.createEmptyBorder( 0, 5, 0, 5 ) );
        JButton circle = new JButton( circleIcon );
        circle.setBackground( new Color( 113, 113, 113 ) );
        JButton rectangle = new JButton( rectangleIcon );
        rectangle.setBackground( new Color( 113, 113, 113 ) );
        JButton line = new JButton( lineIcon );
        line.setBackground( new Color( 113, 113, 113 ) );
        JButton image = new JButton( imageIcon );
        image.setBackground( new Color( 113, 113, 113 ) );
        JButton mouse = new JButton( mouseIcon );
        mouse.setBackground( new Color( 113, 113, 113 ) );
        JButton paintBucket = new JButton( colorIcon );
        paintBucket.setBackground( new Color( 113, 113, 113 ) );
        JButton pencil = new JButton( pencilIcon );
        pencil.setBackground( new Color( 113, 113, 113 ) );
        JButton moveShapes = new JButton( moveIcon );
        moveShapes.setBackground( new Color( 113, 113, 113 ) );
        JButton size = new JButton( sizeIcon );
        size.setBackground( new Color( 113, 113, 113 ) );
        JButton play = new JButton( playIcon );
        play.setBackground( new Color( 113, 113, 113 ) );
        JButton grow = new JButton( animegrowIcon );
        grow.setBackground( new Color( 113, 113, 113 ) );
        JButton move = new JButton( animemoveIcon );
        move.setBackground( new Color( 113, 113, 113 ) );
        JButton growRR = new JButton( animegrowRRIcon );
        growRR.setBackground( new Color( 113, 113, 113 ) );
        JButton moveRR = new JButton( animemoveRRIcon );
        moveRR.setBackground( new Color( 113, 113, 113 ) );
        JButton changeImage = new JButton( animechangeIcon );
        changeImage.setBackground( new Color( 113, 113, 113 ) );
        JButton erase = new JButton( eraseIcon );
        erase.setBackground( new Color( 113, 113, 113 ) );
        JButton clearAll = new JButton( clearallIcon );
        clearAll.setBackground( new Color( 113, 113, 113 ) );
        JButton spray = new JButton( sprayIcon );
        spray.setBackground( new Color( 113, 113, 113 ) );
        JButton color = new JButton();
        JButton sticker = new JButton( sprayIcon );
        sticker.setBackground( new Color( 113, 113, 113 ) );
        color.setFont( new Font( "Serif", Font.BOLD, 36 ) );
        color.setText( " ■ " );
        color.setPreferredSize( new Dimension( 20, 20 ) );
        color.setBackground( new Color( 113, 113, 113 ) );
        color.setForeground( colorChoosed );
        JButton stro = new JButton();
        stro.setFont( new Font( "Serif", Font.BOLD, 38 ) );
        stro.setText( "  |  " );
        stro.setPreferredSize( new Dimension( 20, 20 ) );
        stro.setBackground( new Color( 113, 113, 113 ) );
        stro.setForeground( colorChoosed );

        shapesLabel.setFont( new Font( "Serif", Font.BOLD, 28 ) );
        shapesLabel.setForeground( Color.BLACK );
        shapesLabel.setText( "Shapes" );
        toolsLabel.setFont( new Font( "Serif", Font.BOLD, 28 ) );
        toolsLabel.setForeground( Color.BLACK );
        toolsLabel.setText( "Tools" );
        animLabel.setFont( new Font( "Serif", Font.BOLD, 28 ) );
        animLabel.setForeground( Color.BLACK );
        animLabel.setText( "Effects" );
        shapePanel.setLayout( new BoxLayout( shapePanel, BoxLayout.Y_AXIS ) );
        animationPanel.setLayout( new BoxLayout( animationPanel, BoxLayout.Y_AXIS ) );

        shapePanel.add( shapesLabel );
        shapePanel.add( circle );
        shapePanel.add( rectangle );
        shapePanel.add( line );
        shapePanel.add( image );
        shapePanel.add( toolsLabel );
        shapePanel.add( mouse );
        shapePanel.add( pencil );
        shapePanel.add( spray );
        shapePanel.add( moveShapes );
        shapePanel.add( erase );
        shapePanel.add( sticker );
        shapePanel.add( paintBucket );
        shapePanel.add( clearAll );
        shapePanel.add( size );
        shapePanel.add( color );
        shapePanel.add( stro );

        animationPanel.add( animLabel );
        animationPanel.add( move );
        animationPanel.add( grow );
        animationPanel.add( moveRR );
        animationPanel.add( growRR );
        animationPanel.add( changeImage );
        animationPanel.add( em2 );
        animationPanel.add( details );
        animationPanel.add( width );
        animationPanel.add( wid );
        animationPanel.add( height );
        animationPanel.add( hei );
        animationPanel.add( radius );
        animationPanel.add( rad );
        animationPanel.add( picture );
        animationPanel.add( pic );
        animationPanel.add( grow1 );
        animationPanel.add( g1 );
        animationPanel.add( move1 );
        animationPanel.add( m1 );
        animationPanel.add( play );

        shapePanel.setPreferredSize( new Dimension( 100, 300 ) );
        animationPanel.setPreferredSize( new Dimension( 150, 200 ) );
        downPanel.setPreferredSize( new Dimension( 100, 40 ) );
        downPanel.setBorder( BorderFactory.createEmptyBorder( 20, 0, 0, 0 ) );
        downPanel.setBackground( new Color( 113, 113, 113 ) );
        this.setSize( Toolkit.getDefaultToolkit().getScreenSize() );
        this.setTitle( "Paint" );
        this.setMaximumSize( Toolkit.getDefaultToolkit().getScreenSize() );
        this.setMinimumSize( Toolkit.getDefaultToolkit().getScreenSize() );
        this.add( shapePanel, BorderLayout.EAST );
        this.add( animationPanel, BorderLayout.WEST );
        this.add( downPanel, BorderLayout.SOUTH );
        details.setText( "Details" );
        details.setFont( new Font( "Serif", Font.BOLD, 28 ) );
        details.setForeground( Color.BLACK );
        em2.setText( " " );
        em2.setFont( new Font( "Serif", Font.BOLD, 20 ) );
        width.setText( "Width :" );
        width.setForeground( Color.WHITE );
        width.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        wid.setText( "     -     " );
        wid.setForeground( Color.WHITE );
        wid.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        height.setText( "Height :" );
        height.setForeground( Color.WHITE );
        height.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        hei.setText( "     -     " );
        hei.setForeground( Color.WHITE );
        hei.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        radius.setText( "Radius :" );
        radius.setForeground( Color.WHITE );
        radius.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        rad.setText( "     -     " );
        rad.setForeground( Color.WHITE );
        rad.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        picture.setText( "Picture :" );
        picture.setForeground( Color.WHITE );
        picture.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        pic.setText( "     -     " );
        pic.setForeground( Color.WHITE );
        pic.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        grow1.setText( "Grow :" );
        grow1.setForeground( Color.WHITE );
        grow1.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        g1.setText( "     -     " );
        g1.setForeground( Color.WHITE );
        g1.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        move1.setText( "Move :" );
        move1.setForeground( Color.WHITE );
        move1.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        m1.setText( "     -     " );
        m1.setForeground( Color.WHITE );
        m1.setFont( new Font( "Serif", Font.BOLD, 24 ) );
        shapePropertyLabel.setFont( new Font( "Serif", Font.BOLD, 40 ) );
        this.add( paintPanel, BorderLayout.CENTER );

        circle.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = "c";
                setCursor( new Cursor( Cursor.CROSSHAIR_CURSOR ) );
            }
        } );
        rectangle.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = "r";
                setCursor( new Cursor( Cursor.CROSSHAIR_CURSOR ) );
            }
        } );
        line.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = "l";
                setCursor( new Cursor( Cursor.CROSSHAIR_CURSOR ) );
            }
        } );
        image.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = "i";
                JFileChooser jfc = new JFileChooser( FileSystemView.getFileSystemView().getHomeDirectory() );
                JFrame load = new JFrame();
                load.setSize( 650, 650 );
                load.setLocation( 650, 300 );
                int returnValue = jfc.showOpenDialog( null );
                if (returnValue == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = jfc.getSelectedFile();
                    try {
                        img = ImageIO.read( new File( selectedFile.getPath() ) );
                    } catch (FileNotFoundException e1) {
                        e1.printStackTrace();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }
                }
                setCursor( new Cursor( Cursor.CROSSHAIR_CURSOR ) );
            }
        } );
        mouse.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = null;
                setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
            }
        } );
        pencil.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = "p";
                setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
            }
        } );
        moveShapes.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = "m";
                setCursor( new Cursor( Cursor.MOVE_CURSOR ) );
            }
        } );
        erase.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = "e";
                setCursor( new Cursor( Cursor.HAND_CURSOR ) );
            }
        } );
        clearAll.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = null;
                setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
                JFrame ask = new JFrame();
                JLabel asking = new JLabel();
                JPanel yesnoclear = new JPanel();
                JButton yesclear = new JButton( "Yes" );
                yesclear.setFont( new Font( "Serif", Font.BOLD, 40 ) );
                yesclear.setBackground( Color.WHITE );
                JButton noclear = new JButton( "No" );
                noclear.setFont( new Font( "Serif", Font.BOLD, 40 ) );
                noclear.setBackground( Color.WHITE );
                asking.setSize( new Dimension( 400, 100 ) );
                yesnoclear.setSize( new Dimension( 400, 100 ) );
                yesnoclear.add( yesclear, new FlowLayout( FlowLayout.RIGHT ) );
                yesnoclear.add( noclear, new FlowLayout( FlowLayout.LEFT ) );
                asking.setFont( new Font( "Serif", Font.BOLD, 30 ) );
                asking.setText( "     Are you sure to clear all?" );
                ask.setLocation( 800, 300 );
                ask.setSize( new Dimension( 400, 200 ) );
                ask.setMaximumSize( new Dimension( 400, 200 ) );
                ask.setMinimumSize( new Dimension( 400, 200 ) );
                ask.add( asking, BorderLayout.NORTH );
                ask.add( yesnoclear, BorderLayout.SOUTH );
                ask.setTitle( "Clear All" );
                ask.setVisible( true );
                noclear.addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        ask.setVisible( false );
                    }
                } );
                yesclear.addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        paintPanel.getShapes().clear();
                        selectedShape = null;
                        moveShape = null;
                        paintPanel.repaint();
                        ask.setVisible( false );
                        wid.setText( "     -     " );
                        hei.setText( "     -     " );
                        rad.setText( "     -     " );
                        pic.setText( "     -     " );
                        g1.setText( "     -     " );
                        m1.setText( "     -     " );
                    }
                } );

            }
        } );
        sticker.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame st = new JFrame();
                st.setLayout( new GridLayout( 3, 3 ) );
                st.setPreferredSize( new Dimension( 270,270 ) );
                st.setMinimumSize( new Dimension( 270,270 ) );
                st.setMaximumSize( new Dimension( 270,270 ) );
                st.setLocation( 1550,650 );
                JButton zzheart = new JButton(zzheartIcon);
                map[0][0] = zzheart;
                st.add(map[0][0]);
                map[0][0].addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        a="sti";
                    }
                } );
                JButton zzstar = new JButton(zzstarIcon);
                map[0][1] = zzstar;
                st.add(map[0][1]);
                map[0][1].addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        a="sti";
                    }
                } );
                JButton zzmoon = new JButton(zzmoonIcon);
                map[0][2] = zzmoon;
                st.add(map[0][2]);
                map[0][2].addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        a="sti";
                    }
                } );
                JButton zzflower = new JButton(zzflowerIcon);
                map[1][0] = zzflower;
                st.add(map[1][0]);
                map[1][0].addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        a="sti";
                    }
                } );
                JButton zzleaf = new JButton(zzleafIcon);
                map[1][1] = zzleaf;
                st.add(map[1][1]);
                map[1][1].addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        a="sti";
                    }
                } );
                JButton zzsun = new JButton(zzsunIcon);
                map[1][2] = zzsun;
                st.add(map[1][2]);
                map[1][2].addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        a="sti";
                    }
                } );
                JButton zzeye = new JButton(zzeyeIcon);
                map[2][0] = zzeye;
                st.add(map[2][0]);
                map[2][0].addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        a="sti";
                    }
                } );
                JButton zzrainbow = new JButton(zzrainbowIcon);
                map[2][1] = zzrainbow;
                st.add(map[2][1]);
                map[2][1].addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        a="sti";
                    }
                } );
                JButton zzcloud = new JButton(zzcloudIcon);
                map[2][2] = zzcloud;
                st.add(map[2][2]);
                map[2][2].addActionListener( new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        a="sti";
                    }
                } );
                st.setVisible( true );
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        map[i][j].setBackground(  new Color( 113, 113, 113 )  );
                    }
                }

            }
        } );
        paintBucket.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = "pb";
                setCursor( new Cursor( Cursor.HAND_CURSOR ) );
            }
        } );
        spray.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = "sp";
                setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
            }
        } );
        grow.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stop) {
                    a = null;
                    if (selectedShape != null) {
                        double a = Double.parseDouble( JOptionPane.showInputDialog( "How much you want to grow?" ) );
                        GrowThread gt = new GrowThread( paintPanel, selectedShape, a );
                        growThreads.add( gt );
                        if (selectedShape instanceof Circle) {
                            ((Circle) selectedShape).setGt( gt );
                        }
                        if (selectedShape instanceof Rectangle) {
                            ((Rectangle) selectedShape).setGt( gt );
                        }
                        if (selectedShape instanceof Img) {
                            ((Img) selectedShape).setGt( gt );
                        }
                        g1.setText( "  " + gt.getX() );
                    }
                    setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
                }
            }
        } );
        move.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stop) {
                    a = null;
                    if (selectedShape != null) {
                        Point point = new Point();
                        point.setLocation( Integer.parseInt( JOptionPane.showInputDialog( "x?" ) ), Integer.parseInt( JOptionPane.showInputDialog( "y?" ) ) );
                        MoveThread mt = new MoveThread( paintPanel, selectedShape, point );
                        moveThreads.add( mt );
                        if (selectedShape instanceof Circle) {
                            ((Circle) selectedShape).setMt( mt );
                        }
                        if (selectedShape instanceof Rectangle) {
                            ((Rectangle) selectedShape).setMt( mt );
                        }
                        if (selectedShape instanceof Img) {
                            ((Img) selectedShape).setMt( mt );
                        }
                        m1.setText( "  " + mt.getGo().x + " , " + mt.getGo().y );
                    }

                    setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
                }
            }
        } );
        growRR.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stop) {
                    a = null;
                    if (selectedShape != null) {
                        double a = Double.parseDouble( JOptionPane.showInputDialog( "How much you want to grow?" ) );
                        GrowRRThread grrt = new GrowRRThread( paintPanel, selectedShape, a );
                        growRRThreads.add( grrt );
                        if (selectedShape instanceof Circle) {
                            ((Circle) selectedShape).setGrrt( grrt );
                        }
                        if (selectedShape instanceof Rectangle) {
                            ((Rectangle) selectedShape).setGrrt( grrt );
                        }
                        if (selectedShape instanceof Img) {
                            ((Img) selectedShape).setGrrt( grrt );
                        }
                        g1.setText( "  " + grrt.getGb().getX() );
                    }
                    setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
                }
            }
        } );
        moveRR.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!stop) {
                    a = null;
                    if (selectedShape != null) {
                        Point point = new Point();
                        point.setLocation( Integer.parseInt( JOptionPane.showInputDialog( "x?" ) ), Integer.parseInt( JOptionPane.showInputDialog( "y?" ) ) );
                        MoveRRThread mrrt = new MoveRRThread( paintPanel, selectedShape, point );
                        moveRRThreads.add( mrrt );
                        if (selectedShape instanceof Circle) {
                            ((Circle) selectedShape).setMrrt( mrrt );
                        }
                        if (selectedShape instanceof Rectangle) {
                            ((Rectangle) selectedShape).setMrrt( mrrt );
                        }
                        if (selectedShape instanceof Img) {
                            ((Img) selectedShape).setMrrt( mrrt );
                        }
                        m1.setText( "  " + mrrt.getMb().getGo().x + " , " + mrrt.getMb().getGo().y );
                    }
                    setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
                }
            }
        } );
        size.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                stroke = (Integer.parseInt( JOptionPane.showInputDialog( "set thickness" ) ));
                estroke = stroke + 50;
                setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
            }
        } );
        play.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
                wid.setText( "     -     " );
                hei.setText( "     -     " );
                rad.setText( "     -     " );
                pic.setText( "     -     " );
                g1.setText( "     -     " );
                m1.setText( "     -     " );
                doo = 0;
                if (kook == 0 && doo == 0) {
                    play.setIcon( stopIcon );
                    stop = true;
                    kook = 1;
                    doo = 1;
                    a = null;
                    for (int i = 0; i < moveThreads.size(); i++) {
                        moveThreads.get( i ).start();
                    }
                    for (int i = 0; i < growThreads.size(); i++) {
                        growThreads.get( i ).start();
                    }
                    for (int i = 0; i < growRRThreads.size(); i++) {
                        growRRThreads.get( i ).start();
                    }
                    for (int i = 0; i < moveRRThreads.size(); i++) {
                        moveRRThreads.get( i ).start();
                    }
                    selectedShape = null;
                    growThreads.clear();
                    moveThreads.clear();
                    for (int i = 0; i < paintPanel.getShapes().size(); i++) {
                        if (paintPanel.getShapes().get( i ) instanceof Circle) {
                            ((Circle) paintPanel.getShapes().get( i )).setMt( null );
                            ((Circle) paintPanel.getShapes().get( i )).setGt( null );
                            ((Circle) paintPanel.getShapes().get( i )).setMrrt( null );
                            ((Circle) paintPanel.getShapes().get( i )).setGrrt( null );
                        }
                        if (paintPanel.getShapes().get( i ) instanceof Rectangle) {
                            ((Rectangle) paintPanel.getShapes().get( i )).setMt( null );
                            ((Rectangle) paintPanel.getShapes().get( i )).setGt( null );
                            ((Rectangle) paintPanel.getShapes().get( i )).setMrrt( null );
                            ((Rectangle) paintPanel.getShapes().get( i )).setGrrt( null );

                        }
                        if (paintPanel.getShapes().get( i ) instanceof Img) {
                            ((Img) paintPanel.getShapes().get( i )).setMt( null );
                            ((Img) paintPanel.getShapes().get( i )).setGt( null );
                            ((Img) paintPanel.getShapes().get( i )).setMrrt( null );
                            ((Img) paintPanel.getShapes().get( i )).setGrrt( null );
                        }
                    }

                }

                if (kook == 1 && doo == 0) {
                    kook = 0;
                    doo = 1;
                    play.setIcon( playIcon );
                    stop = false;
                    for (int i = 0; i < growRRThreads.size(); i++) {
                        growRRThreads.get( i ).stop();
                    }
                    for (int i = 0; i < moveRRThreads.size(); i++) {
                        moveRRThreads.get( i ).stop();
                    }
                    growRRThreads.clear();
                    moveRRThreads.clear();
                    selectedShape = null;
                }
            }
        } );

        color.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = JColorChooser.showDialog( null, "Choose a Color", null );
                if (c != null) {
                    colorChoosed = c;
                    color.setForeground( colorChoosed );
                }
            }
        } );
        stro.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Color c = JColorChooser.showDialog( null, "Choose a Color", null );
                if (c != null) {
                    strokeChoosed = c;
                    stro.setForeground( strokeChoosed );
                }
            }
        } );
        changeImage.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = null;
                if (selectedShape instanceof Img) {
                    JFileChooser jfc = new JFileChooser( FileSystemView.getFileSystemView().getHomeDirectory() );
                    JFrame load = new JFrame();
                    load.setSize( 650, 650 );
                    load.setLocation( 650, 300 );
                    int returnValue = jfc.showOpenDialog( null );
                    if (returnValue == JFileChooser.APPROVE_OPTION) {
                        File selectedFile = jfc.getSelectedFile();
                        try {
                            imgc = ImageIO.read( new File( selectedFile.getPath() ) );
                        } catch (FileNotFoundException e1) {
                            e1.printStackTrace();
                        } catch (IOException e1) {
                            e1.printStackTrace();
                        }
                    }
                    ((Img) selectedShape).setImg( imgc.getScaledInstance( Math.abs( ((Img) selectedShape).getX1() - ((Img) selectedShape).getX0() ), Math.abs( ((Img) selectedShape).getY1() - ((Img) selectedShape).getY0() ), Image.SCALE_DEFAULT ) );
                    paintPanel.repaint();
                    pic.setText( imgc.toString() );
                }
                setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
            }
        } );

        addMouseListener( this );

        addMouseMotionListener( this );

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        xc = e.getX() - 160;
        yc = e.getY() - 40;
        for (int i = 0; i < paintPanel.getShapes().size(); i++) {
            if (paintPanel.getShapes().get( i ) instanceof Circle) {
                if (xc >= ((Circle) paintPanel.getShapes().get( i )).getX0() && xc <= ((Circle) paintPanel.getShapes().get( i )).getX11() && yc >= ((Circle) paintPanel.getShapes().get( i )).getY0() && yc <= ((Circle) paintPanel.getShapes().get( i )).getY11()) {
                    selectedShape = (Circle) paintPanel.getShapes().get( i );
                }
            }
            if (paintPanel.getShapes().get( i ) instanceof Rectangle) {
                if (xc >= ((Rectangle) paintPanel.getShapes().get( i )).getX0() && xc <= ((Rectangle) paintPanel.getShapes().get( i )).getX1() && yc >= ((Rectangle) paintPanel.getShapes().get( i )).getY0() && yc <= ((Rectangle) paintPanel.getShapes().get( i )).getY1()) {
                    selectedShape = (Rectangle) paintPanel.getShapes().get( i );
                }
            }
            if (paintPanel.getShapes().get( i ) instanceof Line) {
                if (xc >= ((Line) paintPanel.getShapes().get( i )).getX0() && xc <= ((Line) paintPanel.getShapes().get( i )).getX1() && yc >= ((Line) paintPanel.getShapes().get( i )).getY0() && yc <= ((Line) paintPanel.getShapes().get( i )).getY1()) {
                    selectedShape = (Line) paintPanel.getShapes().get( i );
                }
            }
            if (paintPanel.getShapes().get( i ) instanceof Img) {
                if (xc >= ((Img) paintPanel.getShapes().get( i )).getX0() && xc <= ((Img) paintPanel.getShapes().get( i )).getX1() && yc >= ((Img) paintPanel.getShapes().get( i )).getY0() && yc <= ((Img) paintPanel.getShapes().get( i )).getY1()) {
                    selectedShape = (Img) paintPanel.getShapes().get( i );
                }
            }
        }
        if (a == "pb") {
            if (selectedShape instanceof Circle) {
                ((Circle) selectedShape).setColor( colorChoosed );
            }
            if (selectedShape instanceof Rectangle) {
                ((Rectangle) selectedShape).setColor( colorChoosed );
            }
            paintPanel.repaint();

        }
        if (a == "e") {
            paintPanel.getShapes().remove( selectedShape );
            paintPanel.repaint();
            selectedShape = null;
            wid.setText( "     -     " );
            hei.setText( "     -     " );
            rad.setText( "     -     " );
            pic.setText( "     -     " );
            g1.setText( "     -     " );
            m1.setText( "     -     " );

        } else {
            if (selectedShape instanceof Circle) {
                wid.setText( "     -     " );
                hei.setText( "     -     " );
                rad.setText( "  " + ((Circle) selectedShape).getR() );
                pic.setText( "     -     " );
                if (((Circle) selectedShape).getGt() != null) {
                    g1.setText( "  " + ((Circle) selectedShape).getGt().getX() );
                } else {
                    g1.setText( "     -     " );
                }
                if (((Circle) selectedShape).getMt() != null) {
                    m1.setText( "  " + ((Circle) selectedShape).getMt().getGo().x + " , " + ((Circle) selectedShape).getMt().getGo().y );
                } else {
                    m1.setText( "     -     " );
                }
            }
            if (selectedShape instanceof Rectangle) {
                wid.setText( "  " + (((Rectangle) selectedShape).getX1() - ((Rectangle) selectedShape).getX0()) );
                hei.setText( "  " + (((Rectangle) selectedShape).getY1() - ((Rectangle) selectedShape).getY0()) );
                rad.setText( "     -     " );
                pic.setText( "     -     " );
                if (((Rectangle) selectedShape).getGt() != null) {
                    g1.setText( "  " + ((Rectangle) selectedShape).getGt().getX() );
                } else {
                    g1.setText( "     -     " );
                }
                if (((Rectangle) selectedShape).getMt() != null) {
                    m1.setText( "  " + ((Rectangle) selectedShape).getMt().getGo().x + " , " + ((Rectangle) selectedShape).getMt().getGo().y );
                } else {
                    m1.setText( "     -     " );
                }
            }
            if (selectedShape instanceof Img) {
                wid.setText( "  " + (((Img) selectedShape).getX1() - ((Img) selectedShape).getX0()) );
                hei.setText( "  " + (((Img) selectedShape).getY1() - ((Img) selectedShape).getY0()) );
                rad.setText( "     -     " );
                pic.setText( ((Img) selectedShape).getImg().toString() );
                if (((Img) selectedShape).getGt() != null) {
                    g1.setText( "  " + ((Img) selectedShape).getGt().getX() );
                } else {
                    g1.setText( "     -     " );
                }
                if (((Img) selectedShape).getMt() != null) {
                    m1.setText( "  " + ((Img) selectedShape).getMt().getGo().x + " , " + ((Img) selectedShape).getMt().getGo().y );
                } else {
                    m1.setText( "     -     " );
                }
            }
            if (selectedShape == null) {
                wid.setText( "     -     " );
                hei.setText( "     -     " );
                rad.setText( "     -     " );
                pic.setText( "     -     " );
                g1.setText( "     -     " );
                m1.setText( "     -     " );

            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
        x0 = e.getX() - 160;
        y0 = e.getY() - 40;
        xdraw = x0;
        ydraw = y0;
        moveShape = null;
        if (a == "m") {
            for (int i = 0; i < paintPanel.getShapes().size(); i++) {
                if (paintPanel.getShapes().get( i ) instanceof Circle) {
                    if (xc >= ((Circle) paintPanel.getShapes().get( i )).getX0() && xc <= ((Circle) paintPanel.getShapes().get( i )).getX11() && yc >= ((Circle) paintPanel.getShapes().get( i )).getY0() && yc <= ((Circle) paintPanel.getShapes().get( i )).getY11()) {
                        moveShape = paintPanel.getShapes().get( i );
                    }
                }
                if (paintPanel.getShapes().get( i ) instanceof Rectangle) {
                    if (xc >= ((Rectangle) paintPanel.getShapes().get( i )).getX0() && xc <= ((Rectangle) paintPanel.getShapes().get( i )).getX1() && yc >= ((Rectangle) paintPanel.getShapes().get( i )).getY0() && yc <= ((Rectangle) paintPanel.getShapes().get( i )).getY1()) {
                        moveShape = paintPanel.getShapes().get( i );
                    }
                }
                if (paintPanel.getShapes().get( i ) instanceof Line) {
                    if (xc >= ((Line) paintPanel.getShapes().get( i )).getX0() && xc <= ((Line) paintPanel.getShapes().get( i )).getX1() && yc >= ((Line) paintPanel.getShapes().get( i )).getY0() && yc <= ((Line) paintPanel.getShapes().get( i )).getY1()) {
                        moveShape = paintPanel.getShapes().get( i );
                    }
                }
                if (paintPanel.getShapes().get( i ) instanceof Img) {
                    if (xc >= ((Img) paintPanel.getShapes().get( i )).getX0() && xc <= ((Img) paintPanel.getShapes().get( i )).getX1() && yc >= ((Img) paintPanel.getShapes().get( i )).getY0() && yc <= ((Img) paintPanel.getShapes().get( i )).getY1()) {
                        moveShape = paintPanel.getShapes().get( i );
                    }
                }
            }
        }
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x1 = e.getX() - 160;
        y1 = e.getY() - 40;
        drawingShape = null;
        if (a == "m") {
            if (moveShape instanceof Circle) {
                dx = x1 - ((Circle) selectedShape).getX0();
                dy = y1 - ((Circle) selectedShape).getY0();
            }
            if (moveShape instanceof Rectangle) {
                dx = x1 - ((Rectangle) selectedShape).getX0();
                dy = y1 - ((Rectangle) selectedShape).getY0();
            }
            if (moveShape instanceof Img) {
                dx = x1 - ((Img) selectedShape).getX0();
                dy = y1 - ((Img) selectedShape).getY0();
            }
        }
        paintPanel.repaint();
        if (a == "c" || a == "r" || a == "l" || a == "i") {
            a = null;
            setCursor( new Cursor( Cursor.DEFAULT_CURSOR ) );
        }
    }


    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int xg1 = e.getX() - 160;
        int yg1 = e.getY() - 40;
        Point go = new Point();
        go.setLocation( e.getX() - 160, e.getY() - 40 );
        if (a == "c") {
            paintPanel.getShapes().remove( drawingShape );
            drawingShape = new Circle( xg1, yg1, x0, y0, colorChoosed, strokeChoosed, stroke );
            paintPanel.getShapes().add( drawingShape );
        }
        if (a == "r") {
            paintPanel.getShapes().remove( drawingShape );
            drawingShape = new Rectangle( xg1, yg1, x0, y0, colorChoosed, strokeChoosed, stroke );
            paintPanel.getShapes().add( drawingShape );
        }
        if (a == "i") {
            paintPanel.getShapes().remove( drawingShape );
            drawingShape = new Img( xg1, yg1, x0, y0, img );
            paintPanel.getShapes().add( drawingShape );
        }
        if (a == "l") {
            paintPanel.getShapes().remove( drawingShape );
            drawingShape = new Line( xg1, yg1, x0, y0, strokeChoosed, stroke );
            paintPanel.getShapes().add( drawingShape );
        }
        if (a == "m") {
            paintPanel.getShapes().remove( moveShape );
            if (moveShape instanceof Circle) {
                Circle circle = new Circle( xg1, yg1, (((Circle) moveShape).getX1()) - (((Circle) moveShape).getX0()) + xg1, (((Circle) moveShape).getY1()) - (((Circle) moveShape).getY0()) + yg1, ((Circle) moveShape).getColor(), ((Circle) moveShape).getStro(), ((Circle) moveShape).getThick() );
                paintPanel.getShapes().add( circle );
                moveShape = circle;
            }
            if (moveShape instanceof Rectangle) {
                Rectangle rectangle = new Rectangle( xg1, yg1, (((Rectangle) moveShape).getX1()) - (((Rectangle) moveShape).getX0()) + xg1, (((Rectangle) moveShape).getY1()) - (((Rectangle) moveShape).getY0()) + yg1, ((Rectangle) moveShape).getColor(), ((Rectangle) moveShape).getStro(), ((Rectangle) moveShape).getThick() );
                paintPanel.getShapes().add( rectangle );
                moveShape = rectangle;
            }
            if (moveShape instanceof Img) {
                Img ax = new Img( xg1, yg1, (((Img) moveShape).getX1()) - (((Img) moveShape).getX0()) + xg1, (((Img) moveShape).getY1()) - (((Img) moveShape).getY0()) + yg1, ((Img) moveShape).getImg() );
                paintPanel.getShapes().add( ax );
                moveShape = ax;
            }
        }
        if (a == "p") {
            if (e.getX() - 160 != xdraw || e.getY() - 40 != ydraw) {
                line = new Line( xdraw, ydraw, e.getX() - 160, e.getY() - 40, strokeChoosed, stroke );
                paintPanel.getShapes().add( line );
                xdraw = e.getX() - 160;
                ydraw = e.getY() - 40;
            }
        }
        if (a == "e") {
            if (e.getX() - 160 != xdraw || e.getY() - 40 != ydraw) {
                Line line = new Line( xdraw, ydraw, e.getX() - 160, e.getY() - 40, Color.WHITE, estroke );
                paintPanel.getShapes().add( line );
                xdraw = e.getX() - 160;
                ydraw = e.getY() - 40;
            }
        }
        if (a == "sp") {
            spray = new Spray( paintPanel, go, stroke, colorChoosed );
            spray.start();
        }
        paintPanel.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
