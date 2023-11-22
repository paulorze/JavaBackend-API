package ar.com.desafio5.controllers.parsers;

import java.io.InputStream;
import java.util.Collection;

public interface IParser<T> {
	public Collection<T> parse (InputStream inputStream);
}
