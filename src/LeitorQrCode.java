public class LeitorQrCode implements LeitorDeCodigosGeral{
    public String lerQrCode(String codigo)throws QrCodeException{
        if (codigo == null){
            throw new QrCodeException("QrCode Nulo");
        }else if(codigo.equals("")){
            throw new QrCodeException("Vazia");
        }
        return "Qr code: " + codigo;
    }

    @Override
    public String leitor(String codigo) throws ErroLeituraException{
        try{
            return lerQrCode(codigo);
        }catch (QrCodeException e){
            return "Erro no Qr Code";
        }

    }
}
