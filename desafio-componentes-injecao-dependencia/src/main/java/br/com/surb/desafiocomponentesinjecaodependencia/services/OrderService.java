package br.com.surb.desafiocomponentesinjecaodependencia.services;

import br.com.surb.desafiocomponentesinjecaodependencia.entities.Order;

public class OrderService {
    public double total(Order order){
        return order.getBasic();
    }
}
