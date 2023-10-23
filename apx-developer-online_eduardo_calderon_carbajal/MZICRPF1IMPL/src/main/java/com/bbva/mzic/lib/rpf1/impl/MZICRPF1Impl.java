package com.bbva.mzic.lib.rpf1.impl;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.bbva.mzic.dto.pfinal.ProductDTO;

/**
 * The MZICRPF1Impl class...
 */
public class MZICRPF1Impl extends MZICRPF1Abstract {

	private static final Logger LOGGER = LoggerFactory.getLogger(MZICRPF1Impl.class);

	@Override
	public ProductDTO executeGetProductByID(long id) {
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug(">>>>>library:" + id);
		}
		LOGGER.debug(">>>>>0");
		final ProductDTO p = new ProductDTO();
		p.setIdProduct(id);
		LOGGER.debug(">>>>>1");

		final Map<String, Object> inData = new HashMap<String, Object>();
		inData.put("idProduct", id);
		LOGGER.debug(">>>>>2");

		final Map<String, Object> outData = jdbcUtils.queryForMap("select.client", inData);
		LOGGER.debug(">>>>>2.5");
		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("outData:" + outData);
		}
		LOGGER.debug(">>>>>3");

		p.setDescription((String) outData.get("DESCRIPTION"));
		p.setTitle((String) outData.get("TITLE"));
		p.setAmount(Double.parseDouble(outData.get("AMOUNT").toString()));
		p.setDisable((String) outData.get("DISABLE"));
		LOGGER.debug(">>>>>4");

		if (LOGGER.isDebugEnabled()) {
			LOGGER.debug("<<<<<library:" + id);
		}
		LOGGER.debug(">>>>>5");
		return p;
	}
}
