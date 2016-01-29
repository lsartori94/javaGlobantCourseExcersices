package sumAverageLoop;

public class SumAndAverage {

	public static void main(String[] args) {
		int upperBound = 100;
		int result = 0;
		int count = 0;
		int i = 0;
		
//		for(i = 0; i<=upperBound; i++, count++) {
//			result+=i;
//		}

//		for(i = 0; i<=upperBound; i++, count++) {
//			if(i % 2 != 0) {
//				result+=i;
//			}
//		}
		
//		for(i = 0; i<=upperBound; i++, count++) {
//			if(i % 7 == 0) {
//				result+=i;
//			}
//		}

		for(i = 0; i<=upperBound; i++, count++) {
			if(i % 7 == 0) {
				result+=i*i;
			}
		}
		
//		while(i <= upperBound){
//			result+=i;
//			i++;
//			count++;
//		}

//		do {
//			result += i;
//			i++;
//			count++;
//		}while(i <= upperBound);
		
		double average = result/count;
		
		System.out.println("Result = "+result);
		System.out.println("Average "+average);
	}

}
