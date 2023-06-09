class Rectangle
{
int length;
int width;
void insert(int l,int w)
{
length=l;
width=w;
}
void calculationArea(){System.out.println(length*width);}
}
class TestRectangle2
{
public static void main(String args[])
{
Rectangle r1=new Rectangle(),r2=new Rectangle();
r1.insert(67,23);
r2.insert(56,76);
r1.CalculateArea();
r2.CalculateArea();
}
}