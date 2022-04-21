package com.example.clientservice.Service;



import com.example.clientservice.model.Client;
import com.example.clientservice.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ClientService{
    @Autowired(required = false)
    private ClientRepository clientRepository;

public List<Client> getAllClients(){

    return clientRepository.findAll();
}
public Client addClient(Client client){
    return clientRepository.save(client);

}
public Client findById(Long clientId){
    return clientRepository.findById(clientId).orElse(null);
}
 public void deleteClient(Long clientId){
    Client newDoctor=findById(clientId);
  clientRepository.delete(newDoctor);
 }
public Client updateClient(Client client){
    return clientRepository.save(client);
}
}
