package com.stefanini.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;


@Entity
@Table(name = "TB_PERFIL")
public class Perfil implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "CO_SEQ_PERFIL")
	private Integer id;
	
	@NotNull
	@Column(name = "NO_PERFIL")
	private String perfil;
	
	@NotNull
	@Column(name = "DS_PERFIL")
	private String descPerfil;
	
	@NotNull
	@Column(name = "DT_HORA_INCLUSAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date horaInclusao;
	
	@NotNull
	@Column(name = "DT_HORA_ALTERACAO")
	@Temporal(TemporalType.TIMESTAMP)
	private Date horaAlteracao;

	
	
	public Perfil() {
		
	}

	public Perfil(Integer id, @NotNull String perfil, @NotNull String descPerfil, @NotNull Date horaInclusao,
			@NotNull Date horaAlteracao) {
		this.id = id;
		this.perfil = perfil;
		this.descPerfil = descPerfil;
		this.horaInclusao = horaInclusao;
		this.horaAlteracao = horaAlteracao;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getDescPerfil() {
		return descPerfil;
	}

	public void setDescPerfil(String descPerfil) {
		this.descPerfil = descPerfil;
	}

	public Date getHoraInclusao() {
		return horaInclusao;
	}

	public void setHoraInclusao(Date horaInclusao) {
		this.horaInclusao = horaInclusao;
	}

	public Date getHoraAlteracao() {
		return horaAlteracao;
	}

	public void setHoraAlteracao(Date horaAlteracao) {
		this.horaAlteracao = horaAlteracao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((descPerfil == null) ? 0 : descPerfil.hashCode());
		result = prime * result + ((horaAlteracao == null) ? 0 : horaAlteracao.hashCode());
		result = prime * result + ((horaInclusao == null) ? 0 : horaInclusao.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((perfil == null) ? 0 : perfil.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Perfil other = (Perfil) obj;
		if (descPerfil == null) {
			if (other.descPerfil != null)
				return false;
		} else if (!descPerfil.equals(other.descPerfil))
			return false;
		if (horaAlteracao == null) {
			if (other.horaAlteracao != null)
				return false;
		} else if (!horaAlteracao.equals(other.horaAlteracao))
			return false;
		if (horaInclusao == null) {
			if (other.horaInclusao != null)
				return false;
		} else if (!horaInclusao.equals(other.horaInclusao))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (perfil == null) {
			if (other.perfil != null)
				return false;
		} else if (!perfil.equals(other.perfil))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Perfil [id=" + id + ", perfil=" + perfil + ", descPerfil=" + descPerfil + ", horaInclusao="
				+ horaInclusao + ", horaAlteracao=" + horaAlteracao + "]";
	}

	
	
	
	
}


