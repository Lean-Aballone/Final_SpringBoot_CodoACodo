package com.codo.finalproject.controller;
import com.codo.finalproject.dto.request.ReservaDto;
import jakarta.validation.Valid;
import com.codo.finalproject.dto.request.VueloDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.codo.finalproject.service.interfaces.IUsuarioService;
import com.codo.finalproject.service.implementations.UsuarioServiceImp;

@RestController
public class UsuarioController {
    private IUsuarioService service;
    public UsuarioController(UsuarioServiceImp service){
        this.service = service;
    }
    @PostMapping("/usuario/reserva")
    public ResponseEntity<?>crearReserva(@RequestBody @Valid ReservaDto reserva){
        return new ResponseEntity<>(service.crearReserva(reserva),HttpStatus.OK);
    }

    @PostMapping("/usuario/pagar")
    public ResponseEntity<?>pagar(@RequestBody @Valid VueloDto vueloDto){
        return new ResponseEntity<>(service.Pagar(),HttpStatus.OK); // falta saber que le pongo de argumento
    }
}