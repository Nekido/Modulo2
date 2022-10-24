public class Corrida {



    public static void main(String[] args) {


        Piloto piloto = new Piloto("cati",Genero.FEMININO,45,"VETERANOS");
        Carro ferrari = new Carro("Ztx",piloto,63,150,50,true);

        System.out.println(piloto);
        System.out.println(ferrari);
        ferrari.ligadoDesligado();
        ferrari.acelerar(42);
        ferrari.frear(92);
        ferrari.parar();
    }

    }

