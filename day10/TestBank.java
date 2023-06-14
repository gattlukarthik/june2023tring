abstract class Bank{
abstract int getRateOfintrest();
}
class SBI extends Bank{
int getRateOfintrest(){return 7;}
}
class PNB extends Bank{
int getRateOfintrest(){return 8;}
}
class TestBank{
public static void main(String args[])
{
Bank b;
b=new SBI();
System.out.println("Rate of intrest is:"+b.getRateOfintrest()+"%");
b=new PNB();
System.out.println("Rate of intrest is:"+b.getRateOfintrest()+"%");
}}