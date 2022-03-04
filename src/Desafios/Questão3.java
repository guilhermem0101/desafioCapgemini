package Desafios;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Questão3 {
	public static void main (String[] args) {
		Scanner leia = new Scanner(System.in);
		ArrayList	lista	=	new	ArrayList();//lista para armazenar os caracteres
		int x=0;
		String texto;
		System.out.println("Digite algo: ");
		texto = leia.nextLine();
		String texto1= texto.replaceAll("\\s+",""); //remove os espaços da cadeia de caracteres
	
		 
		int tam_matriz = ((int)Math.ceil(Math.sqrt(texto1.length())));//tira a raiz quadrada do numero de caracters e aredonda para um inteiro para uma matriz
		
		
		char matriz[][]=  new char[tam_matriz][tam_matriz];
		
		for(int i=0;i<texto1.length(); i++) {
			//armazenaos caracteres em uma lista
			lista.add(texto1.charAt(i));
		}

        Collections.shuffle(lista);// faz o embaralhamento dos caracteres da lista

     
		
		for(int i=0;i<tam_matriz; i++){
			for(int j=0; j<tam_matriz; j++){
				
				try{					
					matriz[i][j] = (char) lista.get(x);
					x++;
				} catch	(IndexOutOfBoundsException e){} //nem sempre os espaçõs da matriz seram ocupados, então lancei um try/catch para o progrma ignorar os endereços não existentes da lista
				
			}
		}
		
		for(int i=0;i<tam_matriz; i++){
			System.out.println();
			for(int j=0; j<tam_matriz; j++){
				System.out.print(matriz[i][j]);
			}
		}
		
		
	}
}
