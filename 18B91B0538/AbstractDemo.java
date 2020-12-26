abstract class One
{
abstract void calculate(int n);
}
class Two extends One
{
void calculate(int n){
System.out.println("Square:"+(n*n));
}
}
class AbstractDemo
{
public static void main(String args[])
{
Two t=new Two();
t.calculate(5);
One o;
o=t;
o.calculate(5);
}
}
