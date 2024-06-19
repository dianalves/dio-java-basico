package edu.diana.msnmessenger.apps;

public class MsnMessenger extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
		validarConectadoInternet();
		salvarHistoricoMensagem();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
}
