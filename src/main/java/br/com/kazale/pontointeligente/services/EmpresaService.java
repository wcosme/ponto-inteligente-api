package br.com.kazale.pontointeligente.services;

import java.util.Optional;

import br.com.kazale.pontointeligente.api.entities.Empresa;

public interface EmpresaService {
	
	/**
	 * Retorna uma empresa dado um CNPJ.
	 * 
	 * @param cnpj
	 * @return Optional<Empresa>
	 */
	public Optional<Empresa> buscarPorCnpj(String cnpj);
	
	/**
	 * Realiza o cadastro de uma nova empresa.
	 * 
	 * @param empresa
	 * @return Empresa
	 */
	public Empresa persistir(Empresa empresa);

}
