import java.util.*;
class pattern01
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
char sp=sc.next().charAt(0);
int n=sc.nextInt();
int space=n-1; 
for(int i=0;i<n;i++)
{
  for(int j=0;j<=space;j++)
  {
    System.out.print(sp);
  }
  space--;
  for(int j=0;j<=i;j++)
  {
    System.out.print("*");
  }
  System.out.println();
}
   }
}
