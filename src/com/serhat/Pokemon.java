package com.serhat;

import java.util.Objects;

public class Pokemon {

    private String nom;
    private Type type;
    private int niveau;

    public Pokemon() {}

    public Pokemon(String nom, Type type, int niveau) {
        this.nom = nom;
        this.type = type;
        this.niveau = niveau;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public int getNiveau() {
        return niveau;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void addNiveau() {
        if(niveau < 100) {
            addPlusUnNiveau();
        }
    }

    private void addPlusUnNiveau() {
        niveau++;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nom='" + nom + '\'' +
                ", type=" + type +
                ", niveau=" + niveau +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return niveau == pokemon.niveau && Objects.equals(nom, pokemon.nom) && type == pokemon.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, type, niveau);
    }
}
