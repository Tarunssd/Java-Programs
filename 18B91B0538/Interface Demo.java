interface A
{
void calculate(int x,int y);
}
interface B extends A
{
void calculate2(int x,int y);
}
class C implements B
{
public void calculate(int x,int y)
{
System.out.println("Addition in Interface A:"+(x+y));
}
public void calculate2(int x,int y)
{
System.out.println("Multiplication in Interface B:"+(x*y));
}
}
class InterfaceDemo
{
public static void main(String args[])
{
C obj=new C();
obj.calculate(2,4);
obj.calculate2(2,4);
}
}