class Balu {
public void funloki() {
System.out.println("FunLoki called from class Balu");
}
public void funsurtur() {
System.out.print("FunSurtur called from class Balu");
}

public void funlang() {
System.out.println("funLang called from class Balu");
} 
}
class Thor
{
public static void main(String args[]) {
Balu ob=new Balu();
ob.funloki();
ob.funsurtur();
ob.funlang();
}
}