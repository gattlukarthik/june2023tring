class  Main3
{
public static void main(String args[])
{
int[] age={2,-9,0,5,12,-25,22,9,8,12};
int sum=0;
Double average;
for(int number:age)
{
sum+=number;
}
int arryLength=age.length;
average =((double)sum/(double)arryLength);
System.out.println("sum - " +sum);
System.out.println("Average = " + average);
}}