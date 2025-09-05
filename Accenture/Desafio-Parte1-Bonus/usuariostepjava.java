import io.cucumber.java.pt.Dado;
import java.util.ArrayList;
import java.util.List;

public class UsuarioSteps {

    private List<Usuario> usuarios = new ArrayList<>();

    @Dado("que eu crio {int} registros de usuários")
    public void queEuCrioRegistrosDeUsuarios(int quantidade) {
        for (int i = 0; i < quantidade; i++) {
            Usuario usuario = UsuarioFactory.criarUsuario();
            usuarios.add(usuario);

            // Aqui você pode chamar API, salvar no banco ou usar Selenium para cadastro
            System.out.println("Usuário criado: " + usuario);
        }
    }
}
