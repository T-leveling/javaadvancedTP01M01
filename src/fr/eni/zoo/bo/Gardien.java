package fr.eni.zoo.bo;

public class Gardien extends Salarie {

    private boolean gardienDeNuit;
    public Gardien(int id, String nom, String prenom, double salaire, boolean gardienDeNuit) {
        super(id, nom, prenom, salaire);
        this.gardienDeNuit = gardienDeNuit;
    }

    public boolean isGardienDeNuit() {
        return gardienDeNuit;
    }

    public void setGardienDeNuit(boolean gardienDeNuit) {
        this.gardienDeNuit = gardienDeNuit;
    }

    @Override
    public String toString() {
        return super.toString() + "[" + "gardienDeNuit=" + this.gardienDeNuit + "]";
    }
}
