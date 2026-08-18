package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao03 {
    // imprima os primeiros 25 numero de um dado valor. Por exemplo 50
    static void main() {
        for (int i = 0; i < 51; i++) {
            if(i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
