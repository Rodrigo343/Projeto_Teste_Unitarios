package tdd.service;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;
import br.com.alura.tdd.service.ReajusterService;
import org.junit.jupiter.api.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReajusterServiceTest {

    private ReajusterService service;
    private Funcionario funcionario;

    @BeforeEach
    public void inicializar(){
        System.out.println("inicializar");
        this.service = new ReajusterService();
        this.funcionario = new Funcionario("Ana", LocalDate.now(), new BigDecimal("1000"));
    }

    @AfterEach
    public void finalizar(){
        System.out.println("Finalizar");
    }

    @BeforeAll
    public static void antesTodos(){
        System.out.println("Ates de todos");
    }

    @AfterAll
    public static void depoisTodos(){
        System.out.println("Depois de todos");
    }
    @Test
    public void reajusteDeTresPorcentoParaDesempenhoADesejar(){
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeQuinzePorcentoParaDesempenhoBom(){
        service.concederReajuste(funcionario, Desempenho.BOM);
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteDeVintePorcentoParaDesempenhoOtimo(){
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }
}
