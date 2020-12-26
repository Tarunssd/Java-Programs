class A
{
final int n=100;
void change()
{
n=50;
}
}
class FinalKeyword
{
public static void main(String args[])
{
A obj=new A();
obj.change();
}
}