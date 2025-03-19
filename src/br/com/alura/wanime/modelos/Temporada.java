package br.com.alura.wanime.modelos;

public class Temporada {
    private int numero;
    private int quantidadeEpisodios;

    public Temporada (int numero, int quantidadeEpisodios){
        this.numero = numero;
        this.quantidadeEpisodios = quantidadeEpisodios;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getQuantidadeEpisodios() {
        return quantidadeEpisodios;
    }

    public void setQuantidadeEpisodios(int quantidadeEpisodios) {
        this.quantidadeEpisodios = quantidadeEpisodios;



    }
}
