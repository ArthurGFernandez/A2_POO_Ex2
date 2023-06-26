package program;

import entities.*;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Fabricante
        Fabricante fabricante = new Fabricante("Nissan", "Japão");

        // Criando o objeto Automovel
        Automovel automovel = new Automovel("Skyline", fabricante, 1957, 5, 18);

        // Criando o segundo fabricante e em seguida o segundo Automovel
        Fabricante fabricante2 = new Fabricante("Ford", "Estados Unidos");
        Automovel automovel2 = new Automovel("Mustang", fabricante, 2022, 2, 20);

        System.out.println("Exibindo informações dos automóveis, acelerando e abrindo porta malas: ");
        System.out.println(automovel);
        System.out.println(automovel.acelerar());
        System.out.println(automovel.abrirPortaMalas());
        System.out.println("////////////");
        System.out.println(automovel2);
        System.out.println(automovel2.acelerar());
        System.out.println(automovel2.abrirPortaMalas());

        System.out.println();
        System.out.println();


        //Criando 2 Fabricantes pra avião
        Fabricante fabricanteAviao = new Fabricante("Airbus", "França");
        Fabricante fabricanteAviao2 = new Fabricante("Boeing", "Estados Unidos");
        // Criando o objeto Aviao
        Aviao aviao1 = new Aviao("Airbus A380", fabricanteAviao, 2010, 500, 4);
        Aviao aviao2 = new Aviao("737", fabricanteAviao2, 2015, 200, 2);


        System.out.println("Exibindo informações dos aviões, acelerando, decolando e pousando: ");
        System.out.println(aviao1);
        // Acelerando o avião
        System.out.println(aviao1.acelerar());
        // Decolando o avião
        System.out.println(aviao1.decolar());
        // Pousando o avião
        System.out.println(aviao1.pousar());
        System.out.println("////////////");
        // Mesma coisa para o segundo avião.
        System.out.println(aviao2);
        System.out.println(aviao2.acelerar());
        System.out.println(aviao2.decolar());
        System.out.println(aviao2.pousar());


        System.out.println();
        System.out.println();
        // Criando 2 Fabricantes para os barcos
        Fabricante fabricanteBarco1 = new Fabricante("MarineXpress", "USA");
        Fabricante fabricanteBarco2 = new Fabricante("Brasilienze", "Brasil");

        // Criando os objetos Barco
        Barco barco1 = new Barco("Destroi Mares", fabricanteBarco1, 2010, 10, 3);
        Barco barco2 = new Barco("Caça Ondas", fabricanteBarco2, 2015, 5, 1);

        System.out.println("Exibindo informações dos barcos, acelerando, içando as velas e recolhendo as velas:");
        System.out.println(barco1);
        // Acelerando o barco
        System.out.println(barco1.acelerar());
        // Içando as velas do barco
        System.out.println(barco1.icarVelas());
        // Recolhendo as velas do barco
        System.out.println(barco1.recolherVelas());
        System.out.println("////////////");
        // Mesma coisa para o segundo barco.
        System.out.println(barco2.acelerar());
        System.out.println(barco2.icarVelas());
        System.out.println(barco2.recolherVelas());


    }
}