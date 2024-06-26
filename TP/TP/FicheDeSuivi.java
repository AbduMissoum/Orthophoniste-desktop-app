package TP;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FicheDeSuivi implements Serializable {
    private List<Objectif> objectifs;

    public FicheDeSuivi() {
        this.objectifs = new ArrayList<>();
    }

    public List<Objectif> getObjectifs() {
        return objectifs;
    }

    public void addObjectif(Objectif objectif) {
        this.objectifs.add(objectif);
    }
}
