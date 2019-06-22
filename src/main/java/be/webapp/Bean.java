package be.webapp;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Named
@SessionScoped
public class Bean implements Serializable {
	private static final long serialVersionUID = -3090063784435170160L;

	private static final Logger LOGGER = LoggerFactory.getLogger(Bean.class);

	/**
	 * Default constructor.
	 */
	public Bean() {
		super();
	}

	public String getHelloBundleKey() {
		LOGGER.debug("String getHelloBundleKey() - start");
		return "hello";
	}
}
