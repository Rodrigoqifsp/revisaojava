import java.lang.reflect.Field;

class Configuracao {
    private String urlConexao = "localhost:5432";
}

class ModificadorDeAtributo {
    public static void main(String[] args) {
        try {
            Configuracao config = new Configuracao();
            Field campo = Configuracao.class.getDeclaredField("urlConexao");
            campo.setAccessible(true);
            campo.set(config, "db.producao.com:5432");
            System.out.println(campo.get(config));
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}