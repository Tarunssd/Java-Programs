class NegativeArraysize
{
public static void main(String args[])
{
try{
int []a=new int[-3];
a[0]=1;
a[1]=2;
}
catch(NegativeArraySizeException e)
{
System.out.println(e);
}
}
}