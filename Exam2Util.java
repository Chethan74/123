import java.util.Scanner;

class Exam2Util{
static String[] hallTicket=new String[3];
public static void main(String a[])
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter the candidate name");
String name =sc.next();
System.out.println("Enter the USN Numer");
String usn = sc.next();
System.out.println("Enter the subject name");
String subject = sc.next();
hallTicket[0]=name;
hallTicket[1]=usn;
hallTicket[2]=subject;
Exam2.allow(hallTicket);
Exam2.allow(1250);
}
}
