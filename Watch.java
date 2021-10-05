class Watch{
static String watchName[] = new String[4];
static int noOfBranch[]=new int[4];

public static void main(String a[])
{
           watchName[0] = "sonata";
            watchName[1] = "fastrack";
            watchName[2] = "titan";
            watchName[3] = "fossil";
            getWatchName();
  

noOfBranch[0]=6;
noOfBranch[1]=11;
noOfBranch[2]=8;
noOfBranch[3]=10;
getNoOfBranch();
}

public static void getWatchName(){
for(int z=0; z<watchName.length;z++){
System.out.println(watchName[z] );
} 
}
public static void getNoOfBranch(){
for(int d=0;d<noOfBranch.length;d++){
System.out.println(noOfBranch[d] );
}
}
}
