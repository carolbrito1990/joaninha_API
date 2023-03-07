package br.com.springboot.joaninha_API.controller;

import br.com.springboot.joaninha_API.model.Cadastro;
import com.google.gson.Gson;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@CrossOrigin(origins = "*")
@RestController
public class controller {
    public ArrayList<Cadastro> cadastros = new ArrayList<Cadastro>();
    @GetMapping(value = "/get-hello-world")
    public String getHelloWorld() {
        return "Hello World! Joaninha Baby ";
    }

    @GetMapping(value = "/cadastros")
    public String getAllCadastro() {
        this.cadastros.clear();

        for (var i = 0; i <5; i++) {
            var cadastro = new Cadastro(i, "ste@ste.com", "04/03/2023", true, null);
            this.cadastros.add(cadastro);
        }

        return new Gson().toJson(this.cadastros) ;
    }
}
