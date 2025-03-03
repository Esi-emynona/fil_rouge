package entities.armee;

import entities.Personne;
import entities.grades.GMarine;

import java.util.Objects;

public /*abstract*/ class Militaire extends Personne {
    GMarine grade;
    private int matiricule;

    //CONSTRUCTEUR
    public Militaire(String nom, String prenom, GMarine grade, int matricule) {
        super(nom, prenom);
        this.grade = grade;
        this.matiricule = matricule;
    }

    //GETTERS
    public GMarine getGrade() {
        return grade;
    }
    public int getMatiricule() {
        return matiricule;
    }

    //SETTER
    public void setGrade(GMarine grade) {
        this.grade = grade;
    }
    private void setMatiricule(int matricule){
        this.matiricule = matricule;
    }

    //METHODES

    public void sePresenter() {
        System.out.println("Je suis le " + this.grade + " " + Militaire.super.getNom() + "  " + getPrenom());
    }

    //OVERRIDE & SURCHARGE
    @Override
    public String toString() {
        return "Militaire ->" + " " +
                "nom : " + super.getNom() + " | " +
                "prenom : " + super.getPrenom() + " | " +
                "grade : " + this.grade;
    }d

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom(), (Object) this.matiricule);
    }

    @Override
    public boolean equals(Object aComparer) {
        return this.hashCode() == aComparer.hashCode() && aComparer instanceof Militaire;
    }

}
