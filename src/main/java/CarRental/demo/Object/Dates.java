package CarRental.demo.Object;

import javax.persistence.Embeddable;

@Embeddable
public class Dates {

    String date_debut;
    String date_fin;

    public Dates() {
    }

    public Dates(String date_debut, String date_fin) {
        this.date_debut = date_debut;
        this.date_fin = date_fin;
    }

    public String getDate_debut() {
        return this.date_debut;
    }

    public void setDate_debut(String date_debut) {
        this.date_debut = date_debut;
    }

    public String getDate_fin() {
        return this.date_fin;
    }

    public void setDate_fin(String date_fin) {
        this.date_fin = date_fin;
    }

    @Override
    public String toString() {
        return date_debut+" au "+date_fin ;
    }
}