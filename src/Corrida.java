public class Corrida {


    public static void main(String[] args) {


        Piloto piloto = new Piloto("cati", Genero.FEMININO, 45, "VETERANOS");
        Carro ferrari = new Carro("Ztx", piloto, 63, 150, 40, true);

        System.out.println(piloto);
        System.out.println(ferrari);
        ferrari.ligadoDesligado();
        ferrari.acelerar(100);
        System.out.println();
        ferrari.frear(140);
        System.out.println();
        ferrari.parar();
        ferrari.ligadoDesligado();
    }

}

