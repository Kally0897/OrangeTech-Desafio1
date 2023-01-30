package dio.webapi.controller;

import dio.webapi.model.Usuario;
import dio.webapi.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;
    @GetMapping("/users")
    public List<Usuario> getUsers(){
        return repository.findAll();
    }

    @GetMapping("/users/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return repository.findByUserName(username);
    }

    @DeleteMapping("/users/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        repository.deleteById(id);
    }

    @PostMapping("/users")
    public void postUser(@RequestBody Usuario usuario){
        repository.save(usuario);
    }
}
