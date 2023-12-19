package fr.eni.zoo.bo;

public class Salarie {
    private int id;
    private String nom;
    private String prenom;
    private double salaire;

    protected Salarie(int id, String nom, String prenom, double salaire) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.salaire = salaire;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [id=" + this.getId() + ", nom= " + this.getNom() + ", prénom=" + this.getPrenom() + ", salaire=" + this.getSalaire() + "]";
    }
}
