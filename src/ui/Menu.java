package ui;

import java.util.Scanner;

import model.Matrix;
import model.Node;

public class Menu{
	 private Matrix m;
	 private Node node;
	 
	 private Scanner l;
	 
	 public Menu(){
			Scanner lector = new Scanner(System.in);
			l = lector;
			System.out.println ("==========================================================");
			System.out.println ("==============| Welcome to the laser game |==============");
			System.out.println ("==========================================================");
			System.out.println ("==============  |Wednesday, November 4 |==================");
			System.out.println ("==============|  Universidad ICESI |======================");
			System.out.println ("===========================================================");
			System.out.print ("\n\n");
			iniciarPartida();
		}
	 
	 public void iniciarPartida(){
			System.out.println ("Digite la opcion deseada:");
			System.out.println ("1- Iniciar el juego");
			System.out.println ("2- ver tablero de posiciones");
			System.out.println ("3- salir del juego");
			int option= l.nextInt();
			
			switch (option){
				case 1:
				
				break;
				case 2:
					Matrix lm = new Matrix(2, 26
							);
					System.out.println(lm);
				break;
				default:
		
				break;
			}
}
	 
}