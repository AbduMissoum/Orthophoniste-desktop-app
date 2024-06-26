package TP;

import java.util.*;
import java.time.*;
import java.io.*;

public class Agenda implements Serializable {
    private List<Rdv> dateList;

    // Constructor
    public Agenda() {
        this.dateList = new ArrayList<>();
    }

    public void removeRdv(Rdv rdv) {

    }

    // Getters and Setters
    public List<Rdv> getDateList() {
        return dateList;
    }

    public void setDateList(List<Rdv> dateList) {
        this.dateList = dateList;
    }

    public boolean isDispo(Rdv newRdv) {
        int ajout = newRdv.getDuree();
        for (Rdv rdv : dateList) {
            if ((rdv.getDate().isBefore(newRdv.getDate())
                    && rdv.getDate().plusMinutes(rdv.getDuree()).isAfter(newRdv.getDate()))
                    || (newRdv.getDate().isBefore(rdv.getDate())
                            && newRdv.getDate().plusMinutes(ajout).isAfter(rdv.getDate()))
                    || (rdv.getDate().isEqual(newRdv.getDate())))
                return false;

        }
        dateList.add(newRdv);
        return true;

    }

}