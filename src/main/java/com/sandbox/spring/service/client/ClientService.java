package com.sandbox.spring.service.client;

import com.sandbox.spring.model.entity.Address;
import com.sandbox.spring.model.entity.Client;
import com.sandbox.spring.model.repository.ClientRepository;
import com.sandbox.spring.service.client.request.ClientCreateRequest;
import com.sandbox.spring.service.client.request.ClientEditRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public List<Client> getClients() {
		return clientRepository.findAll();
	}

	public void create(ClientCreateRequest request) {
		Client client = new Client();
		client.setName(request.getName());
		Address address = new Address();
		address.setPostalCode(request.getAddress().getPostalCode());
		address.setAddress1(request.getAddress().getAddress1());
		address.setAddress2(request.getAddress().getAddress2());
		client.setAddress(address);

		clientRepository.save(client);
	}

	public void edit(int id, ClientEditRequest request) {
		Client savedClient = clientRepository.findOne(id);
		savedClient.setName(request.getName());
		Address address = new Address();
		address.setPostalCode(request.getAddress().getPostalCode());
		address.setAddress1(request.getAddress().getAddress1());
		address.setAddress2(request.getAddress().getAddress2());
		savedClient.setAddress(address);

		clientRepository.save(savedClient);
	}

	public void delete(int id) {
		clientRepository.delete(id);
	}
}
