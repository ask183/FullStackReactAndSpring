package com.crm2.crm2.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Demoloader implements CommandLineRunner {

  private final ContactRepository repository;

  @Autowired
  public Demoloader(ContactRepository repository) {
    this.repository = repository;
  }

  @Override
  public void run(String... strings) throws Exception {
    this.repository.save(new Contact("Aabharn", "Koppal", "ak@email.com"));
  }
}
