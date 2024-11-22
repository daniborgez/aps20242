/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex.controller;

import java.util.ArrayList;
import pokedex.dao.ExceptionDAO;
import pokedex.dao.PokemonDAO;
import pokedex.model.Pokemon;

/**
 *
 * @author danie
 */
public class PokemonController {
    
    public boolean cadastrarPokemon(String nome, String categoria, String descricao, String habitat, String cor) throws ExceptionDAO{
        
        if(nome != null && nome.length() >0 && categoria != null && 
                categoria.length() >0 && descricao != null && descricao.length() >0 
                && habitat != null && habitat.length() >0 && cor != null && cor.length() >0){
        
        Pokemon pokemon = new Pokemon(nome,categoria,descricao,habitat,cor);
        pokemon.cadastrarPokemon(pokemon);
        return true;
    }
    return false; 
    }
    
    public ArrayList<Pokemon> listarPokemon(String nome)throws ExceptionDAO{
        return new PokemonDAO().listarPokemon(nome); // A CONTROLLER CHAMA A MODEL POKEMON E A MODEL POKEMON CHAMA A POKEMON DAO
    }
    
    public boolean alterarPokemon(int id_pokemon,String nome, String categoria, String descricao, String habitat, String cor) 
            throws ExceptionDAO{
        
        if(nome != null && nome.length() >0 && categoria != null && categoria.length() >0 && descricao != null &&
                descricao.length() >0 && habitat != null && habitat.length() >0 && cor != null && cor.length() >0){
        
         Pokemon pokemon = new Pokemon(nome,categoria,descricao,habitat,cor);
         pokemon.setId_pokemon(id_pokemon);
         pokemon.alterarPokemon(pokemon);
         return true;
        }
        return false; 
    }
    
    public boolean apagarFilme(int id_Pokemon)throws ExceptionDAO{
        if(id_Pokemon == 0){
            return false;
        }else{
            Pokemon pokemon = new Pokemon();
            pokemon.setId_pokemon(id_Pokemon);
            pokemon.apagarPokemon(pokemon);
            return true;
        }
    }
    
    public ArrayList<Pokemon> listarCategoria(String categoria)throws ExceptionDAO{
        return new PokemonDAO().listarCategoria(categoria); 
    }
    
}

