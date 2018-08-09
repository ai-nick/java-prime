 package first;


public class thought {
	public static void main(String[] arguments) {
		String feels = "its a dream within a dream";
		System.out.println(feels);
		int primeIndex = 1000;
		int count = 0;
		int start = 2;
		while(count < primeIndex) {
			//we only need to check divisors up to half way because 
			//anything past that would have been the dividend of a 
			//divisor in the first half of the set, hence our midpoint var
			int midpoint = start/2;
			//System.out.println(midpoint);
			if (midpoint > 1) {
				int divisor = 2;
				boolean is_prime = true;
				while(divisor < midpoint) {
					if((start % divisor) == 0) {
						is_prime = false;
						break;
					}
					divisor++;
				}
				if ((is_prime == true) && (start%midpoint != 0)) {
					System.out.println(count);
					start++;
					count ++;
				} else {
					start++;
				}
			} else {
				count++;
				start++;
			}
			//start++;
		}
		System.out.println("the " + 116 + "th prime number is " + (start -1));
	}
	
}
