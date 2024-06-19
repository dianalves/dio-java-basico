package edu.diana.msnmessenger.apps;

public class Telegram extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
		validarConectadoInternet();
		salvarHistoricoMensagem();
		System.out.println("Enviando mensagem pelo Telegram");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Telegram");
	}
}
