package controller;

import model.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import service.PerfilService;

import java.util.List;

@RestController
@RequestMapping("/api/profiles")
public class ProfileController {

    @Autowired
    private PerfilService profileService;

    @GetMapping
    public List<Perfil> getAllProfiles() {
        return profileService.findAllProfiles();
    }

    @GetMapping("/{id}")
    public Perfil getProfileById(@PathVariable Long id) {
        return profileService.findProfileById(id);
    }

    @PostMapping
    public Perfil createProfile(@RequestBody Perfil profile) {
        return profileService.createProfile(profile);
    }

    @DeleteMapping("/{id}")
    public void deleteProfile(@PathVariable Long id) {
        profileService.deleteProfile(id);
    }
}