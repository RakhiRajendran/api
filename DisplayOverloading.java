public class DisplayOverloading
{
 static int n1;
	int n2;

public static void add(){
n1=10;
DisplayOverloading ob=new DisplayOverloading();
ob.n2=20;
int result=n1+n2;
System.out.println("sum= "+result);
}

public static void main(String args[])
{
DisplayOverloading.add();
}
}