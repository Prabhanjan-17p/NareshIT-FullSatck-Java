class Test
{
int a ;
public static void main(String args[ ])
{
new Test();
}
{
System.out.println(this.a);
this.a = 100 ;
}
Test()
{
System.out.println(this.a);
}
}