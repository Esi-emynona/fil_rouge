package entities.armee;

import entities.Personne;
import entities.grades.GMarine;
import entities.grades.Grades;

import java.util.Objects;

public /*abstract*/ class Militaire extends Personne {
    Grades grade;
    private int matiricule;

    //CONSTRUCTEUR
    public Militaire(String nom, String prenom, Grades grade, int matricule) {
        super(nom, prenom);
        this.grade = grade;
        this.matiricule = matricule;
    }
    public Militaire(String nom, String prenom, int matricule) {
        super(nom, prenom);
        this.matiricule = matricule;
    }

    //GETTERS
    public Grades getGrade() {
        return grade;
    }
    public int getMatiricule() {
        return matiricule;
    }

    //SETTER
    public void setGrade(Grades mGrade) {
        this.grade = mGrade;
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
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNom(), getPrenom(), (Object) this.matiricule);
    }

    @Override
    public boolean equals(Object aComparer) {
        return this.hashCode() == aComparer.hashCode() && aComparer instanceof Militaire;
    }

}
