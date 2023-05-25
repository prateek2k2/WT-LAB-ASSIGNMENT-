import java.awt.*; 
import java.applet.*; 
import java.awt.event.*; 
import java.awt.geom.Line2D; 
import javax.swing.*; 
public class q19 extends Applet 
{ 
 int x[] = {200,300,400,400,300,200}; 
 int y[] = {200,150,200,300,350,300}; 
 int x1[] = {200,300,300}; 
 int y1[] = {200,150,200}; 
 int x2[] = {300,400,300}; 
 int y2[] = {150,200,200}; 
 int x3[] = {200,300,300}; 
 int y3[] = {200,200,300}; 
 int x4[] = {400,300,300}; 
 int y4[] = {200,200,300}; 
 int x5[] = {200,200,300}; 
 int y5[] = {200,300,300}; 
 int x6[] = {400,400,300}; 
 int y6[] = {200,300,300}; 
 int x7[] = {400,300,300}; 
 int y7[] = {300,350,300}; 
 int x8[] = {300,200,300}; 
 int y8[] = {350,300,300}; 
 public void paint(Graphics obj) 
 { 
 obj.setColor(Color.black); 
 Graphics2D g = (Graphics2D) obj; 
 g.setStroke(new BasicStroke(6)); 
 
 g.setColor(Color.red); 
 g.fillPolygon(x1,y1,3); 
 g.setColor(Color.yellow); 
 g.fillPolygon(x2,y2,3); 
 g.setColor(Color.blue); 
 g.fillPolygon(x3,y3,3); 
 g.setColor(Color.green); 
 g.fillPolygon(x4,y4,3); 
 g.setColor(Color.green); 
 g.fillPolygon(x5,y5,3); 
 
 g.setColor(Color.blue); 
 g.fillPolygon(x6,y6,3); 
 g.setColor(Color.red); 
 g.fillPolygon(x7,y7,3); 
 g.setColor(Color.yellow); 
 g.fillPolygon(x8,y8,3); 
 g.setColor(Color.black); 
 g.drawPolygon(x,y,6); 
 g.drawLine(300,150,300,350); 
 g.drawLine(200,200,400,200); 
 g.drawLine(400,300,200,300); 
 g.drawLine(200,200,300,300); 
 g.drawLine(400,200,300,300); 
 } 
}
/*<html> 
 <applet code=q19 height=200 width=200> 
 </applet> 
 </html> 
*/