package TP;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;

public class Rdv implements Serializable {
    protected String observation;
    protected LocalDateTime date;

    public void setObservation(String observation) {
        this.observation = observation;

    }

    public String getObservation() {
        return observation;
    }

    public LocalDateTime getDate() {
        return this.date;
    }

    public int getDuree() {
        return 1;
    }

    // Getters and Setters
}
