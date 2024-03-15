package br.com.surb.desafiocomponentesinjecaodependencia.services;

import br.com.surb.desafiocomponentesinjecaodependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    public double total(Order order){
        return order.getBasic();
    }
}
