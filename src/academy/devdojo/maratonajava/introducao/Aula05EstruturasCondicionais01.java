package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    static void main(String[] args) {
        int idade = 10;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if(isAutorizadoComprarBebida) {
            System.out.println("Voce tem idade");
        }

        if(!isAutorizadoComprarBebida) { // '!' operador  de negação
            System.out.println("Voce não tem idade suficiente");
        }

        // OU:
        else {
            System.out.println("Voce não tem idade");
        }
    }
}
