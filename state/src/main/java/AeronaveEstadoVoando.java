public class AeronaveEstadoVoando extends AeronaveEstado {

    private AeronaveEstadoVoando() {};
    private static AeronaveEstadoVoando instance = new AeronaveEstadoVoando();
    public static AeronaveEstadoVoando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Voando";
    }

    public boolean pousar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoPousando.getInstance());
        return true;
    }
}
