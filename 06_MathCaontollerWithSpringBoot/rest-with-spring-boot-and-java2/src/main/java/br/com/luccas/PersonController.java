package br.com.luccas;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import br.com.luccas.model.Person;
import br.com.luccas.services.PersonServices;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	@Autowired // Permite injetar o service atraves dessa annotation
	private PersonServices service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Person findById(
					  @PathVariable(value = "id") String id)throws Exception{
		return service.findById(id);
	}
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Person> findAll(){
		return service.findAll();
	}

}
