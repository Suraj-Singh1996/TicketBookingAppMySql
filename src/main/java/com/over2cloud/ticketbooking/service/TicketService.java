/**
 * 
 */
package com.over2cloud.ticketbooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.over2cloud.ticketbooking.dao.TicketDao;
import com.over2cloud.ticketbooking.model.TicketEntity;

/**
 * @author Suraj.Singh
 *
 */

@Service
public class TicketService {
	
	@Autowired
	private TicketDao ticketDao;
	
	public Iterable<TicketEntity> findAllTicket(){
		
		return ticketDao.findAll();
	}

	public TicketEntity findTickeById(Integer id) {
		
		return ticketDao.findById(id).orElse(new TicketEntity());
	}
	
	public TicketEntity savePassengerRecord(TicketEntity ticketdata) {
		
		return ticketDao.save(ticketdata);
	}
	
	public TicketEntity updateTicket(Integer id, String email) {
		
		TicketEntity obj = findTickeById(id);
		obj.setEmail(email);
		
		return ticketDao.save(obj);
	}
	
	public void removeTicket(Integer id) {
		
		ticketDao.deleteById(id);
	}
	
	public TicketEntity findTicketByPassangerName(String passangerName) {
		
		return ticketDao.findByPassangerName(passangerName);
	}
}
