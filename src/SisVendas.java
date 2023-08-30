public class SisVendas {
    private LeitorDeCodigosGeral ler;

    public String lerCodigo(String codigo){
        try{return ler.leitor(codigo);
        }catch (ErroLeituraException e){
            return "Erro na leitura";
        }

    }

    public void setLer(LeitorDeCodigosGeral ler) {
        this.ler = ler;
    }
}
