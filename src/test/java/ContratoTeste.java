import org.junit.Test;

public class ContratoTeste {
    @Test
    public void crearContratoPF(){
        FabricaContratoPF.getInstance().createContrato(new ContratoPF());
    }

}
