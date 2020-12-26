class Test
{
int a,b;
Test(int m,int n)
{
a=m;
b=n;
System.out.println("a in first constructor:"+a);
System.out.println("b in first constructor:"+b);
}
Test(Test t)
{
a=t.a;
b=t.b;
System.out.println("a in copy constructor:"+a);
System.out.println("b in copy constructor:"+b);
}
}
class CopyConstructor
{
public static void main(String args[])
{
Test t1=new Test(20,30);
Test t2=new Test(t1);
}
}