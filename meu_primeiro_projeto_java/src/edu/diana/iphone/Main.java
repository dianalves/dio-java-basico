package edu.diana.iphone;

import edu.diana.iphone.implementacoes.Smartphone;

public class Main {
    public static void main(String[] args) {
        Smartphone meuSmartphone = new Smartphone();

        // Testando funcionalidades do ReprodutorMusical
        meuSmartphone.tocar();
        meuSmartphone.pausar();
        meuSmartphone.selecionarMusica("Minha Música Favorita");

        // Testando funcionalidades do AparelhoTelefonico
        meuSmartphone.ligar("123-456-7890");
        meuSmartphone.atender();
        meuSmartphone.iniciarCorreioVoz();

        // Testando funcionalidades do NavegadorInternet
        meuSmartphone.exibirPagina("www.example.com");
        meuSmartphone.adicionarNovaAba();
        meuSmartphone.atualizarPagina();
    }
}