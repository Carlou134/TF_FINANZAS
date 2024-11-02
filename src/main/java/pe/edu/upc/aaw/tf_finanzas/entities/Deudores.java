package pe.edu.upc.aaw.tf_finanzas.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Deudores")
public class Deudores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tipo_documento", length = 30, nullable = false)
    private String tipo_documento;
    @Column(name = "numero_documento", length = 20, nullable = false)
    private String numero_documento;
    @Column(name = "razon_social", length = 11, nullable = false)
    private String razon_social;
    @Column(name = "direccion", length = 200, nullable = false)
    private String direccion;

    public Deudores() {
    }

    public Deudores(int id, String tipo_documento, String numero_documento, String razon_social, String direccion) {
        this.id = id;
        this.tipo_documento = tipo_documento;
        this.numero_documento = numero_documento;
        this.razon_social = razon_social;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_documento() {
        return tipo_documento;
    }

    public void setTipo_documento(String tipo_documento) {
        this.tipo_documento = tipo_documento;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getRazon_social() {
        return razon_social;
    }

    public void setRazon_social(String razon_social) {
        this.razon_social = razon_social;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
