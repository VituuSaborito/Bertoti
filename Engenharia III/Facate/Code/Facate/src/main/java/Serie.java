public class Serie {
    private String nome;
    private int temporada;
    private int episodio;

    public Serie(String nome, int temporada, int episodio) {
        this.nome = nome;
        this.temporada = temporada;
        this.episodio = episodio;
    }

    public void play() {
        System.out.println("Reproduzindo série: " + nome + ", Temporada: " + temporada + ", Episódio: " + episodio);
    }

    public void pause() {
        System.out.println("Série pausada: " + nome);
    }
}