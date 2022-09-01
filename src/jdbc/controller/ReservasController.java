package jdbc.controller;

import java.sql.Connection;
import java.util.List;
import jdb.factory.ConnectionFactory;
import jdbc.dao.ReservaDAO;
import jdbc.modelo.Reserva;

public class ReservasController {
 private ReservaDAO reservaDAO;
 
 public ReservasController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.reservaDAO = new ReservaDAO(connection);
	}
 
	public void salvar(Reserva reserva) {
		this.reservaDAO.salvar(reserva);
	}
	
	public List<Reserva> listar() {
		return this.reservaDAO.listar();
	}
}
