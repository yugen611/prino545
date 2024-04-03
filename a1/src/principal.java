//import java.util.Scanner;

public class principal {
	public static void main(String[] args) {
		
		Hospital h = new Hospital();
		h.leer();
		h.mostrar();
		System.out.println("Mostrar la Especialidad");
		MostrarEspecialidad("gastro"  ,h);
		/*	System.out.println("Pacientes con Tos");
			pacienteTos(h , "Tos"); */
		
	}

	public static void pacienteTos(Hospital h, String q) {
		//Scanner teclado = new Scanner(System.in);
		System.out.println();
		//String N = teclado.next();
		
	}

	public static void MostrarEspecialidad(String q, Hospital h) {
		Medico m[]=h.getM();
		for(int i = 0; i < h.getNroM(); i++) {
			if(m[i].getEspe().equals(q)) {
				m[i].mostrar();
			}
		}
	}
}
