import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AeronaveTeste {

    Aeronave aeronave;

    @BeforeEach
    public void setUp() {
        aeronave = new Aeronave();
    }

    // AERONAVE ESTACIONADA

    @Test
    public void naoDeveEstacionarAeronaveEstacionada() {
        aeronave.setEstado(AeronaveEstadoEstacionada.getInstance());
        assertFalse(aeronave.estacionar());
    }

    @Test
    public void deveTaxiarAeronaveEstacionada() {
        aeronave.setEstado(AeronaveEstadoEstacionada.getInstance());
        assertTrue(aeronave.taxiar());
        assertEquals(AeronaveEstadoTaxiando.getInstance(), aeronave.getEstado());
    }

    @Test
    public void naoDeveDecolarAeronaveEstacionada() {
        aeronave.setEstado(AeronaveEstadoEstacionada.getInstance());
        assertFalse(aeronave.decolar());
    }

    @Test
    public void naoDeveAbortarDecolagemAeronaveEstacionada() {
        aeronave.setEstado(AeronaveEstadoEstacionada.getInstance());
        assertFalse(aeronave.abortarDecolagem());
    }

    @Test
    public void naoDeveVoarAeronaveEstacionada() {
        aeronave.setEstado(AeronaveEstadoEstacionada.getInstance());
        assertFalse(aeronave.voar());
    }

    @Test
    public void naoDevePousarAeronaveEstacionada() {
        aeronave.setEstado(AeronaveEstadoEstacionada.getInstance());
        assertFalse(aeronave.pousar());
    }

    @Test
    public void naoDeveArremeterAeronaveEstacionada() {
        aeronave.setEstado(AeronaveEstadoEstacionada.getInstance());
        assertFalse(aeronave.arremeter());
    }


    // AERONAVE TAXIANDO

    @Test
    public void naoDeveTaxiarAeronaveTaxiando() {
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        assertFalse(aeronave.taxiar());
    }

    @Test
    public void deveDecolarAeronaveTaxiando() {
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        assertTrue(aeronave.decolar());
        assertEquals(AeronaveEstadoDecolando.getInstance(), aeronave.getEstado());
    }

    @Test
    public void naoDeveAbortarDecolagemAeronaveTaxiando() {
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        assertFalse(aeronave.abortarDecolagem());
    }

    @Test
    public void naoDeveVoarAeronaveTaxiando() {
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        assertFalse(aeronave.voar());
    }

    @Test
    public void naoDevePousarAeronaveTaxiando() {
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        assertFalse(aeronave.pousar());
    }

    @Test
    public void naoDeveArremeterAeronaveTaxiando() {
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        assertFalse(aeronave.arremeter());
    }

    @Test
    public void deveEstacionarAeronaveTaxiando() {
        aeronave.setEstado(AeronaveEstadoTaxiando.getInstance());
        assertTrue(aeronave.estacionar());
        assertEquals(AeronaveEstadoEstacionada.getInstance(), aeronave.getEstado());
    }


    // AERONAVE DECOLANDO

    @Test
    public void naoDeveDecolarAeronaveDecolando() {
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        assertFalse(aeronave.decolar());
    }

    @Test
    public void naoDeveTaxiarAeronaveDecolando() {
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        assertFalse(aeronave.taxiar());
    }


    @Test
    public void deveAbortarDecolagemAeronaveDecolando() {
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        assertTrue(aeronave.abortarDecolagem());
        assertEquals(AeronaveEstadoAbortandoDecolagem.getInstance(), aeronave.getEstado());
    }

    @Test
    public void deveVoarAeronaveDecolando() {
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        assertTrue(aeronave.voar());
        assertEquals(AeronaveEstadoVoando.getInstance(), aeronave.getEstado());
    }

    @Test
    public void naoDevePousarAeronaveDecolando() {
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        assertFalse(aeronave.pousar());
    }

    @Test
    public void naoDeveArremeterAeronaveDecolando() {
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        assertFalse(aeronave.arremeter());
    }

    @Test
    public void naoDeveEstacionarAeronaveDecolando() {
        aeronave.setEstado(AeronaveEstadoDecolando.getInstance());
        assertFalse(aeronave.estacionar());
    }


    // AERONAVE ABORTANDO DECOLAGEM

    @Test
    public void naoDeveAbortarDecolagemAeronaveAbortandoDecolagem() {
        aeronave.setEstado(AeronaveEstadoAbortandoDecolagem.getInstance());
        assertFalse(aeronave.abortarDecolagem());
    }

    @Test
    public void deveTaxiarAeronaveAbortandoDecolagem() {
        aeronave.setEstado(AeronaveEstadoAbortandoDecolagem.getInstance());
        assertTrue(aeronave.taxiar());
        assertEquals(AeronaveEstadoTaxiando.getInstance(), aeronave.getEstado());
    }

    @Test
    public void naoDeveDecolarAeronaveAbortandoDecolagem() {
        aeronave.setEstado(AeronaveEstadoAbortandoDecolagem.getInstance());
        assertFalse(aeronave.decolar());
    }

    @Test
    public void naoDeveVoarAeronaveAbortandoDecolagem() {
        aeronave.setEstado(AeronaveEstadoAbortandoDecolagem.getInstance());
        assertFalse(aeronave.voar());
    }

    @Test
    public void naoDevePousarAeronaveAbortandoDecolagem() {
        aeronave.setEstado(AeronaveEstadoAbortandoDecolagem.getInstance());
        assertFalse(aeronave.pousar());
    }

    @Test
    public void naoDeveArremeterAeronaveAbortandoDecolagem() {
        aeronave.setEstado(AeronaveEstadoAbortandoDecolagem.getInstance());
        assertFalse(aeronave.arremeter());
    }

    @Test
    public void naoDeveEstacionarAeronaveAbortandoDecolagem() {
        aeronave.setEstado(AeronaveEstadoAbortandoDecolagem.getInstance());
        assertFalse(aeronave.estacionar());
    }


    // AERONAVE VOANDO

    @Test
    public void naoDeveVoarAeronaveVoando() {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        assertFalse(aeronave.voar());
    }

    @Test
    public void naoDeveTaxiarAeronaveVoando() {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        assertFalse(aeronave.taxiar());
    }

    @Test
    public void naoDeveDecolarAeronaveVoando() {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        assertFalse(aeronave.decolar());
    }

    @Test
    public void naoDeveAbortarDecolagemAeronaveVoando() {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        assertFalse(aeronave.abortarDecolagem());
    }

    @Test
    public void devePousarAeronaveVoando() {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        assertTrue(aeronave.pousar());
        assertEquals(AeronaveEstadoPousando.getInstance(), aeronave.getEstado());
    }

    @Test
    public void naoDeveArremeterAeronaveVoando() {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        assertFalse(aeronave.arremeter());
    }

    @Test
    public void naoDeveEstacionarAeronaveVoando() {
        aeronave.setEstado(AeronaveEstadoVoando.getInstance());
        assertFalse(aeronave.estacionar());
    }


    // AERONAVE POUSANDO

    @Test
    public void naoDevePousarAeronavePousando() {
        aeronave.setEstado(AeronaveEstadoPousando.getInstance());
        assertFalse(aeronave.pousar());
    }

    @Test
    public void deveTaxiarAeronavePousando() {
        aeronave.setEstado(AeronaveEstadoPousando.getInstance());
        assertTrue(aeronave.taxiar());
        assertEquals(AeronaveEstadoTaxiando.getInstance(), aeronave.getEstado());
    }

    @Test
    public void naoDeveDecolarAeronavePousando() {
        aeronave.setEstado(AeronaveEstadoPousando.getInstance());
        assertFalse(aeronave.decolar());
    }

    @Test
    public void naoDeveAbortarDecolagemAeronavePousando() {
        aeronave.setEstado(AeronaveEstadoPousando.getInstance());
        assertFalse(aeronave.abortarDecolagem());
    }

    @Test
    public void naoDeveVoarAeronavePousando() {
        aeronave.setEstado(AeronaveEstadoPousando.getInstance());
        assertFalse(aeronave.voar());
    }

    @Test
    public void deveArremeterAeronavePousando() {
        aeronave.setEstado(AeronaveEstadoPousando.getInstance());
        assertTrue(aeronave.arremeter());
        assertEquals(AeronaveEstadoArremetendo.getInstance(), aeronave.getEstado());
    }

    @Test
    public void naoDeveEstacionarAeronavePousando() {
        aeronave.setEstado(AeronaveEstadoPousando.getInstance());
        assertFalse(aeronave.estacionar());
    }


    // AERONAVE ARREMETENDO

    @Test
    public void naoDeveArremeterAeronaveArremetendo() {
        aeronave.setEstado(AeronaveEstadoArremetendo.getInstance());
        assertFalse(aeronave.arremeter());
    }

    @Test
    public void naoDeveTaxiarAeronaveArremetendo() {
        aeronave.setEstado(AeronaveEstadoArremetendo.getInstance());
        assertFalse(aeronave.taxiar());
    }

    @Test
    public void naoDeveDecolarAeronaveArremetendo() {
        aeronave.setEstado(AeronaveEstadoArremetendo.getInstance());
        assertFalse(aeronave.decolar());
    }

    @Test
    public void naoDeveAbortarDecolagemAeronaveArremetendo() {
        aeronave.setEstado(AeronaveEstadoArremetendo.getInstance());
        assertFalse(aeronave.abortarDecolagem());
    }

    @Test
    public void deveVoarAeronaveArremetendo() {
        aeronave.setEstado(AeronaveEstadoArremetendo.getInstance());
        assertTrue(aeronave.voar());
        assertEquals(AeronaveEstadoVoando.getInstance(), aeronave.getEstado());
    }

    @Test
    public void naoDevePousarAeronaveArremetendo() {
        aeronave.setEstado(AeronaveEstadoArremetendo.getInstance());
        assertFalse(aeronave.pousar());
    }

    @Test
    public void naoDeveEstacionarAeronaveArremetendo() {
        aeronave.setEstado(AeronaveEstadoArremetendo.getInstance());
        assertFalse(aeronave.estacionar());
    }

}