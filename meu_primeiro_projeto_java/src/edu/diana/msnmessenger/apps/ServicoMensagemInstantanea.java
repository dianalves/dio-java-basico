package edu.diana.msnmessenger.apps;

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
	public abstract void receberMensagem();

    //mais um método que todos os filhos deverão implementar
	protected void salvarHistoricoMensagem() {
        System.out.println("Salvo historico de mensagem");
    }

	//somente os filhos conhecem este método
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}
}
