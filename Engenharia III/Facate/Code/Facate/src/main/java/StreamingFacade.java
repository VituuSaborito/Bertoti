public class StreamingFacade {
    private Filme filme;
    private Serie serie;
    private Documentario documentario;

    public StreamingFacade(Filme filme, Serie serie, Documentario documentario) {
        this.filme = filme;
        this.serie = serie;
        this.documentario = documentario;
    }

    public void avaliar(String tipo, String nome, int estrelas) {
        System.out.println("Avaliação para " + tipo + " (" + nome + "): " + estrelas + " estrelas");
    }

    public void colocarNaLista(String tipo, String nome) {
        System.out.println(tipo + " (" + nome + ") adicionado à lista.");
    }
}