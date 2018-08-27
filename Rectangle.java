class Rect
{
  int l,b;
  Rect(int x,int y)
  {
    l=x;
    b=y; 
  }  
  void calculateArea()
  {
    System.out.println("Area : "+(l*b));
  }
}
public class Rectangle
{
public static void main(String args[])
{
  Rect obj = new Rect(10,20);
  obj.calculateArea();
}
}