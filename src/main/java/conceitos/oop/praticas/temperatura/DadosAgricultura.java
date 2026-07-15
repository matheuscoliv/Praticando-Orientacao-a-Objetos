package conceitos.oop.praticas.temperatura;

public class DadosAgricultura {
    private float temperatura;
    private String local;

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public void exibirInformacoes() {
        System.out.printf("Sensor no local: %s\nTemperatura: %.2f\n", local, temperatura);
    }

    public void alertar() {
        if(temperatura > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite");
        }
    }
}
