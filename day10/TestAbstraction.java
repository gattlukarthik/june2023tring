abstract class Shape
{
abstract void draw();
}
class Rectangle extends Shape
{
void draw(){System.out.println("drawing Rectangle");}
}
class Circle extends Shape
{
void draw(){System.out.println("drawing circle");}
}
class TestAbstraction
{
public static void main(String args[])
{
Shape s=new Circle();
s.draw();
Shape s1=new Rectangle();
s1.draw();
}}