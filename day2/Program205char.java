import java.util'*;
public class program205
{
public static void main(String[] args)
{char ch;
system.out.print(''Enter the character:'');
Scanner sc = new Scanner(System.in);
ch = sc.next().charAt(0);
System.out.println();
if( (ch>='a'&&ch<='z')||( ch >='A' && ch <='Z') )
System.out.println(ch + ''is an alphhabet'');
else
System.out.println(ch + ''is not an alphabet'');
}}