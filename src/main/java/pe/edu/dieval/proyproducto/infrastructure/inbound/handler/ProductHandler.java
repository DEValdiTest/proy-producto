package pe.edu.dieval.proyproducto.infrastructure.inbound.handler;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import pe.edu.dieval.proyproducto.application.facade.ProductFacade;
import pe.edu.dieval.proyproducto.domain.dto.ProductDto;
import reactor.core.publisher.Mono;

@Component
public class ProductHandler {

    ProductFacade productFacade;

    public ProductHandler(ProductFacade productFacade) {
        this.productFacade = productFacade;
    }

    public Mono<ServerResponse> addProduct(ServerRequest request) {
        return request
                .bodyToMono(ProductDto.class)
                .flatMap(req -> ServerResponse.ok()
                        .contentType(MediaType.APPLICATION_JSON)
                        .body(productFacade.addProduct(req), ProductDto.class));
    }

    public Mono<ServerResponse> deleteProduct(ServerRequest request) {
        return null;
    }
    public Mono<ServerResponse> getProduct(ServerRequest request) {
        return null;
    }
    public Mono<ServerResponse> updateProduct(ServerRequest request) {
        return null;
    }

}
