package com.example.clientservice.controller;


import com.example.clientservice.Service.ClientService;
import com.example.clientservice.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/client")
public class ClientController {
   @Autowired
    private ClientService clientService;

   @GetMapping("/all")
    public List<Client> getAllDoctors(){
        return clientService.getAllClients();
    }

      @PostMapping("/add")
    public Client addclilent(@RequestBody Client client ){
        return clientService.addClient(client);

    }
    @GetMapping("/findById/{clientId}")
    public Client findById(@PathVariable Long clientId){

       return clientService.findById(clientId);
    }
    @DeleteMapping("/delete/{clientId}")
    public void deleteDoctor(@PathVariable Long clientId){

        clientService.deleteClient(clientId);
    }

    @PutMapping("/update")
    public Client updateDoctor(@RequestBody Client client ){
       return clientService.updateClient(client );
    }
}
