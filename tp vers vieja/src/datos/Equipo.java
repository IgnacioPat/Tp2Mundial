package datos;

public class Equipo{

	private int id;
	private String nombre;
	private int goles;
	private boolean calificado;
	private int posicion;
	private String grupo;
	private static int[] resXpartido =new int[8];
	
	
	public Equipo(int id, String nombre, int goles, boolean calificado, String grupo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.goles = 0;
		this.calificado = calificado;
		this.grupo = grupo;
		this.posicion=0;
	}


	public int getPosicion() {
		return posicion;
	}


	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}


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


	public int getGoles() {
		return goles;
	}


	public void setGoles(int goles) {
		this.goles = goles;
	}


	public boolean isCalificado() {
		return calificado;
	}


	public void setCalificado(boolean calificado) {
		this.calificado = calificado;
	}


	public String getGrupo() {
		return grupo;
	}


	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}


	public static int[] getResXpartido() {
		return resXpartido;
	}


	public static void setResXpartido(int[] resXpartido) {
		Equipo.resXpartido = resXpartido;
	}


	@Override
	public String toString() {
		return "Id: " + id + ", nombre: " + nombre + ", goles totales del equipo en la fase actual: " + goles + /*", calificado=" + calificado
				+ */", grupo `" + grupo + "´";
	}
	
	public String toString2(){
		return "Id: " + id + ", nombre: " + nombre +", grupo `" + grupo + "´";
	}


}
