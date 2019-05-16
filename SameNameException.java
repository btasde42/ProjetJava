//cette classe d'exception s'utilise quand on a deux personnage à meme noms

class SameNameException extends Exception{

	public SameNameException(){
		super();
	}

	public SameNameException(String message){
		super(message);
	}
	
}