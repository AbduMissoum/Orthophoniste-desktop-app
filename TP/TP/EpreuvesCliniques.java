package TP;

import java.io.Serializable;
import java.util.ArrayList;

public class EpreuvesCliniques implements Serializable {
    ArrayList<Observation> observations;
    ArrayList<Test> tests;

    public EpreuvesCliniques(ArrayList<Observation> observations, ArrayList<Test> tests) {
        this.tests = tests;
        this.observations = observations;
    }

    public void AjouterObservation(Observation o) {
        observations.add(o);
    }

    public void AjouterTest(Test t) {
        tests.add(t);
    }

}
