class Animal
{
public void move() {	System.out.println("call from Animal class");	}
}
class Wild extends Animal{
public void move(){	System.out.println("call from Wild class");	}
}
class Pet extends Animal{
public void move() {	System.out.println("call from Pet class");	}
}
class TestAnimal  {
public static void main(String args[])
{
Animal a=new Animal();
Animal b=new Wild();
Animal p=new Pet();
a.move();
b.move();
p.move();
}
}