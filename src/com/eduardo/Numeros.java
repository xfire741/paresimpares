package com.eduardo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Numeros {




    public static void entrada() {
        Scanner teclado = new Scanner(System.in);
        String continuar = "S";
        ArrayList<Integer> lista = new ArrayList<>();

        adicionarNumero(lista);
        System.out.println("Deseja adicionar mais um número? S/N");
        continuar = teclado.nextLine();

        while(continuar.equals("s") || continuar.equals("S")){
            adicionarNumero(lista);
            System.out.println("Deseja adicionar mais um número? S/N");
            continuar = teclado.nextLine();
        }

        imprimir(lista);

    }

    public static void imprimir(ArrayList<Integer> lista) {

        ArrayList<Integer> listaPar = new ArrayList<>();
        ArrayList<Integer> listaImpar = new ArrayList<>();

        for (Integer numero : lista) {
            if (numero % 2 == 0) {
                listaPar.add(numero);

            } else {
                listaImpar.add(numero);
            }
        }
            Collections.sort(listaPar);
            Collections.reverse(listaPar);

            Collections.sort(listaImpar);
            Collections.reverse(listaImpar);

            System.out.println("Lista Par:");

            for (Integer numeroPar : listaPar) {
                System.out.println(numeroPar);
            }

            System.out.println("Lista Impar:");

            for (Integer numeroImpar : listaImpar) {
                System.out.println(numeroImpar);
            }


    }

    public static void adicionarNumero(ArrayList<Integer> lista) {

        int num;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número:");
        num = teclado.nextInt();

        if (num >= 0) {
            lista.add(num);
        } else {
            System.out.println("Somente números maiores que 0 podem ser adicionados");
        }

    }

}
