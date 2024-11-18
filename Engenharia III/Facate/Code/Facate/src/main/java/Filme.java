public class Filme {
    private String nome;
    private String genero;
    private int classificacaoEtaria;

    public Filme(String nome, String genero, int classificacaoEtaria) {
        this.nome = nome;
        this.genero = genero;
        this.classificacaoEtaria = classificacaoEtaria;
    }

    public void play() {
        System.out.println("Reproduzindo filme: " + nome);
    }

    public void pause() {
        System.out.println("Filme pausado: " + nome);
    }
}