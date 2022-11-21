package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Test implements Serializable{
	
	int i=10,j=20;
}


public class SerializationAndDeserialization {

	public static void main(String[] args) throws Exception {
		
		Test t1=new Test();
		
		//serialization
		//convert java obj to txt
		FileOutputStream fos= new FileOutputStream("text.txt") ;
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(t1);
		
		
		
		//deserialization
		//convert the text format to obj
		FileInputStream fis= new FileInputStream("C:\\Users\\likja\\eclipse-workspace\\RESTAPI_BDD\\text.txt");
		ObjectInputStream ois= new ObjectInputStream(fis);
		 Test t2=(Test)ois.readObject();
		 System.out.println(t2.i +" "+ t2.j);
		
		

	}

}
