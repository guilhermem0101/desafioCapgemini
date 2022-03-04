package Desafios;


import java.util.Random;

public class Questão2 {
	public static void main (String[] args) {
		Random gerador = new Random();
		
		int vetor[] = new int[5];
		int y = gerador.nextInt(10); //a questão não fez restrição a elementos repetidos no vetor
		int contador =0;
		System.out.println("o numero y que determina o valor da diferença é: " + y);
		System.out.println();
		for(int x=0;  x<vetor.length; x++) {
			
			vetor[x] = gerador.nextInt(10);
			System.out.print(vetor[x]+" ");
		}
		
		for(int x=0;  x<vetor.length; x++) {
			for(int z=x;  z<vetor.length; z++)/* z=x é necessario para não repetir a mesma comparação*/ {
				if (Math.abs(vetor[x]-vetor[z])==y && x!=z) {
					contador++;
					System.out.println();
					System.out.println("o par {" +vetor[x]+","+vetor[z]+"} tem diferença igual a "+y );
				}

				
			}
		}
		System.out.println();
		System.out.println("o numero de elementos pares em que a diferença é igual a y é "+ contador );
		
	}
}
