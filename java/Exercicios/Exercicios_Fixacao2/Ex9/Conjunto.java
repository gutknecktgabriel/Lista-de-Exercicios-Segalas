
package Exercicios.Exercicios_Fixacao2.Ex9;

import java.util.ArrayList;
import java.util.List;

public class Conjunto {
    private List<String> conjunto;

    public Conjunto() {
        this.conjunto = new ArrayList<>();
    }

    public void adicionar(String elemento) {
        if (!conjunto.contains(elemento)) {
            conjunto.add(elemento);
        } else {
            System.out.println("O elemento já existe no conjunto");
        }
    }

    public boolean verificarExistencia(String elemento) {
        return conjunto.contains(elemento);
    }

    public Conjunto uniao(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (String elemento : this.conjunto) {
            resultado.adicionar(elemento);
        }
        for (String elemento : outro.conjunto) {
            resultado.adicionar(elemento);
        }
        return resultado;
    }

    public Conjunto inter(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (String elemento : this.conjunto) {
            if (outro.verificarExistencia(elemento)) {
                resultado.adicionar(elemento);
            }
        }
        return resultado;
    }

    public Conjunto menos(Conjunto outro) {
        Conjunto resultado = new Conjunto();
        for (String elemento : this.conjunto) {
            if (!outro.verificarExistencia(elemento)) {
                resultado.adicionar(elemento);
            }
        }
        return resultado;
    }

    public void exibir() {
        System.out.println(conjunto);
    }
}