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
@Repository("CidadeDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface CidadeDAO extends JpaRepository<Cidade, java.lang.String> {

  /**
   * Obtém a instância de Cidade utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Cidade entity WHERE entity.id = :id")
  public Cidade findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Cidade utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Cidade entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Cidade c")
  public Page<Cidade> list(Pageable pageable);
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select c from Cidade c where c.nome LIKE CONCAT('%',coalesce(:nome, c.nome),'%')")
  public Page<Cidade> listByNome(@Param(value="nome") java.lang.String nome, Pageable pageable);
  

    
  /**
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Pessoa entity WHERE entity.cidade.id = :id AND (entity.nome like concat('%',coalesce(:search,''),'%'))")
  public Page<Pessoa> findPessoaGeneralSearch(@Param(value="search") java.lang.String search, @Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation - Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Pessoa entity WHERE entity.cidade.id = :id AND (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<Pessoa> findPessoaSpecificSearch(@Param(value="id") java.lang.String id, @Param(value="nome") java.lang.String nome, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Pessoa entity WHERE entity.cidade.id = :id")
  public Page<Pessoa> findPessoa(@Param(value="id") java.lang.String id, Pageable pageable);

  
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @Query("SELECT entity FROM Cidade entity WHERE entity.nome like concat('%',coalesce(:search,''),'%')")
  public Page<Cidade> generalSearch(@Param(value="search") java.lang.String search, Pageable pageable);

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @Query("SELECT entity FROM Cidade entity WHERE (:nome is null OR entity.nome like concat('%',:nome,'%'))")
  public Page<Cidade> specificSearch(@Param(value="nome") java.lang.String nome, Pageable pageable);
  
}