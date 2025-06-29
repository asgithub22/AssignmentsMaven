package ConditionalStatementsAndLoops;

public class Assignement13 {

	public static void main(String[] args) {
		int n = 1; // You can change this value to test other inputs
        boolean isPrime = true;

        if (n <= 1) { //check the prime condition for 1
            isPrime = false; 
        } else {
            int i = 2;
            while (i <= n / 2) { //check the quotient value
                if (n % i == 0) { //compare the remainder value
                    isPrime = false;
                    break;
                }
                i++;
            }
        }
        

        System.out.println("Is " + n + " a prime number? " + isPrime);
    }

	

}
