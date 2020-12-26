class A
{
A()
{
int a=12,b=13;
System.out.println("Multiplication in def Constructor:"+(a*b));
}
A(int x,int y){
System.out.println("Multiplication in parameterised Constructor:"+(x*y));
}
}
class ConstructorOverloading
{
public static void main(String args[])
{
A obj1=new A();
A obj2=new A(2,4);
}
}