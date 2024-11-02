package pe.edu.upc.aaw.tf_finanzas.dtos;

import pe.edu.upc.aaw.tf_finanzas.entities.Bancos;
import pe.edu.upc.aaw.tf_finanzas.entities.Users;

import java.time.LocalDate;

public class CarteraDTO {
    private int id;
    private UserDTO usuarios;
    private Bancos bancos;
    private LocalDate fecha_descuento;
    private String moneda;
    private double total_valor_nominal;
    private double total_valor_portes;
    private double total_comision_estudios;
    private double total_desembolso_cobranza;
    private double total_igv;
    private double total_valor_neto;
    private double tcea;
    private int dias_promedio;
    private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserDTO getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(UserDTO usuarios) {
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
