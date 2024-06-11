package edu.diana.candidatura;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo");
        List<String> nomesCandidatosSelecionados = selecaoCandidatos();
        mostrarCandidatosSelecionados(nomesCandidatosSelecionados);
        ligarParaCandidatosSelecionados(nomesCandidatosSelecionados);
    }

    static List<String> selecaoCandidatos() {
        String[] candidatos = {
            "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA", "DANIELA", "JORGE",
            "CARLOS", "ANA", "MARIO", "LUCIANA", "PEDRO", "ROBERTA", "SERGIO", "RENATA", "ANDRÉ", "FERNANDA",
            "THIAGO", "BEATRIZ", "LUIS", "CLARA", "ALINE", "HENRIQUE", "GISELE", "ANTONIO", "BRUNA", "RICARDO",
            "CAMILA", "ADRIANO", "LETICIA", "RAFAEL", "PATRICIA", "GABRIEL", "LARISSA", "DIEGO", "SIMONE",
            "JONATHAN", "CINTIA", "EVERTON", "KARINA", "FABIO", "SANDRA", "CAIO", "SUZANA", "LEONARDO", "JÉSSICA",
            "BRUNO", "TATIANA", "GUSTAVO", "PRISCILA", "RODRIGO", "ELAINE", "VITOR", "CRISTINA", "DANILO", "MARTA",
            "VINICIUS", "ISABEL", "MARCOS", "MONIQUE", "LUCAS", "JULIANA", "DANIEL", "CAROLINA", "RAUL", "SAMARA",
            "NATALIA", "ANDERSON", "GABRIELA", "FREDERICO", "LAURA", "EDUARDO", "MARIANA", "ALEX", "KARLA",
            "FERNANDO", "LUCIA", "MATHEUS", "FRANCISCA", "RAFAELA", "EDSON", "JAQUELINE", "GUILHERME", "BIANCA",
            "IGOR", "SABRINA", "LUIZ", "VANESSA", "WILLIAM", "RENAN", "BRUNO", "CLARICE", "MURILO", "ROSE",
            "OTÁVIO", "VERA"
    };

        int candidatosSelecionados = 0;
        List<String> nomesCandidatosSelecionados = new ArrayList<>();
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
                nomesCandidatosSelecionados.add(candidato);
            } else {
                System.out.println("O candidato " + candidato + " não foi selecionado para a vaga");
            }
            candidatosAtual++;
        }
        return nomesCandidatosSelecionados;

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void mostrarCandidatosSelecionados(List<String> nomesCandidatosSelecionados) {
        System.out.println("Candidatos selecionados:");
        for (String candidato : nomesCandidatosSelecionados) {
            System.out.println(candidato);
        }
    }

    static void ligarParaCandidatosSelecionados(List<String> nomesCandidatosSelecionados) {
        System.out.println("Ligando para candidatos selecionados...");
        List<String> atenderam = new ArrayList<>();
        List<String> naoAtenderam = new ArrayList<>();
        int tentativas = 0;

        for (String candidato : nomesCandidatosSelecionados) {
            tentativas++;
            boolean atendeu = tentativaDeLigacao();

            if (atendeu) {
                atenderam.add(candidato);
                System.out.println("O candidato " + candidato + " atendeu a ligação.");
            } else {
                naoAtenderam.add(candidato);
                System.out.println("O candidato " + candidato + " não atendeu a ligação.");
            }
        }

        System.out.println("\nResumo das ligações:");
        System.out.println("Total de tentativas de ligação: " + tentativas);
        System.out.println("Candidatos que atenderam:");
        for (String candidato : atenderam) {
            System.out.println(candidato);
        }
        System.out.println("Candidatos que não atenderam:");
        for (String candidato : naoAtenderam) {
            System.out.println(candidato);
        }
    }

    static boolean tentativaDeLigacao() {
        // Simulação de tentativa de ligação com 50% de chance de sucesso
        return ThreadLocalRandom.current().nextBoolean();
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o canditado com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demias candidatos");
        }
    }
}
