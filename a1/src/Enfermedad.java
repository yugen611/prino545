
import java.util.Scanner;

public class Enfermedad {
	private String nom,trata;
	private int nroM;
	Scanner lee = new Scanner(System.in);
	Enfermedad(){
		nom=trata="";
		nroM=0;
	}
	void leer(){
		System.out.println("INGRESAR nombre, tratamiento y nroMedico 	ENFERMEDAD ");
		nom=lee.next();
		trata=lee.next();
		nroM=lee.nextInt();
	}
	void mostrar() {
		System.out.println(nom+" "+trata+" "+nroM 	);
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTrata() {
		return trata;
	}
	public void setTrata(String trata) {
		this.trata = trata;
	}
	public int getNroM() {
		return nroM;
	}
	public void setNroM(int nroM) {
		this.nroM = nroM;
	}
	
}
