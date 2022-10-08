package examen;
import java.util.Scanner;
public class CalculoDepreciacionActivos{
	static 	Scanner Sc=new Scanner(System.in);
	public static void main(String[] args) {
		int menu, Vidautil, VUU, VUUF,a;
		double Costoactivo, Valordesecho,Depreciacionanual, VL, Depreciacionacumulada;
		 a=0;
		System.out.println("Bienvenido al calculador de depreciacion Master");
		do{System.out.println("Que metodo quiere utilizar?  "
				+ "\n1. Metodo de linea"
				+ "\n2. Metodo de las unidades producidas"
				+ "\n3. Metodo de reduccion de saldo"
				+ "\n4. Metodo de la suma de los digitos por año"); 
		System.out.println("5. saliendo del programa");
		menu=Sc.nextInt();}while(menu<1 || menu>5);
		while(a<100) {
		switch(menu) {
		case 1:
			do{System.out.println("Por favor, Digite el valor del activo");
			Costoactivo=Sc.nextInt();}while(Costoactivo<1000 || Costoactivo>1000000);
			do{System.out.println("Digite el valor de desecho/residual");
			Valordesecho=Sc.nextInt();}while(Valordesecho<1000 || Valordesecho>1000000);
			do{System.out.println("Digite la vida util del activo");
			Vidautil=Sc.nextInt();}while(Vidautil<1 || Vidautil>20);
			Depreciacionanual=((Costoactivo-Valordesecho)/Vidautil);
			VL=Costoactivo-Depreciacionanual;
			Depreciacionacumulada=0;
			System.out.println("Costo del activo: $"+Costoactivo
					+ "\nValor de Desecho: $"+Valordesecho+""
					+ "\nVida Util: "+Vidautil+""
					+ "\nDepresiacion Anual: $"+Depreciacionanual);
			
			 for(int i=1;i<=Vidautil;i++) {
				Depreciacionacumulada=Depreciacionacumulada+Depreciacionanual;
				System.out.println(i+". Depreciacion Acumulada="+Depreciacionacumulada+" | Valor en libros="+VL);
				VL=VL-Depreciacionanual;
			 }
			break;
		case 2:
			do{System.out.println("Por favor, Digite el valor del activo");
			Costoactivo=Sc.nextInt();}while(Costoactivo<1000 || Costoactivo>1000000);
			do{System.out.println("Digite el valor de desecho/residual");
			Valordesecho=Sc.nextInt();}while(Valordesecho<1000 || Valordesecho>1000000);
			do{System.out.println("Digite la vida util del activo");
			Vidautil=Sc.nextInt();}while(Vidautil<1 || Vidautil>20);
		
			VUUF=0;
			
			for(int j=1;j<=Vidautil;j++) {
				System.out.print("Digite la vida util del activo en unidades");
				VUU=Sc.nextInt();
				VUUF=VUU+VUUF;
				System.out.println(j+" Año= "+VUU+" Km");
			}

			System.out.println(VUUF+" km");
			
			
			Depreciacionanual=((Costoactivo-Valordesecho)/Vidautil);
			VL=Costoactivo-Depreciacionanual;
			Depreciacionacumulada=0;
			System.out.println("Costo del activo: $"+Costoactivo
					+ "\nValor de Desecho: $"+Valordesecho+""
					+ "\nVida Util: "+Vidautil+""
					+ "\nDepresiacion Anual: $"+Depreciacionanual);
			
			 for(int i=1;i<=Vidautil;i++) {
				Depreciacionacumulada=Depreciacionacumulada+Depreciacionanual;
				System.out.println(i+". Depreciacion Acumulada="+Depreciacionacumulada+" | Valor en libros="+VL);
				VL=VL-Depreciacionanual;
			 }

			break;
		case 3:
			do{System.out.println("Por favor, Digite el valor del activo");
			Costoactivo=Sc.nextInt();}while(Costoactivo<1000 || Costoactivo>1000000);
			do{System.out.println("Digite el valor de desecho/residual");
			Valordesecho=Sc.nextInt();}while(Valordesecho<1000 || Valordesecho>1000000);
			do{System.out.println("Digite la vida util del activo");
			Vidautil=Sc.nextInt();}while(Vidautil<1 || Vidautil>20);
			
			Depreciacionanual= (Costoactivo-Valordesecho)*(1/Vidautil);
			
			break;
			
		case 4:
			int NVU;
			do{System.out.println("Por favor, Digite el valor del activo");
			Costoactivo=Sc.nextInt();}while(Costoactivo<1000 || Costoactivo>1000000);
			do{System.out.println("Digite el valor de desecho/residual");
			Valordesecho=Sc.nextInt();}while(Valordesecho<1000 || Valordesecho>1000000);
			do{System.out.println("Digite la vida util del activo");
			Vidautil=Sc.nextInt();}while(Vidautil<1 || Vidautil>20);
		    int i,suma,fraccion;  
		    suma=0;
				  for(i=0;i<=Vidautil;i++){    
				      suma=suma+i;    
				  }    

				    Depreciacionanual=(((Costoactivo-Valordesecho)*Vidautil)/suma);
					System.out.println("Costo del activo: $"+Costoactivo
							+ "\nValor de Desecho: $"+Valordesecho+""
							+ "\nVida Util: "+Vidautil+""
							+ "\nDepresiacion Anual: $"+Depreciacionanual);
					NVU=Vidautil;
					 for(int j=1;j<=Vidautil;j++) {
					    VL=Costoactivo-Depreciacionanual;
					    Depreciacionanual=(((VL-Valordesecho)*NVU)/suma);
             System.out.println(j+". Depreciacion Anual="+Depreciacionanual+" | Valor en libros="+VL);
                        NVU=Vidautil-1;
						VL=VL-Depreciacionanual;
						break;
							}
		case 5:
		    
            System.out.println("Saliendo de la app....");
            a=101;
            break;
    
        default:
            System.out.println("Opcion incorrecta, intente nuevamente....");

            break;
			
			
						}
					 }
	}
		   

	}

	
			
		
		
		
		
		
	   
   





	
		
		
	


