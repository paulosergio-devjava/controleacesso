package controller;

import model.Perfil;
import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.PerfilService;
import service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@CrossOrigin(origins = "http://localhost:4200")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private PerfilService perfilService;

    @GetMapping
    public List<Usuario> listarTodos() {
        return usuarioService.listarTodos();
    }

    @PostMapping
    public Usuario criarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvar(usuario);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuarioAtualizado) {
        return usuarioService.buscarPorId(id)
                .map(usuario -> {
                    usuario.setNome(usuarioAtualizado.getNome());
                    usuario.setSenha(usuarioAtualizado.getSenha());
                    usuario.setPerfil(usuarioAtualizado.getPerfil());
                    Usuario atualizado = usuarioService.salvar(usuario);
                    return ResponseEntity.ok(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarUsuario(@PathVariable Long id) {
        usuarioService.deletar(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/perfis")
    public List<Perfil> listarPerfis() {
        return perfilService.findAllProfiles();
    }
}
