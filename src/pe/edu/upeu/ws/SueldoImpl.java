package pe.edu.upeu.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "pe.edu.upeu.ws.SueldoDao")
public class SueldoImpl implements SueldoDao {
	@Override
	public int calcularSueldo(int horas, int cuota) {
		// TODO Auto-generated method stub
		int sueldo=0, extra;
		if (horas<=40) {
			sueldo=horas*cuota;
		} else {
			extra=horas-40;
			sueldo=cuota*40+extra*(3*cuota)/2;
		}
		return sueldo;
	}

}
