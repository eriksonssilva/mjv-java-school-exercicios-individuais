import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ExportarCsv {

    public void exportarCsv(Candidato candidato) {

        StringBuilder exportarCandidato = new StringBuilder();

        exportarCandidato.append(candidato.getNome()).append(";");
        exportarCandidato.append(candidato.getCpf()).append(";");
        exportarCandidato.append(candidato.getDataNascimento()).append(";");
        exportarCandidato.append(candidato.getSexo()).append(";");
        exportarCandidato.append(candidato.getLogradouro()).append(";");
        exportarCandidato.append(candidato.getNumero()).append(";");
        exportarCandidato.append(candidato.getComplemento()).append(";");
        exportarCandidato.append(candidato.getBairro()).append(";");
        exportarCandidato.append(candidato.getCidade()).append(";");
        exportarCandidato.append(candidato.getEstado()).append(";");
        exportarCandidato.append(candidato.getEmail()).append(";");
        exportarCandidato.append(candidato.getTelefone()).append(";");
        exportarCandidato.append(candidato.getCelular()).append(";");
        exportarCandidato.append(candidato.isCelularWhats()).append(";");
        exportarCandidato.append(candidato.getProfissao()).append(";");
        exportarCandidato.append(candidato.getEmpresa()).append(";");
        exportarCandidato.append(candidato.getSalario()).append(";");
        exportarCandidato.append(candidato.isEmpregoAtual()).append(";");
        exportarCandidato.append(candidato.getPretencaoMinima()).append(";");
        exportarCandidato.append(candidato.getPretencaoMaxima()).append(";");
        exportarCandidato.append(candidato.getHabilidades()).append(";");

        Path arquivoDestino = Paths.get("C:\\Users\\Erikson\\Desktop\\Export\\Candidato.csv");


        try {
            Files.writeString(arquivoDestino, exportarCandidato.toString(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }

    }

}