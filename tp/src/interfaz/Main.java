package interfaz;

import java.util.*;
import javax.swing.*;
import datos.*;

public class Main {

	public static void main(String[] args) {

		JOptionPane.showMessageDialog(null, "Bienvenido al Mundial", "Hola", JOptionPane.DEFAULT_OPTION,
				new ImageIcon("src/img/holaa.jpg"));

		Encargado pepito = new Encargado();

		LinkedList<Equipo> equiposCompletos = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposA = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposB = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposC = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposD = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposE = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposF = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposG = new LinkedList<Equipo>();
		LinkedList<Equipo> GruposH = new LinkedList<Equipo>();

		Equipo equipo1 = new Equipo(1, "Qatar", 0, true, "A");
		Equipo equipo2 = new Equipo(2, "Ecuador", 0, true, "A");
		Equipo equipo3 = new Equipo(3, "Senegal", 0, true, "A");
		Equipo equipo4 = new Equipo(4, "Países Bajos", 0, true, "A");

		equiposCompletos.add(equipo1);
		equiposCompletos.add(equipo2);
		equiposCompletos.add(equipo3);
		equiposCompletos.add(equipo4);

		for (Equipo equipo : equiposCompletos) {
			if (equipo.getGrupo().equals("A"))
				;
			GruposA.add(equipo);
		}

		Equipo equipo5 = new Equipo(5, "Inglaterra", 0, true, "B");
		Equipo equipo6 = new Equipo(6, "Irán", 0, true, "B");
		Equipo equipo7 = new Equipo(7, "Usa", 0, true, "B");
		Equipo equipo8 = new Equipo(8, "Gales", 0, true, "B");

		equiposCompletos.add(equipo5);
		equiposCompletos.add(equipo6);
		equiposCompletos.add(equipo7);
		equiposCompletos.add(equipo8);

		for (Equipo equipo : equiposCompletos) {
			if (equipo.getGrupo().equals("B"))
				;
			GruposB.add(equipo);
		}

		Equipo equipo9 = new Equipo(9, "Argentina", 0, true, "C");
		Equipo equipo10 = new Equipo(10, "Arabia Saudí", 0, true, "C");
		Equipo equipo11 = new Equipo(11, "México", 0, true, "C");
		Equipo equipo12 = new Equipo(12, "Polonia", 0, true, "C");

		equiposCompletos.add(equipo9);
		equiposCompletos.add(equipo10);
		equiposCompletos.add(equipo11);
		equiposCompletos.add(equipo12);

		for (Equipo equipo : equiposCompletos) {
			if (equipo.getGrupo().equals("C"))
				;
			GruposC.add(equipo);
		}

		Equipo equipo13 = new Equipo(13, "Francia", 0, true, "D");
		Equipo equipo14 = new Equipo(14, "Australia", 0, true, "D");
		Equipo equipo15 = new Equipo(15, "Dinamarca", 0, true, "D");
		Equipo equipo16 = new Equipo(16, "Túnez", 0, true, "D");

		equiposCompletos.add(equipo13);
		equiposCompletos.add(equipo14);
		equiposCompletos.add(equipo15);
		equiposCompletos.add(equipo16);

		for (Equipo equipo : equiposCompletos) {
			if (equipo.getGrupo().equals("Grupo D"))
				;
			GruposD.add(equipo);
		}

		Equipo equipo17 = new Equipo(17, "España", 0, true, "E");
		Equipo equipo18 = new Equipo(18, "Costa Rica", 0, true, "E");
		Equipo equipo19 = new Equipo(19, "Alemania", 0, true, "E");
		Equipo equipo20 = new Equipo(20, "Japón", 0, true, "E");

		equiposCompletos.add(equipo17);
		equiposCompletos.add(equipo18);
		equiposCompletos.add(equipo19);
		equiposCompletos.add(equipo20);

		for (Equipo equipo : equiposCompletos) {
			if (equipo.getGrupo().equals("E"))
				;
			GruposE.add(equipo);

		}

		Equipo equipo21 = new Equipo(21, "Bélgica", 0, true, "F");
		Equipo equipo22 = new Equipo(22, "Canadá", 0, true, "F");
		Equipo equipo23 = new Equipo(23, "Marruecos", 0, true, "F");
		Equipo equipo24 = new Equipo(24, "Croacia", 0, true, "F");

		equiposCompletos.add(equipo21);
		equiposCompletos.add(equipo22);
		equiposCompletos.add(equipo23);
		equiposCompletos.add(equipo24);

		for (Equipo equipo : equiposCompletos) {
			if (equipo.getGrupo().equals("F"))
				;
			GruposF.add(equipo);
		}

		Equipo equipo25 = new Equipo(25, "Brasil", 0, true, "G");
		Equipo equipo26 = new Equipo(26, "Serbia", 0, true, "G");
		Equipo equipo27 = new Equipo(27, "Suiza", 0, true, "G");
		Equipo equipo28 = new Equipo(28, "Camerún", 0, true, "G");

		equiposCompletos.add(equipo25);
		equiposCompletos.add(equipo26);
		equiposCompletos.add(equipo27);
		equiposCompletos.add(equipo28);

		for (Equipo equipo : equiposCompletos) {
			if (equipo.getGrupo().equals("G"))
				;
			GruposG.add(equipo);
		}

		Equipo equipo29 = new Equipo(29, "Portugal", 0, true, "H");
		Equipo equipo30 = new Equipo(30, "Ghana", 0, true, "H");
		Equipo equipo31 = new Equipo(31, "Uruguay", 0, true, "H");
		Equipo equipo32 = new Equipo(32, "Corea del Sur", 0, true, "H");

		equiposCompletos.add(equipo29);
		equiposCompletos.add(equipo30);
		equiposCompletos.add(equipo31);
		equiposCompletos.add(equipo32);

		for (Equipo equipo : equiposCompletos) {
			if (equipo.getGrupo().equals("H"))
				;
			GruposH.add(equipo);

		}
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

		int aux;

		String[] aux2 = { "Ver resultados de partidos", "Ver equipos", "Iniciar sesión " };

		do {
			aux = JOptionPane.showOptionDialog(null,
					"Elija una de las siguientes opciones \nEs obligatorio iniciar sesion para poder continuar a los octavos",
					null, 0, 0, null, aux2, aux2);
			switch (aux) {
			case 0:
				int aux5 = Integer.parseInt(JOptionPane.showInputDialog(null,
						"Ingresar un numero \nPartidos del Grupo A = 1, Partidos del grupo B = 2, ... (son 8 grupos) \nIngresar 0 para verlo por consola"));
				switch (aux5) {
				case 0:
					imprimirPartidos(HacerPartidos);
					break;
				case 1:
					JOptionPane.showMessageDialog(null, HacerPartidosA);
					break;
				case 2:
					JOptionPane.showMessageDialog(null, HacerPartidosB);
					break;
				case 3:
					JOptionPane.showMessageDialog(null, HacerPartidosC);
					break;
				case 4:
					JOptionPane.showMessageDialog(null, HacerPartidosD);
					break;
				case 5:
					JOptionPane.showMessageDialog(null, HacerPartidosE);
					break;
				case 6:
					JOptionPane.showMessageDialog(null, HacerPartidosF);
					break;
				case 7:
					JOptionPane.showMessageDialog(null, HacerPartidosG);
					break;
				case 8:
					JOptionPane.showMessageDialog(null, HacerPartidosH);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Solo hay 8 equipos");
					break;
				}
				break;
			case 1:
				String[] opciones = { "'Buscar'", "System.out.println", "JOptionPane.showMessageDialog " };
				int masopciones = JOptionPane.showOptionDialog(null,
						"Elija una de las siguientes opciones para saber como mostrar a los equipos", null, 0, 0, null,
						opciones, opciones);

				switch (masopciones) {
				case 0:

					String[] aux3 = new String[equiposCompletos.size()];

					for (Equipo grup : equiposCompletos) {

						aux3[equiposCompletos.indexOf(grup)] = grup.toString();
					}

					String mira = (String) JOptionPane.showInputDialog(null // para que se muestre centrado
							, "Seleccione de Datos" // Mensaje de la ventana
							, "Lista de Datos" // Titulo de la ventana
							, JOptionPane.QUESTION_MESSAGE // Icono
							, null // null para icono defecto de la ventana
							, aux3 // el objeto
							, aux3[0] // posicion del que va aparecer seleccionado
					);

					JOptionPane.showMessageDialog(null, mira);

					break;
				case 1:
					imprimirEquipos(equiposCompletos);
					break;
				case 2:
					String[] aux4 = new String[equiposCompletos.size()];

					for (Equipo grup : equiposCompletos) {
						aux4[equiposCompletos.indexOf(grup)] = grup.toString();
					}
					JOptionPane.showMessageDialog(null, aux4, "\n", 0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "no");
					break;
				}

				break;
			case 2:
				Encargado.Login(pepito, pepito.getId());
				break;
			default:

				break;
			}
		} while (aux < 2);

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

		equiposFinalesA.addFirst(equipo1);
		equiposFinalesA.addLast(equipo2);
		/*
		 * otra forma equipo1.setPosicion(1); equipo2.setPosicion(2); for (Equipo
		 * equipoa : GruposA) { if (equipoa.getPosicion() == 1) {
		 * equiposFinalesA.addFirst(equipoa); } else if (equipoa.getPosicion() == 2) {
		 * equiposFinalesA.addLast(equipoa); } }
		 */
		equiposFinalesB.addFirst(equipo5);
		equiposFinalesB.addLast(equipo6);

		/*
		 * otra forma equipo5.setPosicion(1); equipo6.setPosicion(2);
		 * 
		 * for (Equipo equipob : GruposB) { if (equipob.getPosicion() == 1) {
		 * equiposFinalesB.addFirst(equipob); } else if (equipob.getPosicion() == 2) {
		 * equiposFinalesB.addLast(equipob); } }
		 */
		equiposFinalesC.addFirst(equipo9);
		equiposFinalesC.addLast(equipo10);

		/*
		 * otra forma equipo9.setPosicion(1); equipo10.setPosicion(2);
		 * 
		 * for (Equipo equipoc : GruposC) { if (equipoc.getPosicion() == 1) {
		 * equiposFinalesC.addFirst(equipoc); } else if (equipoc.getPosicion() == 2) {
		 * equiposFinalesC.addLast(equipoc); } }
		 */
		equiposFinalesD.addFirst(equipo13);
		equiposFinalesD.addLast(equipo14);

		/*
		 * otra forma equipo13.setPosicion(1); equipo14.setPosicion(2); for (Equipo
		 * equipod : GruposD) { if (equipod.getPosicion() == 1) {
		 * equiposFinalesD.addFirst(equipod); } else if (equipod.getPosicion() == 2) {
		 * equiposFinalesD.addLast(equipod); } }
		 */
		equiposFinalesE.addFirst(equipo17);
		equiposFinalesE.addLast(equipo18);

		/*
		 * otra forma equipo17.setPosicion(1); equipo18.setPosicion(2); for (Equipo
		 * equipoe : GruposE) { if (equipoe.getPosicion() == 1) {
		 * equiposFinalesE.addFirst(equipoe); } else if (equipoe.getPosicion() == 2) {
		 * equiposFinalesE.addLast(equipoe); } }
		 */
		equiposFinalesF.addFirst(equipo21);
		equiposFinalesF.addLast(equipo22);
		/*
		 * otra forma equipo21.setPosicion(1); equipo22.setPosicion(2); for (Equipo
		 * equipof : GruposF) { if (equipof.getPosicion() == 1) {
		 * equiposFinalesF.addFirst(equipof); } else if (equipof.getPosicion() == 2) {
		 * equiposFinalesF.addLast(equipof); } }
		 */
		equiposFinalesG.addFirst(equipo25);
		equiposFinalesG.addLast(equipo26);

		/*
		 * otra forma equipo25.setPosicion(1); equipo26.setPosicion(2);
		 * 
		 * for (Equipo equipog : GruposG) { if (equipog.getPosicion() == 1) {
		 * equiposFinalesG.addFirst(equipog); } else if (equipog.getPosicion() == 2) {
		 * equiposFinalesG.addLast(equipog); } }
		 */

		equiposFinalesH.addFirst(equipo29);
		equiposFinalesH.addLast(equipo30);
		/*
		 * otra forma equipo29.setPosicion(1); equipo30.setPosicion(2); for (Equipo
		 * equipoh : GruposH) { if (equipoh.getPosicion() == 1) {
		 * equiposFinalesH.addFirst(equipoh); } else if (equipoh.getPosicion() == 2) {
		 * equiposFinalesH.addLast(equipoh); } }
		 * 
		 */

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

		JOptionPane.showMessageDialog(null, "Octavos");
		System.out.println("Octavos");
		int preg1;
		do {
			preg1 = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1 Para ver los equipos que llegaron a los octavos \n2 Para ver los equipos que pasaron a la siguiente fase \n0 Para ver los partidos de esta fase e ir hacia la siguiente"));
			switch (preg1) {
			case 0:
				System.out.println("8°");
				imprimirPartidosDesp(Octavos);
				JOptionPane.showMessageDialog(null, "Todos los partidos de los octavos : \n" + Octavos);
				System.out.println();
				break;
			case 1:
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
						equiposFinalesA + "\n" + equiposFinalesB + "\n" + equiposFinalesC + "\n" + equiposFinalesD
								+ "\n" + equiposFinalesE + "\n" + equiposFinalesF + "\n" + equiposFinalesG + "\n"
								+ equiposFinalesH);
				break;
			case 2:
				System.out.println(CuartosEquipos1);
				System.out.println(CuartosEquipos2);
				System.out.println(CuartosEquipos3);
				System.out.println(CuartosEquipos4);
				JOptionPane.showMessageDialog(null,
						CuartosEquipos1 + "\n" + CuartosEquipos2 + "\n" + CuartosEquipos3 + "\n" + CuartosEquipos4);
				System.out.println();
				break;
			default:
				break;
			}
		} while (preg1 != 0);

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
			preg2 = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1 Para ver los equipos que llegaron a los cuartos \n2 Para ver los equipos que pasaron a la siguiente fase \n0 Para ver los partidos de esta fase e ir hacia la siguiente"));
			switch (preg2) {
			case 0:
				System.out.println("4°");
				imprimirPartidosDesp(Cuartos);
				JOptionPane.showMessageDialog(null, Cuartos);
				System.out.println();
				break;
			case 1:
				System.out.println(CuartosEquipos1);
				System.out.println(CuartosEquipos2);
				System.out.println(CuartosEquipos3);
				System.out.println(CuartosEquipos4);
				JOptionPane.showMessageDialog(null,
						CuartosEquipos1 + "\n" + CuartosEquipos2 + "\n" + CuartosEquipos3 + "\n" + CuartosEquipos4);
				System.out.println();

				break;
			case 2:
				System.out.println();
				System.out.println(SemifinalEquipos1);
				System.out.println(SemifinalEquipos2);
				JOptionPane.showMessageDialog(null, SemifinalEquipos1 + "\n" + SemifinalEquipos2);
				System.out.println();
				break;
			default:
				break;
			}
		} while (preg2 != 0);

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

		JOptionPane.showMessageDialog(null, "Semifinal");
		System.out.println("Semifinal");
		int preg3;
		do {
			preg3 = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1 Para ver los equipos que llegaron a la semifinal \n2 Para ver los equipos que pasaron a la siguiente fase \n0 Para ver los partidos de esta fase e ir hacia la siguiente"));
			switch (preg3) {
			case 0:
				System.out.println("Semifinal");
				imprimirPartidosDesp(Semifinal);
				JOptionPane.showMessageDialog(null, Semifinal);
				System.out.println();
				break;
			case 1:
				System.out.println(SemifinalEquipos1);
				System.out.println(SemifinalEquipos2);

				JOptionPane.showMessageDialog(null, SemifinalEquipos1 + "\n" + SemifinalEquipos2 + "\n");
				System.out.println();

				break;
			case 2:
				System.out.println();
				System.out.println(TerceroyCuartoEquipos);

				JOptionPane.showMessageDialog(null, TerceroyCuartoEquipos + "\n");
				System.out.println();
				break;
			default:
				break;
			}
		} while (preg3 != 0);

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

		JOptionPane.showMessageDialog(null, "3° y 4°");
		System.out.println("3° y 4°");
		int preg4;
		do {
			preg4 = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1 Para ver los equipos que llegaron a disputar por el 3° y 4° puesto \n0 Para ver los partidos de esta fase e ir hacia la siguiente"));
			switch (preg4) {
			case 0:
				System.out.println("3° y 4°");
				imprimirPartidosDesp(TerceroyCuarto);
				JOptionPane.showMessageDialog(null, TerceroyCuarto);
				System.out.println();
				break;
			case 1:
				System.out.println(TerceroyCuartoEquipos);

				JOptionPane.showMessageDialog(null, TerceroyCuartoEquipos + "\n");
				System.out.println();

				break;
			default:
				break;
			}
		} while (preg4 != 0);

		System.out.println(Cuarto);
		System.out.println(Tercero);

		JOptionPane.showMessageDialog(null, "Cuarto :" + Cuarto + "\n 3° puesto: " + Tercero + "\n");

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

		JOptionPane.showMessageDialog(null, "1° y 2°");
		System.out.println("1° y 2°");
		int preg5;
		do {
			preg5 = Integer.parseInt(JOptionPane.showInputDialog(null,
					"1 Para ver los equipos que llegaron a disputar por el 1° y 2° puesto \n0 Para ver los partidos de esta fase e ir hacia la siguiente (aunque ya no hay más)"));
			switch (preg5) {
			case 0:
				System.out.println("1° y 2°");
				imprimirPartidosDesp(Final);
				JOptionPane.showMessageDialog(null, Final);
				System.out.println();
				break;
			case 1:
				System.out.println(FinalEquipos);

				JOptionPane.showMessageDialog(null, FinalEquipos + "\n");
				System.out.println();

				break;
			default:
				break;
			}
		} while (preg5 != 0);

		// importantes!

		System.out.println(Segundo);
		System.out.println(Ganador);
		JOptionPane.showMessageDialog(null, "Ganador :" + Ganador + "\n 2° puesto: " + Segundo + "\n");

		JOptionPane.showMessageDialog(null, "Termino el Mundial", ":)", JOptionPane.DEFAULT_OPTION,
				new ImageIcon("src/img/maradona.jpg"));
	}

	// principio funciones
	public static void imprimirEquipos(LinkedList<Equipo> lista) {

		if (lista.isEmpty()) {
			System.out.println("La lista esta vacía");
		} else {
			for (Equipo equipo : lista)
				System.out.println("Este es el equipo `" + equipo.getNombre() + "´, es del grupo `" + equipo.getGrupo()
						+ "´" + " y su id es : " + equipo.getId() + "\n");
		}

	}

	public static void imprimirPartidos(LinkedList<Partido> lista) {

		if (lista.isEmpty()) {
			System.out.println("La lista esta vacía");
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
			System.out.println("La lista esta vacía");
		} else {
			for (Partido partido : lista)
				System.out.println(
						"Hubo un partido, su id es " + partido.getId() + ", el equipo 1 hizo " + partido.getGol1()
								+ " goles , el equipo 2 hizo " + partido.getGol2() + " goles \n Datos equipo 1 : "
								+ partido.getEquipoo1() + "\n Datos equipo 2 : " + partido.getEquipoo2() + "\n");
		}
	}

	public static void imprimirEquiposDesp(LinkedList<Equipo> lista) {

		if (lista.isEmpty()) {
			System.out.println("La lista esta vacía");
		} else {
			for (Equipo equipo : lista)
				System.out.println(("Este es el equipo `" + equipo.getNombre() + "´, es del grupo `" + equipo.getGrupo()
						+ "´" + " y su id es : " + equipo.getId() + "\n"));
		}
	}

//fin funciones

}
