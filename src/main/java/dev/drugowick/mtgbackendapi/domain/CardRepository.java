package dev.drugowick.mtgbackendapi.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "cards")
public interface CardRepository extends JpaRepository<Card, Long> {

}
