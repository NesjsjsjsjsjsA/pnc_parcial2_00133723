package com.example.parcial02ncapas.Controller;

import com.example.parcial02ncapas.Model.DTOs.GenericResponse;
import com.example.parcial02ncapas.Model.DTOs.MagicProviderDTO;
import com.example.parcial02ncapas.Service.iMagicProviderService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/providers")
@RequiredArgsConstructor
public class MagicProviderController {

    private final iMagicProviderService magicProviderService;

    @PostMapping("/add")
    ResponseEntity<GenericResponse> registerPerson(@RequestBody @Valid MagicProviderDTO mgDto){
        return GenericResponse.builder()
                .message("Se ha creado con éxito")
                .data(magicProviderService.registrarProveedor(mgDto))
                .status(HttpStatus.OK)
                .build().buildResponse();
    }

}
