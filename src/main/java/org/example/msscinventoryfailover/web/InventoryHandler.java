package org.example.msscinventoryfailover.web;

import org.example.msscinventoryfailover.model.BeerInventoryDto;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.UUID;

@Component
public class InventoryHandler {
    public Mono<ServerResponse> listInventory(ServerRequest request) {
        return ServerResponse.ok()
                .body(Mono.just(List.of(
                        BeerInventoryDto.builder()
                        .id(UUID.randomUUID())
                        .beerId(UUID.fromString("00000000-0000-0000-0000-000000000000"))
                        .quantityOnHand(999)
                        .createdDate(OffsetDateTime.now())
                        .lastModifiedDate(OffsetDateTime.now())
                        .build())), List.class);
    }
}
