package main;

import java.util.*;
import static main.Principal1_1.suma;
import static main.Principal1_2.resta;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int numero1, numero2, resultado;

		System.out.print("Introduce primer número: ");
		numero1 = sc.nextInt();
		System.out.print("Introduce segundo número: ");
		numero2 = sc.nextInt();

		resultado = suma(numero1, numero2);
		System.out.println("Suma: " + resultado);

		resultado = resta(numero1, numero2);
		System.out.println("Suma: " + resultado);

	}

}