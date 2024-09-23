package service;

import model.Perfil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.PerfilRepository;

import java.util.List;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository profileRepository;

    public Perfil findProfileById(Long id) {
        return profileRepository.findById(id).orElse(null);
    }

    public List<Perfil> findAllProfiles() {
        return profileRepository.findAll();
    }

    public Perfil createProfile(Perfil profile) {
        return profileRepository.save(profile);
    }

    public void deleteProfile(Long id) {
        profileRepository.deleteById(id);
    }
}