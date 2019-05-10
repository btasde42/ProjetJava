/*
Une classe utilitaire pour gérer les opérations entre les vecteurs
Les vecteurs sont considérées comme des tableaux de doubles
*/
    
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public final class VectorProjet{

	//la constructeur
	private VectorProjet(){}

	//les méthodes

	//controle si deux vecteurs ont le meme longueur
	public static boolean same_length(List<Double> v1, List<Double> v2){
		if(v1.size() != v2.size()){
			return false;
		}
		return true;
	}

	//retourne l'addition de deux vecteurs
	public static List<Double> addition(List<Double> v1, List<Double> v2){
		if(!(same_length(v1,v2))){
			throw new IllegalArgumentException("Longueur des vecteurs non compatible!");
		}
		
		ArrayList<Double> somme_vecteur=new ArrayList<Double>();
		for(int i=0;i<v1.size();i++){
			somme_vecteur.add(v1.get(i)+v2.get(i));

		}
		return somme_vecteur;

	}
	//retourne la soustraction de deux vecteurs
	public static List<Double> soustraction(List<Double> v1, List<Double> v2){
		if(!(same_length(v1,v2))){
			throw new IllegalArgumentException("Longueur des vecteurs non compatible!");
		}
		ArrayList<Double> soustract_vecteur=new ArrayList<Double>();
		for(int i=0;i<v1.size();i++){
			soustract_vecteur.add(v1.get(i)-v2.get(i));
		}
		return soustract_vecteur;

	}

	//retourne le produit interne de deux vecteurs
	public static double produit(List<Double> v1, List<Double> v2){
		if(!(same_length(v1,v2))){
			throw new IllegalArgumentException("Longueur des vecteurs non compatible!");
		}
		double produit_sum=0.0;
		for(int i=0;i<v1.size();i++){
			produit_sum+=(v1.get(i)*v2.get(i));
		}
		return produit_sum;		
	}
	//retourne le double d'un vecteur
	public static double carre(List<Double> v){
		double v_carre=0.0;
		for(int i=0; i<v.size();i++){
			v_carre+=Math.pow(v.get(i),2);
		}
		return v_carre;

	}
	//retourne le cosinus entre deux vecteurs
	public static double cosinus(List<Double> v1, List<Double> v2){
		return produit(v1,v2) / (Math.sqrt(carre(v1))*(Math.sqrt(carre(v2))));
	}
	
}
