package SenhorDosAneisExeptions;

public class PersonagemNaoEncontradoNoMapaException extends  RuntimeException{
    public PersonagemNaoEncontradoNoMapaException(String message){
        super(message);
    }
}
