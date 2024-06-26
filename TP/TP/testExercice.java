package TP;
import java.util.ArrayList;

public class testExercice extends Test {
    protected ArrayList<Exercice> exo;
    public testExercice(){}
    public void AjouterExercice(Exercice e){
        exo.add(e);
    }
    public float calculerScore(){
       float moyenne=0; 
       for (Exercice exercice : exo) {
         moyenne+=exercice.score;
        }
        return (moyenne/exo.size());
    }
}
