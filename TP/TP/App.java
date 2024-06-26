package TP;

import java.util.*;
import java.io.*;

public class App implements Serializable {
    private static final long serialVersionUID = 1L; // Ensure version control

    private List<Orthophoniste> orthophonistes;

    public App() {
        orthophonistes = new ArrayList<Orthophoniste>();
    }

    public Orthophoniste getOrthophoniste() {
        return orthophonistes.get(0);
    }

    public void addOrthophoniste(Orthophoniste o) {
        orthophonistes.add(o);
    }

    public void serialize() {
        try (ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
                new File("App.dat"))))) {
            out.writeObject(this);
            System.out.println("ortho have been serialized.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static App deserializeApp() {
        try (ObjectInputStream in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
                new File("App.dat"))))) {
            return ((App) in.readObject());
        } catch (FileNotFoundException e) {
            System.out.println("Users file not found. A new list will be created.");
            return new App();
        } catch (ClassNotFoundException | IOException e) {

            e.printStackTrace();
            return new App();
        }
    }

    // work as expected
    public boolean login(String username, String password) {

        for (Orthophoniste o : orthophonistes) {
            if (o.getMail().equals(username) && o.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }

}
