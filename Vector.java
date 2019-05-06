/*
Une classe utilitaire pour gérer les opérations entre les vecteurs
Les vecteurs sont considérées comme des tableaux de doubles
*/
import java.lang.Math;
public final class Vector{

	//la constructeur
	private Vector(){}

	//les méthodes

	//retourne le longueur d'un vecteur
	public static int longueur(double[] v){
		return v.length;
	}

	//controle si deux vecteurs ont le meme longueur
	public static boolean same_length(double[] v1, double[] v2){
		if(v1.longueur() != v2.longueur()){
			return false;
		}
		return true;
	}

	//retourne l'addition de deux vecteurs
	public static double addition(double[] v1, double[] v2){
		if(!(same_length(v1,v2))){
			throw new IllegalArgumentException("Longueur des vecteurs non compatible!");
		}
		
		double[] somme_vecteur={};
		for(int i=0;i<v1.length;i++){
			somme_vecteur[i]=v1[i]+v2[i];

		}
		return somme_vecteur;

	}
	//retourne la soustraction de deux vecteurs
	public static double soustraction(double[] v1, double[] v2){
		if(!(same_length(v1,v2))){
			throw new IllegalArgumentException("Longueur des vecteurs non compatible!");
		}
		double[] soustract_vecteur={};
		for(int i=0;i<v1.length;i++){
			somme_vecteur[i]=v1[i]-v2[i];
		}
		return soustract_vecteur;

	}

	//retourne le produit interne de deux vecteurs
	public static double produit(double[] v1, double[] v2){
		if(!(same_length(v1,v2))){
			throw new IllegalArgumentException("Longueur des vecteurs non compatible!");
		}
		double produit_sum=0.0;
		for(int i=0;i<v1.length;i++){
			produit_sum+=(v1[i]*v2[i]);
		}
		return produit_sum;		
	}
	//retourne le double d'un vecteur
	public static double carre(double[] v){
		double v_carre=0.0;
		for(int i=0; v.length;i++){
			v_carre+=Math.pow(v[i],2);
		}
		return v_carre;

	}
	//retourne le cosinus entre deux vecteurs
	public static double cosinus(double[] v1, double[] v2){
		return produit(v1,v2) / (Math.sqrt(carre(v1))*Math.sqrt(v2));
	}
	
}
