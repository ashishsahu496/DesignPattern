package pattern;

public class Samosa {
	
	static Samosa samosa;
	private  Samosa() {
		
	};
	
	// Lazy Loading calling when needed
	public static Samosa getSamosa() {
		
		if(samosa == null) {
			
			synchronized (Samosa.class) {
				samosa = new Samosa();
			}
		}
		return samosa;
	}

}
 
/*
make private constructor
make static method
have synchronized block

*/