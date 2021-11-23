package POO;

public class Principal {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setCor("Vermelho");
        carro.setNumPortas(4);
        carro.setPlaca("Jnva-1563");
        carro.setTipo("Fusca");

        carro.imprimeDadosCarro();

        Pessoa pessoa = new Pessoa();

        pessoa.setAltura(1.80);
        pessoa.setEtnia("Pardo");
        pessoa.setGenero("Masculino");
        pessoa.setIdade(22);
        pessoa.setPeso(77.80);
        pessoa.setNome("José");

        pessoa.ImprimirDadosPessoas();
        
        double a=3,b=2;
        System.out.println("Quadrado de "+a+" é: "+Calculo.elevar(a, b));
        
        System.out.println("Quadrado de "+a+" é: "+Calculo.elevar(a));
    }
}
