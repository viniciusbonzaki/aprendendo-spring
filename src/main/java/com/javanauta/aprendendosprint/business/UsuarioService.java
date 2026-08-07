package com.javanauta.aprendendosprint.business;

import com.javanauta.aprendendosprint.infrastructure.entity.Usuario;
import com.javanauta.aprendendosprint.infrastructure.exceptions.ConflictException;
import com.javanauta.aprendendosprint.infrastructure.exceptions.ResourceNotFoundException;
import com.javanauta.aprendendosprint.infrastructure.repository.UsuarioRepository;

import lombok.RequiredArgsConstructor;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    // Método para Salvar os Dados do Usuário no Banco
    public Usuario salvarUsuario(Usuario usuario) {
        try {
            emailExistente(usuario.getEmail());
            usuario.setSenha(passwordEncoder.encode(usuario.getSenha()));
            return usuarioRepository.save(usuario);
        }
        catch (ConflictException e) {
            throw new ConflictException("Email já cadastrado ", e.getCause());
        }
    }

    // Método para verificar se o Email já existe no Banco e definir as Exceções
    public void emailExistente(String email) {
        try {
            boolean emailExiste = verificarSeEmailExiste(email);

            if (emailExiste) {
                throw new ConflictException("Email já cadastrado " + email);
            }
        }
        catch (ConflictException e) {
            throw new ConflictException("Email já cadastrado ", e.getCause());
        }
    }

    // Verificar se o Email já existe utilizando o Método "existsByEmail" de UsuarioRepository
    public boolean verificarSeEmailExiste(String email) {
        return usuarioRepository.existsByEmail(email);
    }

    // Buscar um Usuário pelo Email utilizando o Método "findByEmail" de UsuarioRepository
    public Usuario buscarUsuarioPorEmail(String email) {
        return usuarioRepository.findByEmail(email).orElseThrow(
                () -> new ResourceNotFoundException("Email não encontrado " + email)
        );
    }

    // Método para deletar um Usuário pelo Email
    public void deletarUsuarioPorEmail(String email) {
        usuarioRepository.deleteByEmail(email);
    }
}
