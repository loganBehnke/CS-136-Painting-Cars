import java.awt.geom.Ellipse2D;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.Rectangle;
import java.awt.geom.Point2D;
import java.awt.Color;
import javax.swing.JComponent;
import java.awt.Graphics2D;
import java.awt.Graphics;


public class Car extends JComponent{
  int x;
  int y;
  Color carColor;
  int lengthofcar;
  int frontTireSize;
  int rearTireSize;

  public Car(int x, int y, Color carColor, int length, int frontTireSize, int rearTireSize){
    this.x = x;
    this.y = y;
    this.carColor = carColor;
    this.lengthofcar = length;
    this.frontTireSize = frontTireSize;
    this.rearTireSize = rearTireSize;

  }

  @Override
  protected void paintComponent(Graphics g){
    Graphics2D g2 = (Graphics2D) g;
    g2.translate(this.x, this.y);
    Rectangle carbody = new Rectangle(0, 10, this.lengthofcar, 10);
    g2.setColor(this.carColor);
    g2.fill(carbody);
    Ellipse2D.Double frontTire = new Ellipse2D.Double((this.lengthofcar-20), 20, this.frontTireSize, this.frontTireSize);
    g2.setColor(Color.BLACK);
    g2.fill(frontTire);
    Ellipse2D.Double backTire = new Ellipse2D.Double(10, 20, this.rearTireSize, this.rearTireSize);
    g2.setColor(Color.BLACK);
    g2.fill(backTire);

    //Bottom of front windowshield
    Point2D.Double r1 = new Point2D.Double((this.lengthofcar-10), 10);
    //front of the roof
    Point2D.Double r2 = new Point2D.Double((this.lengthofcar-20), 0);
    //rear of the roof
    Point2D.Double r3 = new Point2D.Double(10,10);
    //Bottom of the rear windowshield
    Point2D.Double r4 = new Point2D.Double(20, 0);

    Line2D.Double frontWindoshield = new Line2D.Double(r1, r2);
    Line2D.Double rooftop = new Line2D.Double(r2, r4);
    Line2D.Double rearWindoshield = new Line2D.Double(r3, r4);

    g2.setColor(this.carColor);
    g2.draw(frontWindoshield);
    g2.draw(rooftop);
    g2.draw(rearWindoshield);


  }
}
