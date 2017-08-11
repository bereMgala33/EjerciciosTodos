/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.com.att.javaocho.referencedMethods;

/**
 *
 * @author Oracle
 */
public class RefenciadosTest {
    
    public void referenciaMetodoParticular(){
    }
    
    public void referenciaConstructor(){
        IPersona iper = Persona::new ;
        Persona per = iper.crear(1, "Berenice Murillo");
        
        IPersona ipersona = new IPersona() {
            @Override
            public Persona crear(int id, String nombre) {
                 return new Persona(id, nombre);
            }
        };
        
        
        IPersona iPersonaLambda = (int id, String nombre )-> {return new Persona(id, nombre);};
        
       
        
        System.out.println(per);
    }
    
}
