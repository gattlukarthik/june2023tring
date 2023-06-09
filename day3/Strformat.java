public class Strformat
{
public static void main(String args[])
{
String s1 = new String("Hello");//string1
String s2 = new String("Barbie");//string2
String s = String.format("%s%s",s1,s2);//string 3 to store the result
System.out.println(s.toString());//Displays result
}
}