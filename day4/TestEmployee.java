class Employee
{
int id;
String name;
float salary;
void insert(int j,String n,float s)
{
id=j;
name=n;
salary=s;
}
void display(){System.out.println(id+" "+name+" "+salary);}
}
public class TestEmployee
{
public static void main(String args[])
{
Employee e1=new Employee();
Employee e2=new Employee();
Employee e3=new Employee();
e1.insert(901,"harry",90000);
e2.insert(902,"ron",80000);
e3.insert(903,"hermione",100000);
e1.display();
e2.display();
e3.display();
}
}