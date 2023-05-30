package Principal;

import java.util.ArrayList;

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


        ArrayList<Titulo> lista = new ArrayList<>();
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
    }
    
}
