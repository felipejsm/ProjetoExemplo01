package app.business;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.*;
import app.dao.*;
import app.entity.*;

/**
 * Classe que representa a camada de negócios de CidadeBusiness
 * 
 * @generated
 **/
@Service("CidadeBusiness")
public class CidadeBusiness {

  private static final Logger log = LoggerFactory.getLogger(CidadeBusiness.class);


  /**
   * Instância da classe CidadeDAO que faz o acesso ao banco de dados
   * 
   * @generated
   */
  @Autowired
  @Qualifier("CidadeDAO")
  protected CidadeDAO repository;

  // CRUD

  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Cidade post(final Cidade entity) throws Exception {
    // begin-user-code  
    // end-user-code  
    Cidade result = null;
    result = repository.save(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   * 
   * @generated
   */
  public Cidade put(final Cidade entity) throws Exception {
    // begin-user-code  
    // end-user-code
    Cidade result = null;
    result = repository.saveAndFlush(entity);
    // begin-user-code
    // end-user-code
    return result;
  }

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public void delete(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Cidade entity = this.get(id);
    this.repository.delete(entity);
    // begin-user-code  
    // end-user-code        
  }
  
  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  public Cidade get(java.lang.String id) throws Exception {
    // begin-user-code  
    // end-user-code
    Cidade result = repository.findOne(id);
    // begin-user-code
    // end-user-code
    return result;
  }

  // CRUD
  
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Cidade> list(Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Cidade> result = repository.list(pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Cidade> listByNome( java.lang.String nome, Pageable pageable){
    // begin-user-code
    // end-user-code
    Page<Cidade> result = repository.listByNome( nome, pageable);
    // begin-user-code
    // end-user-code
    return result;
  }
  /**
   * @generated modifiable
   * OneToMany Relation - Searchable fields - General search (Only strings fields)
   */  
  public Page<Pessoa> findPessoaGeneralSearch(java.lang.String search, java.lang.String id,  Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Pessoa> result = repository.findPessoaGeneralSearch(search, id,  pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation - Searchable fields - Specific search
   */  
  public Page<Pessoa> findPessoaSpecificSearch(java.lang.String id, java.lang.String nome, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Pessoa> result = repository.findPessoaSpecificSearch(id, nome, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  
  /**
   * @generated modifiable
   * OneToMany Relation
   */  
  public Page<Pessoa> findPessoa(java.lang.String id, Pageable pageable) {
    // begin-user-code
    // end-user-code  
    Page<Pessoa> result = repository.findPessoa(id, pageable);
    // begin-user-code  
    // end-user-code        
    return result;    
  }
  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  public Page<Cidade> generalSearch(java.lang.String search, Pageable pageable) {
    return repository.generalSearch(search, pageable);
  }
  
  /**
   * Searchable fields - Specific search
   * @generated
   */
  public Page<Cidade> specificSearch(java.lang.String nome, Pageable pageable) {
    return repository.specificSearch(nome, pageable);
  }
}