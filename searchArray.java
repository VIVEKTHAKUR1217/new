class searchArray
{
public static void main(String[] args)
{
int i;
int[] A = {1,4,6,7,8,9,10};
int flag=0;
int N=Integer.parseInt(args[0]);
for(i=0; i<=6; i++) {
    if(A[i]==N) {
        flag=1;
        break;
    }
}
if(flag==1)
{
System.out.println ( "Element found at index "+i);
}
else
{
System.out.println ( "Element NOT found in array");
}
}
}