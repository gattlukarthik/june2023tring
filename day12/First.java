class First
{
public static void main(String args[])
{
Thread t=Thread.currentThread();
System.out.println("CURRENTTHREAD-"+t);
t.setName("New Threadby Pawan");
t.setPriority(t.getPriority()-1);
System.out.println("CURRENTTHREAD-"+t);
System.out.println("NAME-"+t.getName());
}}