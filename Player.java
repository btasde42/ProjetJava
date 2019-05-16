
/**
Cette classe crée un joueur avec un nom et les informations de position.
La position standarde de debut est la case 0.
Cette classe contient une methode move qui permet au joueur d'avancer
**/
public class Player{
	public static final int nbr_Essaie=3;
	private String nom;
	private int current_pos; //la position actuelle de player
	private static int start_pos=0; //la position de début de player

	//La constructeur
	public Player(){
		nom="";
		current_pos=0;

	}
	public Player(String nom){
		this.nom=nom;
		this.current_pos=start_pos;
	}

	//les getters
	public int getCurrentPosition(){
		return current_pos;
	}
	public String getName(){
		return nom;
	}

	//les setters
	public void setCurrentPosition(int newposition){
		current_pos=newposition;
	}

	//les méthodes pour bouger les players sur le plateau
	public void moveForward(int i){
		current_pos+=i;
	}
	public void moveBackward(int i){
		current_pos-=i;
	}
	//toString Method
	public void printPlayerDetails(){
		System.out.println(nom+" est dans la position " + current_pos);
	}

}