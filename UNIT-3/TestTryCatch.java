public class TestTryCatch{
	public static void main(String args[]){
		String studentName="Aasif";
		System.out.println(studentName+"started math calculation...");
		
		try{
			int totalmarks=100;
			int subjects=0;
			int result=totalmarks/ subjects;
			
			System.out.println("Result:"+result);
		}catch (ArithmeticException e){
			System.out.println("Exception Caught:division by zero is not allowed for" +studentName+"!");
			System.out.println("System error detail:"+ e.getMessage());
		}
		System.out.println(studentName+"'s program continues execution smoothly!");
	}
}