package api.service;

import api.model.Client;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import respository.ClientRepository;
import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {

/*
    private final ClientRepository clientRepository;
    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }
*/
    @Override
    public List<Client> getAllClients() {
        return List.of(
                new Client(1L,"Amazon","mail@123.com","+54 311 111","Av. Sueter","England","Manchester","1234"),
                new Client(2L,"Mercado Libre","aaa@aaa.com","+54 311 222","Av. Sueter","Argentina","Rosario","1234"),
                new Client(3L,"Alibaba","aaa@bbb.com","+54 311 333","Av. Sueter","China","Beijing","1234"),
                new Client(4L,"Ebay","bbb@ccc.com","+54 311 444","Av. Sueter","USA","New York","1234"),
                new Client(5L,"Aliexpress","ccc@ddd.com","+54 311 555","Av. Sueter","China","Shanghai","1234"),
                new Client(6L,"Wish","ddd@eee.com","+54 311 666","Av. Sueter","USA","Los Angeles","1234")
        );
    }
}
