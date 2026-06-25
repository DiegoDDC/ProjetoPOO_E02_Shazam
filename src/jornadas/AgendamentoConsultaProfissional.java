package jornadas;

import repositorio.ClinicaRepositorio;
import model.*;
import exceptions.*;
import java.util.Scanner;

public class AgendamentoConsultaProfissional {
    private ClinicaRepositorio repositorio;
    private Scanner sc = new Scanner(System.in);

    public AgendamentoConsultaProfissional(ClinicaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void executar() {
        System.out.println("\nAGENDAR CONSULTA POR PROFISSIONAL");
        System.out.print("CPF do Paciente: ");
        String cpf = sc.nextLine();
        
        try {
            Paciente paciente = repositorio.buscarPaciente(cpf);
            if (!paciente.isAtivo()) {
                System.out.println("Erro: Paciente inativo.");
                return;
            }
  