package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    // Dado valor de um carro, descubr em quantas parcelas ele pode ser parcelado
    // Condiçoa: valorParcela >= 1000
    static void main() {
        double valorTotal = 30000;

        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela "+parcela+ " R$"+valorParcela);
            } else {
                break;
            }
        }
        }
    }

