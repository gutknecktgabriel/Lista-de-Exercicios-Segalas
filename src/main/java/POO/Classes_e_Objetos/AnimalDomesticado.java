package POO.Classes_e_Objetos;

import POO.Classes_e_Objetos.Cachorro;

public class AnimalDomesticado {
    public static void main(String[] args) {
        Cachorro cao = new Cachorro();
        String resp =  cao.andar(" ao norte");
        System.out.println(resp);
    }
}
