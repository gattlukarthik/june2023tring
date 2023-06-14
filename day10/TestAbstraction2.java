abstract class Bike{
Bike(){System.out.println("bike is created");}
abstract void run();
void changeGear(){System.out.println("gear changed.....");}
}
class Ktm extends Bike{
void run(){System.out.println("running safely.....");}
}
class TestAbstraction2
{
public static void main(String args[])
{
Bike obj=new Ktm();
obj.changeGear();
obj.run();
}}