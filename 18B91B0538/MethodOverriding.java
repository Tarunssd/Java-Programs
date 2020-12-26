class A
{
void add(int x,int y)
{
System.out.println("Addition in parent class:"+(x+y));
}
}
class B extends A
{
void add(int x,int y){
System.out.println("Addition in child class:"+(x+y));
}
}
class MethodOverriding
{
public static void main(String args[])
{
B obj=new B();
obj.add(20,10);
}
}
