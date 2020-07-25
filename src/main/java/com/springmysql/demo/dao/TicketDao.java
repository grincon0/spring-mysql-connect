package com.springmysql.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.springmysql.demo.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket, Integer>{

}
