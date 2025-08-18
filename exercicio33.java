import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME) // Essencial para que a anotação esteja disponível via reflection
@Target(ElementType.METHOD) // A anotação só pode ser aplicada a métodos
@interface Teste {
}

class MinhaClasseDeTeste {
    @Teste
    public void testeSoma() {
        System.out.println("Executando testeSoma: SUCESSO");
    }

    public void metodoComum() {
        System.out.println("Este não é um teste.");
    }

    @Teste
    public void testeLogin() {
        System.out.println("Executando testeLogin: SUCESSO");
    }
}

class ExecutorDeTestes {
    public static void executarTestes(Object obj) {
        Class<?> classe = obj.getClass();
        Method[] metodos = classe.getDeclaredMethods();
        for (Method metodo : metodos) {
            if (metodo.isAnnotationPresent(Teste.class)) {
                try {
                    metodo.setAccessible(true);
                    metodo.invoke(obj);
                } catch (Exception e) {
                    System.out.println("Erro " + e.getMessage() + " ao tentar executar " + metodo.getName());
                }
            }
        }
    }
}