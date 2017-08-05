import java.util.Scanner;


public class BubbleSort {
	
	static int[] bubbleSort(int[] numbers){
		int n = numbers.length;
		
		for(int pass = 1; pass <n; pass++){
			for(int current=0 ; current < n-pass; current++){
				if( numbers[current] > numbers[current+1])	{
					//swap numbers[current] & numbers[current+1]
					int temp = numbers[current];
					numbers[current] = numbers[current+1];
					numbers[current+1] = temp;
				}	//end if
			}
			System.out.println("\n Printing the pass : "+pass);
			printArray(numbers);

		}
		return numbers;
	}
	
	static void printArray(int[] numbers){
		int len = numbers.length;
		for(int i = 0; i < len; i++){
			System.out.print(" "+ numbers[i]);
		}
	}
		
	public static void main(String[] args){
		//input from the user
		Scanner s = new Scanner(System.in);
	
		System.out.println("How many numbers do you wanna sort : ");
		int n = s.nextInt();
		
		int [] inputArray = new int[n];
		System.out.println("Enter the "+n+" numbers: ");
		
		for(int i = 0; i < n; i++){
			inputArray[i] = s.nextInt();
		}
		
		System.out.println("Printing the numbers you entered : ");
		printArray(inputArray);
		
		// bubbleSort (input)
		int[] sortedArray = bubbleSort(inputArray);
		System.out.println("\n The sorted numbers are : ");
		printArray(sortedArray);

	}
	
}
