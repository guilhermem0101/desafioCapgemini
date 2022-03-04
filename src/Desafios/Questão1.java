package Desafios;

import java.util.Random;

public class Questão1 {
	public static void main(String[] args) {
		Random gerador = new Random();
		
		int y = gerador.nextInt(10);// gerador para a quantidade de posições do vetor
		int z;
		
		if (y%2==0 || y==0) /* restrição para numeros impares e diferentes de 0*/{
			y+=3;
			
		}
		System.out.println("O numero de posições do vetor a seguir será de "+ y+":");
		int[] vetor = new int[y];
		

		for (int x = 0; x < vetor.length; x++) {

			vetor[x] = gerador.nextInt(10);
			System.out.print(vetor[x]+" ");
		}
		
		
		
		z=(vetor.length)/2;//calculo para encontrar a mediana, (y+1/2). Porem como o vetor se inicia na posição 0, subtrai 1.
		
		System.out.println();
		System.out.println("a mediana é o valor de "+vetor[z]);
		
	

	}

}
