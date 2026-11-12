package com.stumpfjvc.usuario.business;

import com.stumpfjvc.usuario.business.converter.UsuarioConverter;
import com.stumpfjvc.usuario.business.dto.UsuarioDTO;
import com.stumpfjvc.usuario.infrastructure.entity.Usuario;
import com.stumpfjvc.usuario.infrastructure.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioConverter usuarioConverter;

    public UsuarioDTO salvaUsuario(UsuarioDTO usuarioDTO){
        Usuario usuario = usuarioConverter.paraUsuario(usuarioDTO);
        return usuarioConverter.paraUsuarioDTO(usuarioRepository.save(usuario));
    }


}
