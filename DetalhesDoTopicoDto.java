package com.alura.forum.controller.dto;

import com.alura.forum.modelo.Topico;

public class DetalhesDoTopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;

    public DetalhesDoTopicoDto(Topico topico) {
        this.id = topico.getId();
        this.titulo = topico.getTitulo();
        this.mensagem = topico.getMensagem();
    }

