package jornadas;

import repositorio.ClinicaRepositorio;
import model.*;
import exceptions.*;
import java.util.Scanner;

public class CadastroPacienteCompleto {
    private ClinicaRepositorio repositorio;
    private Scanner sc = new Scanner(System.in);

    public CadastroPacienteCompleto(ClinicaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void executar() {
        System.out.println("\nCADASTRO COMPLETO");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("CPF: ");
        String cpf = sc.nextLine();
        
        int idade = -1;
        while (idade < 0) {
            System.out.print("Idade: ");
            try {
                idade = Integer.parseInt(sc.nextLine());
                if (idade < 0) System.out.println("Idade não pode ser negativa.");
            } catch (NumberFormatException e) {
                System.out.println("Entrada invalida. Digite um numero.");
            }
        }