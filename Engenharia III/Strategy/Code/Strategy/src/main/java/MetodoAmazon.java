public class MetodoAmazon implements MetodoCalculo {
    @Override
    public void calculo(double peso, double distancia) {
        System.out.println("Cálculo de frete para Amazon: Peso = " + peso + ", Distância = " + distancia);
    }
}