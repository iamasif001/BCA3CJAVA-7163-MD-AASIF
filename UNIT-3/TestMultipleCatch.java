public class TestMultipleCatch{
	public static void main(String args[]){
		try{
			int[] vishalScores=new int[3];
			vishalScores[0]=95;
			vishalScores[1]=90;
			vishalScores[02]=85;
			
			vishalScores[5]=100;
		}catch(ArithmeticException e){
			System.out.println("Arithmetic error occured.");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array index error: vishal accessed an invalid index!");
		}catch(Exception e){
			System.out.println("General Exception Handler:"+e);
		}
	}
}