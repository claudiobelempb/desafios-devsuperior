package br.com.surb.desafiocomponentesinjecaodependencia.services;

import br.com.surb.desafiocomponentesinjecaodependencia.entities.Order;

public class ShippingService {
    public double shippingService(Order order){
        return order.getBasic() - order.getDiscount();
    }
}
