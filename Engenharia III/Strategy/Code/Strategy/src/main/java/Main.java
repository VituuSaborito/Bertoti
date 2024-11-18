public class Main {
    public static void main(String[] args) {
        Frete frete = new Frete();

        frete.setMetodoCalculo(new MetodoAmazon());
        frete.calcularFrete(5.0, 10.0);

        frete.setMetodoCalculo(new MetodoMercadoLivre());
        frete.calcularFrete(8.0, 20.0);
    }
}
