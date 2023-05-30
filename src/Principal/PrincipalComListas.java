package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import modelos.Filme;
import modelos.Serie;
import modelos.Titulo;

public class PrincipalComListas {

    public static void main(String[] args) {
        
        Filme meuFilme = new Filme("o poderoso chefão", 1970);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar", 2006);
        meuFilme.avalia(6);
        var filmeDoPaulo = new Filme("DogVille", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);


        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);

        for (Titulo item : lista) {
            System.out.println(item.getNome());

            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
            System.out.println("Classificação " + filme.getClassificacao());
    
            }
        }

        ArrayList<String> buscarPorArtistas = new ArrayList<>();
        buscarPorArtistas.add("Adam Sandler");
        buscarPorArtistas.add("Paulo");
        buscarPorArtistas.add("Jacqueline");

        System.out.println(buscarPorArtistas);
    
        Collections.sort(buscarPorArtistas);
        System.out.println("Depois da ordenação");
        System.out.println(buscarPorArtistas);
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);
    }
    
}
