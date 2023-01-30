package dio.webapi.repository;

import dio.webapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo usuário na camada repositório");
        else
            System.out.println("UPDATE - Recebendo usuário na camada repositório");
        System.out.println(usuario);
    }

    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para excluir"));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Kalliandra", "Kally0809"));
        usuarios.add(new Usuario("Matheus", "123456"));
        return usuarios;
    }

    public Usuario finById(Integer id){
        System.out.println(String.format("FIND/id - Recebedno o id: %d para localizar um usuário", id));
        return  new Usuario("Kalliandra", "Kally0809");
    }

    public Usuario findByUserName(String username){
        System.out.println(String.format("FIND/username - Recebedno o id: %d para localizar o usuário", username));
        return new Usuario("Kalliandra", "Kally0809");
    }
}
