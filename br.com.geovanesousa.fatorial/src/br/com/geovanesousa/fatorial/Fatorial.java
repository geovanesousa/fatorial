package br.com.geovanesousa.fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {
        /*
        5x4x3x2x1
        */
        Scanner leitorDoTeclado = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numeroDigitado = leitorDoTeclado.nextInt();
        int numeroDaDireita = numeroDigitado;
        int numeroDaEsquerda = numeroDigitado - 1;
        int fatorial = 1;
        while(numeroDaEsquerda>=1){
            fatorial = fatorial *(numeroDaDireita*numeroDaEsquerda);
            System.out.println("Valor de fatorial a cada iteração: "+fatorial);
            numeroDaDireita=numeroDaDireita-2;
            numeroDaEsquerda=numeroDaEsquerda-2;
        }
        System.out.println("Valor final de fatorial: "+fatorial);
    }
}
