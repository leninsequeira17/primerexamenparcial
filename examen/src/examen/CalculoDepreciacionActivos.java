package examen;
import java.util.Scanner;
public class CalculoDepreciacionActivos {
	static  Scanner  Sc=new Scanner(System.in);
	public static void main(String[] args) {
		
		Scanner en = new Scanner(System.in);
		int op, vidaUtil;
		double costoActivo,valorDesecho;
		String name = "";
		
		System.out.println("---------------------------------------------------------");
		System.out.println(" Bienvenido al  calculador de depreciacion");
		name = en.nextLine();
		System.out.println("---------------------------------------------------------");

		do {
			
			System.out.println("Elige un metodo por el cual deseas trabajar ------------- \n");
			System.out.println("1) Metodo de linea recta");
			System.out.println("2) Metodo unidades producidas");
			System.out.println("3) Metodo de saldos decrecientes");
			System.out.println("4) Metodo de suma de los digitos de los anios");
			System.out.println("0) salir");
			System.out.println("---------------------------------------------------------");	
			
			op = en.nextInt();
			
					switch(op) {
					case 1:
						System.out.print("Escriba el costo del activo: ");
						costoActivo = en.nextDouble();
						System.out.print("Escriba el valor de desecho: ");
						valorDesecho = en.nextDouble();
						System.out.print("Escriba la vida util: ");
						vidaUtil = en.nextInt();
						
						double depAnual = (costoActivo-valorDesecho)/vidaUtil;
						System.out.println("La depreciacion anual es: " + depAnual);
						break;
					case 2:
						
						
						break;
					case 3:
						
						
						break;
					case 4:
						
						
						break;
					}
					
					
			
		}while(op < 0);
	
				
			
		}
			
		
		
		
		
		
	   
   }





	
		
		
	


