package ar.com.desafio5.repository.pokedex;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ar.com.desafio5.domain.pokedex.Form;

public class FormRepositoryImpl extends PokedexBaseCrud<Form> implements FormRepository {
	
	public FormRepositoryImpl() {
		super(Form.class,"FORMS", "POKEMON_FORMS");
	}
	
	@Override
	protected Form fromResultSetToEntity(ResultSet res) throws SQLException {
		Long id = res.getLong(1);
		String name = res.getString(2);
		String url = res.getString(3);
		return new Form(id, name, url);
	}
	
	@Override
	public List<Form> findByPokemonId(Long id) {
		String sql = "SELECT F.* FROM POKEMON P \r\n"
				+ "JOIN POKEMON_FORMS PF ON P.ID = PF.POKEMON_ID \r\n"
				+ "INNER JOIN FORMS F ON F.ID = PF.FORM_ID \r\n"
				+ "WHERE P.ID = " + id;
		return super.getBySQL(sql);
	}

	@Override
	protected String getMTMSQL() {
		return "(pokemon_id, form_id) values (?,?)";
	}

}
