import java.util.*;
/* Autor: Patricio Tena
**Fecha: 24/10
** Descricipon: Programa que que te diga si un n�mero es perfecto. */
public class perfecto{
	public static void main(String[]Args){
	int num = 0, count= 0, sum =0;
	Scanner a = new Scanner(System.in);

	System.out.print("Ingresa un n�mero ");
	num = a.nextInt();

	for (count = 1; count < num; count++){
		if (num%count == 0)
			sum = sum+count;
	}
	if ((count == num) && (sum == num))
		System.out.println("El n�mero es natural perfecto");

	else
		System.out.println("El n�mero no es natural perfecto");

	}
}
