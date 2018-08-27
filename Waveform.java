import java.util.*;
class t1
{
  int n;
  int a[];
  t1()
  {
    n=0;
  }
  t1(int x)
  {
    n=x;
    a = new int[n];
  }
  void set()
  { 
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
    }
  } 
  void wave()
  {
     int i,t,j;
     for(i=0;i<n;i++)
     {
       for(j=0;j<n-i-1;j++)
       {
          if(a[j]>a[j+1])
          {
             t=a[j];
             a[j]=a[j+1];
             a[j+1]=t;
          }
       }
     }
      for(i=0;i<7;i=i+2)
      {
         t=a[i+1];
         a[i+1]=a[i];
         a[i]=t;
       }  
  }
  void dis()
  {
    for(int i=0;i<n;i++)
    {
       System.out.print(a[i]+" ");
     }
       System.out.println();
   }
}
class Waveform
{
  public static void main(String args[])
  {
    //int tc;
    t1 obj = new t1(10);
    obj.set();
    obj.dis();
    obj.wave();
    obj.dis();
  }
}