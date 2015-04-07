/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;



@ManagedBean(name="buscaCuate", eager=true)
@ApplicationScoped
public class MapeaCuates implements CuateBuscaInterface{
    private Map<String,Cuate> cuates;
    private Collection <Cuate> lista=new ArrayList<Cuate>();
    public MapeaCuates() {
        cuates=new HashMap<>();
        
        addCuate(new Cuate ("user1", "123", "Pérez Pérez", "Pedro", 2345.60));
        addCuate(new Cuate ("user2", "abc", "Lopez Moreno", "Eduardo", 50.00));
        addCuate(new Cuate ("user3", "abc123", "Nava Rosales", "Omar", 68.00));
    }
    
    public Cuate BuscaCuate(String login, String pwd)
    {
        Cuate cuate=null;
        if (login !=null);
        {
            cuate=cuates.get(login.toLowerCase());
            if (cuate !=null){
                if (cuate.getPwd().equals(pwd)){
                    
                    return cuate;
                }
                else
                    return (null);
            }
        }
        return cuate;
    }
    
    private void addCuate(Cuate cuate)
    {
        cuates.put(cuate.getUser(), cuate);
        lista.add(cuate);
        cuates.put(cuate.getUser(),cuate);
    }

    @Override
    public Collection<Cuate> ListaCuates() {

        return lista;
    }
    
}
