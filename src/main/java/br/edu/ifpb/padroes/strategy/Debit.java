package br.edu.ifpb.padroes.strategy;

import br.edu.ifpb.padroes.domain.Payment;
import br.edu.ifpb.padroes.domain.PaymentType;

public class Debit  implements PaymentInterface{


	@Override
	public Payment typePayment(PaymentType type) {
		System.out.println("Do debit payment!");
		return null;
	}

}