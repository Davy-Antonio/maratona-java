package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    static void main() {
        // Doar se o salario for maior que 5000
        double salario = 6000;
        String msgDoar = "Vou doar";
        String msgNaoDoar = "Nao vou doar";
        String resultado = salario > 5000 ? msgDoar : msgNaoDoar; // Operador ternário

        System.out.println(resultado);

    }
}
