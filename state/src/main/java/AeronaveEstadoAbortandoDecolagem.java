public class AeronaveEstadoAbortandoDecolagem extends AeronaveEstado{

    private AeronaveEstadoAbortandoDecolagem() {};
    private static AeronaveEstadoAbortandoDecolagem instance = new AeronaveEstadoAbortandoDecolagem();
    public static AeronaveEstadoAbortandoDecolagem getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Abortando decolagem";
    }

    public boolean taxiar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        return true;
    }
}
