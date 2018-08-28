public class Armstrong {

    public static void main(String[] args) {
	int N=Integer.parseInt(args[0]);
	int m, rem, result = 0;
        m= N;
	while (m != 0)
        {
            rem = m % 10;
            result += rem*rem*rem;
            m /= 10;
        }

        if(result == N)
            System.out.println(N + " is an Armstrong number.");
        else
            System.out.println(N + " is not an Armstrong number.");
    }
}