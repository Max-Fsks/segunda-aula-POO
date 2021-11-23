package POO;

public class Carro {

    String tipo;
    String cor;
    String placa;
    int numPortas;

    public Carro() {

    }

    public Carro(String tipo, String cor, String placa, int numPortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
    }

    void imprimeDadosCarro() {
        System.out.println("---------CARRO----------");
        System.out.println("Cor do carro: " + cor);
        System.out.println("Numero de portas: " + numPortas);
        System.out.println("Placa: " + placa);
        System.out.println("Modelo do carro: " + tipo);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

}
