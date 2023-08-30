public class Main {
    public static void main(String[] args) {
      SisVendas sistema = new SisVendas();
      sistema.setLer(new LeitorQrCode());
        System.out.println(sistema.lerCodigo("123"));
    }
}