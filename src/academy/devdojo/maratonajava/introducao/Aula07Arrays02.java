package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    static void main() {
        // INICIALIZACAO DE VARIAVEIS
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Ana";
        nomes[1] = "Davy";
        nomes[2] = "Emilia";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
    }
}
