package api.repository;

import api.model.Client;
//import org.springframework.stereotype.Repository;

import java.util.Optional;
//@Repository
public interface ClientRepository {
    Optional<Client> findByNameIgnoreCase(String code);
}
