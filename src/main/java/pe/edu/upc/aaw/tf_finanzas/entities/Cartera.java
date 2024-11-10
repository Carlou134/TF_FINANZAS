package pe.edu.upc.aaw.tf_finanzas.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Cartera")
public class Cartera {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Users usuarios;
    @ManyToOne
    @JoinColumn(name = "banco_id")
    private Bancos bancos;
    @Column(name = "fecha_descuento", nullable = false)
    private LocalDate fecha_descuento;
    @Column(name = "moneda", length = 15, nullable = false)
    private String moneda;
    @Column(name = "total_valor_neto")
    private double total_valor_neto;
    @Column(name = "total_valor_neto_convertido")
    private double total_valor_neto_convertido;
    @Column(name = "tcea")
    private double tcea;
    @Column(name = "estado", length = 20, nullable = false)
    private String estado;

    public Cartera() {
    }

    public Cartera(int id, Users usuarios, Bancos bancos, LocalDate fecha_descuento, String moneda, double total_valor_neto, double total_valor_neto_convertido, double tcea, String estado) {
        this.id = id;
        this.usuarios = usuarios;
        this.bancos = bancos;
        this.fecha_descuento = fecha_descuento;
        this.moneda = moneda;
        this.total_valor_neto = total_valor_neto;
        this.total_valor_neto_convertido = total_valor_neto_convertido;
        this.tcea = tcea;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Users getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Users usuarios) {
        this.usuarios = usuarios;
    }

    public Bancos getBancos() {
        return bancos;
    }

    public void setBancos(Bancos bancos) {
        this.bancos = bancos;
    }

    public LocalDate getFecha_descuento() {
        return fecha_descuento;
    }

    public void setFecha_descuento(LocalDate fecha_descuento) {
        this.fecha_descuento = fecha_descuento;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getTotal_valor_neto() {
        return total_valor_neto;
    }

    public void setTotal_valor_neto(double total_valor_neto) {
        this.total_valor_neto = total_valor_neto;
    }

    public double getTotal_valor_neto_convertido() {
        return total_valor_neto_convertido;
    }

    public void setTotal_valor_neto_convertido(double total_valor_neto_convertido) {
        this.total_valor_neto_convertido = total_valor_neto_convertido;
    }

    public double getTcea() {
        return tcea;
    }

    public void setTcea(double tcea) {
        this.tcea = tcea;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
