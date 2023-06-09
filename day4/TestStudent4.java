class Student
{
int rollno;
String name;
void insertRecord(int r,String n)
{
rollno=r;
name=n;
}
void displayinformation(){System.out.println(rollno+" "+name);}
}
class TestStudent4
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.rollno=101;
s1.name="justin";
s2.rollno=202;
s2.name="bieber";
s1.displayinformation();
s2.displayinformation();
}
}