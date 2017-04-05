/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xygrafikcizimi;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import org.math.plot.Plot2DPanel;
import java.awt.*;
/**
 *
 * @author db
 */
public class Plot {
    private JFrame frame = new JFrame("Ant Colony");
    private JPanel panel = new JPanel();

    public Plot() {
        double[] x = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        double[] y = new double[]{0, 100, 20, 70 ,10 ,50, 30, 70, 40, 90, 100};
        Plot2DPanel plot = new Plot2DPanel() {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(600, 400);
            }
        };
        plot.addLegend("WEST");
        plot.addLinePlot("my plot", x, y);
        //plot.setBackground(Color.red);
        // add a line plot to the PlotPanel     
        panel.setLayout(new BorderLayout());
        panel.add(plot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.pack();
        frame.setLocation(150, 150);
        frame.setVisible(true);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Plot();
            }
        });
    }
    
}
