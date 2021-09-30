class Watch{
public static void main(String a[])
{
String watchName[] = new String[4];
            watchName[0] = "sonata";
            watchName[1] = "fastrack";
            watchName[2] = "titan";
            watchName[3] = "fossil";
  
int noOfBranch[]=new int[4];
noOfBranch[0]=6;
noOfBranch[1]=11;
noOfBranch[2]=8;
noOfBranch[3]=10;


for(int z=0; z<noOfBranch.length;z++){
System.out.println(noOfBranch[z] + " : " +watchName[z]);
} 
for(int d=0;d<watchName.length;d++){
System.out.println(watchName[d] + " : " +noOfBranch[d]);
}
}
}