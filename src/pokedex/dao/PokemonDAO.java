/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokedex.dao;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import pokedex.model.Pokemon;
import java.sql.ResultSet;
/**
 *
 * @author danie
 */
public class PokemonDAO {
    
    public void cadastrarPokemon(Pokemon pokemon) throws ExceptionDAO{
        String sql = "insert into pokemon (nome,categoria,descricao,habitat,cor ) value (?,?,?,?,?)";
        PreparedStatement pStatement = null; 
        Connection connection = null; 
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setString(1, pokemon.getNome());
            pStatement.setString(2, pokemon.getCategoria());
            pStatement.setString(3, pokemon.getDescricao());
            pStatement.setString(4, pokemon.getHabitat());
            pStatement.setString(5, pokemon.getCor());
            pStatement.execute();
        }catch (SQLException e){
            throw new ExceptionDAO("Erro ao cadastrar o pokemon: "+ e);
        }finally{
            
            try{
                if(pStatement != null) {pStatement.close();}
            } catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e); //TRATAMENTO DE EXCEÇÕES 
            } try {
                if(connection != null) {connection.close();}
            }catch (SQLException e){
                throw new ExceptionDAO("Erro ao fehcar a conexão; "+ e);
            }
            
        }
        
    }
  
    public ArrayList<Pokemon> listarPokemon(String nome) throws ExceptionDAO{
        String sql = "select * from pokemon where nome like '%" + nome + "%' order by nome";
     
        Connection connection = null; 
        PreparedStatement pStatement = null;
        ArrayList<Pokemon> pokemons = null; 
        
        try {
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            ResultSet rs = pStatement.executeQuery(sql);
            
            if(rs != null){
                pokemons = new ArrayList<Pokemon>();
                while(rs.next()){
                    Pokemon pokemon = new Pokemon(); // Criação de um novo objeto Pokemon
                    pokemon.setId_pokemon(rs.getInt("Id_pokemon"));
                    pokemon.setNome(rs.getString("nome"));
                    pokemon.setCategoria(rs.getString("categoria"));
                    pokemon.setDescricao(rs.getString("descricao"));
                    pokemon.setHabitat(rs.getString("habitat"));
                    pokemon.setCor(rs.getString("cor"));
                    pokemons.add(pokemon); // Adiciona o objeto Pokemon à lista   
                }
            }     
        } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao consultar Pokémons: " + e);
        }finally{
            try{
                if(pStatement!=null){pStatement.close();}
            }catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar o pStatmente:" + e);
            }
            
            try {
                if(connection != null){connection.close();}
            } catch (SQLException e) {
                throw new ExceptionDAO("Eroo ao fechar a conexão:" + e);
            }
        }
        return pokemons;
    }
 
        public void alterarPokemon(Pokemon pokemon)throws ExceptionDAO{ //passando obj do tipo desejado e criando a execao 
            String sql = "update MVC.POKEMON\n" +
                         "SET NOME = ?, CATEGORIA = ?, DESCRICAO = ?, HABITAT = ?, COR = ?\n" +
                        "WHERE ID_POKEMON = ?;"; //parametro que vai ser passado para o mysql
            PreparedStatement pStatement = null;
            Connection connection = null;
            
            try {
                connection = new ConnectionMVC().getConnection();
                pStatement = connection.prepareStatement(sql);
                System.out.println(pokemon);
                pStatement.setString(1, pokemon.getNome());
                pStatement.setString(2, pokemon.getCategoria()); //posicao (parametros passados acima) e o que tem nele
                pStatement.setString(3, pokemon.getDescricao());
                pStatement.setString(4, pokemon.getHabitat());
                pStatement.setString(5, pokemon.getCor());
                pStatement.setInt(6, pokemon.getId_pokemon());
                pStatement.execute();
                
       
            } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao alterar Pokémons: " + e);
        }finally{
            try{
                if(pStatement!=null){pStatement.close();}
            }catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar o pStatmente:" + e);
            }
            
            try {
                if(connection != null){connection.close();}
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a conexão:" + e);
            }
        }
            
    }
        
    public void apagarPokemon(Pokemon pokemon) throws ExceptionDAO{
        String sql = "delete from pokemon where id_pokemon = ?";
        PreparedStatement pStatement = null; 
        Connection connection = null; 
        
        try{
            connection = new ConnectionMVC().getConnection();
            pStatement = connection.prepareStatement(sql);
            pStatement.setInt(1, pokemon.getId_pokemon());
            pStatement.execute();
        }catch (SQLException e){
            throw new ExceptionDAO("Erro ao apagar o pokemon: "+ e);
        }finally{
            
            try{
                if(pStatement != null) {pStatement.close();}
            } catch(SQLException e){
                throw new ExceptionDAO("Erro ao fechar o Statement: " + e); //TRATAMENTO DE EXCEÇÕES 
            } try {
                if(connection != null) {connection.close();}
            }catch (SQLException e){
                throw new ExceptionDAO("Erro ao fehcar a conexão; "+ e);
            }
            
        }
    }
    //testefiltro    
    public ArrayList<Pokemon> listarCategoria(String categoria) throws ExceptionDAO {
    String sql = "SELECT Id_pokemon, nome, categoria FROM pokemon WHERE categoria LIKE ? ORDER BY categoria";

    Connection connection = null;
    PreparedStatement pStatement = null;
    ResultSet rs = null;
    ArrayList<Pokemon> pokemons = new ArrayList<>();

    try {
        connection = new ConnectionMVC().getConnection();
        pStatement = connection.prepareStatement(sql);
        pStatement.setString(1, "%" + categoria + "%"); // Evita injeção de SQL
        rs = pStatement.executeQuery();

        while (rs.next()) {
            Pokemon pokemon = new Pokemon();
            pokemon.setId_pokemon(rs.getInt("Id_pokemon"));
            pokemon.setNome(rs.getString("nome"));
            pokemon.setCategoria(rs.getString("categoria"));
            pokemons.add(pokemon);
        }
    } catch (SQLException e) {
            throw new ExceptionDAO("Erro ao consultar Pokémons: " + e);
        }finally{
            try{
                if(pStatement!=null){pStatement.close();}
            }catch (SQLException e){
                throw new ExceptionDAO("Erro ao fechar o pStatmente:" + e);
            }
            
            try {
                if(connection != null){connection.close();}
            } catch (SQLException e) {
                throw new ExceptionDAO("Erro ao fechar a conexão:" + e);
            }
        }
        return pokemons;
    }



     
}
    
        
    
        

