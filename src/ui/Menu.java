package ui;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;

import model.Game;
import model.Node;
import model.Player;

public class Menu {
	private Game mt;
	private Node node;

	private Scanner l;

	public Menu() {
		mt = new Game(0, 0, 0);
		

		Scanner lector = new Scanner(System.in);
		l = lector;
		System.out.println("==========================================================");
		System.out.println("==============| Welcome to the laser game |==============");
		System.out.println("==========================================================");
		System.out.println("==============  |Wednesday, November 4 |==================");
		System.out.println("==============|  Universidad ICESI |======================");
		System.out.println("===========================================================");
		System.out.print("\n\n");
		iniciarPartida();
	}

	public void iniciarPartida() {
		System.out.println("DIGITE LA OPCION DESEADA:");
		System.out.println("1- Iniciar el juego");
		System.out.println("2- ver tablero de posiciones");
		System.out.println("3- salir del juego");
		int option = l.nextInt();

		switch (option) {
		case 1:
			tamanioArray();

			break;
		case 2:
			
		

			break;

		case 3:

			salir();
			iniciarPartida();

			break;
		default:
			System.out.println("Introduzca una opcion valida nuevamente.");

			break;
		}
	}

	public void tamanioArray() {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese su nickname ");
		String nick = sc.nextLine();
		System.out.println(" ingrese el tamaño de la filas");
		int rowss = sc.nextInt();
		System.out.println(" ingrese el tamaño de la columna");
		int columns = sc.nextInt();
		System.out.println(" ingrese el numero de espejos");
		int mr = sc.nextInt();

		Game b = new Game(rowss, columns, mr);
		System.out.println(b);

	}

	/**
	 * Imprime un mensaje de despedida y termina la ejecucion del programa.
	 */
	public void salir() {
		System.out.println("Gracias! :D");
	}

}