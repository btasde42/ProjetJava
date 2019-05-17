/**
Cette classe controle le jeu.
**/

import java.util.*;

public class GamePlay{
	
	private Plateau pl;
	private List<Player> players;
	private int end_pos;
	private int essai;
	private DeNormale d;
	private DePiege d2; 


	public GamePlay(){
		this.pl=new Plateau();
		this.end_pos=pl.size();
	}



	//cette methode controle si un des joueurs est arrivé au position finale.
	public void is_ended(){
	}	
}