class Factorial
{
public static void main (String a[]){

a(5);

}
public static void a(int num){

int fact=1;
 for(int i=1 ; i<=num ;i++){
fact=fact*i;
}
System.out.println(num+"!"+"="+fact);
System.out.println("factorial of " + num+" is "+fact);

}
}
