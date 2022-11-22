package datos;

import javax.swing.JOptionPane;

public class Encargado{

	private int id;
	private String nombre;
	private boolean ingreso;

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

	public boolean isIngreso() {
		return ingreso;
	}

	public void setIngreso(boolean ingreso) {
		this.ingreso = ingreso;
	}

	@Override
	public String toString() {
		return "Ahora "+ nombre + " es el encargado y su id es : "+ id ;
	}
	
	public static void Login(Encargado pepito,int seguro) {

		do {
			pepito.setNombre(JOptionPane.showInputDialog("Escriba el nombre /o apellido del encargado"));
			pepito.setId(Integer.parseInt(JOptionPane.showInputDialog("Escriba el dni del encargado")));
						seguro=JOptionPane.showConfirmDialog(null, "¿Quiere reingresar los datos? \nSi continua no va a poder cambiar los datos","¿Se equivoco al colocar los datos?", JOptionPane.YES_NO_OPTION);
		} while (seguro==0);
			System.out.println(pepito);	
			System.out.println();
			
	}
	/*
	public void VerPartido(int duracion,int gol1,int gol2,int penales) {
		penales =(int) (Math.random()*2);
		duracion=(int) (Math.random()*10);
		gol1=(int) (Math.random()*5);
		gol2=(int) (Math.random()*5);
		JOptionPane.showMessageDialog(null, "La duracion extra del partido fue de : "+ duracion + "\n Los goles del equipo 1 fueron "+gol1+"\n Los goles del equipo 2 fueron "+gol2);
		if (gol1>gol2) {
			JOptionPane.showMessageDialog(null,"Gano el equipo 1");
		}else if (gol2>gol1) {
			JOptionPane.showMessageDialog(null,"Gano el equipo 2");
		}else if(gol1==gol2 && penales == 0) {
			JOptionPane.showMessageDialog(null,"Empate, penales");
			JOptionPane.showMessageDialog(null,"Gano el equipo 1");
		}else {
			JOptionPane.showMessageDialog(null,"Empate, penales");
			JOptionPane.showMessageDialog(null,"Gano el equipo 2");	
		}
	}
	*/
	public int cargarGol() {
		 int gol=(int) (Math.random()*21);
			return gol;
		}
	
	public int golesDespGrupo() {
		int gol=(int) (Math.random()*9+1);
		return gol;
	}
}
