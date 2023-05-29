//desafio PAtrones simples y anidados M2.2 Clase12
package cl.dmiranda;
import java.util.Scanner;

public class PatronesSimples {

	private static Scanner sc;

	public static void main(String[] args) {
		int nro = 0;
	    boolean esNumero = false;
		sc = new Scanner(System.in);
	    while (!esNumero) {
	        System.out.println("Ingrese el valor de n: ");
	        if (sc.hasNextInt()) {
	            nro = sc.nextInt();
	            esNumero = true;
	        } else {
	            System.out.println("Error: Debe ingresar solo números");
	            sc.next(); 
	        }
	        System.out.println();
	    }
	    //Patron1 * y . intercalados
	    System.out.println("Patrón 1");
	    for(int i=0; i<nro; i++) {
	        if(i%2 == 0) {
	            System.out.print("*");
	        } else {
	            System.out.print(".");
	            }
	    }
	    System.out.println();
	   	    
	    //Patrón2: de 1 a n
	    System.out.println("Patrón 2");
	    for (int i = 0; i < nro * 2; i++) {    
	        System.out.print((i% nro) + 1);
	        for (int j = i; j < 0; j++) {
	   	 System.out.print(j % 2 + i);
	    }
	    }
	    System.out.println();
	  	       
	    //Patrón3
	    System.out.println("Patrón 3");
	    for (int i = 0; i < nro; i++) {
	        if (i% 3 == 2) {
	        	System.out.print("*");
	        } else {
	            System.out.print("|"); 
	        }
	    }


	}

}
