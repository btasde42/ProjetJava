import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Main{
	public static void main(String[] args){
		try{
			EspaceVectorielle v1=new EspaceVectorielle("w2v_final3.csv");
			List<Double> vec1=v1.getVector("mère");
			List<Double> vec2=v1.getVector("chaise");
			System.out.println(VectorProjet.cosinus(vec1,vec2));

		}catch(IOException e){
			System.out.println(e);
		}
	}
}