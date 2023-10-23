package com.bbva.mzic.dto.pfinal.sub.sub2;

import com.bbva.elara.transaction.AbstractTransaction;

/**
 * In this class, the input and output data is defined automatically through the
 * setters and getters.
 */
public abstract class AbstractMZICTPF102MXTransaction extends AbstractTransaction {

	public AbstractMZICTPF102MXTransaction() {
	}

	/**
	 * Return value for input parameter Product
	 */
	protected long getProduct() {
		return (Long) this.getParameter("idProduct");
	}

	/**
	 * Set value for Boolean output parameter insert
	 */
	protected void setInsert(final Boolean field) {
		this.addParameter("insert", field);
	}
}
