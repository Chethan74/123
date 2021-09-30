class Airports
{
public static void main(String a[])
{
String AirportName[] = new String[5];
AirportName[0] =" Kempegowda International Airport";
AirportName[1] = "Jaipur International Airports";
AirportName[2] = "Sardar vallabhbhai Patel International Airport";
AirportName[3] = "Dr.Babasaheb Ambedkar International Airport";
AirportName[4] = "Gaya Airport";
  
int noOfAiroplanes[] = new int[5];
noOfAiroplanes[0] = 21; 
noOfAiroplanes[1]  =  14;
noOfAiroplanes[2] = 12 ;
noOfAiroplanes[3] = 20;
noOfAiroplanes[4] = 8;
 
for(int z=0;z<AirportName.length;z++){
System.out.println(noOfAiroplanes[z] + " Airoplanes in " +AirportName[z]);
}
}
}
            