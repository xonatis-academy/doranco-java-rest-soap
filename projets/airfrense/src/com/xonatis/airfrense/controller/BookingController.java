package com.xonatis.airfrense.controller;

import com.xonatis.airfrense.domain.Cancelable;
import com.xonatis.airfrense.domain.Ticket;
import com.xonatis.airfrense.dto.TicketRequest;
import com.xonatis.airfrense.service.BookingService;

public class BookingController {

	private BookingService bookingService;
	
	public BookingController(BookingService bookingService) {
		this.bookingService = bookingService;
	}
	
	public Cancelable book(TicketRequest request) {
		Ticket ticket = new Ticket(request.getPerson(), request.getDeparture(), request.getFrom(), request.getTo(), 0);
		return this.bookingService.book(null, ticket);
	}
	
	public boolean cancel(String reference) {
		return this.bookingService.cancel(Integer.parseInt(reference));
	}
	
}
