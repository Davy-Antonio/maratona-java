package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    static void main(String[] args) {
        /*
         + - / *
         */
        int numero01 = 10;
        int numero02 = 20;
        int resultado = numero01 / numero02;
        //System.out.println(resultado);


        // % (resto)
        int resto = 23 % 2;
        //System.out.println(resto);

        // operadores lógicos
        // < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDeDez = 10 != 10;
        /*
        System.out.println("Dez é maior que vinte? "+isDezMaiorQueVinte);
        System.out.println("Dez é menor que vinte? "+isDezMenorQueVinte);
        System.out.println("Dez é igual a vinte? "+isDezIgualVinte);
        System.out.println("Dez é igual a dez? "+isDezIgualDez);
        System.out.println("Dez é diferente de dez? "+isDezDiferenteDeDez);
         */

        // operadores lógicos
        // && (AND) || (or) ! (not)
        /*
        int idade = 35;
        float salario = 3500F;
        boolean isDentroDaLei = idade > 30 && salario >= 4600;
        System.out.println(isDentroDaLei);
        */

        double contaCorrente = 200;
        double contaPoupanca = 1000;
        float valorPlayCinco = 5000F;
        boolean isPlayCincoCompravel = contaCorrente > valorPlayCinco || contaPoupanca > valorPlayCinco;
        System.out.println(isPlayCincoCompravel);

        // Atribuição
        int contador = 0;
        contador += 1; // contador = contador + 1
        System.out.println(contador);
    }
}
