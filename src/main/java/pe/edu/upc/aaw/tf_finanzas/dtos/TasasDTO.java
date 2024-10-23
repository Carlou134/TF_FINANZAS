package pe.edu.upc.aaw.tf_finanzas.dtos;

public class TasasDTO {
    private int id;
    private String tipo_tasa;
    private float valor_tasa;
    private String periodo_tasa;

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
