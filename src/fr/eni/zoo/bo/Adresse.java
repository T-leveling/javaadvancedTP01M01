package fr.eni.zoo.bo;

public class Adresse {
    private int id;
    private int numero;
    private String rue;
    private String ville;
    private String codePostal;


    public Adresse(int id, String rue, String ville, String codePostal) {
        this.id = id;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public Adresse(int id, int numero, String rue, String ville, String codePostal) {
        this.id = id;
        this.numero = numero;
        this.rue = rue;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " [" +
                "id=" + this.getId() +
                ", numero=" + this.getNumero() +
                ", rue='" + this.getRue() + '\'' +
                ", ville='" + this.getVille() + '\'' +
                ", codePostal='" + this.getCodePostal() + '\'' +
                ']';
    }
}
