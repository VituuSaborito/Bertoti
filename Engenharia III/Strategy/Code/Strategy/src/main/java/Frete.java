public class Frete {
    private MetodoCalculo metodoCalculo;

    public void setMetodoCalculo(MetodoCalculo metodoCalculo) {
        this.metodoCalculo = metodoCalculo;
    }

    public void calcularFrete(double peso, double distancia) {
        if (metodoCalculo != null) {
            metodoCalculo.calculo(peso, distancia);
        } else {
            System.out.println("Nenhum método de cálculo definido.");
        }
    }
}