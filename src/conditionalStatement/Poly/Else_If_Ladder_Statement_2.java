package conditionalStatement.Poly;

public class Else_If_Ladder_Statement_2 {
	
	public static void main(String []args) {
		int  marks = 59;
		
		if (marks >= 90) 
		{
			System.out.println("Grade: A");
		}
		else if(marks >= 60) 
		{
			System.out.println("Grade: B");
		}
		else if(marks >= 45) 
		{
			System.out.println("Grade: C");
		}
		else
		{
			System.out.println("Fail");
		}
	}

}
