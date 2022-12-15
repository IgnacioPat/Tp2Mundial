package datos;

import javax.swing.JOptionPane;

public class Partido{

	private int duracion;
	private int gol1;
	private int gol2;
	private Equipo equipoo1;
	private Equipo equipoo2;
	private int id;
	private static int autoi=1;
	
	
	public int getDuracion() {
		duracion=(int) (Math.random()*10);
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}


	public int getGol1() {
		return gol1;
	}


	public void setGol1(int gol1) {
		this.gol1 = gol1;
	}


	public int getGol2() {
		return gol2;
	}


	public void setGol2(int gol2) {
		this.gol2 = gol2;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public Equipo getEquipoo1() {
		return equipoo1;
	}


	public void setEquipoo1(Equipo equipoo1) {
		this.equipoo1 = equipoo1;
	}


	public Equipo getEquipoo2() {
		return equipoo2;
	}


	public void setEquipoo2(Equipo equipoo2) {
		this.equipoo2 = equipoo2;
	}

	public Partido(int duracion, int gol1, int gol2, Equipo equipoo1, Equipo equipoo2) {
		super();
		this.duracion = duracion;
		this.gol1 = gol1;
		this.gol2 = gol2;
		this.equipoo1 = equipoo1;
		this.equipoo2 = equipoo2;
		this.id = Partido.autoi;
		Partido.autoi++;
	}


	@Override
	public String toString() {
		return "Hubo un partido, su id es " + id + ", el equipo 1 hizo "+ gol1+" goles , el equipo 2 hizo "+gol2+" goles \n Datos equipo 1 : " + equipoo1
				+ "\n Datos equipo 2 : " + equipoo2+"\n";
	}

	
}
