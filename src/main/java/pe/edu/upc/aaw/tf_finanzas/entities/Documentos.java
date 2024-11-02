package pe.edu.upc.aaw.tf_finanzas.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Documentos")
public class Documentos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "cartera_id")
    private Cartera cartera;
    @ManyToOne
    @JoinColumn(name = "deudor_id")
    private Deudores deudor;
    @Column(name = "tipo", length = 30, nullable = false)
    private String tipo;
    @Column(name = "numero_documento", length = 30, nullable = false)
    private String numero_documento;
    @Column(name = "valor_nominal")
    private double valor_nominal;
    @Column(name = "fecha_emision", nullable = false)
    private LocalDate fecha_emision;
    @Column(name = "fecha_vencimiento", nullable = false)
    private LocalDate fecha_vencimiento;
    @Column(name = "moneda", length = 30, nullable = false)
    private String moneda;
    @Column(name = "tasa_descuento")
    private double tasa_descuento;
    @Column(name = "tipo_tasa", length = 100, nullable = false)
    private String tipo_tasa;
    @Column(name = "dias_descuento")
    private int dias_descuento;
    @Column(name = "periodo_capitalizacion", length = 100, nullable = false)
    private String periodo_capitalizacion;
    @Column(name = "tasa_efectiva_calculada")
    private double tasa_efectiva_calculada;
    @Column(name = "portes")
    private double portes;
    @Column(name = "comision_estudios")
    private double comision_estudios;
    @Column(name = "comision_desembolso")
    private double comision_desembolso;
    @Column(name = "comision_cobranza")
    private double comision_cobranza;
    @Column(name = "igv")
    private double igv;
    @Column(name = "valor_neto")
    private double valor_neto;
    @Column(name = "estado", length = 30, nullable = false)
    private String estado;

    public Documentos() {
    }

    public Documentos(int id, Cartera cartera, Deudores deudor, String tipo, String numero_documento, double valor_nominal, LocalDate fecha_emision, LocalDate fecha_vencimiento, String moneda, double tasa_descuento, String tipo_tasa, int dias_descuento, String periodo_capitalizacion, double tasa_efectiva_calculada, double portes, double comision_estudios, double comision_desembolso, double comision_cobranza, double igv, double valor_neto, String estado) {
        this.id = id;
        this.cartera = cartera;
        this.deudor = deudor;
        this.tipo = tipo;
        this.numero_documento = numero_documento;
        this.valor_nominal = valor_nominal;
        this.fecha_emision = fecha_emision;
        this.fecha_vencimiento = fecha_vencimiento;
        this.moneda = moneda;
        this.tasa_descuento = tasa_descuento;
        this.tipo_tasa = tipo_tasa;
        this.dias_descuento = dias_descuento;
        this.periodo_capitalizacion = periodo_capitalizacion;
        this.tasa_efectiva_calculada = tasa_efectiva_calculada;
        this.portes = portes;
        this.comision_estudios = comision_estudios;
        this.comision_desembolso = comision_desembolso;
        this.comision_cobranza = comision_cobranza;
        this.igv = igv;
        this.valor_neto = valor_neto;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cartera getCartera() {
        return cartera;
    }

    public void setCartera(Cartera cartera) {
        this.cartera = cartera;
    }

    public Deudores getDeudor() {
        return deudor;
    }

    public void setDeudor(Deudores deudor) {
        this.deudor = deudor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public double getValor_nominal() {
        return valor_nominal;
    }

    public void setValor_nominal(double valor_nominal) {
        this.valor_nominal = valor_nominal;
    }

    public LocalDate getFecha_emision() {
        return fecha_emision;
    }

    public void setFecha_emision(LocalDate fecha_emision) {
        this.fecha_emision = fecha_emision;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public double getTasa_descuento() {
        return tasa_descuento;
    }

    public void setTasa_descuento(double tasa_descuento) {
        this.tasa_descuento = tasa_descuento;
    }

    public String getTipo_tasa() {
        return tipo_tasa;
    }

    public void setTipo_tasa(String tipo_tasa) {
        this.tipo_tasa = tipo_tasa;
    }

    public int getDias_descuento() {
        return dias_descuento;
    }

    public void setDias_descuento(int dias_descuento) {
        this.dias_descuento = dias_descuento;
    }

    public String getPeriodo_capitalizacion() {
        return periodo_capitalizacion;
    }

    public void setPeriodo_capitalizacion(String periodo_capitalizacion) {
        this.periodo_capitalizacion = periodo_capitalizacion;
    }

    public double getTasa_efectiva_calculada() {
        return tasa_efectiva_calculada;
    }

    public void setTasa_efectiva_calculada(double tasa_efectiva_calculada) {
        this.tasa_efectiva_calculada = tasa_efectiva_calculada;
    }

    public double getPortes() {
        return portes;
    }

    public void setPortes(double portes) {
        this.portes = portes;
    }

    public double getComision_estudios() {
        return comision_estudios;
    }

    public void setComision_estudios(double comision_estudios) {
        this.comision_estudios = comision_estudios;
    }

    public double getComision_desembolso() {
        return comision_desembolso;
    }

    public void setComision_desembolso(double comision_desembolso) {
        this.comision_desembolso = comision_desembolso;
    }

    public double getComision_cobranza() {
        return comision_cobranza;
    }

    public void setComision_cobranza(double comision_cobranza) {
        this.comision_cobranza = comision_cobranza;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getValor_neto() {
        return valor_neto;
    }

    public void setValor_neto(double valor_neto) {
        this.valor_neto = valor_neto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
