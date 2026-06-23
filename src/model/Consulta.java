package model;

public class Consulta implements Agendavel, Exportavel {

    private String cpfPaciente;
    private String nomeProfissional;
    private String data;
    private String horario;
    private String tipo;
    private String status;

    public Consulta(String cpfPaciente, String nomeProfissional, String data, String horario) {
        this.cpfPaciente = cpfPaciente;
        this.nomeProfissional = nomeProfissional;
        this.data = data;
        this.horario = horario;
        this.tipo = "inicial";
        this.status = "agendada";
    }

    public Consulta(String cpfPaciente, String nomeProfissional, String data,
                    String horario, String tipo) {
        this.cpfPaciente = cpfPaciente;
        this.nomeProfissional = nomeProfissional;
        this.data = data;
        this.horario = horario;
        this.tipo = tipo;
        this.status = "agendada";
    }

    public Consulta(String cpfPaciente, String nomeProfissional, String data,
                    String horario, String tipo, String status) {
        this.cpfPaciente = cpfPaciente;
        this.nomeProfissional = nomeProfissional;
        this.data = data;
        this.horario = horario;
        this.tipo = tipo;
        this.status = status;
    }

    public String getCpfPaciente() { 
        return cpfPaciente; 
    }
    public String getNomeProfissional() { 
        return nomeProfissional; 
    }
    public String getData() { 
        return data; 
    }
    public String getHorario() { 
        return horario; 
    }
    public String getTipo() { 
        return tipo; 
    }
    public String getStatus() { 
        return status; 
    }

    public void setCpfPaciente(String cpfPaciente) { 
        this.cpfPaciente = cpfPaciente; 
    }
    public void setNomeProfissional(String nomeProfissional) { 
        this.nomeProfissional = nomeProfissional; 
    }
    public void setData(String data) { 
        this.data = data; 
    }
    public void setHorario(String horario) { 
        this.horario = horario; 
    }
    public void setTipo(String tipo) { 
        this.tipo = tipo; 
    }
    public void setStatus(String status) { 
        this.status = status; 
    }

    @Override
    public void agendar() {
        this.status = "agendada";
    }

    @Override
    public void cancelar() {
        this.status = "cancelada";
    }

    public String cancelar(String motivo) {
        this.status = "cancelada";
        return "Consulta cancelada. Motivo: " + motivo;
    }

    @Override
    public void remarcar() {
        this.status = "remarcada";
    }

    public void realizar() {
        this.status = "realizada";
    }

    @Override
    public String exportarDados() {
        return "[CONSULTA] CPF: " + cpfPaciente + " | Prof: " + nomeProfissional
                + " | Data: " + data + " | Hora: " + horario
                + " | Tipo: " + tipo + " | Status: " + status;
    }

    public String exibirResumo() {
        return "Paciente(CPF): " + cpfPaciente + " | Prof: " + nomeProfissional
                + " | Data: " + data + " | Hora: " + horario
                + " | Tipo: " + tipo + " | Status: " + status;
    }
}

feat: implementa entidade Consulta com controle de agendamento

Cria a classe Consulta implementando as interfaces Agendavel e Exportavel.
A entidade gerencia os dados da marcação e transições de estado de 
atendimento (agendar, cancelar, remarcar, realizar), além de fornecer 
sobrecarga de construtores para facilitar a instanciação e persistência.

Implementando métodos de exportação de dados e exibição de resumo, permitindo integração com outros módulos do sistema, 
como relatórios e histórico de consultas. Usando encapsulamento para proteger os atributos e fornecer métodos de acesso e modificação.
