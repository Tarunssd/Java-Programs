class A
{
void show(int n)
{
System.out.println("Number is:"+n);
}
}
class B extends A
{
void square(int n)
{
System.out.println("square of n is:"+(n*n));
}
}
class C extends A
{
void cube(int n)
{
System.out.println("cube of n is:"+(n*n*n));
}
}
class HierarchialInheritance
{
public static void main(String args[])
{
B obj1=new B();
System.out.println("For class B:");
obj1.show(5);
obj1.square(5);
C obj2=new C();
System.out.println("For class c:");
obj2.show(5);
obj2.cube(5);
}
}
