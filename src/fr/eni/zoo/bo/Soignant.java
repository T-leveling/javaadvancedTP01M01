package fr.eni.zoo.bo;

public class Soignant extends Salarie {
private TypeAnimal specialite;

    protected Soignant(int id, String nom, String prenom, double salaire, TypeAnimal specialite) {
        super(id, nom, prenom, salaire);
        this.specialite = specialite;
    }

    public TypeAnimal getSpecialite() {
        return specialite;
    }

    public void setSpecialite(TypeAnimal specialite) {
        this.specialite = specialite;
    }

    @Override
    public String toString() {
        return super.toString() + "[specialité=" + this.getSpecialite() + "]";
    }
}
