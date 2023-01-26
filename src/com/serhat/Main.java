package com.serhat;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {


        Pokemon pikachu = new Pokemon();
        Pokemon salameche = new Pokemon("Salamèche", Type.FEU, 10);
        Pokemon salameche2 = new Pokemon("Salamèche", Type.FEU, 10);

        System.out.println(pikachu);
        System.out.println(salameche);

        salameche.addNiveau();

        System.out.println(salameche.equals(salameche2));

        pikachu.setNom("Pikachu");
        System.out.println(pikachu);
        System.out.println(salameche.getNiveau());

        Dresseur p = new Dresseur();
        p.setNom("Serhat");

        pikachu.setNiveau(20);
        pikachu.setType(Type.ELECTRIQUE);
        List<Pokemon> pokemonList = Arrays.asList(pikachu, salameche, salameche2, pikachu);
        p.setPokemonList(pokemonList);

        List<Pokemon> collect = pokemonList.stream().filter(pokemon -> pokemon.getNiveau() > 5).collect(Collectors.toList());

        //Récupère la liste des types de facon distinct
        List<Type> collect2 = pokemonList.stream().map(pokemon -> pokemon.getType()).distinct().collect(Collectors.toList());

        System.out.println(collect);
        System.out.println(collect2);
    }
}