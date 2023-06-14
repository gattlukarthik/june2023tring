import java.util.*;
class Digits1
{
public static void printLine(int start,int stop)
{
for(int i=start;i<=stop;i++){
System.out.print(i);
if(i<stop)System.out.print("");
}}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printLine(1,1);System.out.print("\n");
printLine(1,2);System.out.print("\n");
printLine(1,3);System.out.print("\n");
printLine(1,4);System.out.print("\n");
printLine(1,5);System.out.print("\n");
printLine(1,6);System.out.print("\n");
}}
