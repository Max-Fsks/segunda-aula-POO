package POO;

public class Principal {

    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.setCor("Vermelho");
        carro.setNumPortas(4);
        carro.setPlaca("Jnva-1563");
        carro.setTipo("Fusca");

        System.out.println("---------CARRO----------");
        System.out.println("Cor do carro: " + carro.getCor());
        System.out.println("Numero de portas: " + carro.getNumPortas());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Modelo do carro: " + carro.getTipo());

        Pessoa pessoa = new Pessoa();

        pessoa.setAltura(1.80);
        pessoa.setEtnia("Pardo");
        pessoa.setGenero("Masculino");
        pessoa.setIdade(22);
        pessoa.setPeso(77.80);
        pessoa.setNome("José");

        System.out.println("-------PESSOA-------");
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Altura: " + pessoa.getAltura());
        System.out.println("Genero: " + pessoa.getGenero());
        System.out.println("Idade: " + pessoa.getIdade());
        System.out.println("Peso: " + pessoa.getPeso());
    }
}
