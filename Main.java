import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		try{
			EspaceVectorielle v2=new EspaceVectorielle("w2v_final3.csv");
			v2.getDict();

		}catch(IOException e){
			System.out.println(e);
		}

		System.out.println("Combien de joueur vous voulez ajouter?");
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		//on crée une array liste pour pouvoir enregistrer les players informations.
		List<Player> players=new ArrayList<Player>();
		Scanner noms=new Scanner(System.in);
		String name;
		for(int i=0;i<a;i++){
			//on crée une boucle pour récuperer les noms des players sur le co,sole
			System.out.println("Donnez un nom à Player" + i);
			name=noms.nextLine();
			players.add(new Player(name));
		}
		Des d1=new DePiege();

		GamePlay g2=new GamePlay(players,3,d1);
		//g2.affiche_positions();
		//g2.change_Position(players.get(1));
		//g2.affiche_positions();
		//String mot=g2.get_random_word(v2);
		//System.out.println(mot);


	
	}
}