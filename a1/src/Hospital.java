import java.util.Scanner;

public class Hospital {

	private String nom, ubi;
	private int nroM,nroP;
	private Medico m[]=new Medico[10];
	private Paciente p[]=new Paciente[50];
	Scanner lee = new Scanner(System.in);
	Hospital() {
		nom=ubi="";
		nroP=nroM=0;
	}
	void leer() {
		System.out.println("INGRESAR nombre, ubicacion HOSPITAL, nroMedicos, nroPacientes ");
		nom=lee.next();
		ubi=lee.next();
		nroM=lee.nextInt();
		nroP=lee.nextInt();
		for(int i=0;i<nroM;i++)
			{	m[i]=new Medico();
				m[i].leer();
			}
		for(int j=0;j<nroP;j++)
			{	p[j]=new Paciente();
				p[j].leer();
			}
	}
	void mostrar() {
		System.out.println("nombre y ubicacion");
		System.out.println(nom+" "+ubi);
		System.out.println("Lista de Medicos");
		for(int i=0;i<nroM;i++)
			m[i].mostrar();
		System.out.println("Lista de Pacientes");
		for(int j=0;j<nroP;j++) 
			p[j].mostrar();
			
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getUbi() {
		return ubi;
	}

	public void setUbi(String ubi) {
		this.ubi = ubi;
	}

	public Medico[] getM() {
		return m;
	}

	public void setM(Medico[] m) {
		this.m = m;
	}
	public int getNroM() {
		return nroM;
	}
	public void setNroM(int nroM) {
		this.nroM = nroM;
	}
	public int getNroP() {
		return nroP;
	}
	public void setNroP(int nroP) {
		this.nroP = nroP;
	}
	public Paciente[] getP() {
		return p;
	}
	public void setP(Paciente[] p) {
		this.p = p;
	}
	
	

}
