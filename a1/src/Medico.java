import java.util.Scanner;

public class Medico {
	private String nom, ap, espe;
	private int idM;
	Scanner lee = new Scanner(System.in);
	
	public Medico(){
		nom=ap=espe="";
		idM=0;
	}
	void leer() {
		System.out.println("INGRESAR nombre apellido especialidad y codigo MEDICO");
		nom=lee.next();
		ap=lee.next();
		espe=lee.next();
		idM=lee.nextInt();
	}
	void mostrar() {
		System.out.println(nom+" "+ap+" "+espe+" "+idM);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getAp() {
		return ap;
	}
	public void setAp(String ap) {
		this.ap = ap;
	}
	public String getEspe() {
		return espe;
	}
	public void setEspe(String espe) {
		this.espe = espe;
	}
	public int getIdM() {
		return idM;
	}
	public void setIdM(int idM) {
		this.idM = idM;
	}
	
	

}
