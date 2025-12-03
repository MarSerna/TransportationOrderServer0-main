package es.upm.dit.apsv.transportationorderserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Test mínimo que carga el contexto de la aplicación principal.
 * Forzamos explícitamente la clase de configuración principal para evitar
 * que Spring detecte múltiples @SpringBootConfiguration.
 */
@SpringBootTest(classes = TransportationOrderServerApplication.class)
class TransportationOrderServerApplicationTests {

    @Test
    void contextLoads() {
        // test vacío: su único propósito es comprobar que el contexto arranca.
    }
}
