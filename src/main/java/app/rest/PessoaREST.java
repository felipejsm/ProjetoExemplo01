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
 * Controller para expor serviços REST de Pessoa
 *
 * @generated
 **/
@RestController
@RequestMapping(value = "/api/rest/Pessoa")
public class PessoaREST {

  /**
   * Classe de negócio para manipulação de dados
   *
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
  public Pessoa post(@Validated @RequestBody final Pessoa entity) throws Exception {
    return pessoaBusiness.post(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade fornecida
   *
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT)
  public Pessoa put(@Validated @RequestBody final Pessoa entity) throws Exception {
    return pessoaBusiness.put(entity);
  }

  /**
   * Serviço exposto para salvar alterações de acordo com a entidade e id fornecidos
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.PUT, value = "/{pessoaId}")
  public Pessoa put(@Validated @RequestBody final Pessoa entity, @PathVariable("pessoaId") java.lang.String pessoaId) throws Exception {
    return pessoaBusiness.put(entity);
  }  

  /**
   * Serviço exposto para remover a entidade de acordo com o id fornecido
   * 
   * @generated
   */
  @RequestMapping(method = RequestMethod.DELETE, value = "/{pessoaId}")
  public void delete(@PathVariable("pessoaId") java.lang.String pessoaId) throws Exception {
    pessoaBusiness.delete(pessoaId);
  }

  /**
   * NamedQuery list
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  )
  public HttpEntity<PagedResources<Pessoa>> listParams (Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(pessoaBusiness.list(pageable)), HttpStatus.OK);
  }
  /**
   * NamedQuery listByNome
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET
  , value="/listByNome/{nome}")
  public HttpEntity<PagedResources<Pessoa>> listByNomeParams (@PathVariable("nome") java.lang.String nome, Pageable pageable, PagedResourcesAssembler assembler){
    return new ResponseEntity<>(assembler.toResource(pessoaBusiness.listByNome(nome, pageable)), HttpStatus.OK);
  }


  /**
   * Searchable fields - General search (Only strings fields)
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/generalSearch")
  public HttpEntity<PagedResources<Pessoa>> generalSearch(java.lang.String search, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(pessoaBusiness.generalSearch(search, pageable)), HttpStatus.OK);
  }

  /**
   * Searchable fields - Specific search
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/specificSearch")
  public HttpEntity<PagedResources<Pessoa>> specificSearch(java.lang.String nome, Pageable pageable, PagedResourcesAssembler assembler) {
    return new ResponseEntity<>(assembler.toResource(pessoaBusiness.specificSearch(nome, pageable)), HttpStatus.OK);
  }

  /**
   * Serviço exposto para recuperar a entidade de acordo com o id fornecido
   *
   * @generated
   */
  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  public Pessoa get(@PathVariable("id") java.lang.String id) throws Exception {
    return pessoaBusiness.get(id);
  }

}
