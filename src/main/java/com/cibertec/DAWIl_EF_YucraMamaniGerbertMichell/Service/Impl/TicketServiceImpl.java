package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Ticket;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Repository.TicketRepository;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.TicketService;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	TicketRepository ticketRepo;
	
	@Override
	public List<Ticket> findAll() {
		return ticketRepo.findAll();
	}
	
	@Override
	public List<Ticket> findByName(String title) {
		return ticketRepo.findByName(title);
	}

	@Override
	public Ticket findById(int id) {
		return ticketRepo.findById(id).orElseThrow();
	}

	@Override
	public Ticket save(Ticket ticket) {
		return ticketRepo.save(ticket);
	}

	@Override
	public void deleteById(int id) {
		ticketRepo.deleteById(id);
	}

	@Override
	public void deleteAll() {
		ticketRepo.deleteAll();
	}

}
