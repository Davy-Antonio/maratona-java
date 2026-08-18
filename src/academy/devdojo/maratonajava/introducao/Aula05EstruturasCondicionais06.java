package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais06 {
    static void main() {
        // Utilizando switch e dado os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 5;
/*        switch (dia){
            case 1:
                System.out.println("Final de semana (domingo)");
                break;
            case 2:
                System.out.println("Dia útil (segunda)");
                break;
            case 3:
                System.out.println("Dia útil (terça)");
                break;
            case 4:
                System.out.println("Dia útil (quarta)");
                break;
            case 5:
                System.out.println("Dia útil (quinta)");
                break;
            case 6:
                System.out.println("Dia útil (sexta)");
                break;
            case 7:
                System.out.println("Dia útil (sábado)");
                break;
        } */
        switch (dia){ // OUTRO MODO DE FAZER
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
        }
    }
}
