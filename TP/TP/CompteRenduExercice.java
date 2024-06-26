package TP;

public class CompteRenduExercice extends CompteRendu {
    testExercice test;

    public CompteRenduExercice(testExercice test) {
        this.test = test;
    }

    public void afficherScore() {
        int i = 1;
        for (Exercice exercice : test.exo) {
            System.out.println("Le score obtenu dans l'exercie " + i + " est : " + exercice.score);// a remplacer dans
                                                                                                   // la GUI
        }
        System.out.println("Le score total obtenu est : " + test.score);// a remplacer dans la GUI
    }
}
