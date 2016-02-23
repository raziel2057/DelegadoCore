/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.espe.distri.serviciosRemotos;

import javax.ejb.Remote;

/**
 *
 * @author RAUL
 */
@Remote
public interface CajeroServicioRemote 
{
    public abstract boolean deposito(String identificador, String cuenta,float monto);
    public abstract boolean  logueo(String usuario, String clave);
    public abstract float getSaldo(String identificador,String cuenta);
    public abstract boolean retiro(String identificador,String cuenta,float monto);   
}
