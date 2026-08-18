package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    // Dado valor de um carro, descubr em quantas parcelas ele pode ser parcelado
    // Condiçoa: valorParcela >= 1000
    static void main() {
        double valorTotal = 30000;

        int parcela;
        for (parcela = (int) valorTotal; parcela >= 1; parcela--) {
           double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$" + valorParcela);
        }

    }
}