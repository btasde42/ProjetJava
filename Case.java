public class Case{
//la classe de tous les types de cases

	//variables
	private String signal;

	//constucteur
	public Case(String signal){
		this.signal=signal;
	}
	
	//ici, on utilise le surcharger, comme ca, on peut chnager la phrase de case dasn le main, 
	//sans recreer une nouvelle classe
	public Case(){

	}
	//methode, pour afficher la phrase
	public String afficheSignal(){
		return signal;
	}

}