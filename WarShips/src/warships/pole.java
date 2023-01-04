package warships;

import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class pole extends javax.swing.JFrame {
    
private ShipParts sP[][]=new ShipParts[10][10];
private Player Ligma=new Player();
private SmallShip sS=new SmallShip(sP);
private MediumShip mS=new MediumShip(sP);
private BigShip bS=new BigShip(sP);
private int brc=0;
private int pr[]=new int[100];
private int br=0;

public void cherti()
{
    int y=grid.getHeight();
    int x=grid.getWidth();
    Graphics g=grid.getGraphics();
    g.setColor(Color.black);
    for (int i=0;i<=x;i+=40)
        for (int j=0;j<=y;j+=40)
        {
            g.drawLine(i,j,i,y);
            g.drawLine(i, j, x, j);
        }
}
public void circle (int x,int y,Graphics g)
{
    x=(x-1)*40;
    y=(y-1)*40;
    g.drawOval(y,x,40,40);
}
public void hiks (int x,int y,Graphics g)
{
    int k=y;
    y=x*40-20;
    x=k*40-20;
    g.drawLine(x,y,x+18,y-18);
    g.drawLine(x,y,x+18,y+18);
    g.drawLine(x,y,x-18,y-18);
    g.drawLine(x,y,x-18,y+18);
}

    public pole() {
     initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grid = new javax.swing.JPanel();
        xCor = new javax.swing.JTextField();
        yCor = new javax.swing.JTextField();
        shoot = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        points = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        xLabel = new javax.swing.JLabel();
        yLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        begin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        grid.setBackground(new java.awt.Color(51, 51, 255));
        grid.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout gridLayout = new javax.swing.GroupLayout(grid);
        grid.setLayout(gridLayout);
        gridLayout.setHorizontalGroup(
            gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        gridLayout.setVerticalGroup(
            gridLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        xCor.setText("X");
        xCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xCorActionPerformed(evt);
            }
        });

        yCor.setText("Y");
        yCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yCorActionPerformed(evt);
            }
        });

        shoot.setText("SCHEIẞEN*");
        shoot.setEnabled(false);
        shoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shootActionPerformed(evt);
            }
        });

        jLabel2.setText("X кордината");

        jLabel3.setText("Y кордината");

        points.setText("0");

        jLabel5.setText("Точки");

        xLabel.setText("X (редове)");

        yLabel.setText("Y (колони)");

        jLabel6.setText("*Кординатите трябва да са число между 1 и 10");

        begin.setText("Начало");
        begin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                beginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(shoot)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(xCor, javax.swing.GroupLayout.Alignment.LEADING))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                                .addComponent(yCor, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(begin))
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(yLabel)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xLabel)
                    .addComponent(grid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(begin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(xCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(18, 18, 18)
                                    .addComponent(jLabel3))
                                .addComponent(points, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(yCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(140, 140, 140)
                            .addComponent(shoot))
                        .addComponent(grid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void xCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xCorActionPerformed
    }//GEN-LAST:event_xCorActionPerformed

    private void yCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yCorActionPerformed
    }//GEN-LAST:event_yCorActionPerformed

    private void shootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shootActionPerformed
      String xV=xCor.getText();
      String yV=yCor.getText();
      Graphics g=grid.getGraphics();
      g.setColor(Color.red);
      String v="";
      int x;
      int y;
      try{
          x=Integer.parseInt(xV);
          y=Integer.parseInt(yV);
      }
      catch(NumberFormatException e){
          JOptionPane.showMessageDialog(null, "Виж критериите.","Невалидни кординати",JOptionPane.PLAIN_MESSAGE);
          return;
      }
      catch(InputMismatchException e){
          JOptionPane.showMessageDialog(null, "Виж критериите.","Невалидни кординати",JOptionPane.PLAIN_MESSAGE);
          return;
      } 
      int brm=0;
      int xy=10*x+y;
      for (int i=0;i<br;i++)
      {
          if (xy!=pr[i])brm++;
      }
      if (brm==br)
      {
          if (Ligma.Guess(x-1,y-1,sP).equals("h"))
          {
              pr[br]=xy;
              br++;
              brc++;
              JOptionPane.showMessageDialog(null, "Право в мишената.","Удар",JOptionPane.PLAIN_MESSAGE);
              circle(x,y,g);
              String b=Integer.toString(br);
              points.setText(b);
              if (brc==14)
              {
                  String ime=JOptionPane.showInputDialog(null,"Напиши си името. Трябва да е между 3-10 ЛАТИНСКИ букви, първата трябва да е ГЛАВНА.","ПОБЕДААААААА!!!!!",JOptionPane.INFORMATION_MESSAGE);
                  while (Ligma.SetName(ime).equals("Invalid name"))
                  {
                      JOptionPane.showMessageDialog(null, "Виж критериите и опитай пак","Невалидно име",JOptionPane.WARNING_MESSAGE);
                      ime=JOptionPane.showInputDialog(null,"Напиши си името. Трябва да е между 3-10 ЛАТИНСКИ букви, първата трябва да е ГЛАВНА.","ПОБЕДААААААА!!!!!",JOptionPane.INFORMATION_MESSAGE);
                  }
                  Ligma.SetScore(br);
                  try {
                      Scoreboard AnS=new Scoreboard();
                      AnS.AddNSort(Ligma);
                  } catch (FileNotFoundException ex) {
                  }
                  new start().setVisible(true);
                  dispose();
              }
           }
           else if(Ligma.Guess(x-1, y-1, sP).equals("m"))
           {
               pr[br]=xy;
               br++;
               JOptionPane.showMessageDialog(null, "Тук няма кораб","Пропуск",JOptionPane.PLAIN_MESSAGE);
               hiks(x,y,g);
               String b=Integer.toString(br);
               points.setText(b);     
           }
           else JOptionPane.showMessageDialog(null, "Виж критериите.","Невалидни кординати",JOptionPane.PLAIN_MESSAGE);
           }
      else
      {
          JOptionPane.showMessageDialog(null, "Тези кординати са били въвеждани тази игра.","Невалидни кординати",JOptionPane.PLAIN_MESSAGE);
      }
      brm=0;
    }//GEN-LAST:event_shootActionPerformed
    private void beginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_beginActionPerformed
    points.setText("0");
    for (int i=0;i<10;i++)
    {
        for (int j=0;j<10;j++)
        {
            sP[i][j]=null;
        }
    }
    cherti();
    int x=grid.getWidth();
    int y=grid.getHeight();
    Graphics g=grid.getGraphics();
    g.drawLine(x-1,0,x-1,y-1);
    g.drawLine(0, y-1, x-1, y-1);          
    sS.PlaceParts(sP);
    sS.PlaceParts(sP);
    mS.PlaceParts(sP);
    mS.PlaceParts(sP);
    bS.PlaceParts(sP);
//    for (int i=0;i<10;i++)
//    {
//       for (int j=0;j<10;j++)
//        {
//           if (j!=9)
//           {
//              if(sP[i][j]==null)System.out.print(0+" ");
//              else System.out.print(1+" ");
//           }
//           else
//           {
//              if(sP[i][j]==null)System.out.print(0);
//              else System.out.print(1);
//           }
//        }
//        System.out.println();
//    }
begin.setVisible(false);
shoot.setEnabled(true);
    }//GEN-LAST:event_beginActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton begin;
    private javax.swing.JPanel grid;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel points;
    private javax.swing.JButton shoot;
    private javax.swing.JTextField xCor;
    private javax.swing.JLabel xLabel;
    private javax.swing.JTextField yCor;
    private javax.swing.JLabel yLabel;
    // End of variables declaration//GEN-END:variables
}
