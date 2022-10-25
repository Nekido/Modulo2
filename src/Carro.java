import java.util.Scanner;

public class Carro {
    private String modelo;
    private Piloto piloto;
    public int numeroCarro;
    public final float velocidadeMaxima;
    public float velocidadeAtual;
    public boolean ligado;

    Scanner sc = new Scanner(System.in);

    public Carro(String modelo, Piloto piloto, int numeroCarro, float velocidadeMaxima, float velocidadeAtual, boolean ligado) {
        this.modelo = modelo;
        this.piloto = piloto;
        this.numeroCarro = numeroCarro;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeAtual = velocidadeAtual;
        this.ligado = ligado;
    }

    public float getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(float velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public boolean ligadoDesligado() {
        if (velocidadeAtual <= 0) {
            ligado = false;
            System.out.println("Carro Desligado");
        } else if (velocidadeAtual > 0) {
            System.out.println("Carro Ligado");

        }
        return true;
    }

    public float acelerar(float aceleracao) {
        if (ligado) {
            float novaVelocidade = getVelocidadeAtual() + aceleracao;

            if (novaVelocidade > 150) {
                System.out.println("Velocidade máxima atingida");
                velocidadeAtual = novaVelocidade;
            } else {

                velocidadeAtual = novaVelocidade;
                System.out.println("Você acelerou, " + aceleracao + "km/h \n"
                        + "Sua velocidade agora é: " + velocidadeAtual + "Km/h");

            }
        }
        return velocidadeAtual;
    }

    public float frear(float desaceleracao) {
        if (ligado) {
            float novaVelocidade = getVelocidadeAtual() - desaceleracao;
            if (novaVelocidade < 0) {
                System.out.println("você diminuiu a velocidade a zero, o carro parou");
            } else {
                velocidadeAtual = novaVelocidade;
                System.out.println("Você optou por diminuir a velocidade em: " + desaceleracao + "km/h \n"
                        + "Velocidade atual: " + velocidadeAtual + "Km/h");
            }
        }
        return velocidadeAtual;
    }

    public boolean parar() {
        float novaVelocidade = getVelocidadeAtual();

        if (novaVelocidade <= 0) {
            System.out.println("Você parou o carro");

        }
        return true;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", piloto=" + piloto +
                ", numeroCarro=" + numeroCarro +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", velocidadeAtual=" + velocidadeAtual +
                ", ligado=" + ligado +
                '}';
    }

}