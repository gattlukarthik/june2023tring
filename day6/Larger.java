import java.util.*;
public class Larger
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
int b;
int c;
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((a>b)&&(a>c))
{
System.out.println(a);
}
else if((b>c)&&(b>c))
{
System.out.println(b);
}
else
{
System.out.println(c);
}
}
}