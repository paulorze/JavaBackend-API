package ar.com.desafio5.repository.pokedex;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import ar.com.desafio5.domain.pokedex.Sprites;
import ar.com.desafio5.repository.BaseCrud;

public class SpritesRepositoryImpl extends BaseCrud<Sprites> implements SpritesRepository {
	
	public SpritesRepositoryImpl () {
		super(Sprites.class, "SPRITES");
	}
	
	protected String getSaveSQL() {
		return "(back_default, back_shiny, front_default,front_shiny) values(?,?,?,?)";
	}
	
	protected void saveEntity(Sprites entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getBack_default());
		pst.setString(2, entity.getBack_shiny());
		pst.setString(3, entity.getFront_default());
		pst.setString(4, entity.getFront_shiny());
	}

	protected String getUpdateSQL() {
		return "back_default = ?, back_shiny = ?, front_default = ?, front_shiny = ?";
	}
	
	protected void setUpdateSQL(Sprites entity, PreparedStatement pst) throws SQLException {
		pst.setString(1, entity.getBack_default());
		pst.setString(2, entity.getBack_shiny());
		pst.setString(3, entity.getFront_default());
		pst.setString(4, entity.getFront_shiny());
	}
	
	protected Sprites fromResultSetToEntity (ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		String back_default = res.getString(2);
		String back_shiny = res.getString(3);
		String front_default = res.getString(4);
		String front_shiny = res.getString(5);
		return new Sprites(id, back_default, back_shiny, front_default, front_shiny);
	}
}
