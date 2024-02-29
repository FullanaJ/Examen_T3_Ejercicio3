package api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import api.service.ClientService;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
public class NumberController {

    @Autowired
    private final ClientService clientService;

    public NumberController(ClientService clientService) {
        this.clientService = clientService;
    }

    /**
     * Este método devuelve una lista de 100 números aleatorios.
     * @return
     */
    @GetMapping(value = "/random/numbers")
    public ResponseEntity<List<Integer>> getAllNumbers() {
        return ResponseEntity.ok(clientService.getAllNumbers());
    }

    /**
     * Este método recibe un número y devuelve un número aleatorio del mismo tamaño de digitos que el valor de este.
     * @param d
     * @return
     */
    @GetMapping(value = "/random/numbers/{d}")
    public ResponseEntity<String> getNumberSize(@PathVariable String d) {
        return ResponseEntity.ok(clientService.getNumberSize(Integer.parseInt(d)));
    }

    /**
     * Este método recibe un JSON con un número y devuelve un JSON con un numero aleatorio del mismo tamaño.
     * @param d
     * @return
     */
    @PostMapping(value = "/random/numbers")
    public ResponseEntity<Map<String,String>> numeroAleatorioJson(@RequestBody Map<String,String> d) {
        d.put("random",clientService.getNumberSize(d.get("random").length()));
        return ResponseEntity.ok(d);
    }

}
