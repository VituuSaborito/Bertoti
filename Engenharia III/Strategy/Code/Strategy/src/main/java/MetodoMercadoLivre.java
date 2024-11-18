public class MetodoMercadoLivre implements MetodoCalculo {
    @Override
    public void calculo(double peso, double distancia) {
        System.out.println("Cálculo de frete para Mercado Livre: Peso = " + peso + ", Distância = " + distancia);
    }
}