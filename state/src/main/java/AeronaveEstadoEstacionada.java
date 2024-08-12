public class AeronaveEstadoEstacionada extends AeronaveEstado {

    private AeronaveEstadoEstacionada() {};
    private static AeronaveEstadoEstacionada instance = new AeronaveEstadoEstacionada();
    public static AeronaveEstadoEstacionada getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Estacionado";
    }

    public boolean taxiar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        return true;
    }
}
