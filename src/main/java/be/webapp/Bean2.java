package be.webapp;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import be.webapp.persistence.model.User;

@Named
@SessionScoped
public class Bean2 implements Serializable {
	private static final long serialVersionUID = -515154154L;

	private static final Logger LOGGER = LoggerFactory.getLogger(Bean2.class);

	@PersistenceContext(unitName = "vpaEm")
	private EntityManager em;

	@Inject
	private Bean bean;

	/**
	 * Default constructor.
	 */
	public Bean2() {
		super();
	}

	public User testDatabase() {
		LOGGER.info("Test db");
		return em.find(User.class, 1L);
	}

	public String testInjection() {
		return bean.getHelloBundleKey();
	}
}
