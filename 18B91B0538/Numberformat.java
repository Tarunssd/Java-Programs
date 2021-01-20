class Numberformat
{
public static void main(String args[])
{
try{
String s="ten";
int n=Integer.parseInt(s);
}
catch(NumberFormatException e)
{
System.out.println(e);
}
}
}
