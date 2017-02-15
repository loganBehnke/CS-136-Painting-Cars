import javax.swing.JFrame;
import java.awt.Color;

public class CustomCarComponent{
  public static void main(String[] args){
    //sets up the JFrame
    JFrame frame = new JFrame();
    frame.setSize(220, 520);
    frame.setTitle("Custom Cars!");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setBackground(Color.GRAY);
    frame.setVisible(true);


    PaintBucket bucket = new PaintBucket();
    bucket.addColor(255, 0, 0, 1);
    Car car1 = new Car(10, 10, bucket.getMixedColor(), 60, 10, 10);
    frame.add(car1);
    frame.setVisible(true);
    bucket.addColor(0, 0, 255, 2);
    Car car2 = new Car(10, 50, bucket.getMixedColor(), 100, 10, 15);
    frame.add(car2);
    frame.setVisible(true);
    bucket.addColor(0, 0, 255, 4);
    Car car3 = new Car(10, 100, bucket.getMixedColor(), 45, 5, 6);
    frame.add(car3);
    frame.setVisible(true);
  }
}
