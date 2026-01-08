package org.iesdm.pipeline_spring_boot.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class HelloControllerTest {

    @Test
    public void testHello(){

        //instancio el controlador:
        HelloController controller = new HelloController();

        //Llamo al endpoint:
        String respuesta = controller.hello();

        //Realizamos la comprobacion :
        assertEquals("Hola desde mi primer PipeLine con Spring Boot" , respuesta);

    }

}
