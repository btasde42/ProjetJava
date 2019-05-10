/* Cette classe crée une espace vectorielle avec les données extraits d'un fichier csv
*/

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.regex.*;
import java.io.*;
import java.util.Iterator;

public class EspaceVectorielle{
	
	private Map<String, List<Double>> vec_dict;

	private final String fichier;
	//on va stocker nos données dans un hashmap où le mot sera le clé 
	//et le vecteur sera le valeur

	public EspaceVectorielle(String fichier)throws FileNotFoundException, IOException{
		this.vec_dict=new HashMap<>();
		this.fichier=fichier;
		BufferedReader in = new BufferedReader(new FileReader(fichier));
		int count=0;
		String str = in.readLine();
		List<Double> vectors=new ArrayList<Double>();
		while ((str = in.readLine()) != null) {
    		String[] parts=str.split("\\s+");
    		String key=parts[0];
    		vectors=new ArrayList<Double>(); //mettre à zero le liste
    		for(int i=1;i<parts.length;i++){
    			String vec_str=parts[i];
    			vectors.add(Double.valueOf(vec_str));
    		}

    		vec_dict.put(key,vectors);
		}
	}

	public Map<String, List<Double>> getDict(){
		return this.vec_dict;
	}

	public List<Double> getVector(String key){
		Iterator<Map.Entry<String,List<Double>>> iter = this.vec_dict.entrySet().iterator();
		//iterer sur le map et obtenir le liste de vecteurs
		while(iter.hasNext()){
			Map.Entry<String,List<Double>> entry = iter.next();
			if (entry.getKey().equals(key)){
				return entry.getValue();
			}
		}
		System.out.println("Le mot n'existe pas dans nos archives!");
		return null;
	}

}