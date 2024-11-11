/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex.model;

import java.util.ArrayList;
import pokedex.dao.ExceptionDAO;
import pokedex.dao.PokemonDAO;

/**
 *
 * @author danie
 */

    
public class Pokemon {
    private Integer id_pokemon;
    private String nome; 
    private String categoria;
    private String descricao;
    private String habitat; 
    private String cor; 
    

    public Pokemon(){
        
    }
    
    
    public Pokemon(String nome, String categoria, String descricao, String habitat, String cor){
        this.nome = nome;
        this.categoria = categoria;
        this.descricao = descricao;
        this.habitat = habitat;
        this.cor = cor;
        
    }

    
    public void setId_pokemon(Integer id_pokemon) {
        this.id_pokemon = id_pokemon;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public Integer getId_pokemon() {
        return id_pokemon;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getCor() {
        return cor;
    }

    public void cadastrarPokemon(Pokemon pokemon) throws ExceptionDAO{
        new PokemonDAO().cadastrarPokemon(pokemon);
    
    }
     public ArrayList<Pokemon> listarPokemon(String pokemon) throws ExceptionDAO {
      return new PokemonDAO().listarPokemon(nome);
  }
     
     public void alterarPokemon(Pokemon pokemon)throws ExceptionDAO{
         new PokemonDAO().alterarPokemon(pokemon);
     }
     
     public void apagarPokemon(Pokemon pokemon)throws ExceptionDAO{
         new PokemonDAO().apagarPokemon(pokemon);
     }
    
    public ArrayList<Pokemon> listarCategoria(String pokemon) throws ExceptionDAO {
      return new PokemonDAO().listarPokemon(nome);
  }

    @Override
    public String toString() {
        return "Pokemon{" + "id_pokemon=" + id_pokemon + ", nome=" + nome + ", categoria=" + categoria + ", descricao=" + descricao 
                + ", habitat=" + habitat + ", cor=" + cor + '}';
    }
    
    
}
