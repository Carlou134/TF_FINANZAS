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
    @Column(name = "total_valor_nominal")
    private double total_valor_nominal;
    @Column(name = "total_valor_portes")
    private double total_valor_portes;
    @Column(name = "total_comision_estudios")
    private double total_comision_estudios;
    @Column(name = "total_desembolso_cobranza")
    private double total_desembolso_cobranza;
    @Column(name = "total_igv")
    private double total_igv;
    @Column(name = "total_valor_neto")
    private double total_valor_neto;
    @Column(name = "tcea")
    private double tcea;
    @Column(name = "dias_promedio")
    private int dias_promedio;
    @Column(name = "estado", length = 20, nullable = false)
    private String estado;

    public Cartera() {
    }

    public Cartera(int id, Users usuarios, Bancos bancos, LocalDate fecha_descuento, String moneda, double total_valor_nominal, double total_valor_portes, double total_comision_estudios, double total_desembolso_cobranza, double total_igv, double total_valor_neto, double tcea, int dias_promedio, String estado) {
        this.id = id;
        this.usuarios = usuarios;
        this.bancos = bancos;
        this.fecha_descuento = fecha_descuento;
        this.moneda = moneda;
        this.total_valor_nominal = total_valor_nominal;
        this.total_valor_portes = total_valor_portes;
        this.total_comision_estudios = total_comision_estudios;
        this.total_desembolso_cobranza = total_desembolso_cobranza;
        this.total_igv = total_igv;
        this.total_valor_neto = total_valor_neto;
        this.tcea = tcea;
        this.dias_promedio = dias_promedio;
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

    public double getTotal_valor_nominal() {
        return total_valor_nominal;
    }

    public void setTotal_valor_nominal(double total_valor_nominal) {
        this.total_valor_nominal = total_valor_nominal;
    }

    public double getTotal_valor_portes() {
        return total_valor_portes;
    }

    public void setTotal_valor_portes(double total_valor_portes) {
        this.total_valor_portes = total_valor_portes;
    }

    public double getTotal_comision_estudios() {
        return total_comision_estudios;
    }

    public void setTotal_comision_estudios(double total_comision_estudios) {
        this.total_comision_estudios = total_comision_estudios;
    }

    public double getTotal_desembolso_cobranza() {
        return total_desembolso_cobranza;
    }

    public void setTotal_desembolso_cobranza(double total_desembolso_cobranza) {
        this.total_desembolso_cobranza = total_desembolso_cobranza;
    }

    public double getTotal_igv() {
        return total_igv;
    }

    public void setTotal_igv(double total_igv) {
        this.total_igv = total_igv;
    }

    public double getTotal_valor_neto() {
        return total_valor_neto;
    }

    public void setTotal_valor_neto(double total_valor_neto) {
        this.total_valor_neto = total_valor_neto;
    }

    public double getTcea() {
        return tcea;
    }

    public void setTcea(double tcea) {
        this.tcea = tcea;
    }

    public int getDias_promedio() {
        return dias_promedio;
    }

    public void setDias_promedio(int dias_promedio) {
        this.dias_promedio = dias_promedio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
