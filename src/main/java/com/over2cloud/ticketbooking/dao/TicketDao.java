/**
 * 
 */
package com.over2cloud.ticketbooking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.over2cloud.ticketbooking.model.TicketEntity;

/**
 * @author Suraj.Singh
 *
 */

@Repository
public interface TicketDao extends CrudRepository<TicketEntity, Integer> {

	// Derived Method
	public TicketEntity findByPassangerName(String passangerName); //Abstract Method
}
