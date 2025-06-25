package pattern;

import java.io.Serializable;

public class Paatis implements Serializable {
	
	static Paatis paatis;
	
	private  Paatis() {
		// TODO Auto-generated constructor stub
	 
		if(paatis !=null) {
			throw new RuntimeException("you are trying to break singleton pattern");
		}
		
	};
	
	static Paatis getPaatis() {
		if(paatis==null) {
			synchronized (Paatis.class) {
				paatis =new Paatis();
				
			}
		}return paatis;
	}

}
