package pe.edu.upc.aaw.tf_finanzas.dtos;
import pe.edu.upc.aaw.tf_finanzas.entities.Cartera;

import java.time.LocalDate;

public class ReporteDTO {
    private int id;
    private LocalDate fecha_Reporte;
    private float tcea;
    private Cartera cartera;

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
