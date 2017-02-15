import java.awt.Color;

public class PaintBucket{
  private int red;
  private int green;
  private int blue;

  public  PaintBucket(){
    red = 0;
    green = 0;
    blue = 0;

  }
  public void addColor(int newRed, int newGreen, int newBlue, int amount){
    red = (red + newRed) / amount;
    green = (green + newGreen) / amount;
    blue = (blue + newBlue) / amount;
  }
  public Color getMixedColor(){
    return new Color(red, green, blue);
  }
}
