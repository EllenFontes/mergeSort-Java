package com.merge.mergesort.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    /*
    public static void main(String[] args) {
        int[] vetor = {8, 9, 17, 3, 44, 12, 5, 7}; // Vetor principal
        int[] vetorAuxiliar = new int[vetor.length]; // Vetor auxiliar

        mergeSort(vetor, vetorAuxiliar, 0, vetor.length - 1);

        System.out.printf("Vetor ordenado: %s", Arrays.toString(vetor));
    }
    */

    public static int[] mergeSort(int[]vetor, int[]vetorAuxiliar, int inicio, int fim) {
        int meio = 0;
        int[] lista = {0};
        if (inicio < fim) {

            // Realiza a divisão do vetor em grupos
            meio = (inicio + fim) / 2;
            mergeSort(vetor, vetorAuxiliar, inicio, meio); // Divide o grupo da esquerda
            mergeSort(vetor, vetorAuxiliar, meio + 1, fim); // Divide o grupo da direita
            lista = intercalar(vetor, vetorAuxiliar, inicio, meio, fim); // Responsável por intercalar  (unir e ordenar) os vetores

        }
        return lista;
    }

    private static int[] intercalar(int[] vetor, int[] vetorAuxiliar, int inicio, int meio, int fim) {
        // Popula o vetor auxiliar com os elementos do vetor principal
        for (int i = inicio; i <= fim; i++) {
            vetorAuxiliar[i] = vetor[i];
        }

        //
        int esquerda = inicio;
        int direita = meio + 1;

        //
        for (int i = inicio; i <= fim; i++) {
            if (esquerda > meio) {
                vetor[i] = vetorAuxiliar[direita++];

            } else if (direita > fim) {
                vetor[i] = vetorAuxiliar[esquerda++];

            } else if (vetorAuxiliar[esquerda] < vetorAuxiliar[direita]) {
                vetor[i] = vetorAuxiliar[esquerda++];

            } else {
                vetor[i] = vetorAuxiliar[direita++];
            }
        }

        return vetor;

    }
}
