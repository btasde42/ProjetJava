import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.util.ArrayList;

public class Main{
	public static void main(String[] args){
		try{
			EspaceVectorielle v1=new EspaceVectorielle("w2v_final3.csv");

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
		for(int i=0;i<players.size();i++){
			players.get(i).printPlayerDetails();
		}
		players.get(0).move();
		players.get(0).printPlayerDetails();


	}
}