package academy.devdojo.maratonajava.introducao;
/*
    Pratica
    Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
    Eu <nome>, morando no <endereco>,
    confirmo que recebi o <salario> na data <data>
 */
public class Aula03TiposPrimitivosExercicio {
    static void main(String[] args) {
       var nome = "Davy";
       var endereco = "Rua Campos Teixeira";
       double salario = 10000;
       var data = "19/05/2026";

        System.out.println("Eu "+nome+", morando na "+endereco+", confirmo que recebi o "+salario+" na data "+data);
    }

}
