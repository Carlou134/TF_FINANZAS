package pe.edu.upc.aaw.tf_finanzas.dtos;

import pe.edu.upc.aaw.tf_finanzas.entities.Cartera;
import pe.edu.upc.aaw.tf_finanzas.entities.Tasas;

import java.time.LocalDate;

public class FacturasDTO {
    private int id;
    private Cartera cartera;
    private float Monto;
    private float valor_nominal ;
    private LocalDate fecha_vencimiento;
    private LocalDate fecha_descuento ;
    private String tipo_moneda;
    private Tasas Tasas;

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

    public float getMonto() {
        return Monto;
    }

    public void setMonto(float monto) {
        Monto = monto;
    }

    public float getValor_nominal() {
        return valor_nominal;
    }

    public void setValor_nominal(float valor_nominal) {
        this.valor_nominal = valor_nominal;
    }

    public LocalDate getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(LocalDate fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public LocalDate getFecha_descuento() {
        return fecha_descuento;
    }

    public void setFecha_descuento(LocalDate fecha_descuento) {
        this.fecha_descuento = fecha_descuento;
    }

    public String getTipo_moneda() {
        return tipo_moneda;
    }

    public void setTipo_moneda(String tipo_moneda) {
        this.tipo_moneda = tipo_moneda;
    }

    public pe.edu.upc.aaw.tf_finanzas.entities.Tasas getTasas() {
        return Tasas;
    }

    public void setTasas(pe.edu.upc.aaw.tf_finanzas.entities.Tasas tasas) {
        Tasas = tasas;
    }
}
