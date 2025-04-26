import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ValidadorCpfTeste {

    @Test
    void deveRetornarTrueParaCpfCom11Digitos() {
        assertTrue(ValidadorCpf.validarCpf("12345678901"));
    }

    @Test
    void deveRetornarFalseParaCpfComMenosDe11Digitos() {
        assertFalse(ValidadorCpf.validarCpf("12345678"));
    }

    @Test
    void deveRetornarFalseParaCpfNulo() {
        assertFalse(ValidadorCpf.validarCpf(null));
    }

    @Test
    void deveRetornarFalseParaCpfComMaisDe11Digitos() {
        assertFalse(ValidadorCpf.validarCpf("1234567890123"));
    }
}
