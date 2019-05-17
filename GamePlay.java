/**
Cette classe controle le jeu.
**/

import java.util.*;

public class GamePlay{
	
	private Plateau pl;
	private List<Player> players;
	private int end_pos;
	private int essaie;
	private Des de;


	public GamePlay(List<Player> players, int nombre_essaie, Des de){
		this.pl=new Plateau();
		this.end_pos=pl.size();
		this.players=players;
		this.essaie=nombre_essaie;
		this.de=de;
		//on initialise le de comme piege ou normale selon le choix de l'utilisateur
	}

	//cette methode controle si un des joueurs est arrivé au position finale et si le jeu est fini
	public boolean is_ended(){
		//on controle si qqn est arrivé au pos finale
		boolean reponse=false;
		for(Player player: this.players){
			if(player.getPos()>=end_pos){
				System.out.println("Le jeu est fini! Player " + player.getName() + " a gagné!");
				reponse=true;

			}
		}
		return reponse;
		
	}
	//affiche les positions des joueurs
	public void affiche_positions(){
		for(Player player:this.players){
			System.out.println("Player " + player.getName() + " est à case " +player.getPos());
		}
	}

	//cette fonction change la position de joueur avec le jette de dès.
	public void	Change_Position(Player p){
		if(!(is_ended())){
			int nouvelle_pos=this.de.jetteDes();
			if(nouvelle_pos==0){
				System.out.println("Restez où vous etes!");
				return;
			}if(pl.get_Case(p.getPos()+nouvelle_pos).getType()==2){
				pl.get_Case(p.getPos()+nouvelle_pos).afficheSignale();
				return Change_Position(p); //recursion pour rejetter les des si le nouvel case est de type 2
			}
			p.setPos(p.getPos()+nouvelle_pos);
			if(pl.get_Case(p.getPos()).getType()==3){ //reculer 3 cases si 
				pl.get_Case(p.getPos()+nouvelle_pos).afficheSignale();
				p.setPos(p.getPos()-3);
			}

		}

	}

}