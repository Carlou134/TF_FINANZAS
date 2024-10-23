package pe.edu.upc.aaw.tf_finanzas.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "Tasas")
public class Tasas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tipo_tasa", length = 200, nullable = false)
    private String tipo_tasa;
    @Column(name = "valor_tasa", nullable = false)
    private float valor_tasa;
    @Column(name = "periodo_tasa", length = 200, nullable = false)
    private String periodo_tasa;

    public Tasas() {
    }

    public Tasas(int id, String tipo_tasa, float valor_tasa, String periodo_tasa) {
        this.id = id;
        this.tipo_tasa = tipo_tasa;
        this.valor_tasa = valor_tasa;
        this.periodo_tasa = periodo_tasa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_tasa() {
        return tipo_tasa;
    }

    public void setTipo_tasa(String tipo_tasa) {
        this.tipo_tasa = tipo_tasa;
    }

    public float getValor_tasa() {
        return valor_tasa;
    }

    public void setValor_tasa(float valor_tasa) {
        this.valor_tasa = valor_tasa;
    }

    public String getPeriodo_tasa() {
        return periodo_tasa;
    }

    public void setPeriodo_tasa(String periodo_tasa) {
        this.periodo_tasa = periodo_tasa;
    }
}
