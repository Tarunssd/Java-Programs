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
class B extends Parent{
void add(int x,int y)
{
System.out.println("Addition:"+(x+y));
}
}
class HybridInheritance
{
public static void main(String args[])
{
System.out.println("Grandchild inherits from Parend and child(Multilevel Inheritance)");
Grandchild obj=new Grandchild();
obj.square(5);
obj.cube(5);
obj.mul(19,2);
System.out.println("B inherits from Parent(Single Inheritance)");
B obj1=new B();
obj1.square(9);
obj1.add(21,4);
}
}