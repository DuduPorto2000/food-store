package br.edu.ifpb.padroes.strategy;

import br.edu.ifpb.padroes.domain.Payment;
import br.edu.ifpb.padroes.domain.PaymentType;

public class Credit implements PaymentInterface{


	@Override
	public Payment typePayment(PaymentType type) {
		System.out.println("Do credit card payment!");
		return null;
	}
}