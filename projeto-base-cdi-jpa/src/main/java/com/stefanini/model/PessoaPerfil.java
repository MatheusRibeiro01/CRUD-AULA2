package com.stefanini.model;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "TB_PESSOA_PERFIL")
public class PessoaPerfil implements Serializable {
	
	
	@Id
    @Column(name = "CO_SEQ_PESSOAL_PERFIL")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "CO_SEQ_PERFIL", referencedColumnName = "CO_SEQ_PERFIL", nullable = false)
    private Perfil perfil;
    @ManyToOne
    @JoinColumn(name = "CO_SEQ_PESSOA", referencedColumnName = "CO_SEQ_PESSOA", nullable = false)
    private Pessoa pessoa;

    public PessoaPerfil() {

    }

    public PessoaPerfil(Perfil perfil, Pessoa pessoa) {
        this.perfil = perfil;
        this.pessoa = pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Perfil getPerfil() {
        return perfil;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
