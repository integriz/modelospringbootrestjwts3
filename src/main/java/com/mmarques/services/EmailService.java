package com.mmarques.services;

import org.springframework.mail.SimpleMailMessage;

import com.mmarques.domain.Cliente;
import com.mmarques.domain.Pedido;

public interface EmailService {

	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendNewPasswordEmail(Cliente cliente, String newPass);
}