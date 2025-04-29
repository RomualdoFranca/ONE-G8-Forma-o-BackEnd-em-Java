package trabalhandocomlistas.desafios03.animal;

public class Main {
    public static void main(String[] args) {
        // Objeto cachorro foi criado
        // A variável cachorro01 aponta para o objeto concreto do tipo Cachorro na memória
        //Tem acesso a todos os métodos e atributos de Cachorro e Animal
        Cachorro cachorro01 = new Cachorro("Canina", "Darwin", 8, "shih-tzu", "pequeno" );

        //animal (Tipo Animal)
        //Passa a referenciar o mesmo objeto que cachorro01 (não há criação de novo objeto).
        //Porém, a variável animal é do tipo Animal, então:
        //
        //Só enxerga métodos/atributos da classe Animal (mesmo que o objeto seja Cachorro).
        //
        //Métodos sobrescritos (@Override) ainda usam a implementação de Cachorro (polimorfismo).


        Animal animal =  cachorro01; //Upcasting implícito
        // devido ao casting o método chamado é o que estar sobrecristo na subclasse  Cachorro. Ocorre o Polimorfismo
        animal.animalComer();


        Animal animal1 = new Animal("Felino", "Gato", 12);
        // sem casting o método chamado é da superclasse Animal
        animal1.animalComer();

        if (animal instanceof Cachorro) {
            System.out.println("Verificando usando o 'instanceof' para evitar erro");
            // aqui, devido ao casting, o animal agora é um Cachorro. Por isso é possível chamar o método da subclasse
            ((Cachorro) animal).cahorroLatir();
        }

    }
}
