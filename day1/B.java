class A {
public void funA1() {
System.out.println("FunA1 called from classA");
}
public void funA2() {
System.out.print("FunA2 called from classA");
}
} 
class B
{
public static void main(String args[]){
A ob=new A();
ob.funA1();
ob.funA2();
}
}