package pattern;

public class Samosa {
	
	static Samosa samosa;
	private  Samosa() {
		if(samosa !=null) {
			throw new RuntimeException("you are trying to break singleton pattern");
		}
		
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
 
