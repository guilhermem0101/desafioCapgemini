package Desafios;


import java.util.Random;

public class Quest�o2 {
	public static void main (String[] args) {
		Random gerador = new Random();
		
		int vetor[] = new int[5];
		int y = gerador.nextInt(10); //a quest�o n�o fez restri��o a elementos repetidos no vetor
		int contador =0;
		System.out.println("o numero y que determina o valor da diferen�a �: " + y);
		System.out.println();
		for(int x=0;  x<vetor.length; x++) {
			
			vetor[x] = gerador.nextInt(10);
			System.out.print(vetor[x]+" ");
		}
		
		for(int x=0;  x<vetor.length; x++) {
			for(int z=x;  z<vetor.length; z++)/* z=x � necessario para n�o repetir a mesma compara��o*/ {
				if (Math.abs(vetor[x]-vetor[z])==y && x!=z) {
					contador++;
					System.out.println();
					System.out.println("o par {" +vetor[x]+","+vetor[z]+"} tem diferen�a igual a "+y );
				}

				
			}
		}
		System.out.println();
		System.out.println("o numero de elementos pares em que a diferen�a � igual a y � "+ contador );
		
	}
}
