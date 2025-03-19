import br.com.alura.wanime.modelos.Anime;



public class Main {
    public static void main(String[] args) {

        Anime meuAnime = new Anime();

        meuAnime.setNome("Fooly Cooly (FLCL)");
        meuAnime.setAnoDeLancamento(2000);
        meuAnime.setDescricao("FLCL é uma série de anime em OVA, criado pelo diretor Kazuya Tsurumaki e produzido pela Gainax e Production I.G.");
        meuAnime.setTotalEpisodios(6);
        meuAnime.setMinutosPorEpisodio(20);

        meuAnime.exibeFichaTecnica();

        meuAnime.avalie(8);
        meuAnime.avalie(10);
        meuAnime.avalie(9.5);


        System.out.println("Total de avaliações são: " + meuAnime.getTotalDeNotas());
        System.out.println("Média das avaliações é: " + meuAnime.retornaMedia());
        System.out.println("Duração do anime é: " + meuAnime.getTempoEmMinutos() + " minutos");

    }
}
