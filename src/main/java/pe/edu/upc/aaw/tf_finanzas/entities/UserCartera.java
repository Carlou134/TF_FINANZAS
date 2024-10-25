package pe.edu.upc.aaw.tf_finanzas.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "UserCartera")
public class UserCartera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "usercartera_id", nullable = false)
    private Users user;

    @ManyToOne
    @JoinColumn(name = "cartera_id", nullable = false)
    private Cartera cartera;

    public UserCartera() {
    }

    public UserCartera(int id, Users user, Cartera cartera) {
        this.id = id;
        this.user = user;
        this.cartera = cartera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Cartera getCartera() {
        return cartera;
    }

    public void setCartera(Cartera cartera) {
        this.cartera = cartera;
    }
}
