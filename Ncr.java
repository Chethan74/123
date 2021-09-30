class Ncr
{

public static void main(String a[])
{
int c,n,r;
System.out.println("Enter the value for  n"); 
n=4;
r=2;
c=fact(n)/(fact(n-r)*fact(r));
System.out.println("4C2="+c);

}
public static int fact (int num)
{

int fact=1;
for(int i=1; i<=num; i++)
{
fact=fact*i;
}

return fact;
}
}
