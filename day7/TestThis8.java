class Student
{
int rollno;
String name,course;
float fee;
Student(int rollno,String name,String course){
this.rollno=rollno;
this.name=name;
this.course=course;
}
Student(int rollno,String name,String course,float fee){
this(rollno,name,course);
this.fee=fee;
}
void display(){System.out.println(rollno+" "+name+" "+course+" ");}
}
class TestThis8{
public static void main(String args[]){
Student s1=new Student(555,"saha","java");
Student s2=new Student(666,"sana","10000f");
s1.display();
s2.display();
}}