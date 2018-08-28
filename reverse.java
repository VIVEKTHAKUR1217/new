public class reverse
{
public static void main(String[] args)
{
int N=Integer.parseInt(args[0]);
int n=N;
int count=0;
int rev=0;
System.out.println("Number is: " +n);
while(N!=0)
{
int rem=N%10;
rev=rev*10+rem;
N=N/10;
}
System.out.println("Reverse of the number is: " +rev);
}
}