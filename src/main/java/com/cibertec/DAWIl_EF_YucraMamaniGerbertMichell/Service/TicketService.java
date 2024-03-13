package com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Service;

import java.util.List;

import com.cibertec.DAWIl_EF_YucraMamaniGerbertMichell.Model.Ticket;

public interface TicketService {

    List<Ticket> findAll();

    List<Ticket> findByName(String title);

    Ticket findById(int id);

    Ticket save(Ticket ticket);

    void deleteById(int id);

    void deleteAll();
}
