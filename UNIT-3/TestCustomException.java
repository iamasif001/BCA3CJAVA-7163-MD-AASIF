class InvalidStudentMarksException extends Exception{
	public InvalidStudentMarksException(String message){
		super(message);
	}
}
public class TestCustomException{
	static void validateVishalMarks(double marks)throws InvalidStudentMarksException{
		if(marks<0.0||marks>100.0){
			throw new InvalidStudentMarksException("marks must be between 0 and 100! input was:"+marks);
		}else{
			System.out.println("vishal's marks validated successfully:"+marks);
		}
	}
	public static void main(String args[]){
		try{
			System.out.println("submitting exam score for vishal..");
			validateVishalMarks(105.5);
		}catch(InvalidStudentMarksException e){
			System.out.println("custom exception caught:"+ e.getMessage());
		}
	}
}