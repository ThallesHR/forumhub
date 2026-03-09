package com.alura.forumhub.domain.topicos;

import java.time.LocalDateTime;

public record DadosListagemTopico(Long id,String titulo, LocalDateTime data,EstadoTopico estado,String autor,String curso) {
    public DadosListagemTopico(Topico topico){
        this(topico.getId(),topico.getTitulo(), topico.getData(),topico.getEstado(),topico.getAutor(),topico.getCurso());
    }
}
