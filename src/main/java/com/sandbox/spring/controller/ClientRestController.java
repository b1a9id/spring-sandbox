package com.sandbox.spring.controller;

import com.sandbox.spring.controller.form.ClientCreateForm;
import com.sandbox.spring.controller.form.ClientEditForm;
import com.sandbox.spring.model.entity.Client;
import com.sandbox.spring.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/clients")
@RestController
public class ClientRestController {

	@Autowired
	private ClientService clientService;

	@GetMapping
	public List<Client> list() {
		return clientService.getClients();
	}

	@PostMapping("/create")
	public void create(
			@RequestBody @Validated ClientCreateForm form,
			BindingResult result) throws Exception{
		if (result.hasErrors()) {
			throw new BindException(result);
		}
		clientService.create(form.toClientCreateRequest());
	}

	@PutMapping("/edit/{id}")
	public void edit(
			@PathVariable Integer id,
			@RequestBody @Validated ClientEditForm form,
			BindingResult result) throws Exception {
		if (result.hasErrors()) {
			throw new BindException(result);
		}
		clientService.edit(id, form.toClientEditRequest());
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		clientService.delete(id);
	}
}
