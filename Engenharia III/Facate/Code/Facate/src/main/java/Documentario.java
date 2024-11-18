public class Documentario {
    private String nome;
    private double duracao;
    private String narrador;

    public Documentario(String nome, double duracao, String narrador) {
        this.nome = nome;
        this.duracao = duracao;
        this.narrador = narrador;
    }

    public void play() {
        System.out.println("Reproduzindo documentário: " + nome + ", Narrador: " + narrador);
    }

    public void pause() {
        System.out.println("Documentário pausado: " + nome);
    }
}