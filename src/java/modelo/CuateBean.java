package modelo;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import controller.*;
import java.util.Collection;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name = "Cuate")
@SessionScoped

public class CuateBean {

    private String user;
    private String password;
    private Cuate cuate;
    @ManagedProperty(value = "#{buscaCuate}")
    private static CuateBuscaInterface cuates;
    private Collection<Cuate> listaCuates = null;

    public CuateBean() {
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cuate getCuate() {
        cuate = cuates.BuscaCuate(user, password);
        return cuate;
    }

    public void setCuate(Cuate cuate) {
        this.cuate = cuate;
    }

    public static CuateBuscaInterface getCuates() {

        return cuates;
    }

    public void setCuates(CuateBuscaInterface cuates) {

        this.cuates = cuates;
    }

    public Collection<Cuate> getListaCuates() {
        listaCuates = cuates.ListaCuates();
        return listaCuates;
    }

    public String pagoCuotas() {
        String pagina = "";
        cuate = cuates.BuscaCuate(user, password);
        if (cuate == null) {
            pagina = "Intruso";
        } else if (cuate.getCuotas() < 200) {
            pagina = "Deudor";
        } else if (cuate.getNombres().equals("")) {
            pagina = "Jefe";
        } else {
            pagina = "Cuate";
        }
        return pagina;
    }

}
