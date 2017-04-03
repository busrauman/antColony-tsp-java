/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package antcolony;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author busra
 */
public class TownShow extends javax.swing.JFrame {

    /**
     * Creates new form TownSHow
     */    
    ArrayList<Point> showTown2 = new ArrayList<Point>();

    public TownShow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
     //NewJFrame'den Data almak için oluşturduk.
    public TownShow(ArrayList showTown)
    {
        initComponents();
        System.out.println(showTown);
        showTown2 = showTown;
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setBounds(0, 0, 1500, 600);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TownShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TownShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TownShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TownShow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TownShow().setVisible(true);
            }
        });
    }
        
    public void paint(Graphics g) {
        Graphics2D g2d = ( Graphics2D ) g;
       
        //Rectangle2D.Double rect = new Rectangle2D.Double(25,25,100,100);
        //g.setColor(Color.red);
        //g.setColor(Color.red);
           
       for(Point point : showTown2)
       {
            g2d.setColor(Color.BLUE);
            g2d.setStroke(new BasicStroke((float) 0.3));
            g2d.fillOval(point.x, point.y,10,10);
           
        }
       
         g2d.setColor(Color.RED);
         g2d.setStroke(new  BasicStroke((float) 0.5 ));
         
       for(int i = 0 ; i < showTown2.size() ; i++){
                              
          if(i == showTown2.size()-1){
             g2d.drawLine(showTown2.get(i).x, showTown2.get(i).y, showTown2.get(0).x, showTown2.get(0).y);

          }else{
               g2d.drawLine(showTown2.get(i).x, showTown2.get(i).y, showTown2.get(i+1).x, showTown2.get(i+1).y);
          }
       }
           
       }  
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}