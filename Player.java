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

	//la méthode pour bouger le player sur le plateau
	public void move(){
		current_pos++;
	}
	//toString Method
	public void printPlayerDetails(){
		System.out.println(nom+" est dans la position " + current_pos);
	}

}