import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class RegistroPonto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("HH:mm");
        
        System.out.print("Funcionario: ");
        String funcionario = sc.nextLine();
        
        System.out.print("Cargo: ");
        String cargo = sc.nextLine();
        
        System.out.println("===========================================");
        System.out.println("Sistema de configração de Ponto Real Salvos");
        System.out.println("===========================================");
        
        System.out.print("Entrada 1: ");
        LocalTime entradaPri = LocalTime.parse(sc.nextLine(), parser);
        
        System.out.print("Saida 1: ");
        LocalTime saidaPri = LocalTime.parse(sc.nextLine(), parser);
        
        System.out.print("Entrada 2: ");
        LocalTime entradaSecun = LocalTime.parse(sc.nextLine(), parser);
        
        System.out.print("Saida Final: ");
        LocalTime saidaFinal = LocalTime.parse(sc.nextLine(), parser);
        
        System.out.println("Horario real: ");
        LocalTime chegadaReal = LocalTime.parse(sc.nextLine(), parser);
        
        if(chegadaReal.isAfter(entradaPri)) {
            System.out.println("[ATRASADO!] REVER COM SEU ENCARREGADO OU GERENTE LOCAL! ");
        }
        else {
            System.out.println("[OK] REVER ANOTAÇÕES ");
        }
        
        System.out.println("=====================RELATORIO FINAL===================");
        System.out.println("| Funcionario:  |" + funcionario + " | ");
        System.out.println("| Cargo: |" + cargo + " | ");
        System.out.println("| Horario de contrato: |" + entradaPri + " | ");
        System.out.println("| Horario de contrato: |" + saidaPri + " | ");
        System.out.println("| Horario de contrato: |" + entradaSecun + " | ");
        System.out.println("| Horario de contrato: |" + saidaFinal + " | ");
        System.out.println("| Horario que chegou realmente: |" + chegadaReal + " | ");
        
        
        sc.close();
    }
}