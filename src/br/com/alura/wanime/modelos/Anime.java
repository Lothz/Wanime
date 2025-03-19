public class Anime {

    String nome;
    String descricao;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDeNotas;
    private int totalDeNotas;
    int tempoEmMinutos;
    int totalEpisodios;

    int getTotalDeNotas (){
        return totalDeNotas;
    }

    void exibeFichaTecnica() {
        System.out.printf("Nome do anime: " + nome + " | Lançado no ano de: " + anoDeLancamento);
        System.out.printf("\nDescrição do anime: " + descricao);
        System.out.printf("\nQuantidade de episódios: " + totalEpisodios + "\n");

    }

    void avalie(double nota) {
        somaDeNotas += nota; totalDeNotas++;
    }

    double retornaMedia(){
        return somaDeNotas / totalDeNotas;
    }
}
