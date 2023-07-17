package exceptionhandling;

public class Throwkeyword {

	public static void main(String[] args) {
		try {
			throw new Exception("Naveen exception");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		String data=null;
		if(data==null) {
			try {
			throw new Exception("jkl exception");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
