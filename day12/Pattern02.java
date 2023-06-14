import java.util.*;
class Pattern02
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
int i=0,j=0;
a=sc.nextInt();
for(i=0;i<a;i++)
{
for(j=0;j<=i;j++)
{
System.out.print(j+1);
}
System.out.println();
}
}}