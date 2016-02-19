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
public interface CajeroServicioRemote {
    public abstract boolean deposito();
   
}
