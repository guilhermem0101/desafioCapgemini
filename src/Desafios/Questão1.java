package Desafios;

import java.util.Random;

public class Quest�o1 {
	public static void main(String[] args) {
		Random gerador = new Random();
		
		int y = gerador.nextInt(10);// gerador para a quantidade de posi��es do vetor
		int z;
		
		if (y%2==0 || y==0) /* restri��o para numeros impares e diferentes de 0*/{
			y+=3;
			
		}
		System.out.println("O numero de posi��es do vetor a seguir ser� de "+ y+":");
		int[] vetor = new int[y];
		

		for (int x = 0; x < vetor.length; x++) {

			vetor[x] = gerador.nextInt(10);
			System.out.print(vetor[x]+" ");
		}
		
		
		
		z=(vetor.length)/2;//calculo para encontrar a mediana, (y+1/2). Porem como o vetor se inicia na posi��o 0, subtrai 1.
		
		System.out.println();
		System.out.println("a mediana � o valor de "+vetor[z]);
		
	

	}

}
