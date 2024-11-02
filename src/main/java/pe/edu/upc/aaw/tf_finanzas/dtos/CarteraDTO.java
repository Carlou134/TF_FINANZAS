package pe.edu.upc.aaw.tf_finanzas.dtos;

import pe.edu.upc.aaw.tf_finanzas.entities.Bancos;
import java.time.LocalDate;

public class CarteraDTO {
    private int id;
    private UserDTO usuarios;
    private Bancos bancos;
    private LocalDate fecha_descuento;
    private String moneda;
    private double total_valor_nominal;
    private double total_valor_descontado;
    private double total_descuento;
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

    public double getTotal_valor_descontado() {
        return total_valor_descontado;
    }

    public void setTotal_valor_descontado(double total_valor_descontado) {
        this.total_valor_descontado = total_valor_descontado;
    }

    public double getTotal_descuento() {
        return total_descuento;
    }

    public void setTotal_descuento(double total_descuento) {
        this.total_descuento = total_descuento;
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
