package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 

/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("PessoaDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface PessoaDAO extends JpaRepository<Pessoa, java.lang.String> {

  /**
   * Obtém a instância de Pessoa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Pessoa entity WHERE entity.id = :id")
  public Pessoa findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Pessoa utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Pessoa entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Pessoa c")
  public Page<Pessoa> list(Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select p from Pessoa p where p.nome LIKE CONCAT('%',COALESCE(:nome,p.nome),'%')")
  public Page<Pessoa> listByNome(@Param(value="nome") java.lang.String nome, Pageable pageable);
  


  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Pessoa entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<Pessoa> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Pessoa entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<Pessoa> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
}