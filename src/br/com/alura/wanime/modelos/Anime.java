package br.com.alura.wanime.modelos;

import java.util.ArrayList;
import java.util.List;

public class Anime extends Titulo {

    private boolean ativa;
    private int totalEpisodios;
    private int minutosPorEpisodio;


    @Override
    public int getTempoEmMinutos() {
        return totalEpisodios * minutosPorEpisodio;
    }

    public int getTotalEpisodios() {
        return totalEpisodios;
    }

    public void setTotalEpisodios(int totalEpisodios) {
        this.totalEpisodios = totalEpisodios;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    private List<Temporada> temporadas;

    public Anime() {
        this.temporadas = new ArrayList<>();
    }

    public void adicionarTemporada(Temporada temporada){
        temporadas.add(temporada);
    }

    public List<Temporada> getTemporadas(){
        return temporadas;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }
    }
