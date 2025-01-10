/*Sam’s mark in Maths is 94, Physics is 95 and Chemistry is 96 out of 100. Find the average percent mark in PCM
I/P => NONE
O/P => Sam’s average mark in PCM is ___
*/

public class SamAverageMark{
	public static void main(String[] args){
		int maths = 94, physics = 95, chemistry = 96, totalMarks = 300;//TotalMarks is the marks out of which these marks are obtained 
		double samAverage = (maths + physics + chemistry);
		samAverage = samAverage/totalMarks*100; //The formula for percent will be samAverage/totalMarks*100
		System.out.println("Sam’s average mark in PCM is " + samAverage + "%");
	}
}