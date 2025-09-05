import com.github.javafaker.Faker;
import java.util.Locale;

public class UsuarioFactory {
    private static final Faker faker = new Faker(new Locale("pt-BR"));

    public static Usuario criarUsuario() {
        return new Usuario(
                faker.name().fullName(),
                faker.internet().emailAddress(),
                faker.phoneNumber().cellPhone()
        );
    }
}
