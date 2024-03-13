package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Ticket;
import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service.TicketService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/ticket")
public class TicketController {

	@Autowired
	TicketService ticketServ;
	
	@GetMapping
    public List<Ticket> findAll() {
        return ticketServ.findAll();
    }

    @GetMapping("/{id}")
    public Ticket findById(@PathVariable("id") int id) {
        return ticketServ.findById(id);
    }

    @GetMapping(params = "title")
    public List<Ticket> findByName(@RequestParam("title") String title) {
        return ticketServ.findByName(title);
    }

    @PostMapping
    public Ticket save(@RequestBody Ticket ticket) {
        return ticketServ.save(ticket);
    }

    @PutMapping("/{id}")
    public Ticket update(@PathVariable("id") int id, @RequestBody Ticket ticket) {
    	ticket.setId(id);
        return ticketServ.save(ticket);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable("id") int id) {
    	ticketServ.deleteById(id);
    }

    @DeleteMapping
    public void deleteAll() {
    	ticketServ.deleteAll();
    }
}
