class Exam2{
public static String universityName="VTU";

public static void allow(String[] hallTicket)
{
System.out.println("start of allow method with hallTicket");
if(hallTicket !=null)
{
gethallTicketDetails(hallTicket);
}
else{
System.out.println("end of allow method with hallTicket");
}}
public static void allow(int fees)
{
System.out.println("start of allow method with fees");
if(fees>1000)
{
System.out.println(fees);
}
else
{
System.out.println("please pay the fees!!");
}
System.out.println("end of allow method with fees");
}
public static void gethallTicketDetails(String[] hallTicket)
{
for(int i=0; i<hallTicket.length; i++)
{
System.out.println(hallTicket[i]);
}
}
}

