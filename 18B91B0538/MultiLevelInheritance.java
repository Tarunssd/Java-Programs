class Parent
{
void square(int n)
{
System.out.println("square:"+(n*n));
}
}
class Child extends Parent
{
void cube(int n)
{
System.out.println("cube:"+(n*n*n));
}
}
class Grandchild extends Child
{
void mul(int a,int b)
{
System.out.println("Multiplication:"+(a*b));
}
}
class MultiLevelInheritance
{
public static void main(String args[])
{
Grandchild obj=new Grandchild();
obj.square(5);
obj.cube(5);
obj.mul(19,2);
}
}