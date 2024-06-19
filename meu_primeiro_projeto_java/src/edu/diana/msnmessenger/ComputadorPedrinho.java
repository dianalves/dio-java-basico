package edu.diana.msnmessenger;

import edu.diana.msnmessenger.apps.Facebook;
import edu.diana.msnmessenger.apps.MsnMessenger;
import edu.diana.msnmessenger.apps.ServicoMensagemInstantanea;
import edu.diana.msnmessenger.apps.Telegram;

public class ComputadorPedrinho {
    public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        /*
         * NÃO SE SABE QUAL APP
         * MAS QUALQUER UM DEVERÁ ENVIAR E RECEBER MENSAGEM
         */
        String appEscolhido = "fbm";

        if (appEscolhido.equals("msn"))
            smi = new MsnMessenger();
        else if (appEscolhido.equals("fbm"))
            smi = new Facebook();
        else if (appEscolhido.equals("tlg"))
            smi = new Telegram();

        smi.enviarMensagem();
        smi.receberMensagem();
    }
}
