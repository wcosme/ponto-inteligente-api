package br.com.kazale.pontointeligente.api.services;

import java.util.Optional;

import br.com.kazale.pontointeligente.api.entities.Funcionario;

public interface FuncionarioService {
	
	/**
	 * Persiti um funcionário
	 * @param funcionario
	 * @return Funcionario
	 */
	Funcionario persistir(Funcionario funcionario);
	
	/**
	 * Retorna um funcionário dado um CPF.
	 * @param cpf
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorCpf(String cpf);	
	
	/**
	 * Retorna um Funcionário pelo email.
	 * @param email
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorEmail(String email);
	
	/**
	 * Retorna um Funcionário pelo ID.
	 * @param id
	 * @return Optional<Funcionario>
	 */
	Optional<Funcionario> buscarPorId(Long id);
	
}
