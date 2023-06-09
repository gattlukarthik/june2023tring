simport java.util.*;
public class Palindrome1
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int temp=a;
int b=0;
while(a>0)
{
b=b*10+(a%10);
a=a/10;
}
System.out.println(b);
if(temp==b)
{
System.out.println("palindrome");
}
else
{
System.out.println("not a palindrome");
}
}
}