package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {
    static void main() {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >= 18 categoria adulto
        int idade = 22;
        String categoria;

        if(idade < 15){
            categoria = "Categoria infantil";
        } else if(idade >= 15 && idade < 18){
            categoria = "Categoria juvenil";
        } else{
            categoria = "Categoria adulto";
        }
        System.out.println(categoria);
    }
}
