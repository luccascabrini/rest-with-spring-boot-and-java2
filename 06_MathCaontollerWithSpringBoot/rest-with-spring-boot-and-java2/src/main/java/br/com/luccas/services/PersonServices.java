package br.com.luccas.services;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import br.com.luccas.model.Person;

@Service //trata como objeto que vai ser injetado em outras classes em runtime
public class PersonServices {
	private final AtomicLong counter = new AtomicLong();
	private Logger logger = Logger.getLogger(PersonServices.class.getName());
	
	public List<Person> findAll() {
		List<Person> persons = new ArrayList<>();
		for(int i = 0; i < 8; i++) {
			Person person = mockPerson(i);
			persons.add(person);
		}
		return persons ;
	}
	private Person mockPerson(int i) {
		logger.info("Finding all people!");
		
		Person person =  new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Person name " + i);
		person.setLastName("Last name " + i);
		person.setAdress("Some address in Brasil " + i);
		person.setGender("Male");
		return person;
	}
	public Person findById(String id) {
		logger.info("Finding one person!");
		
		Person person =  new Person();
		person.setId(counter.incrementAndGet());
		person.setFirstName("Luccas");
		person.setLastName("Cabrini");
		person.setAdress("Belo Horizonte - Minas Gerais - Brasil");
		person.setGender("Male");
		return person;
	}
	
}
