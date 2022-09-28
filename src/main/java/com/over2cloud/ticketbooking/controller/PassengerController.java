/**
 * 
 */
package com.over2cloud.ticketbooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.over2cloud.ticketbooking.model.TicketEntity;
import com.over2cloud.ticketbooking.service.TicketService;

/**
 * @author Suraj.Singh
 *
 */

@RestController
@RequestMapping("/ticketbooking")
public class PassengerController {
	
	@Autowired
	private TicketService ticketService;
	
	@GetMapping(value = "/allTicket")
	public Iterable<TicketEntity> findAllTickets(){
		
		return ticketService.findAllTicket();
	}
	
	
	@GetMapping(value = "/{ticketId}")
	public TicketEntity findTicketById(@PathVariable("ticketId") Integer id) {
		return ticketService.findTickeById(id);
	}
	
	@PostMapping(value = "/addPassenger")
	public TicketEntity addPassenger(@RequestBody TicketEntity ticket) {
		
		return ticketService.savePassengerRecord(ticket);
	}
	
	@PutMapping(value = "/{id}/{email}")
	public TicketEntity updatePassenger(@PathVariable("id") Integer id, @PathVariable("email") String email) {
		
		return ticketService.updateTicket(id, email);
	}
	
	@DeleteMapping(value = "/{id}")
	public void reovePassenger(@PathVariable("id") Integer id) {
		
		ticketService.removeTicket(id);
	}

}
