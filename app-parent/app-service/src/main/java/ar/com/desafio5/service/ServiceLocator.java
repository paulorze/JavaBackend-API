package ar.com.desafio5.service;

public class ServiceLocator {
	@SuppressWarnings("all")
	public static IEntidadBaseService getService (Class clazz) {
		String name = clazz.getCanonicalName() + "Impl";
		try {
			return (IEntidadBaseService) Class.forName(name).getConstructors()[0].newInstance();
		} catch (Exception e) {
			throw new IllegalArgumentException(name);
		}
	}
}
