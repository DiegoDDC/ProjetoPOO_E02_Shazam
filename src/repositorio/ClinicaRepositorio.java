package repositorio;

import exceptions.*;
import model.*;
import java.util.*;

public class ClinicaRepositorio {
    private Map<String, Paciente> mapaPacientes = new HashMap<>();
    private Map<String, Profissional> mapaProfissionais = new HashMap<>();
    private Set<String> cpfsCadastrados = new HashSet<>();
    private List<Consulta> consultas = new ArrayList<>();
    private List<Atendimento> atendimentos = new ArrayList<>();
    private List<Pagamento> pagamentos = new ArrayList<>();
    private List<Double> multas = new ArrayList<>();
    private List<Pessoa> todasAsPessoas = new ArrayList<>();
    private List<Convenio> convenios = new ArrayList<>();
    private List<HorarioDisponivel> horariosDisponiveis = new ArrayList<>();

    public ClinicaRepositorio() {
        inicializarConvenios();
    }

    private void inicializarConvenios() {
        convenios.add(new Convenio("SaudePlus", 40.0, Arrays.asList("clinica geral", "fisioterapia", "nutricao")));
        convenios.add(new Convenio("VidaMais", 30.0, Arrays.asList("clinica geral", "psicologia")));
        convenios.add(new Convenio("BemEstar", 50.0, Arrays.asList("clinica geral", "fisioterapia", "psicologia", "nutricao")));
    }