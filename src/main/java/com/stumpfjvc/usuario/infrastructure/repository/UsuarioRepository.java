package com.stumpfjvc.usuario.infrastructure.repository;


import com.stumpfjvc.usuario.infrastructure.entity.Usuario;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    boolean existsByEmail(String email);

    Optional<Usuario> findByEmail(String email); // para caso aconteca de n ter email, n dar nullpoint exception e travar a aplicacao

    @Transactional
    void deleteByEmail(String email);
}
