import java.util.Scanner;
public class even
{
    public static void main(String[] args) 
    {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the no. upto which you want to print even numbers:");
        n = s.nextInt();
       
        System.out.print("Even numbers:");
        for(int i = 0 ; i < n ; i++)
        {
            if(i % 2 == 0)
            {
                System.out.print(i +" ");
            }
        }
    }
}