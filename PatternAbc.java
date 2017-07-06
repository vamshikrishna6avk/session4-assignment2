package assignment2;

public class PatternAbc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int j, d, x = 0;
		char k;
		while(i<=5){ //Here I'm using while loop to print the values in a rows
			k = 'a'; 
			for (j = 1, d=0; j <= 5; j++) { //Here I'm using for loop to print the values in  columns 
				// For increasing and decreasing the values I'm using nested if loop
				if (i < 4) {  // Starts increasing the values 
					if (j >= 4 - i && j <= 2 + i) {
						System.out.print(k);
						if (j < 3) {
							k++;
						} else {
							k--;
						}
					} else {
						System.out.print(" ");
					}
				} else {
					
					// Starts decreasing values form here					
					if (j>i-3 && j <= 5-d) {
						
						System.out.print(k);
						if (j<3) {
							k++;
						} else {
							k--;
						}
					} else {
						System.out.print(" ");
						d++;
					}
				}

			}

			System.out.println();
			i++;
		}
	}
}