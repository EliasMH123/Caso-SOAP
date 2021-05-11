package pe.edu.upeu.ws;

import java.util.Scanner;

public class ClienteService {

	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		// TODO Auto-generated method stub
		SueldoImplService sueldo = new SueldoImplService();
		SueldoDao cliente = sueldo.getSueldoImplPort();
		System.out.println("Ingrese horas de trabajo");
		int horas=t.nextInt();
		System.out.println("Ingrese cuota normal");
		int cuota=t.nextInt();
		t.close();
		System.out.println(cliente.calcularSueldo(horas, cuota));
		
	}

}
