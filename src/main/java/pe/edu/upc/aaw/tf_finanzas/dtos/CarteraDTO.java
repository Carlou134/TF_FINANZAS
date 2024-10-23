package pe.edu.upc.aaw.tf_finanzas.dtos;

import java.util.Date;

public class CarteraDTO {
    private int id;
    private String nombre_cartera ;
    private Date fecha_descuento;

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
