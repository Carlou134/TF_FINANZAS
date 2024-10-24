package pe.edu.upc.aaw.tf_finanzas.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Reporte")
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "fecha_Reporte")
    private LocalDate fecha_Reporte;
    @Column(name = "tcea", nullable = false)
    private float tcea;
    @ManyToOne
    @JoinColumn(name = "Cartera_id")
    private Cartera cartera;

    public Reporte() {
    }

    public Reporte(int id, LocalDate fecha_Reporte, float tcea, Cartera cartera) {
        this.id = id;
        this.fecha_Reporte = fecha_Reporte;
        this.tcea = tcea;
        cartera = cartera;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getFecha_Reporte() {
        return fecha_Reporte;
    }

    public void setFecha_Reporte(LocalDate fecha_Reporte) {
        this.fecha_Reporte = fecha_Reporte;
    }

    public float getTcea() {
        return tcea;
    }

    public void setTcea(float tcea) {
        this.tcea = tcea;
    }

    public Cartera getCartera() {
        return cartera;
    }

    public void setCartera(Cartera cartera) {
        this.cartera = cartera;
    }
}
