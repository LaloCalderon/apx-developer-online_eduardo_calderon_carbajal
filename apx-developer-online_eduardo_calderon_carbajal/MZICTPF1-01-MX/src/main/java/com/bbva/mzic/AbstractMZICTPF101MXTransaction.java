package com.bbva.mzic;

import com.bbva.elara.transaction.AbstractTransaction;
import com.bbva.mzic.dto.pfinal.ProductDTO;
//import com.bbva.mzic.dto.pfinal.sub1.sub2;

/**
 * In this class, the input and output data is defined automatically through the
 * setters and getters.
 */
public abstract class AbstractMZICTPF101MXTransaction extends AbstractTransaction {

	public AbstractMZICTPF101MXTransaction() {
	}

	/**
	 * Return value for input parameter idProduct
	 */
	protected Long getIdproduct() {
		return (Long) this.getParameter("idProduct");
	}

	/**
	 * Set value for sub2 output parameter Product
	 */
	protected void setProduct(final ProductDTO field) {
		this.addParameter("Product", field);
	}
}
