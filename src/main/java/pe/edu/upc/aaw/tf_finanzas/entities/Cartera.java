package pe.edu.upc.aaw.tf_finanzas.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "Cartera")
public class Cartera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nombre_cartera", length = 200, nullable = false)
    private String nombre_cartera ;
    @Column(name = "fecha_descuento", nullable = false)
    private Date fecha_descuento;

    public Cartera() {
    }

    public Cartera(int id, String nombre_cartera, Date fecha_descuento) {
        this.id = id;
        this.nombre_cartera = nombre_cartera;
        this.fecha_descuento = fecha_descuento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_cartera() {
        return nombre_cartera;
    }

    public void setNombre_cartera(String nombre_cartera) {
        this.nombre_cartera = nombre_cartera;
    }

    public Date getFecha_descuento() {
        return fecha_descuento;
    }

    public void setFecha_descuento(Date fecha_descuento) {
        this.fecha_descuento = fecha_descuento;
    }
}
