package trim3.TA.lab7;

import java.awt.Color;
import java.awt.Graphics;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;


/**
 *
 * @author Vadim
 */
public class DijkstraAlgorithm extends javax.swing.JFrame {
    private ReadXML readXML;
    private ArrayList<Vertice> vertices;
    private ArrayList<Edge> edges;
    private Vertice currentVertice;
    private int adjacentVerticeNumber;
    private Vertice nextVertice;
    private ArrayList<Edge> adjacentEdges;
    private boolean areAdjacentEdgesExist;
    
    public DijkstraAlgorithm() {
        initComponents();
        readXML = new ReadXML();
    }
    
    @Override
    public void paint(Graphics g) {
       super.paint(g);
       g.setColor(new Color(139,58,58));
       g.drawLine(top1.getX()+23, top1.getY()+31, top2.getX()+23, top2.getY()+59);
       g.drawLine(top1.getX()+37, top1.getY()+45, top6.getX()+10, top6.getY()+45);
       g.drawLine(top1.getX()+23, top1.getY()+59, top8.getX()+10, top8.getY()+45);
       g.drawLine(top2.getX()+35, top2.getY()+45, top3.getX()+10, top3.getY()+45);
       g.drawLine(top2.getX()+35, top2.getY()+45, top5.getX()+10, top5.getY()+45);
       g.drawLine(top2.getX()+23, top2.getY()+59, top6.getX()+23, top6.getY()+31);
       g.drawLine(top3.getX()+37, top3.getY()+45, top4.getX()+10, top4.getY()+45);
       g.drawLine(top3.getX()+37, top3.getY()+45, top5.getX()+23, top5.getY()+31);
       g.drawLine(top4.getX()+10, top4.getY()+45, top5.getX()+35, top5.getY()+45);
       g.drawLine(top4.getX()+23, top4.getY()+59, top7.getX()+23, top7.getY()+31);
       g.drawLine(top5.getX()+10, top5.getY()+45, top6.getX()+35, top6.getY()+45);
       g.drawLine(top5.getX()+37, top5.getY()+45, top7.getX()+23, top7.getY()+31);
       g.drawLine(top6.getX()+35, top6.getY()+45, top7.getX()+10, top7.getY()+45);
       g.drawLine(top6.getX()+23, top6.getY()+59, top8.getX()+23, top8.getY()+31);
       g.drawLine(top6.getX()+35, top6.getY()+45, top9.getX()+23, top9.getY()+31);
       g.drawLine(top7.getX()+10, top7.getY()+45, top9.getX()+35, top9.getY()+45);
       g.drawLine(top8.getX()+35, top8.getY()+45, top9.getX()+10, top9.getY()+45);
       
       top1.setBackground(new Color(240,255,255));
       top2.setBackground(new Color(240,255,255));
       top3.setBackground(new Color(240,255,255));
       top4.setBackground(new Color(240,255,255));
       top5.setBackground(new Color(240,255,255));
       top6.setBackground(new Color(240,255,255));
       top7.setBackground(new Color(240,255,255));
       top8.setBackground(new Color(240,255,255));
       top9.setBackground(new Color(240,255,255));
        
       graphPanel.setBackground(new Color(250,235,215));
       verticesTextArea.setBackground(new Color(238,238,244));
       startVerticeNumberTextField.setBackground(new Color(238,238,244));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        graphPanel = new javax.swing.JPanel();
        top1 = new javax.swing.JLabel();
        top2 = new javax.swing.JLabel();
        top3 = new javax.swing.JLabel();
        top6 = new javax.swing.JLabel();
        top5 = new javax.swing.JLabel();
        top8 = new javax.swing.JLabel();
        top4 = new javax.swing.JLabel();
        top7 = new javax.swing.JLabel();
        top9 = new javax.swing.JLabel();
        eLabel1 = new javax.swing.JLabel();
        eLabel2 = new javax.swing.JLabel();
        eLabel3 = new javax.swing.JLabel();
        eLabel4 = new javax.swing.JLabel();
        eLabel5 = new javax.swing.JLabel();
        eLabel6 = new javax.swing.JLabel();
        eLabel7 = new javax.swing.JLabel();
        eLabel8 = new javax.swing.JLabel();
        eLabel9 = new javax.swing.JLabel();
        eLabel10 = new javax.swing.JLabel();
        eLabel11 = new javax.swing.JLabel();
        eLabel12 = new javax.swing.JLabel();
        eLabel13 = new javax.swing.JLabel();
        eLabel15 = new javax.swing.JLabel();
        eLabel16 = new javax.swing.JLabel();
        wLabel17 = new javax.swing.JLabel();
        vLabel1 = new javax.swing.JLabel();
        vLabel2 = new javax.swing.JLabel();
        vLabel3 = new javax.swing.JLabel();
        vLabel4 = new javax.swing.JLabel();
        vLabel5 = new javax.swing.JLabel();
        vLabel6 = new javax.swing.JLabel();
        vLabel7 = new javax.swing.JLabel();
        vLabel8 = new javax.swing.JLabel();
        vLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        startVerticeNumberTextField = new javax.swing.JTextField();
        runAlgorithmButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        verticesTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dijkstra Algorithm");
        setResizable(false);

        graphPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        top1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        top1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top1.setText("1");
        top1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        top1.setOpaque(true);

        top2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        top2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top2.setText("2");
        top2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        top2.setOpaque(true);

        top3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        top3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top3.setText("3");
        top3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        top3.setOpaque(true);

        top6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        top6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top6.setText("6");
        top6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        top6.setOpaque(true);

        top5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        top5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top5.setText("5");
        top5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        top5.setOpaque(true);

        top8.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        top8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top8.setText("8");
        top8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        top8.setOpaque(true);

        top4.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        top4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top4.setText("4");
        top4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        top4.setOpaque(true);

        top7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        top7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top7.setText("7");
        top7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        top7.setOpaque(true);

        top9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        top9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        top9.setText("9");
        top9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        top9.setOpaque(true);

        eLabel1.setText("39");

        eLabel2.setText("3");

        eLabel3.setText("34");

        eLabel4.setText("31");

        eLabel5.setText("12");

        eLabel6.setText("65");

        eLabel7.setText("49");

        eLabel8.setText("83");

        eLabel9.setText("12");

        eLabel10.setText("58");

        eLabel11.setText("10");

        eLabel12.setText("32");

        eLabel13.setText("11");

        eLabel15.setText("32");

        eLabel16.setText("11");

        wLabel17.setText("10");

        vLabel1.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vLabel1.setForeground(new java.awt.Color(255, 0, 0));
        vLabel1.setText("∞");

        vLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vLabel2.setForeground(new java.awt.Color(255, 0, 0));
        vLabel2.setText("∞");

        vLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vLabel3.setForeground(new java.awt.Color(255, 0, 0));
        vLabel3.setText("∞");

        vLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vLabel4.setForeground(new java.awt.Color(255, 0, 0));
        vLabel4.setText("∞");

        vLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vLabel5.setForeground(new java.awt.Color(255, 0, 0));
        vLabel5.setText("∞");

        vLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vLabel6.setForeground(new java.awt.Color(255, 0, 0));
        vLabel6.setText("∞");

        vLabel7.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vLabel7.setForeground(new java.awt.Color(255, 0, 0));
        vLabel7.setText("∞");

        vLabel8.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vLabel8.setForeground(new java.awt.Color(255, 0, 0));
        vLabel8.setText("∞");

        vLabel9.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        vLabel9.setForeground(new java.awt.Color(255, 0, 0));
        vLabel9.setText("∞");

        javax.swing.GroupLayout graphPanelLayout = new javax.swing.GroupLayout(graphPanel);
        graphPanel.setLayout(graphPanelLayout);
        graphPanelLayout.setHorizontalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(graphPanelLayout.createSequentialGroup()
                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(graphPanelLayout.createSequentialGroup()
                                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(graphPanelLayout.createSequentialGroup()
                                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, graphPanelLayout.createSequentialGroup()
                                                .addComponent(vLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(eLabel1)
                                                .addGap(56, 56, 56)
                                                .addComponent(eLabel6))
                                            .addGroup(graphPanelLayout.createSequentialGroup()
                                                .addGap(118, 118, 118)
                                                .addComponent(eLabel2)))
                                        .addGap(42, 42, 42)
                                        .addComponent(top3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, graphPanelLayout.createSequentialGroup()
                                        .addGap(62, 62, 62)
                                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(graphPanelLayout.createSequentialGroup()
                                                .addComponent(vLabel2)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(graphPanelLayout.createSequentialGroup()
                                                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(eLabel8)
                                                    .addComponent(top2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(eLabel4)))))
                                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(graphPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vLabel3))
                                    .addGroup(graphPanelLayout.createSequentialGroup()
                                        .addGap(77, 77, 77)
                                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(eLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(top5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(vLabel5)
                                        .addGap(26, 26, 26)
                                        .addComponent(eLabel5)))
                                .addGap(12, 12, 12))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graphPanelLayout.createSequentialGroup()
                                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(graphPanelLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(eLabel13))
                                    .addGroup(graphPanelLayout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addComponent(eLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(graphPanelLayout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(vLabel9))
                                            .addGroup(graphPanelLayout.createSequentialGroup()
                                                .addComponent(top9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(eLabel15)))))
                                .addGap(28, 28, 28)))
                        .addGap(20, 20, 20)
                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vLabel4)
                            .addComponent(top4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47))
                    .addGroup(graphPanelLayout.createSequentialGroup()
                        .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(119, 119, 119)
                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(graphPanelLayout.createSequentialGroup()
                                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(eLabel10)
                                    .addComponent(top6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(graphPanelLayout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(eLabel16)
                                            .addComponent(eLabel7))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(graphPanelLayout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(wLabel17)
                                            .addComponent(eLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(eLabel12)
                                        .addGap(65, 65, 65)
                                        .addComponent(top7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(graphPanelLayout.createSequentialGroup()
                                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(top8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vLabel6)
                                    .addGroup(graphPanelLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(vLabel8)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(vLabel7)
                        .addGap(35, 35, 35))))
        );
        graphPanelLayout.setVerticalGroup(
            graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(graphPanelLayout.createSequentialGroup()
                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(graphPanelLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(graphPanelLayout.createSequentialGroup()
                                    .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(graphPanelLayout.createSequentialGroup()
                                            .addComponent(top3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(top2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(graphPanelLayout.createSequentialGroup()
                                                    .addGap(2, 2, 2)
                                                    .addComponent(eLabel1)
                                                    .addGap(34, 34, 34)
                                                    .addComponent(eLabel8))
                                                .addGroup(graphPanelLayout.createSequentialGroup()
                                                    .addGap(59, 59, 59)
                                                    .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(top7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(eLabel12)
                                                        .addComponent(vLabel7)))))
                                        .addGroup(graphPanelLayout.createSequentialGroup()
                                            .addGap(19, 19, 19)
                                            .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(graphPanelLayout.createSequentialGroup()
                                                    .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(eLabel2)
                                                        .addComponent(eLabel3)
                                                        .addComponent(vLabel2))
                                                    .addGap(13, 13, 13)
                                                    .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(vLabel5)
                                                        .addComponent(top4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGap(8, 8, 8))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graphPanelLayout.createSequentialGroup()
                                                    .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(wLabel17)
                                                        .addComponent(vLabel4))
                                                    .addGap(37, 37, 37)))
                                            .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(graphPanelLayout.createSequentialGroup()
                                                    .addGap(8, 8, 8)
                                                    .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(eLabel7)
                                                        .addComponent(eLabel13)))
                                                .addGroup(graphPanelLayout.createSequentialGroup()
                                                    .addGap(2, 2, 2)
                                                    .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(eLabel6)
                                                        .addComponent(vLabel6))))))
                                    .addGap(51, 51, 51))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graphPanelLayout.createSequentialGroup()
                                    .addComponent(vLabel1)
                                    .addGap(105, 105, 105)))
                            .addGroup(graphPanelLayout.createSequentialGroup()
                                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(top5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(eLabel4))
                                .addGap(28, 28, 28)
                                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(top1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(top6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(graphPanelLayout.createSequentialGroup()
                                        .addGap(44, 44, 44)
                                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(top9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(eLabel9)
                                            .addComponent(eLabel15))
                                        .addGap(2, 2, 2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graphPanelLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graphPanelLayout.createSequentialGroup()
                                                .addComponent(eLabel10)
                                                .addGap(27, 27, 27))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, graphPanelLayout.createSequentialGroup()
                                                .addComponent(eLabel11)
                                                .addGap(42, 42, 42))))))))
                    .addGroup(graphPanelLayout.createSequentialGroup()
                        .addComponent(vLabel3)
                        .addGap(61, 61, 61)
                        .addComponent(eLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(top8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(graphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(eLabel16)
                        .addComponent(vLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(vLabel8)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N
        jLabel1.setText("Start from vertice №");

        startVerticeNumberTextField.setFont(new java.awt.Font("Segoe UI Semilight", 0, 18)); // NOI18N

        runAlgorithmButton.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vadim\\Documents\\NetBeansProjects\\Dijkstra Algorithm\\src\\trim3\\TA\\lab7\\play-button.png")); // NOI18N
        runAlgorithmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runAlgorithmButtonActionPerformed(evt);
            }
        });

        verticesTextArea.setColumns(20);
        verticesTextArea.setRows(5);
        verticesTextArea.setPreferredSize(new java.awt.Dimension(132, 92));
        jScrollPane1.setViewportView(verticesTextArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(graphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 9, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(startVerticeNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(runAlgorithmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(graphPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(startVerticeNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addComponent(runAlgorithmButton))
                        .addGap(9, 9, 9)
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void runAlgorithmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runAlgorithmButtonActionPerformed
        verticesTextArea.setText("");
        if(isStartVerticeNumberValidInput()) {
            areAdjacentEdgesExist = true;
            initVerticesAndEdges();
            runAlgorithm(Integer.valueOf(startVerticeNumberTextField.getText()));
            repaint();
        }
    }//GEN-LAST:event_runAlgorithmButtonActionPerformed

    private void initVerticesAndEdges() {
        vertices = new ArrayList<>();
        edges = new ArrayList<>();

        readXML.start(vertices, edges);
        vertices.get(0).setPathLabel(vLabel1);
        vertices.get(1).setPathLabel(vLabel2);
        vertices.get(2).setPathLabel(vLabel3);
        vertices.get(3).setPathLabel(vLabel4);
        vertices.get(4).setPathLabel(vLabel5);
        vertices.get(5).setPathLabel(vLabel6);
        vertices.get(6).setPathLabel(vLabel7);
        vertices.get(7).setPathLabel(vLabel8);
        vertices.get(8).setPathLabel(vLabel9);
        vertices.get(0).setTopLabel(top1);
        vertices.get(1).setTopLabel(top2);
        vertices.get(2).setTopLabel(top3);
        vertices.get(3).setTopLabel(top4);
        vertices.get(4).setTopLabel(top5);
        vertices.get(5).setTopLabel(top6);
        vertices.get(6).setTopLabel(top7);
        vertices.get(7).setTopLabel(top8);
        vertices.get(8).setTopLabel(top9);
    }
    
    private void runAlgorithm(int verticeNumber) {
        chooseStartVertice(verticeNumber);
        
        while(areAdjacentEdgesExist) { 
            makeStep();
        }
        
        printVerticesTextArea();
    }
       
    private void chooseStartVertice(int verticeNumber) {
        verticeNumber--; //0..N
        currentVertice = vertices.get(verticeNumber);
        currentVertice.setPathLength(0);
        currentVertice.getPath().add(currentVertice.getNumber());
    }
    
    private void makeStep() {
        adjacentEdges = new ArrayList<>();
        nextVertice = new Vertice(-1);
                
        collectAdjacentEdges();
          
        if(!adjacentEdges.isEmpty()) {
            for(Edge adjacentEdge : adjacentEdges) {
                adjacentVerticeNumber = getAdjacentVerticeNumber(currentVertice.getNumber(), adjacentEdge);
                
                if(!isAdjacentVerticePathLengthMinimal(adjacentEdge)) {
                    changeAdjacentVerticeData(adjacentEdge);
                }
            }
            
            currentVertice.setTagged(true);
            
            checkNextVertice();
       
            currentVertice = nextVertice;
        } else {
            areAdjacentEdgesExist = false;
        }
    } 
    
    private void collectAdjacentEdges() {
        for(Edge edge : edges) {
            if(currentVertice.getNumber() == edge.getVerticeNumber1() |
               currentVertice.getNumber() == edge.getVerticeNumber2()) {
                adjacentEdges.add(edge);
            }
        }
    }
    
    private int getAdjacentVerticeNumber(int currentVerticeNumber, Edge adjacentEdge) {
        if(currentVerticeNumber == adjacentEdge.getVerticeNumber1()) {
            return adjacentEdge.getVerticeNumber2();
        } else {
            return adjacentEdge.getVerticeNumber1();
        }
    }

    private boolean isAdjacentVerticePathLengthMinimal(Edge adjacentEdge) {
        return vertices.get(adjacentVerticeNumber-1).getPathLength() < 
               currentVertice.getPathLength() + adjacentEdge.getWeight();
    }
    
    private void changeAdjacentVerticeData(Edge adjacentEdge) {
        vertices.get(adjacentVerticeNumber-1).setPathLength(currentVertice.getPathLength() + adjacentEdge.getWeight());
        vertices.get(adjacentVerticeNumber-1).getPath().clear();
        vertices.get(adjacentVerticeNumber-1).getPath().addAll(currentVertice.getPath());
        vertices.get(adjacentVerticeNumber-1).getPath().add(vertices.get(adjacentVerticeNumber-1).getNumber());
    }
    
    private void checkNextVertice() {
        for(Vertice vertice : vertices) {
            if(vertice.getPathLength() < nextVertice.getPathLength() & !vertice.isTagged()) {
                nextVertice = vertice;
            }
        }
    }
    
    private void printVerticesTextArea() {
        vertices.iterator().forEachRemaining((v)->verticesTextArea.append(v.toString()+"\n"));
    }
    
    private boolean isStartVerticeNumberValidInput() {
        try {
            if(Integer.valueOf(startVerticeNumberTextField.getText()) >= 1 &
               Integer.valueOf(startVerticeNumberTextField.getText()) <= 9) 
            {
                return true;
            }
            paintInfinityLabels();
            JOptionPane.showMessageDialog(rootPane, "Input a number from 1 to 9.", "Warning!", JOptionPane.WARNING_MESSAGE);
            return false;
        } catch(NumberFormatException ex) {
            paintInfinityLabels();
            JOptionPane.showMessageDialog(rootPane, "Input a number from 1 to 9.", "Warning!", JOptionPane.WARNING_MESSAGE);
            return false;
        } 
    }

    private void paintInfinityLabels() {
        vLabel1.setText("∞");
        vLabel2.setText("∞");
        vLabel3.setText("∞");
        vLabel4.setText("∞");
        vLabel5.setText("∞");
        vLabel6.setText("∞");
        vLabel7.setText("∞");
        vLabel8.setText("∞");
        vLabel9.setText("∞");
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DijkstraAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DijkstraAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DijkstraAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DijkstraAlgorithm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DijkstraAlgorithm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eLabel1;
    private javax.swing.JLabel eLabel10;
    private javax.swing.JLabel eLabel11;
    private javax.swing.JLabel eLabel12;
    private javax.swing.JLabel eLabel13;
    private javax.swing.JLabel eLabel15;
    private javax.swing.JLabel eLabel16;
    private javax.swing.JLabel eLabel2;
    private javax.swing.JLabel eLabel3;
    private javax.swing.JLabel eLabel4;
    private javax.swing.JLabel eLabel5;
    private javax.swing.JLabel eLabel6;
    private javax.swing.JLabel eLabel7;
    private javax.swing.JLabel eLabel8;
    private javax.swing.JLabel eLabel9;
    private javax.swing.JPanel graphPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton runAlgorithmButton;
    private javax.swing.JTextField startVerticeNumberTextField;
    private javax.swing.JLabel top1;
    private javax.swing.JLabel top2;
    private javax.swing.JLabel top3;
    private javax.swing.JLabel top4;
    private javax.swing.JLabel top5;
    private javax.swing.JLabel top6;
    private javax.swing.JLabel top7;
    private javax.swing.JLabel top8;
    private javax.swing.JLabel top9;
    private javax.swing.JLabel vLabel1;
    private javax.swing.JLabel vLabel2;
    private javax.swing.JLabel vLabel3;
    private javax.swing.JLabel vLabel4;
    private javax.swing.JLabel vLabel5;
    private javax.swing.JLabel vLabel6;
    private javax.swing.JLabel vLabel7;
    private javax.swing.JLabel vLabel8;
    private javax.swing.JLabel vLabel9;
    private javax.swing.JTextArea verticesTextArea;
    private javax.swing.JLabel wLabel17;
    // End of variables declaration//GEN-END:variables

}
