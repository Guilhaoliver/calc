package com.senac;

public class Main {

    public static void main(String[] args) {

        double num = 15;
        double num2 = 25;

        double multiplicacao = num * num2;
        double divisao = num / num2;
        double soma = num + num2;
        double subtracao = num - num2;

        double aoQuadradoNum = num * num;
        double aoQuadradoNum2 = num2 * num2;

        double trianguloBase = 25;
        double trianguloAltura = 6;
        double trianguloArea = trianguloAltura * trianguloBase;

        double quadradoLado = 4;
        double quadradoArea = quadradoLado * quadradoLado;

        double circuloRaio = 4;
        double circuloPi = 3.14;
        double circuloArea = circuloPi * circuloRaio;

        System.out.println("-------------------------------------");

        System.out.println(quadradoArea);
        System.out.println("-------------------------------------");


        System.out.println(trianguloArea);
        System.out.println("-------------------------------------");

        System.out.println(circuloArea);
        System.out.println("-------------------------------------");


        System.out.println();




    }
}
