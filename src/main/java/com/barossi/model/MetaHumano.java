package com.barossi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MetaHumano {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome, idSecreta;
    private boolean terraqueo, criminoso;
    private String poderesConhecidos;

    public MetaHumano(String nome, String idSecreta, boolean terraqueo, boolean criminoso, String poderesConhecidos) {
        this.nome = nome;
        this.idSecreta = idSecreta;
        this.terraqueo = terraqueo;
        this.criminoso = criminoso;
        this.poderesConhecidos = poderesConhecidos;
    }

    public MetaHumano(String nome, boolean terraqueo, boolean criminoso, String poderesConhecidos) {
        this.nome = nome;
        this.idSecreta = "Desconhecida";
        this.terraqueo = terraqueo;
        this.criminoso = criminoso;
        this.poderesConhecidos = poderesConhecidos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIdSecreta() {
        return idSecreta;
    }

    public void setIdSecreta(String idSecreta) {
        this.idSecreta = idSecreta;
    }

    public boolean isTerraqueo() {
        return terraqueo;
    }

    public void setTerraqueo(boolean terraqueo) {
        this.terraqueo = terraqueo;
    }

    public boolean isCriminoso() {
        return criminoso;
    }

    public void setCriminoso(boolean criminoso) {
        this.criminoso = criminoso;
    }

    public String getPoderesConhecidos() {
        return poderesConhecidos;
    }

    public void setPoderesConhecidos(String poderesConhecidos) {
        this.poderesConhecidos = poderesConhecidos;
    }
}
