package avancado;

import java.util.*;

/**
 * A classe SobreMap1 demonstra o uso da interface Map em Java para criar e manipular mapas de chave-valor.
 */
public class SobreMap1 {
    public static void main(String[] args) {
        Animal a1 = new Animal(1L, "Tartaruga");
        Animal a2 = new Animal(2L, "Coelho");
        Animal a3 = new Animal(3L, "Cachorro");
        Animal a4 = new Animal(4L, "Gato");
        Animal a5 = new Animal(5L, "Girafa");

        Map<String, Animal> mapaDeAnimais = new HashMap<>();

        mapaDeAnimais.put("TAR", a1);
        mapaDeAnimais.put("COE", a2);
        mapaDeAnimais.put("CAO", a3);
        mapaDeAnimais.put("GAT", a4);
        mapaDeAnimais.put("GIT", a5);

        System.out.println(mapaDeAnimais);

        Set<String> setDasChaves = mapaDeAnimais.keySet();
        System.out.println(setDasChaves);

        Collection<Animal> colecaoDeValores = mapaDeAnimais.values();
        System.out.println(colecaoDeValores);

        Set<Map.Entry<String, Animal>> entrySet = mapaDeAnimais.entrySet();
        for (Map.Entry<String, Animal> entry : entrySet) {
            System.out.println("Chave: " + entry.getKey());
            System.out.println("Valor: " + entry.getValue());
        }
    }
}
