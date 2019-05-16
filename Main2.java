public class Main2 {

	public static void main(String[] args) {
		//initialise un plateau
		Plateau p=new Plateau();
		p.affiche();//affiche ce plateau
		System.out.println(p.size());//affiche la taille de ce plateau
		
		//preciser les 3 differents types de cases, et ses phrases
		Case c1=new Case("");
		System.out.println(c1.afficheSignal());
		Case c2=new Case("relancer le de!");
		System.out.println(c2.afficheSignal());
		Case c3=new Case("reculer 3 cases");
		System.out.println(c3.afficheSignal());

	}
}