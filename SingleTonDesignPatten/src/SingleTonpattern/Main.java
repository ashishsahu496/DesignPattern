package SingleTonpattern;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;

public class Main{

	public static void main(String[] args) throws Exception{
		
		
	Samosa s1=Samosa.getSamosa();
	Samosa s2 =Samosa.getSamosa();
	
	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	
	System.out.println(Jalebi.getJalebi().hashCode());
	System.out.println(Jalebi.getJalebi().hashCode());
	
	// break the singleton 
	
//	Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
//	constructor.setAccessible(true);
//	Samosa s3=constructor.newInstance();
//	System.out.println(s3.hashCode());
	
	Kachori k1=Kachori.INSTANCE;
	Kachori k2=Kachori.INSTANCE;
	System.out.println(k1.hashCode());
	System.out.println(k2.hashCode());
	
	Paatis paatis =Paatis.getPaatis();
	ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream("abc.ob"));
	oos.writeObject(paatis);
	System.out.println("Serialization done...");
	ObjectInputStream ois=new ObjectInputStream(new FileInputStream("abc.ob"));
	Paatis p1=(Paatis) ois.readObject();
	System.out.println(s2.hashCode());
	}

}
/*
make private constructor
make static method
have synchronized block
reflectionApi
use Enum

*/