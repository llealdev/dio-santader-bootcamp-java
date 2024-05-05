

public class FormatadorCepExemplo {
    public static void main(String[] args) {
        try {
            String meuCep = formatarCep("23756064");
            System.out.println(meuCep);
        } catch (CepInvalidoException e) {
            System.out.println("O cep não corresponde com o que foi pedido");;
        }
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
            throw new CepInvalidoException();

        //simulando um cep formatado
        return "23.765-064";
    }
}
