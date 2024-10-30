/*
Escreva um programa que leia a quantidade em segundos e imprima o resultado em dias, horas, minutos e segundos.
*/

import java.util.Scanner; // importar Scanner

public class Conversor{ // criar classe

    public static void main(String[] args){ // criar funcao main

        System.out.println("--- Conversor de Tempo ---");

        Scanner input = new Scanner(System.in); // instanciar objeto Scanner

        int seg = 0, min = 0, hrs = 0, dia = 0; // criar variaveis

        // coletar e armazenar entrada
        System.out.println("Entre com o numero de segundos: ");
        seg = input.nextInt();

        while (seg >= 60){ // converter segundos para minutos
            min += 1; // adiciona 1 min
            seg -= 60; // remove 60 seg
        }

        while (min >= 60){ // converter minutos para horas
            hrs += 1;
            min -= 60;
        }

        while (hrs >= 24){ // converter horas para dias
            dia += 1;
            hrs -= 24;
        }

        System.out.println("--- Resultado ---");
        System.out.printf("%d dia(s), %d hora(s), %d minuto(s) e %d segundo(s).", dia, hrs, min, seg);

    }
}