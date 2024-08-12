public class AeronaveEstadoTaxiando extends AeronaveEstado {

    private AeronaveEstadoTaxiando() {};
    private static AeronaveEstadoTaxiando instance = new AeronaveEstadoTaxiando();
    public static AeronaveEstadoTaxiando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Taxiando";
    }

    public boolean estacionar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoEstacionada.getInstance());
        return true;
    }

    public boolean decolar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        return true;
    }
}
