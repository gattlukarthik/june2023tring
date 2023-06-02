class Bruce{
public void funWayne(){
System.out.println("FunWayne called from class Bruce");
}
public void funBat(){
System.out.println("FunBat called from class Bruce");
}
public void funMistate(){
System.out.println("FunMistate called from Bruce");
}
}
class Been
{
public static void main (String args[]){
Bruce ob=new Bruce();
ob.funWayne();
ob.funBat();
ob.funMistate();
}
}