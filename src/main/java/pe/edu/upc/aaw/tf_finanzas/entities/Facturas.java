package pe.edu.upc.aaw.tf_finanzas.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "Facturas")
public class Facturas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "Cartera_id")
    private Cartera cartera;
    @Column(name = "Monto", nullable = false)
    private float Monto;
    @Column(name = "valor_nominal ", nullable = false)
    private float valor_nominal ;
    @Column(name = "fecha_vencimiento")
    private LocalDate fecha_vencimiento;
    @Column(name = "fecha_descuento ")
    private LocalDate fecha_descuento ;
    @Column(name = "tipo_moneda", length = 200, nullable = false)
    private String tipo_moneda;
    @ManyToOne
    @JoinColumn(name = "Tasas_id")
    private Tasas Tasas;

    public Facturas() {
    }

    public Facturas(int id, Cartera cartera, float monto, float valor_nominal, LocalDate fecha_vencimiento, LocalDate fecha_descuento, String tipo_moneda, pe.edu.upc.aaw.tf_finanzas.entities.Tasas tasas) {
        this.id = id;
        this.cartera = cartera;
        Monto = monto;
        this.valor_nominal = valor_nominal;
        this.fecha_vencimiento = fecha_vencimiento;
        this.fecha_descuento = fecha_descuento;
        this.tipo_moneda = tipo_moneda;
        Tasas = tasas;
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
