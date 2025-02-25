//c'est un plateau de ce jeu, on le voit comme un tableau de Cases
public class Plateau {
	//variables
	private final Case c1; //parce que dans le plateau il y a 3 types de case, on doit donc faire 3 fois de cases
	private final Case c2;
	private final Case c3;
	private Case [] p;
	private static int n=40; //n est la taille de ce plateau

	//constucteur, on initialise tous
	public Plateau() {
		c1=new Case("",1);
		c2=new Case("Relancez les dès",2);
		c3=new Case("Reculez 3 cases",3); 
		p=new Case[n]; 
		for(int i=0;i<n;i++){
			if (i%6==0){
				p[i]=c2;
			}else if (i%5==0){
				p[i]=c3;
			}else{
				p[i]=c1;
			}
		}
	}

	//les methodes pour afficher la taille de ce plateau et aussi la plateau
	public int size(){
		return n;
	}
	
	public Case get_Case(int i){
		return p[i];
	}

	public void affiche(){
		for (int i=0;i<this.n;i++){
			System.out.print(p[i].getType());
		}
		System.out.println();
	}


}
