class Bike
{
void run(){System.out.println("running");}
}
class Duke extends Bike{
void run(){System.out.println("running safely with 100kmph");}
public static void main(String args[])
{
Duke obj=new Duke();
obj.run();
}
}
