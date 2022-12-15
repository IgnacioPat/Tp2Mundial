package datos;

import javax.swing.JOptionPane;

public class Encargado{

	private int id;
	private String nombre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Encargado(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Ahora "+ nombre + " es el encargado y su id es : "+ id ;
	}
	
	public static void Login(Encargado pepito,int seguro,int defaul) {

		
		defaul= JOptionPane.showConfirmDialog(null, "¿Quiere ingresar rápido? (sin ingresar su usuario y id)\n","", JOptionPane.YES_NO_OPTION);
		if (defaul==0) {
			pepito.setNombre("Kakaroto");
			pepito.setId(8000);
		}else {
			do {	
			pepito.setNombre(JOptionPane.showInputDialog("Escriba el nombre /o apellido del encargado"));
			pepito.setId(Integer.parseInt(JOptionPane.showInputDialog("Escriba el dni del encargado")));
			seguro=JOptionPane.showConfirmDialog(null, "¿Quiere reingresar los datos? \nSi continua no va a poder cambiar los datos","¿Se equivoco al colocar los datos?", JOptionPane.YES_NO_OPTION);
		} while (seguro==0);
		}
		JOptionPane.showMessageDialog(null, pepito);
			System.out.println(pepito);	
			System.out.println();
			
	}

	public int cargarGol() {
		 int gol=(int) (Math.random()*20);
			return gol;
		}
	
	public int golesDespGrupo() {
		int gol=(int) (Math.random()*9+1);
		return gol;
	}
}
