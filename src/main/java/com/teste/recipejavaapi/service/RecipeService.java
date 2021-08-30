package com.teste.recipejavaapi.service;

import java.util.List;

/**
 * Interface que define os metodos relacionados aos fluxos de receita
 */
public interface ReceitasService{

    /**
     * Método que retornar todas as receitas cadastras
     * @return List<recipe>
     */
    List<recipe> listarReceitas();

    /**
     * Metodo que ç cria uma nova receita
     * @param recipe
     */
    void adicionarReceita(Recipe recipe);

    /**
     * metodo que altera uma receita ja cadastrada
     * @param id
     * @param recipe
     */
    void alterarReceita(String id, Recipe recipe);

    /**
     * metodo que exclui uma receita cadastra
     * @param id
     */
    void excluirReceita(String id);

    /**
     * * método que excluir um ingrediente
     */
    * @param ingredient;
    void excluirIngredient (Integer ingredient);
    /**
     * metodo que obtem uma receita cadastra
     * @param id
     */
    Recipe obterReceita(String id);
}
