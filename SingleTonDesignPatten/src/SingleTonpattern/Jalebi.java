package SingleTonpattern;

public class Jalebi {
	
	//Eager loading
	private static Jalebi jalebi = new Jalebi();
	
	public static Jalebi getJalebi() {
		return jalebi;
	}

}
