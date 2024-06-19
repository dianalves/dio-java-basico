package edu.diana.msnmessenger.apps;

public class Facebook  extends ServicoMensagemInstantanea{
    public void enviarMensagem() {
		validarConectadoInternet();
		salvarHistoricoMensagem();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
	}
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}
}
