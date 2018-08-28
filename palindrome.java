public class palindrome
{
public static void main(String[] args)
{
int N=Integer.parseInt(args[0]);
int n=N;
int count=0;
int rev=0;
while(N!=0)
{
int rem=N%10;
rev=rev*10+rem;
N=N/10;
}
if(n==rev)
{
System.out.println(n+" is palindrome");
}
else
{
System.out.println(n+" is not palindrome");
}
}
}