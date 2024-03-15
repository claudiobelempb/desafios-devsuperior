package br.com.surb.desafiocomponentesinjecaodependencia.services;

import br.com.surb.desafiocomponentesinjecaodependencia.entities.Order;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {
    public double shippingService(Order order){
        return order.getBasic() - order.getDiscount();
    }
}
