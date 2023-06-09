class Teststringcomparison1
{
public static void main(String args[])
{
String s1="Karthik";
String s2="Karthik";
String s3=new String("Karthik");
String s4="Reddy";
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
}
}