import java.util.*;
class if_example
{
public static void main(String args[])
{
int i,j,max;
Scanner sc=new Scanner(System.in);
i=sc.nextInt();
j=sc.nextInt();
max=sc.nextInt();
if(i>j)
{
System.out.println("i is bigger");
}
else if(i<j)
{
System.out.println("j is bigger");
}
else
{
System.out.println("max is bigger");
}
}
}