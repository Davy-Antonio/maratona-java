package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    static void main() {
//        int[] numeros = new int[3]; jeitos diferentes de inicializar um array
//        int[] numeros2 = {1,2,3,4,5}; jeitos diferentes de inicializar um array
        int[] numeros3 = new int[]{1,2,3,4,5}; // jeitos diferentes de inicializar um array

//        for (int i = 0; i < numeros3.length; i++) {
//            System.out.println(numeros3[i]);
//        }
        for (int num:numeros3){
            System.out.println(num);
        }
    }
}
