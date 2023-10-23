package com.bbva.mzic.dto.pfinal;

import java.io.Serializable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * The ProductDTO class...
 */
public class ProductDTO implements Serializable {
	private static final long serialVersionUID = 2931699728946643245L;

	private String description, title, disable;
	private double amount;
	private long idProduct;

	/**
	 * Get the name attribute
	 */
	public String getDescription() {
		return this.description;
	}

	public void setDescription(final String description) {
		this.description = description;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(final String title) {
		this.title = title;
	}

	/**
	 * Indicates whether some other object is "equal to" this one.
	 */
	@Override
	public boolean equals(final Object obj) {
		if (obj == null) {
			return false;
		}
		if (obj == this) {
			return true;
		}
		if (obj.getClass() != getClass()) {
			return false;
		}
		final ProductDTO rhs = (ProductDTO) obj;
		return new EqualsBuilder().appendSuper(super.equals(obj)).append(title, rhs.title)
				.append(description, rhs.description).append(idProduct, rhs.idProduct).append(amount, rhs.amount)
				.append(disable, rhs.disable).isEquals();
	}

	/**
	 * Returns a hash code value for the object.
	 */
	@Override
	public int hashCode() {
		return new HashCodeBuilder().append(this.title).append(this.disable).append(this.description)
				.append(this.amount).append(this.idProduct).toHashCode();
	}

	/**
	 * Returns a string representation of the object. It is important to OBFUSCATE
	 * the attributes that are sensitive to show in the representation.
	 */
	@Override
	public String toString() {
		return new ToStringBuilder(this).append("amount", amount).append("idProduct", idProduct).append("title", title)
				.append("description", description).append("disable", disable).toString();
	}

	public String getDisable() {
		return disable;
	}

	public void setDisable(String disable) {
		this.disable = disable;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public long getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(long idProduct) {
		this.idProduct = idProduct;
	}
}
