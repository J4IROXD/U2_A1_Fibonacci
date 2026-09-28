package mx.edu.utez.Fibonacci.controller;

import mx.edu.utez.Fibonacci.controller.dto.RequestBobyDTO;
import org.springframework.web.bind.annotation.*;

@CrossOrigin({"*"})
@RestController
@RequestMapping("fibonacci")
public class MyController {

    RequestBobyDTO rs = new RequestBobyDTO();

        @GetMapping("/{n}")
        public String fibonacci(@PathVariable int n) {

            long anterior = 0;
            long actual = 1;

            for (int i = 1; i <= n; i++) {
                System.out.println(anterior);
                long siguiente = anterior + actual;
                anterior = actual;
                actual = siguiente;
            }

            return rs.getNombre();
        }
}
