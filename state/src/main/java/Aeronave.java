public class Aeronave {

    private String codigo;
    private AeronaveEstado estado;

    public Aeronave() {
        this.estado = AeronaveEstadoEstacionada.getInstance();
    }

    public void setEstado(AeronaveEstado estado) {
        this.estado = estado;
    }

    public boolean taxiar() {
        return estado.taxiar(this);
    }

    public boolean decolar() {
        return estado.decolar(this);
    }

    public boolean abortarDecolagem() {
        return estado.abortarDecolagem(this);
    }

    public boolean voar() {
        return estado.voar(this);
    }

    public boolean pousar() {
        return estado.pousar(this);
    }

    public boolean arremeter() {
        return estado.arremeter(this);
    }

    public boolean estacionar() {
        return estado.estacionar(this);
    }

    public String getNomeEstado() {
        return estado.getEstado();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public AeronaveEstado getEstado() {
        return estado;
    }
}
