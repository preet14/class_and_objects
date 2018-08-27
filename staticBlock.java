class S
{
  static int d;
  static
  {
    d=10;
    System.out.println("In static block");
    System.out.println("Value : "+d);
  }
  void dis()
  {
    System.out.println("In class memeber function");
  }
}
class staticBlock
{
  public static void main(String args[])
  {
    S obj=new S();
    obj.dis();
  }
}