/*
	* Problem 3 *
	Find the largest prime factor of the number 60085147
*/
public class Problem3{
    public static void main(String[] args){

	// Initializes variables for all numbers, factors, and the greatest number
    int[] all = new int[60085147];
    int[] factors = new int[10];
    int k = 0;
    int greatest = 0;

	// Gets all numbers from 0 to 60085147
    for(int n = 0; n < all.length; n++){
        all[n] = n;
    }

	// Checks if all numbers are multiples of 60085147, and then if they are prime
    for(int n = 1; n < all.length; n++){
        if(60085147 % all[n] == 0){
			if(all[n] % 2 == 0 || all[n] % 3 == 0 || all[n] % 5 == 0 ){
				factors[k] = all[n];
				k++;
			}
			else{
				continue;
			}
        }
        else{
            continue;
        	}
        }

	// Finds the greatest value
    for(int n = 0; n < factors.length; n++){
        if(factors[n] > greatest){
            greatest = factors[n];
        }
        else{
            continue;
        }


    }

	// Prints out the greatest number
    System.out.println(greatest);

    }


}
