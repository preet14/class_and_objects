class D1
{
  int r,img;
  D1(int x,int y)
  {
    r=x;
    img=y; 
  }  
  void Dis()
  {
    System.out.println(r+"+"+img+"i");
  }
}
public class Complex
{
public static void main(String args[])
{
  D1 obj = new D1(10,20);
  obj.Dis();
}
}