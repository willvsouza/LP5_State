public class AeronaveEstadoArremetendo extends AeronaveEstado {

    private AeronaveEstadoArremetendo() {};
    private static AeronaveEstadoArremetendo instance = new AeronaveEstadoArremetendo();
    public static AeronaveEstadoArremetendo getInstance() {
        return instance;
    }

    public String getEstado() {
        return "Arremetendo";
    }

    public boolean voar(Aeronave aeronave) {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        return true;
    }
}
