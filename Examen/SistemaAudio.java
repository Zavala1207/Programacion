package SistemaDeAudio;


import java.util.Scanner;
import java.awt.HeadlessException;
import javax.swing.JOptionPane;


public class SistemaAudio {
	static String pedir;
	static Scanner scanner = new Scanner(System.in); //Rtexto
	static int select = -1; //opción 
	static int  volumen, audio, lista; //Variables
	static double volumen2;
        double[] arregloAudio;
	public static void main(String[] args) {
					
		//
		while(select != 0){
			//Try catch 
			try{
				String lectura = JOptionPane.showInputDialog(null,"************************\nElige opción:\n1.- Reproducir En Orden" +
						"\n2.- Reproduccion Aleatoria\n" +
						"3.- Mostrar Lista \n" +
						"4.- Agregar Audio\n" +
                                                "5.- Eliminar Audio\n" +
						"0.- Salir\n************************");
				//
				select = Integer.parseInt(lectura); 
		
				//
				switch(select){
				case 1: 
					JOptionPane.showMessageDialog(null,"Reproduciendo: "  + lista);

					break;
				case 2: 
					JOptionPane.showMessageDialog(null,"Reproduciendo: " + lista);
					
					break;
				case 3: 
					JOptionPane.showMessageDialog(null,"La Lista es: " + lista );
					break;
				case 4: 
                                        
					JOptionPane.showMessageDialog(null,"Agregada ");
					break;
                                case 5: 
					JOptionPane.showMessageDialog(null,"Eliminado ");
					break;
				case 0: 
					JOptionPane.showMessageDialog(null,"Adios!");
					break;
				default:
					JOptionPane.showMessageDialog(null,"Número no reconocido");break;
				}
					
				
					
			}catch(HeadlessException | NumberFormatException e){
				JOptionPane.showMessageDialog(null,"Uoop! Error!");
			}
		}
	}

		
		

}