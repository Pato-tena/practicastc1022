import java.util.*;
/* Autor: Patricio Tena
**Fecha: 24/10
** Descricipon: Programa que recibe 1 año y te devuelve si se trata de bisisto o no. */
public class bisiesto{
	public static void main(String[]Args){
	int year = 0;
	Scanner a = new Scanner(System.in);

	System.out.print("Ingresa un año ");
	year = a.nextInt();

	if ((year%4 == 0) && (year%400 == 0))
		System.out.println("El año " +year+ " es bisiesto");
	else
		System.out.println("El año " +year+ " no es bisiesto");
	}
}
