package br.com.alura.wanime.modelos;

public class Titulo {
    private String nome;
    private String descricao;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDeNotas;
    private int totalDeNotas;
    private int tempoEmMinutos;

    public int getTotalDeNotas (){
        return totalDeNotas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getTempoEmMinutos() {
        return tempoEmMinutos;
    }

    public void setTempoEmMinutos(int tempoEmMinutos) {
        this.tempoEmMinutos = tempoEmMinutos;
    }

    public void exibeFichaTecnica() {
        System.out.printf("Nome do anime: " + nome + " | Lançado no ano de: " + anoDeLancamento);
        System.out.printf("\nDescrição do anime: " + descricao);

    }

    public void avalie(double nota) {
        somaDeNotas += nota; totalDeNotas++;
    }

    public double retornaMedia(){
        return somaDeNotas / totalDeNotas;
    }
}
