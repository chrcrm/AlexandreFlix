/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.usj.ads.lp2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author christian e wellington
 */

@ManagedBean
@RequestScoped
public class BeanCatalogo {
    
    private String IdFilme;
    private String NomeFilme;
    private String Descricao;
    private String Ano;
    private String Ator;
    
    
    public String getIdFilme() {
        return IdFilme;
    }

    public void setIdFilme(String IdFilme) {
        this.IdFilme = IdFilme;
    }

    public String getNomeFilme() {
        return NomeFilme;
    }

    public void setNomeFilme(String NomeFilme) {
        this.NomeFilme = NomeFilme;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }

    public String getAno() {
        return Ano;
    }

    public void setAno(String Ano) {
        this.Ano = Ano;
    }

    public String getAtor() {
        return Ator;
    }

    public void setAtor(String Ator) {
        this.Ator = Ator;
    }
    
}
