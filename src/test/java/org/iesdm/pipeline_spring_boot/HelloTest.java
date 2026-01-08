package org.iesdm.pipeline_spring_boot;

import org.iesdm.pipeline_spring_boot.controller.HelloControler;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class HelloTest {

    @Test
    public void comprobacionHelloController(){

        //instancio el controlador:
        HelloControler controller = new HelloControler();

        //Llamo al endpoint:
        String respuesta = controller.hello();

        //Realizamos la comprobacion :
        assertEquals("Hola desde mi primer PipeLine con Spring Boot!!" , respuesta);

    }

}
