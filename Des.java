
/**
Une interface pour implementer roll method aux dés
**/
import java.util.Random;
public class Des{

	protected int first_face;
	protected int last_face;

	public Des(int first,int last){
		this.first_face=first;
		this.last_face=last;
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
	public int jetteDes(){
		Random des=new Random();
		int valeur=des.nextInt((last_face-first_face)+1)+first_face;
		return valeur;
	}
}