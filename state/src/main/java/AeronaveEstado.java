public abstract class AeronaveEstado {


    public abstract String getEstado();

    public boolean taxiar (Aeronave aeronave) {
        return false;
    }

    public boolean decolar (Aeronave aeronave) {
        return false;
    }

    public boolean abortarDecolagem (Aeronave aeronave) {
        return false;
    }

    public boolean voar (Aeronave aeronave) {
        return false;
    }

    public boolean pousar (Aeronave aeronave) {
        return false;
    }

    public boolean arremeter (Aeronave aeronave) {
        return false;
    }

    public boolean estacionar (Aeronave aeronave) {
        return false;
    }
}
