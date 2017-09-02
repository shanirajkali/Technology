package exception;

public class Exceptions {

	public static void main(String[] args) {
		try{
			int[] arr=new int[2];
			return;
			//System.out.println(arr[3]);
			//System.exit(0);
		}
		catch(Exception e){
			//e.printStackTrace();
			//System.exit(0);
			throw e;
		}
		finally{
			System.out.println("done");
		}
	


	}

}
