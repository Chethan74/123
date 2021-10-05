import java.util.Scanner;
class ElectionUtil{
static String[] voterId=new String[2];
public static void main (String a[])
{
System.out.println("main method started");
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name");
String name=sc.next();
System.out.println("Enter the voterIdNumber");
String voterIdNumber=sc.next();
Election.voting(voterId);
System.out.println("main method ended");
}}
