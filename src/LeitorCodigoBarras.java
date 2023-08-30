public class LeitorCodigoBarras implements LeitorDeCodigosGeral{

    public String leitorBarra(String codigo)throws CodigoBarraException{
        if (codigo == null){
            throw new CodigoBarraException("Nulo");
        }else if (codigo.equals("")){
            throw new CodigoBarraException("Vazia");
        }
        return "Código de barra: " + codigo;
    }

    @Override
    public String leitor(String codigo) throws ErroLeituraException{
        try{
            return leitorBarra(codigo);
        }catch (CodigoBarraException e){
            return "Erro no codigo de Barras";
        }

    }
}
