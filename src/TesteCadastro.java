import java.util.Date;

public class TesteCadastro {

    public static void main(String[] args) {

        Candidato candidato = new Candidato("Erikson Silva", "12345678998", new Date("04/17/1994"), Sexo.MASC,
                "Silvia Lucia Mariano", "145", "Ap 14", "Campo das Antas", "Pocos de Caldas",
                "MG", "eriksonssilva94@gmail.com",000000000,991038045, true, "Analista de Sistemas",
                "Neo BPO", 2100.00, true, 3000.00, 6000.00,
                "Java Basico, Powershell, Selenium, C++ Basico, Comunicativo");

        ExportarCsv export = new ExportarCsv();

        export.exportarCsv(candidato);

    }

}