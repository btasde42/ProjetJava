public class Case{
//la classe de tous les types de cases

	//variables
	private String signal;
	private int type; //le type de case définit par int: normale 1, relancer 2, reculer 3

	//constucteur
	public Case(String signal, int type){
		this.signal=signal;
		this.type=type;
	}

	//les getters
	public int getType(){
		return type;
	}

	public String getSignal(){
		return siganel;
	}
	
	//methode, pour afficher la phrase
	public String afficheSignal(){
		return signal;
	}

}