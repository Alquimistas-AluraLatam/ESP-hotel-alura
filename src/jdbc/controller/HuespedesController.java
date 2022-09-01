package jdbc.controller;
import java.sql.Connection;
import java.util.List;

import jdb.factory.ConnectionFactory;
import jdbc.dao.HuespedesDAO;
import jdbc.modelo.Huespedes;


public class HuespedesController {
	 private HuespedesDAO huespedDAO;
	 
	 public HuespedesController() {
			Connection connection = new ConnectionFactory().recuperarConexao();
			this.huespedDAO = new HuespedesDAO(connection);
		}
	 
		public void guardar(Huespedes huespedes) {
			this.huespedDAO.guardar(huespedes);
		}
		public List<Huespedes> listarHuespedes() {
			return this.huespedDAO.listarHuespedes();
		}
}
