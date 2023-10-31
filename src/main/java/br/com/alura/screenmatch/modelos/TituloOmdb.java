package br.com.alura.screenmatch.modelos;

//essa é uma classe especial: por debaixo dos panos ela tem implementado um construtor padrão, os getters e setters, o toString, etc.
// É uma parada do próprio java (a partir do 14?), não precisa ter o Spring
public record TituloOmdb(String title, String year, String runtime) {
}
