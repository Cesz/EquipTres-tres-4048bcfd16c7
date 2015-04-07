package controller;

import java.util.Collection;

/**
 *
 */
public interface CuateBuscaInterface {

    public Cuate BuscaCuate(String login, String pwd);

    public Collection<Cuate> ListaCuates();
}
