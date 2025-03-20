public class FabricaContratoPF {
    private FabricaContratoPF(){};
    private static FabricaContratoPF instance = new FabricaContratoPF();
    public static FabricaContratoPF getInstance() {
        return instance;
    }
    public IContrato createContrato(ContratoPF contratoPF){ return new ContratoPF();}
}
