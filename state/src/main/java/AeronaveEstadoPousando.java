public class AeronaveEstadoPousando extends AeronaveEstado {

    private AeronaveEstadoPousando() {};
    private static AeronaveEstadoPousando instance = new AeronaveEstadoPousando();
    public static AeronaveEstadoPousando getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Pousando";
    }

    public boolean taxiar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        return true;
    }

    public boolean arremeter(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoArremetendo.getInstance());
        return true;
    }
}
