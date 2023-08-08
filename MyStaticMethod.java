public class MyStaticMethod
{

int a;
static int b;
static int c;
static Integer d;

public  static void show()
{

MyStaticMethod o=new MyStaticMethod();

System.out.println(o.a);
System.out.println(c);
System.out.println(d);
}

public static void add()
{


MyStaticMethod o=new MyStaticMethod();
o.a=12;
b=12;
c=o.a+b;
System.out.println("sum  "+c);
}


public static void subtract()
{
MyStaticMethod o=new MyStaticMethod();
o.a=62;
b=26;
c=o.a-b;
System.out.println("diff  "+c);
}

public void multi()
{
a=10;
b=20;
c=a*b;
System.out.println("Mult "+c);

}

public static void main(String args[])
{
show();
add();
subtract();
MyStaticMethod o=new MyStaticMethod();

o.multi();



}

}
 