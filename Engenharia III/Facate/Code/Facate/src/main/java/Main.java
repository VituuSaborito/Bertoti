public class Main {
    public static void main(String[] args) {
        Filme filme = new Filme("Inception", "Ficção Científica", 13);
        Serie serie = new Serie("Breaking Bad", 5, 14);
        Documentario documentario = new Documentario("Planeta Terra", 1.5, "David Attenborough");

        StreamingFacade streamingFacade = new StreamingFacade(filme, serie, documentario);

        // Utilizando a Facade
        filme.play();
        streamingFacade.avaliar("Filme", "Inception", 5);

        serie.play();
        streamingFacade.colocarNaLista("Série", "Breaking Bad");

        documentario.play();
        streamingFacade.avaliar("Documentário", "Planeta Terra", 4);
    }
}
