package POO;

public class Principal {

    public static void main(String[] args) {

        Carro carro = new Carro("gol", "preto", "PSG-2503", 2);

        carro.imprimeDadosCarro();

        Pessoa pessoa = new Pessoa();

        pessoa.setAltura(1.80);
        pessoa.setEtnia("Pardo");
        pessoa.setGenero("Masculino");
        pessoa.setIdade(22);
        pessoa.setPeso(77.80);
        pessoa.setNome("José");

        pessoa.ImprimirDadosPessoas();

        /*double a = 3, b = 2;
        System.out.println("Quadrado de " + a + " é: " + Calculo.elevar(a, b));

        System.out.println("Quadrado de " + a + " é: " + Calculo.elevar(a));*/
        Carro outroCarro = new Carro();
        outroCarro.setCor("preto");
        outroCarro.setNumPortas(4);
        outroCarro.setPlaca("PPA-7264");
        outroCarro.setTipo("fusca");

        outroCarro.imprimeDadosCarro();
    }
}
