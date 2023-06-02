//java program to check wheather the character is an alphabet or not
import java.util.*;
public class Program205d
{
public static void main(string[] args)
{char ch;
System.out.print(''Enter the character:");
Scanner sc = new Scanner(System.in);
ch = sc.next().charAt(0);
System.out.println();
if(ch >='0' && ch <=9)
System.out.println(ch + ''is a digit'');
else
System.out.println(ch + '' is not a digit'')
}
}