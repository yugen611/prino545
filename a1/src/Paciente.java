
import java.util.Scanner;

public class Paciente {
	private String nom,ap;
	private int idP,nroE;
	private Enfermedad e[]=new Enfermedad[5];
	Scanner lee = new Scanner(System.in);
	Paciente() {
		nom=ap="";
		idP=nroE=0;
	}
	void leer() {
		System.out.println("INGRESAR nombre apellido idPaciente y nroEnfer");
		nom=lee.next();
		ap=lee.next();
		idP=lee.nextInt();	
		nroE=lee.nextInt();
		for(int i=0;i<nroE;i++) {
			e[i]=new Enfermedad();
			e[i].leer();
		}
	}
	void mostrar(){
		
		System.out.println(nom+" "+ap+" "+idP+" "+nroE);
		System.out.println("LISTA de ENFERMEDAD del : "+ nom+" "+ap);
		for(int i=0;i<nroE;i++)
			e[i].mostrar();
	}
	
	boolean existeEnf(String q) {
		int nroE=this.getNroE();
		Enfermedad e[]=this.getE();
		for(int i=0;i<nroE;i++) {
			if(e[i].equals(q))
				return true;
		}
		return false;
			
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
	public int getIdP() {
		return idP;
	}
	public void setIdP(int idP) {
		this.idP = idP;
	}
	public int getNroE() {
		return nroE;
	}
	public void setNroE(int nroE) {
		this.nroE = nroE;
	}
	public Enfermedad[] getE() {
		return e;
	}
	public void setE(Enfermedad[] e) {
		this.e = e;
	}
	
	
}
