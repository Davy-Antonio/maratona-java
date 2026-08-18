package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    static void main() {
        // calcular taxas com base no salario
        double salario = 70000;
        double primeiraTaxa = 9.70 / 100;
        double segundaTaxa = 37.35 / 100;
        double terceiraTaxa = 49.50 / 100;
        double valorImposto;

        if (salario <= 34712){
            valorImposto = salario * primeiraTaxa;
        } else if (salario >= 34713 && salario <= 68507){
            valorImposto = salario * segundaTaxa;
        } else {
            valorImposto = salario * terceiraTaxa;
        }
        System.out.println("Voce vai pagar de imposto: "+valorImposto);
    }
}
