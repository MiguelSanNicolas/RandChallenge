import java.util.Scanner;

public class RandChallenge {
	
	public static void main(String[] args) {
		try (Scanner in = new Scanner(System.in)) {
			
			String line = in.nextLine();
			int listSize = Integer.parseInt(line.substring(0, line.indexOf(' ')));
			int totalOperations = Integer.parseInt(line.substring(line.indexOf(' ')+ 1, line.length()));
			int[] arr = new int[listSize];
			
			for( int i = 0; i < totalOperations; i++ ) {
				line = in.nextLine();
				int start= Integer.parseInt(line.substring(0, line.indexOf(' ')));
				int end = Integer.parseInt(line.substring(line.indexOf(' ') + 1, line.lastIndexOf(' ')));
				int value = Integer.parseInt(line.substring(line.lastIndexOf(' ') + 1, line.length()));
				for (int j = start; j <= end; j++) {
					arr[j - 1]+=value;
				}
			}
			int max = Integer.MIN_VALUE;
			
			for ( int i = 0; i < arr.length; i++ ) {
				if( max < arr[i] )
					max = arr[i];
			}
			
			System.out.println(max);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
	}
}