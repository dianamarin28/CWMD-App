package edu.ubb.cwmdEjbClient.interfaces;

import java.util.List;

import javax.ejb.Remote;

import edu.ubb.cwmdEjbClient.dtos.ActiveFlowDTO;

@Remote
public interface ActiveFlowBeanInterface {

	ActiveFlowDTO findById(Long activeFlowId) throws RemoteException;

	List<ActiveFlowDTO> getActiveByUserId(Long userId) throws RemoteException;

	List<ActiveFlowDTO> getFinishedByUserId(Long userId) throws RemoteException;

	List<ActiveFlowDTO> getActiveForAdministrator(Long userId) throws RemoteException;

	List<ActiveFlowDTO> getFinishedForAdministrator(Long userId) throws RemoteException;

	ActiveFlowDTO updateActiveFlow(ActiveFlowDTO activeFlowDTO) throws RemoteException;

}
