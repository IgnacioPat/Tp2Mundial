package interfaz;

import java.util.*;
import javax.swing.*;
import datos.*;

public class Main {

	public static void main(String[] args) {

		menuPrincipal();

	}
	// principio funciones

	public static void menu() {
		JOptionPane.showMessageDialog(null, "Bienvenido al Mundial", "Hola", JOptionPane.DEFAULT_OPTION,
				new ImageIcon("src/img/holaa.jpg"));

		System.out.println("Nuevo mundial");

		Encargado pepito = new Encargado(0, null);

		LinkedList<Equipo> equiposCompletos = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposA = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposB = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposC = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposD = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposE = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposF = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposG = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposH = new LinkedList<Equipo>();
		// List aposta;

		Equipo equipo1 = new Equipo(1, "Qatar", 0, true, "A");
		Equipo equipo2 = new Equipo(2, "Ecuador", 0, true, "A");
		Equipo equipo3 = new Equipo(3, "Senegal", 0, true, "A");
		Equipo equipo4 = new Equipo(4, "Países Bajos", 0, true, "A");

		equiposCompletos.add(equipo1);
		equiposCompletos.add(equipo2);
		equiposCompletos.add(equipo3);
		equiposCompletos.add(equipo4);

		GruposA.add(equipo1);
		GruposA.add(equipo2);
		GruposA.add(equipo3);
		GruposA.add(equipo4);

		Equipo equipo5 = new Equipo(5, "Inglaterra", 0, true, "B");
		Equipo equipo6 = new Equipo(6, "Irán", 0, true, "B");
		Equipo equipo7 = new Equipo(7, "Usa", 0, true, "B");
		Equipo equipo8 = new Equipo(8, "Gales", 0, true, "B");

		equiposCompletos.add(equipo5);
		equiposCompletos.add(equipo6);
		equiposCompletos.add(equipo7);
		equiposCompletos.add(equipo8);

		GruposB.add(equipo5);
		GruposB.add(equipo6);
		GruposB.add(equipo7);
		GruposB.add(equipo8);

		Equipo equipo9 = new Equipo(9, "Argentina", 0, true, "C");
		Equipo equipo10 = new Equipo(10, "Arabia Saudí", 0, true, "C");
		Equipo equipo11 = new Equipo(11, "México", 0, true, "C");
		Equipo equipo12 = new Equipo(12, "Polonia", 0, true, "C");

		equiposCompletos.add(equipo9);
		equiposCompletos.add(equipo10);
		equiposCompletos.add(equipo11);
		equiposCompletos.add(equipo12);

		GruposC.add(equipo9);
		GruposC.add(equipo10);
		GruposC.add(equipo11);
		GruposC.add(equipo12);

		Equipo equipo13 = new Equipo(13, "Francia", 0, true, "D");
		Equipo equipo14 = new Equipo(14, "Australia", 0, true, "D");
		Equipo equipo15 = new Equipo(15, "Dinamarca", 0, true, "D");
		Equipo equipo16 = new Equipo(16, "Túnez", 0, true, "D");

		equiposCompletos.add(equipo13);
		equiposCompletos.add(equipo14);
		equiposCompletos.add(equipo15);
		equiposCompletos.add(equipo16);

		GruposD.add(equipo13);
		GruposD.add(equipo14);
		GruposD.add(equipo15);
		GruposD.add(equipo16);

		Equipo equipo17 = new Equipo(17, "España", 0, true, "E");
		Equipo equipo18 = new Equipo(18, "Costa Rica", 0, true, "E");
		Equipo equipo19 = new Equipo(19, "Alemania", 0, true, "E");
		Equipo equipo20 = new Equipo(20, "Japón", 0, true, "E");

		equiposCompletos.add(equipo17);
		equiposCompletos.add(equipo18);
		equiposCompletos.add(equipo19);
		equiposCompletos.add(equipo20);

		GruposE.add(equipo17);
		GruposE.add(equipo18);
		GruposE.add(equipo19);
		GruposE.add(equipo20);

		Equipo equipo21 = new Equipo(21, "Bélgica", 0, true, "F");
		Equipo equipo22 = new Equipo(22, "Canadá", 0, true, "F");
		Equipo equipo23 = new Equipo(23, "Marruecos", 0, true, "F");
		Equipo equipo24 = new Equipo(24, "Croacia", 0, true, "F");

		equiposCompletos.add(equipo21);
		equiposCompletos.add(equipo22);
		equiposCompletos.add(equipo23);
		equiposCompletos.add(equipo24);

		GruposF.add(equipo21);
		GruposF.add(equipo22);
		GruposF.add(equipo23);
		GruposF.add(equipo24);

		Equipo equipo25 = new Equipo(25, "Brasil", 0, true, "G");
		Equipo equipo26 = new Equipo(26, "Serbia", 0, true, "G");
		Equipo equipo27 = new Equipo(27, "Suiza", 0, true, "G");
		Equipo equipo28 = new Equipo(28, "Camerún", 0, true, "G");

		equiposCompletos.add(equipo25);
		equiposCompletos.add(equipo26);
		equiposCompletos.add(equipo27);
		equiposCompletos.add(equipo28);

		GruposG.add(equipo25);
		GruposG.add(equipo26);
		GruposG.add(equipo27);
		GruposG.add(equipo28);

		Equipo equipo29 = new Equipo(29, "Portugal", 0, true, "H");
		Equipo equipo30 = new Equipo(30, "Ghana", 0, true, "H");
		Equipo equipo31 = new Equipo(31, "Uruguay", 0, true, "H");
		Equipo equipo32 = new Equipo(32, "Corea del Sur", 0, true, "H");

		equiposCompletos.add(equipo29);
		equiposCompletos.add(equipo30);
		equiposCompletos.add(equipo31);
		equiposCompletos.add(equipo32);

		GruposH.add(equipo29);
		GruposH.add(equipo30);
		GruposH.add(equipo31);
		GruposH.add(equipo32);

		LinkedList<Partido> HacerPartidos = new LinkedList<Partido>();

		LinkedList<Partido> HacerPartidosA = new LinkedList<Partido>();

		Partido partido1 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo1, equipo2);
		Partido partido2 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo3, equipo4);
		Partido partido3 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo1, equipo3);
		Partido partido4 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo4, equipo2);
		Partido partido5 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo4, equipo1);
		Partido partido6 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo2, equipo3);

		HacerPartidosA.add(partido1);
		HacerPartidosA.add(partido2);
		HacerPartidosA.add(partido3);
		HacerPartidosA.add(partido4);
		HacerPartidosA.add(partido5);
		HacerPartidosA.add(partido6);

		HacerPartidos.add(partido1);
		HacerPartidos.add(partido2);
		HacerPartidos.add(partido3);
		HacerPartidos.add(partido4);
		HacerPartidos.add(partido5);
		HacerPartidos.add(partido6);

		LinkedList<Partido> HacerPartidosB = new LinkedList<Partido>();

		Partido partido7 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo5, equipo6);
		Partido partido8 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo7, equipo8);
		Partido partido9 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo5, equipo7);
		Partido partido10 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo8, equipo6);
		Partido partido11 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo8, equipo5);
		Partido partido12 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo6, equipo7);

		HacerPartidosB.add(partido7);
		HacerPartidosB.add(partido8);
		HacerPartidosB.add(partido9);
		HacerPartidosB.add(partido10);
		HacerPartidosB.add(partido11);
		HacerPartidosB.add(partido12);

		HacerPartidos.add(partido7);
		HacerPartidos.add(partido8);
		HacerPartidos.add(partido9);
		HacerPartidos.add(partido10);
		HacerPartidos.add(partido11);
		HacerPartidos.add(partido12);

		LinkedList<Partido> HacerPartidosC = new LinkedList<Partido>();

		Partido partido13 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo9, equipo10);
		Partido partido14 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo11, equipo12);
		Partido partido15 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo9, equipo11);
		Partido partido16 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo12, equipo10);
		Partido partido17 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo12, equipo9);
		Partido partido18 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo10, equipo11);

		HacerPartidosC.add(partido13);
		HacerPartidosC.add(partido14);
		HacerPartidosC.add(partido15);
		HacerPartidosC.add(partido16);
		HacerPartidosC.add(partido17);
		HacerPartidosC.add(partido18);

		HacerPartidos.add(partido13);
		HacerPartidos.add(partido14);
		HacerPartidos.add(partido15);
		HacerPartidos.add(partido16);
		HacerPartidos.add(partido17);
		HacerPartidos.add(partido18);

		LinkedList<Partido> HacerPartidosD = new LinkedList<Partido>();

		Partido partido19 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo13, equipo14);
		Partido partido20 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo15, equipo16);
		Partido partido21 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo13, equipo15);
		Partido partido22 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo16, equipo14);
		Partido partido23 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo16, equipo13);
		Partido partido24 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo14, equipo15);

		HacerPartidosD.add(partido19);
		HacerPartidosD.add(partido20);
		HacerPartidosD.add(partido21);
		HacerPartidosD.add(partido22);
		HacerPartidosD.add(partido23);
		HacerPartidosD.add(partido24);

		HacerPartidos.add(partido19);
		HacerPartidos.add(partido20);
		HacerPartidos.add(partido21);
		HacerPartidos.add(partido22);
		HacerPartidos.add(partido23);
		HacerPartidos.add(partido24);

		LinkedList<Partido> HacerPartidosE = new LinkedList<Partido>();

		Partido partido25 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo17, equipo18);
		Partido partido26 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo19, equipo20);
		Partido partido27 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo17, equipo19);
		Partido partido28 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo20, equipo18);
		Partido partido29 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo20, equipo17);
		Partido partido30 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo18, equipo19);

		HacerPartidosE.add(partido25);
		HacerPartidosE.add(partido26);
		HacerPartidosE.add(partido27);
		HacerPartidosE.add(partido28);
		HacerPartidosE.add(partido29);
		HacerPartidosE.add(partido30);

		HacerPartidos.add(partido25);
		HacerPartidos.add(partido26);
		HacerPartidos.add(partido27);
		HacerPartidos.add(partido28);
		HacerPartidos.add(partido29);
		HacerPartidos.add(partido30);

		LinkedList<Partido> HacerPartidosF = new LinkedList<Partido>();

		Partido partido31 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo21, equipo22);
		Partido partido32 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo23, equipo24);
		Partido partido33 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo21, equipo23);
		Partido partido34 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo24, equipo22);
		Partido partido35 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo24, equipo21);
		Partido partido36 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo22, equipo23);

		HacerPartidosF.add(partido31);
		HacerPartidosF.add(partido32);
		HacerPartidosF.add(partido33);
		HacerPartidosF.add(partido34);
		HacerPartidosF.add(partido35);
		HacerPartidosF.add(partido36);

		HacerPartidos.add(partido31);
		HacerPartidos.add(partido32);
		HacerPartidos.add(partido33);
		HacerPartidos.add(partido34);
		HacerPartidos.add(partido35);
		HacerPartidos.add(partido36);

		LinkedList<Partido> HacerPartidosG = new LinkedList<Partido>();

		Partido partido37 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo25, equipo26);
		Partido partido38 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo27, equipo28);
		Partido partido39 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo25, equipo27);
		Partido partido40 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo28, equipo26);
		Partido partido41 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo28, equipo25);
		Partido partido42 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo26, equipo27);

		HacerPartidosG.add(partido37);
		HacerPartidosG.add(partido38);
		HacerPartidosG.add(partido39);
		HacerPartidosG.add(partido40);
		HacerPartidosG.add(partido41);
		HacerPartidosG.add(partido42);

		HacerPartidos.add(partido37);
		HacerPartidos.add(partido38);
		HacerPartidos.add(partido39);
		HacerPartidos.add(partido40);
		HacerPartidos.add(partido41);
		HacerPartidos.add(partido42);

		LinkedList<Partido> HacerPartidosH = new LinkedList<Partido>();

		Partido partido43 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo29, equipo30);
		Partido partido44 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo31, equipo32);
		Partido partido45 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo29, equipo31);
		Partido partido46 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo32, equipo30);
		Partido partido47 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo32, equipo29);
		Partido partido48 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equipo30, equipo31);

		HacerPartidosH.add(partido43);
		HacerPartidosH.add(partido44);
		HacerPartidosH.add(partido45);
		HacerPartidosH.add(partido46);
		HacerPartidosH.add(partido47);
		HacerPartidosH.add(partido48);

		HacerPartidos.add(partido43);
		HacerPartidos.add(partido44);
		HacerPartidos.add(partido45);
		HacerPartidos.add(partido46);
		HacerPartidos.add(partido47);
		HacerPartidos.add(partido48);

		for (Partido partido : HacerPartidos) {
			for (Equipo equipo : equiposCompletos) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		int apuesta = 0;
		int apostado = 0;
		int defaul;

		int aux;

		String[] aux2 = { "Ver equipos", "Ver resultados de partidos", "Apostar", "Iniciar sesión ",
				"Volver al menú principal" };

		do {
			aux = JOptionPane.showOptionDialog(null,
					"Elija alguna de las siguientes opciones \nEs obligatorio iniciar sesion para poder continuar a los octavos",
					"Estamos en fase de grupos", 0, 0, null, aux2, aux2);
			switch (aux) {
			case 0:
				String[] opciones = { "Buscar por grupo", "Buscar por nombre", "Mensaje en ventana", "Ver lista" };
				int masopciones = JOptionPane.showOptionDialog(null,
						"Elija una de las siguientes opciones para ver los equipos", null, 0, 0, null, opciones,
						opciones);
				switch (masopciones) {
				case 0:
					String aux6 = JOptionPane.showInputDialog(null,
							"Ingresar la letra del grupo a ver \nGrupo A , B , C , D , E , F , G , H");
					switch (aux6) {
					case "a":
						imprimirEquipos(GruposA);
						break;
					case "b":
						imprimirEquipos(GruposB);
						break;
					case "c":
						imprimirEquipos(GruposC);
						break;
					case "d":
						imprimirEquipos(GruposD);
						break;
					case "e":
						imprimirEquipos(GruposE);
						break;
					case "f":
						imprimirEquipos(GruposF);
						break;
					case "g":
						imprimirEquipos(GruposG);
						break;
					case "h":
						imprimirEquipos(GruposH);
						break;
					case "A":
						imprimirEquipos(GruposA);
						break;
					case "B":
						imprimirEquipos(GruposB);
						break;
					case "C":
						imprimirEquipos(GruposC);
						break;
					case "D":
						imprimirEquipos(GruposD);
						break;
					case "E":
						imprimirEquipos(GruposE);
						break;
					case "F":
						imprimirEquipos(GruposF);
						break;
					case "G":
						imprimirEquipos(GruposG);
						break;
					case "H":
						imprimirEquipos(GruposH);
					}
					break;

				//
				case 1:
					String nombreEquipo = (String) JOptionPane.showInputDialog(null,
							"Ingrese nombre de equipo a buscar \nRecuerde que comienzan con mayúscula y que pueden llevar tilde");
					BuscarNombre(equiposCompletos, nombreEquipo);
					break;
				case 2:
					String[] aux4 = new String[equiposCompletos.size()];

					for (Equipo grup : equiposCompletos) {
						aux4[equiposCompletos.indexOf(grup)] = grup.toString();
					}
					JOptionPane.showMessageDialog(null, aux4, "\n", 0);
					break;
				case 3:
					String[] aux3 = new String[equiposCompletos.size()];

					for (Equipo grup : equiposCompletos) {

						aux3[equiposCompletos.indexOf(grup)] = grup.getNombre() + ", Grupo : '" + grup.getGrupo()
								+ "', Id : " + grup.getId();
					}

					String mira = (String) JOptionPane.showInputDialog(null // para que se muestre centrado
							, "Equipos participantes" // Mensaje de la ventana
							, "Lista de Equipos" // Titulo de la ventana
							, JOptionPane.QUESTION_MESSAGE // Icono
							, null // null para icono defecto de la ventana
							, aux3 // el objeto
							, aux3[0] // posicion del que va aparecer seleccionado
					);

					JOptionPane.showMessageDialog(null, "Equipo visto : \n" + mira);
					break;
				default:
					JOptionPane.showMessageDialog(null, "No existe esa opcion");
					break;
				}
				break;
			case 1:
				String aux5 = JOptionPane.showInputDialog(null,
						"Ingresar la letra del grupo a ver \nGrupo A , B , C , D , E , F , G , H");
				switch (aux5) {
				case "a":
					JOptionPane.showMessageDialog(null, HacerPartidosA);
					break;
				case "b":
					JOptionPane.showMessageDialog(null, HacerPartidosB);
					break;
				case "c":
					JOptionPane.showMessageDialog(null, HacerPartidosC);
					break;
				case "d":
					JOptionPane.showMessageDialog(null, HacerPartidosD);
					break;
				case "e":
					JOptionPane.showMessageDialog(null, HacerPartidosE);
					break;
				case "f":
					JOptionPane.showMessageDialog(null, HacerPartidosF);
					break;
				case "g":
					JOptionPane.showMessageDialog(null, HacerPartidosG);
					break;
				case "h":
					JOptionPane.showMessageDialog(null, HacerPartidosH);
					break;
				case "A":
					JOptionPane.showMessageDialog(null, HacerPartidosA);
					break;
				case "B":
					JOptionPane.showMessageDialog(null, HacerPartidosB);
					break;
				case "C":
					JOptionPane.showMessageDialog(null, HacerPartidosC);
					break;
				case "D":
					JOptionPane.showMessageDialog(null, HacerPartidosD);
					break;
				case "E":
					JOptionPane.showMessageDialog(null, HacerPartidosE);
					break;
				case "F":
					JOptionPane.showMessageDialog(null, HacerPartidosF);
					break;
				case "G":
					JOptionPane.showMessageDialog(null, HacerPartidosG);
					break;
				case "H":
					JOptionPane.showMessageDialog(null, HacerPartidosH);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Solo hay 8 equipos");
					break;
				}
				break;
			case 2:
				defaul = JOptionPane.showConfirmDialog(null, "¿Quiere apostar? \n", "", JOptionPane.YES_NO_OPTION);
				if (defaul == 1) {
					apostado = 0;
				} else {
					int loApostado;
					do {
						String[] opcionesApuesta = { "Ingresar monto", "Ver equipos",
								"Ingresar id del equipo que cree que ganará", "Volver al menú anterior" };
						loApostado = JOptionPane.showOptionDialog(null, "Menú de apuestas", null, 0, 0, null,
								opcionesApuesta, opcionesApuesta);
						switch (loApostado) {
						case 0:
							apostado = Integer
									.parseInt(JOptionPane.showInputDialog(null, "Ingresar el monto a apostar"));
							break;
						case 1:
							String[] aux4 = new String[equiposCompletos.size()];

							for (Equipo grup : equiposCompletos) {
								aux4[equiposCompletos.indexOf(grup)] = grup.getId() + " " + grup.getNombre();
							}
							JOptionPane.showMessageDialog(null, aux4, "\n", 0);
							break;
						case 2:
							apuesta = Integer.parseInt(
									JOptionPane.showInputDialog(null, "Ingresar id de equipo que cree que ganará \n"));
							break;
						case 3:

							break;
						default:
							break;
						}
					} while (loApostado != 3);
				}
				break;
			case 3:
				Encargado.Login(pepito, pepito.getId(), 0);
				break;
			case 4:
				menuPrincipal();
				break;
			default:
				menuPrincipal();
				break;
			}
		} while (aux != 3);

		// listas equipos y partidos
		LinkedList<Equipo> equiposFinalesA = new LinkedList<Equipo>();
		LinkedList<Equipo> equiposFinalesB = new LinkedList<Equipo>();
		LinkedList<Equipo> equiposFinalesC = new LinkedList<Equipo>();
		LinkedList<Equipo> equiposFinalesD = new LinkedList<Equipo>();
		LinkedList<Equipo> equiposFinalesE = new LinkedList<Equipo>();
		LinkedList<Equipo> equiposFinalesF = new LinkedList<Equipo>();
		LinkedList<Equipo> equiposFinalesG = new LinkedList<Equipo>();
		LinkedList<Equipo> equiposFinalesH = new LinkedList<Equipo>();
		LinkedList<Partido> Octavos = new LinkedList<Partido>();
		LinkedList<Equipo> CuartosEquipos1 = new LinkedList<Equipo>();
		LinkedList<Equipo> CuartosEquipos2 = new LinkedList<Equipo>();
		LinkedList<Equipo> CuartosEquipos3 = new LinkedList<Equipo>();
		LinkedList<Equipo> CuartosEquipos4 = new LinkedList<Equipo>();
		LinkedList<Partido> Cuartos = new LinkedList<Partido>();
		LinkedList<Equipo> SemifinalEquipos1 = new LinkedList<Equipo>();
		LinkedList<Equipo> SemifinalEquipos2 = new LinkedList<Equipo>();
		LinkedList<Partido> Semifinal = new LinkedList<Partido>();
		LinkedList<Equipo> TerceroyCuartoEquipos = new LinkedList<Equipo>();
		LinkedList<Partido> TerceroyCuarto = new LinkedList<Partido>();
		LinkedList<Equipo> Cuarto = new LinkedList<Equipo>();
		LinkedList<Equipo> Tercero = new LinkedList<Equipo>();
		LinkedList<Equipo> FinalEquipos = new LinkedList<Equipo>();
		LinkedList<Partido> Final = new LinkedList<Partido>();
		LinkedList<Equipo> Segundo = new LinkedList<Equipo>();
		LinkedList<Equipo> Ganador = new LinkedList<Equipo>();

		// Grupo a

		if (equipo1.getGoles() > equipo2.getGoles() && equipo1.getGoles() > equipo3.getGoles()
				&& equipo1.getGoles() > equipo4.getGoles()) {
			equipo1.setPosicion(1);
		} else if (equipo2.getGoles() > equipo3.getGoles() && equipo2.getGoles() > equipo4.getGoles()) {
			equipo2.setPosicion(1);
		} else if (equipo3.getGoles() > equipo4.getGoles()) {
			equipo3.setPosicion(1);
		} else {
			equipo4.setPosicion(1);
		}

		if (equipo1.getPosicion() == 1) {
			if (equipo2.getGoles() > equipo3.getGoles() && equipo2.getGoles() > equipo4.getGoles()) {
				equipo2.setPosicion(2);
			} else if (equipo3.getGoles() > equipo4.getGoles()) {
				equipo3.setPosicion(2);
			} else {
				equipo4.setPosicion(2);
			}
		} else if (equipo2.getPosicion() == 1) {
			if (equipo1.getGoles() > equipo3.getGoles() && equipo1.getGoles() > equipo4.getGoles()) {
				equipo1.setPosicion(2);
			} else if (equipo3.getGoles() > equipo4.getGoles()) {
				equipo3.setPosicion(2);
			} else {
				equipo4.setPosicion(2);
			}
		} else if (equipo3.getPosicion() == 1) {
			if (equipo2.getGoles() > equipo1.getGoles() && equipo2.getGoles() > equipo4.getGoles()) {
				equipo2.setPosicion(2);
			} else if (equipo1.getGoles() > equipo4.getGoles()) {
				equipo1.setPosicion(2);
			} else {
				equipo4.setPosicion(2);
			}
		} else if (equipo4.getPosicion() == 1) {
			if (equipo2.getGoles() > equipo3.getGoles() && equipo2.getGoles() > equipo1.getGoles()) {
				equipo2.setPosicion(2);
			} else if (equipo3.getGoles() > equipo1.getGoles()) {
				equipo3.setPosicion(2);
			} else {
				equipo1.setPosicion(2);
			}
		}

//		System.out.println(equipo1.getPosicion());
//		System.out.println(equipo2.getPosicion());
//		System.out.println(equipo3.getPosicion());
//		System.out.println(equipo4.getPosicion());

		for (Equipo equipo : GruposA) {
			if (equipo.getPosicion() == 1) {
				equiposFinalesA.addFirst(equipo);
			} else if (equipo.getPosicion() == 2) {
				equiposFinalesA.addLast(equipo);
			}
		}

		// Grupo b

		if (equipo5.getGoles() > equipo6.getGoles() && equipo5.getGoles() > equipo7.getGoles()
				&& equipo5.getGoles() > equipo8.getGoles()) {
			equipo5.setPosicion(1);
		} else if (equipo6.getGoles() > equipo7.getGoles() && equipo6.getGoles() > equipo8.getGoles()) {
			equipo6.setPosicion(1);
		} else if (equipo7.getGoles() > equipo8.getGoles()) {
			equipo7.setPosicion(1);
		} else {
			equipo8.setPosicion(1);
		}

		if (equipo5.getPosicion() == 1) {
			if (equipo6.getGoles() > equipo7.getGoles() && equipo6.getGoles() > equipo8.getGoles()) {
				equipo6.setPosicion(2);
			} else if (equipo7.getGoles() > equipo8.getGoles()) {
				equipo7.setPosicion(2);
			} else {
				equipo8.setPosicion(2);
			}
		} else if (equipo6.getPosicion() == 1) {
			if (equipo5.getGoles() > equipo7.getGoles() && equipo5.getGoles() > equipo8.getGoles()) {
				equipo5.setPosicion(2);
			} else if (equipo7.getGoles() > equipo8.getGoles()) {
				equipo7.setPosicion(2);
			} else {
				equipo8.setPosicion(2);
			}
		} else if (equipo7.getPosicion() == 1) {
			if (equipo6.getGoles() > equipo5.getGoles() && equipo6.getGoles() > equipo8.getGoles()) {
				equipo6.setPosicion(2);
			} else if (equipo5.getGoles() > equipo8.getGoles()) {
				equipo5.setPosicion(2);
			} else {
				equipo8.setPosicion(2);
			}
		} else if (equipo8.getPosicion() == 1) {
			if (equipo6.getGoles() > equipo7.getGoles() && equipo6.getGoles() > equipo5.getGoles()) {
				equipo6.setPosicion(2);
			} else if (equipo7.getGoles() > equipo5.getGoles()) {
				equipo7.setPosicion(2);
			} else {
				equipo5.setPosicion(2);
			}
		}

//		System.out.println(equipo5.getPosicion());
//		System.out.println(equipo6.getPosicion());
//		System.out.println(equipo7.getPosicion());
//		System.out.println(equipo8.getPosicion());

		for (Equipo equipo : GruposB) {
			if (equipo.getPosicion() == 1) {
				equiposFinalesB.addFirst(equipo);
			} else if (equipo.getPosicion() == 2) {
				equiposFinalesB.addLast(equipo);
			}
		}

		// Grupo c

		if (equipo9.getGoles() > equipo10.getGoles() && equipo9.getGoles() > equipo11.getGoles()
				&& equipo9.getGoles() > equipo12.getGoles()) {
			equipo9.setPosicion(1);
		} else if (equipo10.getGoles() > equipo11.getGoles() && equipo10.getGoles() > equipo12.getGoles()) {
			equipo10.setPosicion(1);
		} else if (equipo11.getGoles() > equipo12.getGoles()) {
			equipo11.setPosicion(1);
		} else {
			equipo12.setPosicion(1);
		}

		if (equipo9.getPosicion() == 1) {
			if (equipo10.getGoles() > equipo11.getGoles() && equipo10.getGoles() > equipo12.getGoles()) {
				equipo10.setPosicion(2);
			} else if (equipo11.getGoles() > equipo12.getGoles()) {
				equipo11.setPosicion(2);
			} else {
				equipo12.setPosicion(2);
			}
		} else if (equipo10.getPosicion() == 1) {
			if (equipo9.getGoles() > equipo11.getGoles() && equipo9.getGoles() > equipo12.getGoles()) {
				equipo9.setPosicion(2);
			} else if (equipo11.getGoles() > equipo12.getGoles()) {
				equipo11.setPosicion(2);
			} else {
				equipo12.setPosicion(2);
			}
		} else if (equipo11.getPosicion() == 1) {
			if (equipo10.getGoles() > equipo9.getGoles() && equipo10.getGoles() > equipo12.getGoles()) {
				equipo10.setPosicion(2);
			} else if (equipo9.getGoles() > equipo12.getGoles()) {
				equipo9.setPosicion(2);
			} else {
				equipo12.setPosicion(2);
			}
		} else if (equipo12.getPosicion() == 1) {
			if (equipo10.getGoles() > equipo11.getGoles() && equipo10.getGoles() > equipo9.getGoles()) {
				equipo10.setPosicion(2);
			} else if (equipo11.getGoles() > equipo9.getGoles()) {
				equipo11.setPosicion(2);
			} else {
				equipo9.setPosicion(2);
			}
		}

//		System.out.println(equipo9.getPosicion());
//		System.out.println(equipo10.getPosicion());
//		System.out.println(equipo11.getPosicion());
//		System.out.println(equipo12.getPosicion());

		for (Equipo equipo : GruposC) {
			if (equipo.getPosicion() == 1) {
				equiposFinalesC.addFirst(equipo);
			} else if (equipo.getPosicion() == 2) {
				equiposFinalesC.addLast(equipo);
			}
		}

		// Grupo d

		if (equipo13.getGoles() > equipo14.getGoles() && equipo13.getGoles() > equipo15.getGoles()
				&& equipo13.getGoles() > equipo16.getGoles()) {
			equipo13.setPosicion(1);
		} else if (equipo14.getGoles() > equipo15.getGoles() && equipo14.getGoles() > equipo16.getGoles()) {
			equipo14.setPosicion(1);
		} else if (equipo15.getGoles() > equipo16.getGoles()) {
			equipo15.setPosicion(1);
		} else {
			equipo16.setPosicion(1);
		}

		if (equipo13.getPosicion() == 1) {
			if (equipo14.getGoles() > equipo15.getGoles() && equipo14.getGoles() > equipo16.getGoles()) {
				equipo14.setPosicion(2);
			} else if (equipo15.getGoles() > equipo16.getGoles()) {
				equipo15.setPosicion(2);
			} else {
				equipo16.setPosicion(2);
			}
		} else if (equipo14.getPosicion() == 1) {
			if (equipo13.getGoles() > equipo15.getGoles() && equipo13.getGoles() > equipo16.getGoles()) {
				equipo13.setPosicion(2);
			} else if (equipo15.getGoles() > equipo16.getGoles()) {
				equipo15.setPosicion(2);
			} else {
				equipo16.setPosicion(2);
			}
		} else if (equipo15.getPosicion() == 1) {
			if (equipo14.getGoles() > equipo13.getGoles() && equipo14.getGoles() > equipo16.getGoles()) {
				equipo14.setPosicion(2);
			} else if (equipo13.getGoles() > equipo16.getGoles()) {
				equipo13.setPosicion(2);
			} else {
				equipo16.setPosicion(2);
			}
		} else if (equipo16.getPosicion() == 1) {
			if (equipo14.getGoles() > equipo15.getGoles() && equipo14.getGoles() > equipo13.getGoles()) {
				equipo14.setPosicion(2);
			} else if (equipo15.getGoles() > equipo13.getGoles()) {
				equipo15.setPosicion(2);
			} else {
				equipo13.setPosicion(2);
			}
		}

//		System.out.println(equipo13.getPosicion());
//		System.out.println(equipo14.getPosicion());
//		System.out.println(equipo15.getPosicion());
//		System.out.println(equipo16.getPosicion());

		for (Equipo equipo : GruposD) {
			if (equipo.getPosicion() == 1) {
				equiposFinalesD.addFirst(equipo);
			} else if (equipo.getPosicion() == 2) {
				equiposFinalesD.addLast(equipo);
			}
		}

		// Grupo e

		if (equipo17.getGoles() > equipo18.getGoles() && equipo17.getGoles() > equipo19.getGoles()
				&& equipo17.getGoles() > equipo20.getGoles()) {
			equipo17.setPosicion(1);
		} else if (equipo18.getGoles() > equipo19.getGoles() && equipo18.getGoles() > equipo20.getGoles()) {
			equipo18.setPosicion(1);
		} else if (equipo19.getGoles() > equipo20.getGoles()) {
			equipo19.setPosicion(1);
		} else {
			equipo20.setPosicion(1);
		}

		if (equipo17.getPosicion() == 1) {
			if (equipo18.getGoles() > equipo19.getGoles() && equipo18.getGoles() > equipo20.getGoles()) {
				equipo18.setPosicion(2);
			} else if (equipo19.getGoles() > equipo20.getGoles()) {
				equipo19.setPosicion(2);
			} else {
				equipo20.setPosicion(2);
			}
		} else if (equipo18.getPosicion() == 1) {
			if (equipo17.getGoles() > equipo19.getGoles() && equipo17.getGoles() > equipo20.getGoles()) {
				equipo17.setPosicion(2);
			} else if (equipo19.getGoles() > equipo20.getGoles()) {
				equipo19.setPosicion(2);
			} else {
				equipo20.setPosicion(2);
			}
		} else if (equipo19.getPosicion() == 1) {
			if (equipo18.getGoles() > equipo17.getGoles() && equipo18.getGoles() > equipo20.getGoles()) {
				equipo18.setPosicion(2);
			} else if (equipo17.getGoles() > equipo20.getGoles()) {
				equipo17.setPosicion(2);
			} else {
				equipo20.setPosicion(2);
			}
		} else if (equipo20.getPosicion() == 1) {
			if (equipo18.getGoles() > equipo19.getGoles() && equipo18.getGoles() > equipo17.getGoles()) {
				equipo18.setPosicion(2);
			} else if (equipo19.getGoles() > equipo17.getGoles()) {
				equipo19.setPosicion(2);
			} else {
				equipo17.setPosicion(2);
			}
		}

//		System.out.println(equipo17.getPosicion());
//		System.out.println(equipo18.getPosicion());
//		System.out.println(equipo19.getPosicion());
//		System.out.println(equipo20.getPosicion());

		for (Equipo equipo : GruposE) {
			if (equipo.getPosicion() == 1) {
				equiposFinalesE.addFirst(equipo);
			} else if (equipo.getPosicion() == 2) {
				equiposFinalesE.addLast(equipo);
			}
		}

		// Grupo f

		if (equipo21.getGoles() > equipo22.getGoles() && equipo21.getGoles() > equipo23.getGoles()
				&& equipo21.getGoles() > equipo24.getGoles()) {
			equipo21.setPosicion(1);
		} else if (equipo22.getGoles() > equipo23.getGoles() && equipo22.getGoles() > equipo24.getGoles()) {
			equipo22.setPosicion(1);
		} else if (equipo23.getGoles() > equipo24.getGoles()) {
			equipo23.setPosicion(1);
		} else {
			equipo24.setPosicion(1);
		}

		if (equipo21.getPosicion() == 1) {
			if (equipo22.getGoles() > equipo23.getGoles() && equipo22.getGoles() > equipo24.getGoles()) {
				equipo22.setPosicion(2);
			} else if (equipo23.getGoles() > equipo24.getGoles()) {
				equipo23.setPosicion(2);
			} else {
				equipo24.setPosicion(2);
			}
		} else if (equipo22.getPosicion() == 1) {
			if (equipo21.getGoles() > equipo23.getGoles() && equipo21.getGoles() > equipo24.getGoles()) {
				equipo21.setPosicion(2);
			} else if (equipo23.getGoles() > equipo24.getGoles()) {
				equipo23.setPosicion(2);
			} else {
				equipo24.setPosicion(2);
			}
		} else if (equipo23.getPosicion() == 1) {
			if (equipo22.getGoles() > equipo21.getGoles() && equipo22.getGoles() > equipo24.getGoles()) {
				equipo22.setPosicion(2);
			} else if (equipo21.getGoles() > equipo24.getGoles()) {
				equipo21.setPosicion(2);
			} else {
				equipo24.setPosicion(2);
			}
		} else if (equipo24.getPosicion() == 1) {
			if (equipo22.getGoles() > equipo23.getGoles() && equipo22.getGoles() > equipo21.getGoles()) {
				equipo22.setPosicion(2);
			} else if (equipo23.getGoles() > equipo21.getGoles()) {
				equipo23.setPosicion(2);
			} else {
				equipo21.setPosicion(2);
			}
		}

//		System.out.println(equipo21.getPosicion());
//		System.out.println(equipo22.getPosicion());
//		System.out.println(equipo23.getPosicion());
//		System.out.println(equipo24.getPosicion());

		for (Equipo equipo : GruposF) {
			if (equipo.getPosicion() == 1) {
				equiposFinalesF.addFirst(equipo);
			} else if (equipo.getPosicion() == 2) {
				equiposFinalesF.addLast(equipo);
			}
		}

		// Grupo g

		if (equipo25.getGoles() > equipo26.getGoles() && equipo25.getGoles() > equipo27.getGoles()
				&& equipo25.getGoles() > equipo28.getGoles()) {
			equipo25.setPosicion(1);
		} else if (equipo26.getGoles() > equipo27.getGoles() && equipo26.getGoles() > equipo28.getGoles()) {
			equipo26.setPosicion(1);
		} else if (equipo27.getGoles() > equipo28.getGoles()) {
			equipo27.setPosicion(1);
		} else {
			equipo28.setPosicion(1);
		}

		if (equipo25.getPosicion() == 1) {
			if (equipo26.getGoles() > equipo27.getGoles() && equipo26.getGoles() > equipo28.getGoles()) {
				equipo26.setPosicion(2);
			} else if (equipo27.getGoles() > equipo28.getGoles()) {
				equipo27.setPosicion(2);
			} else {
				equipo28.setPosicion(2);
			}
		} else if (equipo26.getPosicion() == 1) {
			if (equipo25.getGoles() > equipo27.getGoles() && equipo25.getGoles() > equipo28.getGoles()) {
				equipo25.setPosicion(2);
			} else if (equipo27.getGoles() > equipo28.getGoles()) {
				equipo27.setPosicion(2);
			} else {
				equipo28.setPosicion(2);
			}
		} else if (equipo27.getPosicion() == 1) {
			if (equipo26.getGoles() > equipo25.getGoles() && equipo26.getGoles() > equipo28.getGoles()) {
				equipo26.setPosicion(2);
			} else if (equipo25.getGoles() > equipo28.getGoles()) {
				equipo25.setPosicion(2);
			} else {
				equipo28.setPosicion(2);
			}
		} else if (equipo28.getPosicion() == 1) {
			if (equipo26.getGoles() > equipo27.getGoles() && equipo26.getGoles() > equipo25.getGoles()) {
				equipo26.setPosicion(2);
			} else if (equipo27.getGoles() > equipo25.getGoles()) {
				equipo27.setPosicion(2);
			} else {
				equipo25.setPosicion(2);
			}
		}

//		System.out.println(equipo25.getPosicion());
//		System.out.println(equipo26.getPosicion());
//		System.out.println(equipo27.getPosicion());
//		System.out.println(equipo28.getPosicion());

		for (Equipo equipo : GruposG) {
			if (equipo.getPosicion() == 1) {
				equiposFinalesG.addFirst(equipo);
			} else if (equipo.getPosicion() == 2) {
				equiposFinalesG.addLast(equipo);
			}
		}

		// Grupo h

		if (equipo29.getGoles() > equipo30.getGoles() && equipo29.getGoles() > equipo31.getGoles()
				&& equipo29.getGoles() > equipo32.getGoles()) {
			equipo29.setPosicion(1);
		} else if (equipo30.getGoles() > equipo31.getGoles() && equipo30.getGoles() > equipo32.getGoles()) {
			equipo30.setPosicion(1);
		} else if (equipo31.getGoles() > equipo32.getGoles()) {
			equipo31.setPosicion(1);
		} else {
			equipo32.setPosicion(1);
		}

		if (equipo29.getPosicion() == 1) {
			if (equipo30.getGoles() > equipo31.getGoles() && equipo30.getGoles() > equipo32.getGoles()) {
				equipo30.setPosicion(2);
			} else if (equipo31.getGoles() > equipo32.getGoles()) {
				equipo31.setPosicion(2);
			} else {
				equipo32.setPosicion(2);
			}
		} else if (equipo30.getPosicion() == 1) {
			if (equipo29.getGoles() > equipo31.getGoles() && equipo29.getGoles() > equipo32.getGoles()) {
				equipo29.setPosicion(2);
			} else if (equipo31.getGoles() > equipo32.getGoles()) {
				equipo31.setPosicion(2);
			} else {
				equipo32.setPosicion(2);
			}
		} else if (equipo31.getPosicion() == 1) {
			if (equipo30.getGoles() > equipo29.getGoles() && equipo30.getGoles() > equipo32.getGoles()) {
				equipo30.setPosicion(2);
			} else if (equipo29.getGoles() > equipo32.getGoles()) {
				equipo29.setPosicion(2);
			} else {
				equipo32.setPosicion(2);
			}
		} else if (equipo32.getPosicion() == 1) {
			if (equipo30.getGoles() > equipo31.getGoles() && equipo30.getGoles() > equipo29.getGoles()) {
				equipo30.setPosicion(2);
			} else if (equipo31.getGoles() > equipo29.getGoles()) {
				equipo31.setPosicion(2);
			} else {
				equipo29.setPosicion(2);
			}
		}

//		System.out.println(equipo29.getPosicion());
//		System.out.println(equipo30.getPosicion());
//		System.out.println(equipo31.getPosicion());
//		System.out.println(equipo32.getPosicion());

		for (Equipo equipo : GruposH) {
			if (equipo.getPosicion() == 1) {
				equiposFinalesH.addFirst(equipo);
			} else if (equipo.getPosicion() == 2) {
				equiposFinalesH.addLast(equipo);
			}
		}

		// fijarse los goles
		// reiniciar goles para los demas partidos?
		for (Equipo poner0 : equiposCompletos) {
			poner0.setGoles(0);
		}

		Partido octavo1 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equiposFinalesA.getFirst(),
				equiposFinalesB.getLast());
		Partido octavo2 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equiposFinalesC.getFirst(),
				equiposFinalesD.getLast());
		Partido octavo3 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equiposFinalesB.getFirst(),
				equiposFinalesA.getLast());
		Partido octavo4 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equiposFinalesD.getFirst(),
				equiposFinalesC.getLast());
		Partido octavo5 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equiposFinalesE.getFirst(),
				equiposFinalesF.getLast());
		Partido octavo6 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equiposFinalesG.getFirst(),
				equiposFinalesH.getLast());
		Partido octavo7 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equiposFinalesF.getFirst(),
				equiposFinalesE.getLast());
		Partido octavo8 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), equiposFinalesH.getFirst(),
				equiposFinalesG.getLast());

		Octavos.add(octavo1);
		Octavos.add(octavo2);
		Octavos.add(octavo3);
		Octavos.add(octavo4);
		Octavos.add(octavo5);
		Octavos.add(octavo6);
		Octavos.add(octavo7);
		Octavos.add(octavo8);

		System.out.println();

		for (Partido partido : Octavos) {
			for (Equipo equipo : equiposFinalesA) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		for (Partido partido : Octavos) {
			for (Equipo equipo : equiposFinalesB) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		for (Partido partido : Octavos) {
			for (Equipo equipo : equiposFinalesC) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		for (Partido partido : Octavos) {
			for (Equipo equipo : equiposFinalesD) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		for (Partido partido : Octavos) {
			for (Equipo equipo : equiposFinalesE) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		for (Partido partido : Octavos) {
			for (Equipo equipo : equiposFinalesF) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		for (Partido partido : Octavos) {
			for (Equipo equipo : equiposFinalesG) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		for (Partido partido : Octavos) {
			for (Equipo equipo : equiposFinalesH) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		// viendo quien gano c/partido
		// a y b
		if (equiposFinalesA.getFirst().getGoles() > equiposFinalesB.getLast().getGoles()) {
			CuartosEquipos1.addFirst(equiposFinalesA.getFirst());
		} else if (equiposFinalesA.getFirst().getGoles() < equiposFinalesB.getLast().getGoles()) {
			CuartosEquipos1.addFirst(equiposFinalesB.getLast());
		} else {
			CuartosEquipos1.addFirst(equiposFinalesA.getFirst());
		}

		if (equiposFinalesB.getFirst().getGoles() > equiposFinalesA.getLast().getGoles()) {
			CuartosEquipos2.addFirst(equiposFinalesB.getFirst());
		} else if (equiposFinalesB.getFirst().getGoles() < equiposFinalesA.getLast().getGoles()) {
			CuartosEquipos2.addFirst(equiposFinalesA.getLast());
		} else {
			CuartosEquipos2.addFirst(equiposFinalesB.getFirst());
		}
		// c y d
		if (equiposFinalesC.getFirst().getGoles() > equiposFinalesD.getLast().getGoles()) {
			CuartosEquipos1.addLast(equiposFinalesC.getFirst());
		} else if (equiposFinalesC.getFirst().getGoles() < equiposFinalesD.getLast().getGoles()) {
			CuartosEquipos1.addLast(equiposFinalesD.getLast());
		} else {
			CuartosEquipos1.addLast(equiposFinalesC.getFirst());
		}

		if (equiposFinalesD.getFirst().getGoles() > equiposFinalesC.getLast().getGoles()) {
			CuartosEquipos2.addLast(equiposFinalesD.getFirst());
		} else if (equiposFinalesD.getFirst().getGoles() < equiposFinalesC.getLast().getGoles()) {
			CuartosEquipos2.addLast(equiposFinalesC.getLast());
		} else {
			CuartosEquipos2.addLast(equiposFinalesD.getFirst());
		}
		// e y f
		if (equiposFinalesE.getFirst().getGoles() > equiposFinalesF.getLast().getGoles()) {
			CuartosEquipos3.addFirst(equiposFinalesE.getFirst());
		} else if (equiposFinalesE.getFirst().getGoles() < equiposFinalesF.getLast().getGoles()) {
			CuartosEquipos3.addFirst(equiposFinalesF.getLast());
		} else {
			CuartosEquipos3.addFirst(equiposFinalesE.getFirst());
		}

		if (equiposFinalesF.getFirst().getGoles() > equiposFinalesE.getLast().getGoles()) {
			CuartosEquipos4.addFirst(equiposFinalesF.getFirst());
		} else if (equiposFinalesF.getFirst().getGoles() < equiposFinalesE.getLast().getGoles()) {
			CuartosEquipos4.addFirst(equiposFinalesE.getLast());
		} else {
			CuartosEquipos4.addFirst(equiposFinalesF.getFirst());
		}
		// g y h
		if (equiposFinalesG.getFirst().getGoles() > equiposFinalesH.getLast().getGoles()) {
			CuartosEquipos3.addLast(equiposFinalesG.getFirst());
		} else if (equiposFinalesG.getFirst().getGoles() < equiposFinalesH.getLast().getGoles()) {
			CuartosEquipos3.addLast(equiposFinalesH.getLast());
		} else {
			CuartosEquipos3.addLast(equiposFinalesG.getFirst());
		}

		if (equiposFinalesH.getFirst().getGoles() > equiposFinalesG.getLast().getGoles()) {
			CuartosEquipos4.addLast(equiposFinalesH.getFirst());
		} else if (equiposFinalesH.getFirst().getGoles() < equiposFinalesG.getLast().getGoles()) {
			CuartosEquipos4.addLast(equiposFinalesG.getLast());
		} else {
			CuartosEquipos4.addLast(equiposFinalesH.getFirst());
		}

		String[] despGrupos = { "Ver los equipos que llegaron a esta fase", "Ver los partidos de esta fase",
				"Ver los equipos que pasaron a la siguiente fase", "Continuar a la siguiente fase",
				"Volver al menú principal" };
		int preg1;
		JOptionPane.showMessageDialog(null, "Octavos");
		System.out.println("Octavos");
		do {
			preg1 = JOptionPane.showOptionDialog(null, "Elija las opciones que desee", "Fase actual: Octavos", 0, 0,
					null, despGrupos, despGrupos);
			switch (preg1) {
			case 0:
				System.out.println();
				System.out.println(equiposFinalesA);
				System.out.println(equiposFinalesB);
				System.out.println(equiposFinalesC);
				System.out.println(equiposFinalesD);
				System.out.println(equiposFinalesE);
				System.out.println(equiposFinalesF);
				System.out.println(equiposFinalesG);
				System.out.println(equiposFinalesH);
				System.out.println();
				JOptionPane.showMessageDialog(null,
						equiposFinalesA + "\n \n" + equiposFinalesB + "\n \n" + equiposFinalesC + "\n \n"
								+ equiposFinalesD + "\n \n" + equiposFinalesE + "\n \n" + equiposFinalesF + "\n \n"
								+ equiposFinalesG + "\n \n" + equiposFinalesH);
				break;
			case 1:
				imprimirPartidosDesp(Octavos);
				JOptionPane.showMessageDialog(null, "Todos los partidos de los octavos : \n" + Octavos);
				System.out.println();
				break;
			case 2:
				System.out.println(CuartosEquipos1);
				System.out.println(CuartosEquipos2);
				System.out.println(CuartosEquipos3);
				System.out.println(CuartosEquipos4);
				JOptionPane.showMessageDialog(null, CuartosEquipos1 + "\n \n" + CuartosEquipos2 + "\n \n"
						+ CuartosEquipos3 + "\n \n" + CuartosEquipos4);
				System.out.println();
				break;
			case 3:
				break;
			case 4:
				volverMenuP();
				break;
			default:
				volverMenuP();
				break;
			}
		} while (preg1 != 3);

		// fijarse los goles
		// reiniciar goles para los demas partidos?
		for (Equipo poner0 : equiposCompletos) {
			poner0.setGoles(0);
		}

		System.out.println();

		Partido cuarto1 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), CuartosEquipos1.getFirst(),
				CuartosEquipos1.getLast());

		Partido cuarto2 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), CuartosEquipos2.getFirst(),
				CuartosEquipos2.getLast());

		Partido cuarto3 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), CuartosEquipos3.getFirst(),
				CuartosEquipos3.getLast());

		Partido cuarto4 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), CuartosEquipos4.getFirst(),
				CuartosEquipos4.getLast());

		Cuartos.add(cuarto1);
		Cuartos.add(cuarto2);
		Cuartos.add(cuarto3);
		Cuartos.add(cuarto4);

		for (Partido partido : Cuartos) {
			for (Equipo equipo : CuartosEquipos1) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		for (Partido partido : Cuartos) {
			for (Equipo equipo : CuartosEquipos2) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		for (Partido partido : Cuartos) {
			for (Equipo equipo : CuartosEquipos3) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		for (Partido partido : Cuartos) {
			for (Equipo equipo : CuartosEquipos4) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		if (CuartosEquipos1.getFirst().getGoles() > CuartosEquipos1.getLast().getGoles()) {
			SemifinalEquipos1.addFirst(CuartosEquipos1.getFirst());
		} else if (CuartosEquipos1.getFirst().getGoles() < CuartosEquipos1.getLast().getGoles()) {
			SemifinalEquipos1.addFirst(CuartosEquipos1.getLast());
		} else {
			SemifinalEquipos1.addFirst(CuartosEquipos1.getFirst());
		}

		if (CuartosEquipos2.getFirst().getGoles() > CuartosEquipos2.getLast().getGoles()) {
			SemifinalEquipos1.addLast(CuartosEquipos2.getFirst());
		} else if (CuartosEquipos2.getFirst().getGoles() < CuartosEquipos2.getLast().getGoles()) {
			SemifinalEquipos1.addLast(CuartosEquipos2.getLast());
		} else {
			SemifinalEquipos1.addLast(CuartosEquipos2.getFirst());
		}

		if (CuartosEquipos3.getFirst().getGoles() > CuartosEquipos3.getLast().getGoles()) {
			SemifinalEquipos2.addFirst(CuartosEquipos3.getFirst());
		} else if (CuartosEquipos3.getFirst().getGoles() < CuartosEquipos3.getLast().getGoles()) {
			SemifinalEquipos2.addFirst(CuartosEquipos3.getLast());
		} else {
			SemifinalEquipos2.addFirst(CuartosEquipos3.getFirst());
		}

		if (CuartosEquipos4.getFirst().getGoles() > CuartosEquipos4.getLast().getGoles()) {
			SemifinalEquipos2.addLast(CuartosEquipos4.getFirst());
		} else if (CuartosEquipos4.getFirst().getGoles() < CuartosEquipos4.getLast().getGoles()) {
			SemifinalEquipos2.addLast(CuartosEquipos4.getLast());
		} else {
			SemifinalEquipos2.addLast(CuartosEquipos4.getFirst());
		}

		JOptionPane.showMessageDialog(null, "Cuartos");
		System.out.println("Cuartos");
		int preg2;
		do {
			preg2 = JOptionPane.showOptionDialog(null, "Elija las opciones que desee", "Fase actual: Cuartos", 0, 0,
					null, despGrupos, despGrupos);
			switch (preg2) {
			case 0:
				System.out.println(CuartosEquipos1);
				System.out.println(CuartosEquipos2);
				System.out.println(CuartosEquipos3);
				System.out.println(CuartosEquipos4);
				JOptionPane.showMessageDialog(null, CuartosEquipos1 + "\n \n" + CuartosEquipos2 + "\n \n"
						+ CuartosEquipos3 + "\n \n" + CuartosEquipos4);
				System.out.println();
				break;
			case 1:
				imprimirPartidosDesp(Cuartos);
				JOptionPane.showMessageDialog(null, "Todos los partidos de los cuartos : \n" + Cuartos);
				System.out.println();
				break;
			case 2:
				System.out.println();
				System.out.println(SemifinalEquipos1);
				System.out.println(SemifinalEquipos2);
				JOptionPane.showMessageDialog(null, SemifinalEquipos1 + "\n \n" + SemifinalEquipos2);
				System.out.println();
				break;
			case 3:
				break;
			case 4:
				volverMenuP();
				break;
			default:
				volverMenuP();
				break;
			}
		} while (preg2 != 3);

		// fijarse los goles
		// reiniciar goles para los demas partidos?
		for (Equipo poner0 : equiposCompletos) {
			poner0.setGoles(0);
		}

		Partido semifinal1 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), SemifinalEquipos1.getFirst(),
				SemifinalEquipos1.getLast());

		Partido semifinal2 = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), SemifinalEquipos2.getFirst(),
				SemifinalEquipos2.getLast());

		Semifinal.add(semifinal1);
		Semifinal.add(semifinal2);

		for (Partido partido : Semifinal) {
			for (Equipo equipo : SemifinalEquipos1) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		for (Partido partido : Semifinal) {
			for (Equipo equipo : SemifinalEquipos2) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		if (SemifinalEquipos1.getFirst().getGoles() > SemifinalEquipos1.getLast().getGoles()) {
			FinalEquipos.addFirst(SemifinalEquipos1.getFirst());
			TerceroyCuartoEquipos.addFirst(SemifinalEquipos1.getLast());
		} else if (SemifinalEquipos1.getFirst().getGoles() < SemifinalEquipos1.getLast().getGoles()) {
			FinalEquipos.addFirst(SemifinalEquipos1.getLast());
			TerceroyCuartoEquipos.addFirst(SemifinalEquipos1.getFirst());
		} else {
			FinalEquipos.addFirst(SemifinalEquipos1.getFirst());
			TerceroyCuartoEquipos.addFirst(SemifinalEquipos1.getLast());
		}

		if (SemifinalEquipos2.getFirst().getGoles() > SemifinalEquipos2.getLast().getGoles()) {
			FinalEquipos.addLast(SemifinalEquipos2.getFirst());
			TerceroyCuartoEquipos.addLast(SemifinalEquipos2.getLast());
		} else if (SemifinalEquipos2.getFirst().getGoles() < SemifinalEquipos2.getLast().getGoles()) {
			FinalEquipos.addLast(SemifinalEquipos2.getLast());
			TerceroyCuartoEquipos.addLast(SemifinalEquipos2.getFirst());
		} else {
			FinalEquipos.addLast(SemifinalEquipos2.getFirst());
			TerceroyCuartoEquipos.addLast(SemifinalEquipos2.getLast());
		}

		String[] Semif = { "Ver los equipos que llegaron a esta fase", "Ver los partidos de esta fase",
				"Ver los equipos que jugaran por el 3° y 4° puesto", "Continuar a siguiente fase (por 3° y 4° puesto)",
				"Volver al menú principal" };
		JOptionPane.showMessageDialog(null, "Semifinal");
		System.out.println("Semifinal");
		int preg3;
		do {
			preg3 = JOptionPane.showOptionDialog(null, "Elija las opciones que desee", "Fase actual: Semifinal", 0, 0,
					null, Semif, Semif);
			switch (preg3) {
			case 0:
				System.out.println(SemifinalEquipos1);
				System.out.println(SemifinalEquipos2);
				JOptionPane.showMessageDialog(null, SemifinalEquipos1 + "\n \n" + SemifinalEquipos2 + "\n");
				System.out.println();
				break;
			case 1:
				imprimirPartidosDesp(Semifinal);
				JOptionPane.showMessageDialog(null, "Todos los partidos de la semifinal : \n" + Semifinal);
				System.out.println();
				break;
			case 2:
				System.out.println();
				System.out.println(TerceroyCuartoEquipos);
				JOptionPane.showMessageDialog(null, TerceroyCuartoEquipos + "\n");
				System.out.println();
				break;

			case 3:
				break;
			case 4:
				volverMenuP();
				break;
			default:
				volverMenuP();
				break;
			}
		} while (preg3 != 3);

		// fijarse los goles
		// reiniciar goles para los demas partidos?
		for (Equipo poner0 : equiposCompletos) {
			poner0.setGoles(0);
		}

		Partido terceroycuarto = new Partido(0, pepito.cargarGol(), pepito.cargarGol(),
				TerceroyCuartoEquipos.getFirst(), TerceroyCuartoEquipos.getLast());

		TerceroyCuarto.add(terceroycuarto);

		for (Partido partido : TerceroyCuarto) {
			for (Equipo equipo : TerceroyCuartoEquipos) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		if (TerceroyCuartoEquipos.getFirst().getGoles() > TerceroyCuartoEquipos.getLast().getGoles()) {
			Tercero.add(TerceroyCuartoEquipos.getFirst());
			Cuarto.add(TerceroyCuartoEquipos.getLast());
		} else if (TerceroyCuartoEquipos.getFirst().getGoles() < TerceroyCuartoEquipos.getLast().getGoles()) {
			Tercero.add(TerceroyCuartoEquipos.getLast());
			Cuarto.add(TerceroyCuartoEquipos.getFirst());
		} else {
			Tercero.add(TerceroyCuartoEquipos.getFirst());
			Cuarto.add(TerceroyCuartoEquipos.getLast());
		}

		String[] tercycuar = { "Ver los equipos que llegaron a esta fase", "Ver el partido de esta fase",
				"Continuar a la siguiente fase (por 1° y 2° puesto)", "Volver al menú principal" };
		JOptionPane.showMessageDialog(null, "3° y 4°");
		System.out.println("3° y 4°");
		int preg4;
		do {
			preg4 = JOptionPane.showOptionDialog(null, "Elija las opciones que desee", "Fase actual: 3° y 4°", 0, 0,
					null, tercycuar, tercycuar);
			switch (preg4) {
			case 0:
				System.out.println(TerceroyCuartoEquipos);
				JOptionPane.showMessageDialog(null, TerceroyCuartoEquipos + "\n");
				System.out.println();
				break;
			case 1:
				imprimirPartidosDesp(TerceroyCuarto);
				JOptionPane.showMessageDialog(null, "Partido por 3° y 4° puesto: \n" + TerceroyCuarto);
				System.out.println();
				break;
			case 2:
				break;
			case 3:
				volverMenuP();
				break;
			default:
				volverMenuP();
				break;
			}
		} while (preg4 != 2);

		System.out.println(Cuarto);
		System.out.println(Tercero);

		JOptionPane.showMessageDialog(null, "4° puesto :" + Cuarto + "\n3° puesto: " + Tercero + "\n");

		Partido elfinal = new Partido(0, pepito.cargarGol(), pepito.cargarGol(), FinalEquipos.getFirst(),
				FinalEquipos.getLast());

		Final.add(elfinal);

		for (Partido partido : Final) {
			for (Equipo equipo : FinalEquipos) {

				if (partido.getEquipoo1().equals(equipo)) {
					equipo.setGoles(equipo.getGoles() + partido.getGol1());

				} else if (partido.getEquipoo2().equals(equipo)) {

					equipo.setGoles(equipo.getGoles() + partido.getGol2());
				}
			}
		}

		if (FinalEquipos.getFirst().getGoles() > FinalEquipos.getLast().getGoles()) {
			Ganador.add(FinalEquipos.getFirst());
			Segundo.add(FinalEquipos.getLast());
		} else if (FinalEquipos.getFirst().getGoles() < FinalEquipos.getLast().getGoles()) {
			Ganador.add(FinalEquipos.getLast());
			Segundo.add(FinalEquipos.getFirst());
		} else {
			Ganador.add(FinalEquipos.getFirst());
			Segundo.add(FinalEquipos.getLast());
		}

		String[] lafinal = { "Ver los equipos que llegaron a esta fase", "Ver el partido de esta fase",
				"Continuar para ver el ganador,el 2° puesto y la apuesta", "Volver al menú principal" };
		JOptionPane.showMessageDialog(null, "1° y 2°");
		System.out.println("1° y 2°");
		int preg5;
		do {
			preg5 = JOptionPane.showOptionDialog(null, "Elija las opciones que desee", "Fase actual: 1° y 2°", 0, 0,
					null, lafinal, lafinal);
			switch (preg5) {
			case 0:
				System.out.println(FinalEquipos);
				JOptionPane.showMessageDialog(null, FinalEquipos + "\n");
				System.out.println();
				break;
			case 1:
				imprimirPartidosDesp(Final);
				JOptionPane.showMessageDialog(null, "Partido por 1° y 2° puesto: \n" + Final);
				System.out.println();
				break;
			case 2:
				break;
			case 3:
				volverMenuP();
				break;
			default:
				volverMenuP();
				break;
			}
		} while (preg5 != 2);

		System.out.println(Segundo);
		System.out.println(Ganador);
		JOptionPane.showMessageDialog(null, "Ganador :" + Ganador + "\n2° puesto: " + Segundo + "\n");

		if (apuesta == Ganador.getFirst().getId() && apuesta > 0) {
			apostado = apostado * 2;
			JOptionPane.showMessageDialog(null, "Ganaste y duplicaste tu apuesta.\n Total ganado $ " + apostado,
					"A casa platita", JOptionPane.DEFAULT_OPTION, new ImageIcon("src/img/platita.jpg"));
			System.out.println("Ganaste y duplicaste tu apuesta. Total ganado $ " + apostado);
		} else if (apuesta != Ganador.getFirst().getId() && apuesta > 0) {
			JOptionPane.showMessageDialog(null, "Perdiste tu apuesta de $ " + apostado, "Chau platita",
					JOptionPane.DEFAULT_OPTION, new ImageIcon("src/img/noplatita.jpg"));
			System.out.println("Perdiste tu apuesta de $ " + apostado);
		} else if (apostado <= 0) {
			JOptionPane.showMessageDialog(null, "No apostaste nada, pero te regalo 2 carpinchos ", ":/", JOptionPane.DEFAULT_OPTION,
					new ImageIcon("src/img/duendeverd.jpg"));
		}
	}

	public static void imprimirEquipos(LinkedList<Equipo> lista) {

		if (lista.isEmpty()) {
			System.out.println("Lista vacía");
		} else {
			for (Equipo equipo : lista)
				JOptionPane.showMessageDialog(null, "Este es el equipo `" + equipo.getNombre() + "´, es del grupo `"
						+ equipo.getGrupo() + "´" + " y su id es : " + equipo.getId() + "\n");
			;
		}

	}

	public static void imprimirPartidos(LinkedList<Partido> lista) {

		if (lista.isEmpty()) {
			System.out.println("Lista vacía");
		} else {
			for (Partido partido : lista)
				System.out.println(
						"Hubo un partido, su id es " + partido.getId() + ", el equipo 1 hizo " + partido.getGol1()
								+ " goles , el equipo 2 hizo " + partido.getGol2() + " goles \n Datos equipo 1 : "
								+ partido.getEquipoo1() + "\n Datos equipo 2 : " + partido.getEquipoo2() + "\n");
		}
	}

	public static void imprimirPartidosDesp(LinkedList<Partido> lista) {

		if (lista.isEmpty()) {
			System.out.println("Lista vacía");
		} else {
			for (Partido partido : lista)
				System.out.println(
						"Hubo un partido, su id es " + partido.getId() + ", el equipo 1 hizo " + partido.getGol1()
								+ " goles , el equipo 2 hizo " + partido.getGol2() + " goles \n Datos equipo 1 : "
								+ partido.getEquipoo1() + "\n Datos equipo 2 : " + partido.getEquipoo2() + "\n");
		}
	}

	public static void salir() {
		int salir = JOptionPane.showConfirmDialog(null, "¿Quiere salir del programa?", "¿Salir?",
				JOptionPane.YES_NO_OPTION);
		if (salir == 0) {
			JOptionPane.showMessageDialog(null, "Terminó el Mundial", ":)", JOptionPane.DEFAULT_OPTION,
					new ImageIcon("src/img/maradona.jpg"));
			JOptionPane.showMessageDialog(null, "Fue bueno compartir el Mundial", "Chau", JOptionPane.DEFAULT_OPTION,
					new ImageIcon("src/img/handshake.gif"));
			System.exit(0);
		} else {
			menuPrincipal();
		}
	}

	public static void menuPrincipal() {
		String[] princpio = { "Empezar nuevo Mundial", "Terminar Mundial y salir del programa" };
		int aaa = 0;
		do {
			aaa = JOptionPane.showOptionDialog(null, "Menú principal", "Bienvenido al menú", 0, 0, null, princpio,
					princpio);
			switch (aaa) {
			case 0:
				menu();
				break;
			case 1:
				salir();
				break;
			default:
				salir();
				break;
			}
		} while (aaa != 1);
	}

	public static Equipo BuscarNombre(LinkedList<Equipo> lista, String nombre) {
		if (lista.isEmpty()) {
			System.out.println("Lista vacía");
		} else {
			for (Equipo e : lista)
				if (e.getNombre().equals(nombre)) {
					JOptionPane.showMessageDialog(null, e);
				}
		}
		return null;

	}

	public static void volverMenuP() {
		int volver;
		volver = JOptionPane.showConfirmDialog(null,
				"¿Quiere volver al menú principal? \nSi regresa los resultados del mundial actual seran descartados \n",
				"Advertencia", JOptionPane.YES_NO_OPTION);
		if (volver == 0) {
			menuPrincipal();
		} else {
		}
	}
//fin funciones
}