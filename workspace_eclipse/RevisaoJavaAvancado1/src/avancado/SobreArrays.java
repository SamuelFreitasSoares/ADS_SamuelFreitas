package avancado;

/**
 * A classe SobreArrays demonstra o uso de arrays em Java para armazenar e iterar sobre objetos da classe Animal.
 */
public class SobreArrays {
    public static void main(String args[]) {
        Animal[] arrayDeAnimais = new Animal[4];

        arrayDeAnimais[0] = new Animal(1L, "Tartaruga");
        arrayDeAnimais[1] = new Animal(2L, "Coelho");
        arrayDeAnimais[2] = new Animal(3L, "Cachorro");
        arrayDeAnimais[3] = new Animal(4L, "Gato");

        // Itera sobre o array e imprime os nomes dos animais
        for (Animal animal : arrayDeAnimais) {
            System.out.println(animal.getNome());
        }
    }
}
