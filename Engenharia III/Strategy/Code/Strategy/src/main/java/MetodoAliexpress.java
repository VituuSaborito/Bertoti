public class MetodoAliexpress implements MetodoCalculo {
    @Override
    public void calculo(double peso, double distancia) {
        System.out.println("Cálculo de frete para Aliexpress: Peso = " + peso + ", Distância = " + distancia);
    }
}