import java.util.*;
class t
{
  int n;
  int a[];
  t()
  {
    n=0;
  }
  t(int x)
  {
      n=x;
    a = new int[n];
  }
  void get()
  { 
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
  } 
  void check()
  {
    int max=0,smax=0;
    
    for(int i=0;i<n;i++)
    {
      if (a[i] > max)
            {
                smax = max;
                max = a[i];
            }
            else if (a[i] > smax && a[i] != max)
                {smax = a[i];}
    }
   System.out.println("Second Max : "+smax); 
  }
  
}
class SecondLargest
{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int t1;
    System.out.println("Enter : ");
    t1=sc.nextInt();
    t obj = new t(t1);
    obj.get();
    obj.check();
  }
}