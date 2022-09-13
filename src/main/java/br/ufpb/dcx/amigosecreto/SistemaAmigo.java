package br.ufpb.dcx.amigosecreto;

import java.util.Collection;
import java.util.List;

public class SistemaAmigo {
    public Amigo pesquisaAmigo(String emailAmigo) throws AmigoInexistenteException{
        //TODO
        return null;
    }

    public void cadastraAmigo(String nomeAmigo, String emailAmigo) throws AmigoJaExisteException {
        //TODO
    }

    public List<Mensagem> pesquisaTodasAsMensagens() {
        //TODO
        return null;
    }

    public void enviarMensagemParaTodos(String texto, String remetente, boolean ehAnonima) {
    //TODO
    }

    public void enviarMensagemParaAlguem(String texto, String remetente, String destinatario, boolean ehAnonima) {
        //TODO
    }

    public List<Mensagem> pesquisaMensagensAnonimas() {
        //TODO
        return null;
    }

    public String pesquisaAmigoSecretoDe(String emailDaPessoa) throws AmigoInexistenteException, AmigoNaoSorteadoException {
        //TODO
        return null;
    }

    public void configuraAmigoSecretoDe(String emailDaPessoa, String emailAmigoSorteado) throws  AmigoInexistenteException{
        //TODO
    }
}
