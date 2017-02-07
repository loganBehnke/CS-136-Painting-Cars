import java.awt.geom.Ellipse2D;
import java.awt.Graphic2D;
import java.awt.geom.line2D;
import java.awt.Rectangle;
import java.awt.geom.Point2D;


public class Car{
  int x;
  int y;
  String color;
  int lengthofcar;
  int frontTireSize;
  int rearTireSize;

  public Car(int x, int y, String color, int length, int frontTireSize, int rearTireSize){
    this.x = x;
    this.y = y;
    this.color = color;
    this.lengthofcar = length;
    this.frontTireSize = frontTireSize;
    this.rearTireSize = rearTireSize;

  }

  public void draw(Graphic2D g2){
    Rectangle carbody = new Rectangle(0, 10, this.lengthofcar, 10);
    g2.setColor(Color.this.color);
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
    Point2D.Double r2 = new Point2D.Double(this.lengthofcar-20), 0);
    //rear of teh roof
    Point2D.Double r3 = new Point2D.Double(10,10);
    //Bottom of the rear windowshield
    Point2D.Double r4 = new Point2D.Double(20, 0);

    Line2D.Double frontWindoshield = new Line2D.Double(r1, r2);
    Line2D.Double rooftop = new Line2D.Double(r2, r3);
    Line2D.Double rearWindoshield = new Line2D.Double(r3, r4);

    g2.setColor(Color.this.color);
    g2.draw(frontWindoshield);
    g2.draw(rooftop);
    g2.draw(rearWindoshield);


  }
}
