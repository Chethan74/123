class IPL{
public static void main(String a[])
{
String teamName[] = new String[8];
            teamName[0] = "RCB";
            teamName[1] = "MI";
            teamName[2] = "CSK";
            teamName[3] = "SHR";
            teamName[4] = "RR";
            teamName[5] = "PPKS";
            teamName[6] = "KKR";
            teamName[7] = "DD";      
  
int yearOfWin[]=new int[8];
yearOfWin[0]=2012;
yearOfWin[1]=2013;
yearOfWin[2]=2014;
yearOfWin[3]=2015;
yearOfWin[4]=2016;
yearOfWin[5]=2017;
yearOfWin[6]=2018;
yearOfWin[7]=2019;


for(int z=0;z< yearOfWin.length;z++){
System.out.println(teamName[z] + " win in " +yearOfWin[z]);

}
}
}