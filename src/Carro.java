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
        } else {
            System.out.println("Carro Ligado");
        }
        return true;
    }

    public float acelerar(float aceleracao) {
        if(ligado) {
            velocidadeAtual = getVelocidadeAtual() + aceleracao;

            if (velocidadeAtual > 150) {
                System.out.println("Velocidade máxima atingida");
            } else {
                System.out.println("Velocidade atual: " + velocidadeAtual + "Km/h");
            }
        }
        return velocidadeAtual;
    }
    public float frear(float desaceleracao) {
        if(ligado) {
            velocidadeAtual = getVelocidadeAtual() - desaceleracao;
            if (velocidadeAtual < 0) {
                System.out.println("você diminuiu a velocidade a zero, o carro parou");
            } else {
                System.out.println("Velocidade atual: " + velocidadeAtual + "Km/h");
            }
        }
        return velocidadeAtual;
    }
    public boolean parar(){
        if ( velocidadeAtual == 0){
            System.out.println("Carro parado");
        }
        return true;
    }

        @Override
        public String toString () {
            return "Carro{" +
                    "modelo='" + modelo + '\'' +
                    ", piloto=" + piloto +
                    ", numeroCarro=" + numeroCarro +
                    ", velocidadeMaxima=" + velocidadeMaxima +
                    ", velocidadeAtual=" + velocidadeAtual +
                    ", ligado=" + ligado +
                    '}';
        }


//
//
//        public float frear () {
//
//
//        }
//
//        public void boolean parar() {
//        if (velocidadeAtual <= 0) {
//            System.out.println("O carro está parado");
//        }
//        }


    }