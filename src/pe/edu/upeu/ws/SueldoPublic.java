package pe.edu.upeu.ws;

import javax.xml.ws.Endpoint;

public class SueldoPublic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:2123/soap/sueldo", new SueldoImpl());
		System.out.print("Funcionando ... :)");
	}
	

}
