package fr.eni.zoo.bo;

public class Animal {
    private int id;
    private String nom;
    private boolean estFemelle;
    private TypeAnimal type;

    public Animal(int id, String nom, boolean estFemelle, TypeAnimal type) {
        this.id = id;
        this.nom = nom;
        this.estFemelle = estFemelle;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isEstFemelle() {
        return estFemelle;
    }

    public void setEstFemelle(boolean estFemelle) {
        this.estFemelle = estFemelle;
    }

    public TypeAnimal getType() {
        return type;
    }

    public void setType(TypeAnimal type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +" [" + "id=" + this.getId() + ", nom='" + this.getNom() + ", estFemelle=" + this.getType() +
                ", type=" + this.getType() + ']';
    }
}
