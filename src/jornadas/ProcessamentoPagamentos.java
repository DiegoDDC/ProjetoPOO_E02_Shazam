package jornadas;

import repositorio.ClinicaRepositorio;
import model.*;
import exceptions.*;
import java.util.Scanner;

public class ProcessamentoPagamentos {
    private ClinicaRepositorio repositorio;
    private Scanner sc = new Scanner(System.in);

    public ProcessamentoPagamentos(ClinicaRepositorio repositorio) {
        this.repositorio = repositorio;
    }

    public void executar() {
        System.out.println("\nPROCESSAR PAGAMENTO");
        System.out.print("Indice da Consulta realizada: ");
        int indice;
        try { indice = Integer.parseInt(sc.nextLine()); } catch (Exception e) { System.out.println("Indice invalido."); return; }