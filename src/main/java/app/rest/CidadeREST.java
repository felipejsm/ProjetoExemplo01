package app.rest;

import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.*;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.*;
import org.springframework.beans.factory.annotation.*;
import java.util.*;
import app.entity.*;
import app.business.*;

/**
 * Controller para expor serviços REST de Cidade
 *
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Cidade")
public class CidadeREST {

  /**
   * Classe de negócio para manipulação de dados
   *
   * @generated
   */
  @Autowired
  @Qualifier("CidadeBusiness")
  private CidadeBusiness cidadeBusiness;

  /**
   * @generated
   */
  @Autowired
  @Qualifier("PessoaBusiness")
  private PessoaBusiness pessoaBusiness;
  /**
   * Serviço exposto para novo registro de acordo com a entidade fornecida
   *
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST)
  public Cidade post(@Validated @RequestBody final Cidade entity) throws Exception {
    return cidadeBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   *
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Cidade put(@Validated @RequestBody final Cidade entity) throws Exception {
    return cidadeBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{cidadeId}")
  public Cidade put(@Validated @RequestBody final Cidade entity, @PathVariable("cidadeId") java.lang.String cidadeId) throws Exception {
    return cidadeBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{cidadeId}")
  public void delete(@PathVariable("cidadeId") java.lang.String cidadeId) throws Exception {
    cidadeBusiness.delete(cidadeId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )
  public HttpEntity<PagedResources<Cidade>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(cidadeBusiness.list(pageable)), HttpStatus.OK);
  }
  /**
   * NamedQuery listByNome
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/listByNome/{nome}")
  public HttpEntity<PagedResources<Cidade>> listByNomeParams (@PathVariable("nome") java.lang.String nome, Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(cidadeBusiness.listByNome(nome, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship GET - Searchable fields - General search (Only strings fields)
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value="/{instanceId}/Pessoa/generalSearch")
  public HttpEntity<PagedResources<Pessoa>> findPessoaGeneralSearch(java.lang.String search, @PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cidadeBusiness.findPessoaGeneralSearch(search, instanceId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship GET - Searchable fields - Specific search
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Pessoa/specificSearch")
  public HttpEntity<PagedResources<Pessoa>> findPessoaSpecificSearch(@PathVariable("instanceId") java.lang.String instanceId, java.lang.String nome, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cidadeBusiness.findPessoaSpecificSearch(instanceId, nome, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship GET
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/{instanceId}/Pessoa")
  public HttpEntity<PagedResources<Pessoa>> findPessoa(@PathVariable("instanceId") java.lang.String instanceId, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cidadeBusiness.findPessoa(instanceId, pageable)), HttpStatus.OK);
  }

  /**
   * OneToMany Relationship DELETE
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE
  , value="/{instanceId}/Pessoa/{relationId}")
  public void deletePessoa(@PathVariable("relationId") java.lang.String relationId) throws Exception {
    this.pessoaBusiness.delete(relationId);
  }

  /**
   * OneToMany Relationship PUT
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT
  , value="/{instanceId}/Pessoa/{relationId}")
  public Pessoa putPessoa(@Validated @RequestBody final Pessoa entity, @PathVariable("relationId") java.lang.String relationId) throws Exception {
    return this.pessoaBusiness.put(entity);
  }

  /**
   * OneToMany Relationship POST
   * @generated
   */
  @RequestMapping(method = RequestMethod.POST
  , value="/{instanceId}/Pessoa")
  public Pessoa postPessoa(@Validated @RequestBody final Pessoa entity, @PathVariable("instanceId") java.lang.String instanceId) throws Exception {
  Cidade cidade = this.cidadeBusiness.get(instanceId);
  entity.setCidade(cidade);
    return this.pessoaBusiness.post(entity);
  }


  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/generalSearch")
  public HttpEntity<PagedResources<Cidade>> generalSearch(java.lang.String search, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cidadeBusiness.generalSearch(search, pageable)), HttpStatus.OK);
  }

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/specificSearch")
  public HttpEntity<PagedResources<Cidade>> specificSearch(java.lang.String nome, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(cidadeBusiness.specificSearch(nome, pageable)), HttpStatus.OK);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   *
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public Cidade get(@PathVariable("id") java.lang.String id) throws Exception {
    return cidadeBusiness.get(id);
  }

}
