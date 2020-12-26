class Methods
{
void add()
{
int a=10;
int b=20;
System.out.println("Addition:"+(a+b));
}
void add(int x,int y)
{
System.out.println("Add:"+(x+y));
}
}
class MethodOverloading
{
public static void main(String args[]){
Methods obj1=new Methods();
obj1.add();
obj1.add(12,12);
}
}