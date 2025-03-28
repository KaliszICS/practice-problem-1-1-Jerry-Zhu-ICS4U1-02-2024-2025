public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sum2D(int[][] arr){
		int sum = 0;
		for (int row = 0; row < arr.length; row++){
			for (int column = 0; column < arr[row].length; column++){
sum += arr[row][column];
			}
		}
		return sum;
	}

	public static int sumRow(int[][] arr, int row){
		int sum = 0;
for(int i = 0; i < arr[row].length; i++){
sum += arr[row][i];
}
return sum;
	}


	public static int sumColumn(int[][] arr, int column){
		int sum = 0;
		for(int i = 0; i < arr.length; i++){
			sum += arr[i][column];
		}
		return sum;
	}
}
