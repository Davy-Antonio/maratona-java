package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    static void main() {
      // while, do while, for
      int contador = 0;

      while (contador <= 10){
          System.out.println(contador);
          contador += 1;
      }
      contador = 0;
      do {
          System.out.println("dentro do do-while "+ ++contador); // DO WHILE EXECUTA PELO MENOS UMA VEZ MESMO A CONDICAO SENDO FALSE
      } while (contador < 10);

      for(int i = 0; i < 10; i++) {
          System.out.println("For "+i);
      }
    }
}
