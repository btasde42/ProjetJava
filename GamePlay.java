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
	public void	change_Position(Player p){
		while(!(is_ended())){
			int nouvelle_pos=de.jetteDes();
			System.out.println(nouvelle_pos);
			if(nouvelle_pos==0){
				System.out.println("Restez où vous etes!");
				return;
			}
			if(pl.get_Case(p.getPos()+nouvelle_pos).getType()==2){
				pl.get_Case(p.getPos()+nouvelle_pos).afficheSignale();
				change_Position(p); //recursion pour rejetter les des si le nouvel case est de type 2
			}
			p.setPos(p.getPos()+nouvelle_pos);
			if(pl.get_Case(p.getPos()).getType()==3){ //reculer 3 cases si 
				pl.get_Case(p.getPos()+nouvelle_pos).afficheSignale();
				p.setPos(p.getPos()-3);
			}

		}

	}

	//cette methode extrait à chaque tour un mot random à deviner
	public static String get_random_word(EspaceVectorielle v){
		Map<String, List<Double>> map_word=v.getDict();
		Random r=new Random();
		List<String> keys=new ArrayList<String>(map_word.keySet());
		return keys.get(r.nextInt(keys.size()));

	}

	//Cette méthode prend trois mots proposées par l'utilisateur et retourne une dictionnaire
	//où il y a les mots et leurs valurs de similarité
	//i est le nombre des mots retournés en resultat; choisit par l'utilisateur
	public Map<Double,String> calcule_similaire(EspaceVectorielle v, int k, String a, String b, String c){
		//on obtient les vecteurs de ces trois mots et on calcule leur vecteur totale
		Map<Double,String> resultats=new Hashmap<>();
		Double vec_indices=addition(soustraction(getVector(a),getVector(b)),getVector(c));
		//iteration sur l'espace vectorielle
		Iterator<Map.Entry<String,List<Double>>> iter =v.entrySet().iterator();
		while(iter.hasNext()){
			Map.Entry<String,List<Double>> entry = iter.next();
			resultats.put(cosinus(vec_indices,entry.getValue()),entry.getKey());
			
		}
		//pour enumerer le map qu'on a crée
		Map<Double, String> sorted_by_key = new TreeMap<>(resultats);
		Set set = sorted_by_key.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()&&i<k){
			Map.Entry k_results=(Map.Entry) i.next();
		}
		return k_results;	
	}


}