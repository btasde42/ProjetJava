/**
Une classe de dés qui crées des dés normales. Les variables des faces peuvent etre modifié avec
les setters.
**/
import java.util.Random;

public class DeNormale implements Des{

	//le premier et le dernier face des dés.
	private int first_face;
	private int last_face;

	public DeNormale(){
		first_face=1;
		last_face=6;
	}

	//accesseurs

	public int get_first_face(){
		return this.first_face;
	}

	public int get_last_face(){
		return this.last_face;
	}

	//setters
	public void set_firs_face(int i){
		first_face=i;
	}

	public void set_last_face(int i){
		last_face=i;
	}

	@Override
	public int jetteDes(){
		Random des=new Random();
		int valeur=des.nextInt((last_face-first_face)+1)+first_face;

		return valeur;
	}

}