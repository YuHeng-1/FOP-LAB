/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1q4;

/**
 *
 * @author Dell
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import javax.swing.JFrame;

class Slice {
   double value;
   Color color;
   public Slice(double value, Color color) {  
      this.value = value;
      this.color = color;
   }
}
class MyComponent extends JComponent {
   Slice[] slices = { 
      new Slice(2500, Color.white), new Slice(1600, Color.green), new Slice(2000, Color.yellow), new Slice(2700, Color.red), new Slice(3200, Color.PINK), new Slice(800, Color.blue)
   };
   MyComponent() {}
   public void paint(Graphics g) {
      drawPie((Graphics2D) g, getBounds(), slices);
   }
   void drawPie(Graphics2D g, Rectangle area, Slice[] slices) {
      double total = 0.0D;
      
      for (int i = 0; i < slices.length; i++) {
         total += slices[i].value;
      }
      double curValue = 0.0D;
      int startAngle = 0;
      for (int i = 0; i < slices.length; i++) {
         startAngle = (int) (curValue * 360 / total);
         int arcAngle = (int) (slices[i].value * 360 / total);
         g.setColor(slices[i].color);
         g.fillArc(area.x, area.y, area.width, area.height, startAngle, arcAngle);
         curValue += slices[i].value;
      }
   }
}

public class L1Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      JFrame frame = new JFrame();
      frame.getContentPane().add(new MyComponent());
      frame.setSize(300, 300);
      frame.setVisible(true); 
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      
    }
    
}
