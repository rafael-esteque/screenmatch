package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(9);
        Filme outroFilme = new Filme("AVatar", 2023);
        outroFilme.avalia(6);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filmeDoPaulo);
        lista.add(favorito);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            //uma formulação não muito elegante, mas que está em muitos códigos legados por aí:
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano: ");
        System.out.println(lista);

    }
}
