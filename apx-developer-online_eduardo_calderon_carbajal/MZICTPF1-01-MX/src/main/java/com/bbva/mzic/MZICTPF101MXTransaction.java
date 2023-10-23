package com.bbva.mzic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.mzic.dto.pfinal.ProductDTO;
import com.bbva.mzic.lib.rpf1.MZICRPF1;

/**
 * "5"
 *
 */
public class MZICTPF101MXTransaction extends AbstractMZICTPF101MXTransaction {

	private static final Logger LOGGER = LoggerFactory.getLogger(MZICTPF101MXTransaction.class);

	/**
	 * The execute method...
	 */
	@Override
	public void execute() {
		MZICRPF1 mzicRPF1 = this.getServiceLibrary(MZICRPF1.class);
		// TODO
		LOGGER.debug(">>>>>trx");
		final ProductDTO productDTO = mzicRPF1.executeGetProductByID(this.getIdproduct());
		LOGGER.debug(">>>>>ProductDTO: {}", productDTO.toString());
		setProduct(productDTO);
		LOGGER.debug("<<<<<<trx");
	}
}
