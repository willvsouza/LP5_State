public class AeronaveEstadoDecolando extends AeronaveEstado {

    private AeronaveEstadoDecolando() {};
    private static AeronaveEstadoDecolando instance = new AeronaveEstadoDecolando();
    public static AeronaveEstadoDecolando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Decolando";
    }

    public boolean voar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        return true;
    }

    public boolean abortarDecolagem(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoAbortandoDecolagem.getInstance());
        return true;
    }
}
