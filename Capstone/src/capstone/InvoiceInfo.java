package capstone;

public class InvoiceInfo {
	// Invoice
	int invId;
	String oilType, oilGrade;
	String serviceParts[];
	double subTotal, tax, total;

	public InvoiceInfo(int invId, String oilType, String oilGrade,
			String[] serviceParts, double subTotal, double tax, double total) {
		this.invId = invId;
		this.oilType = oilType;
		this.oilGrade = oilGrade;
		this.serviceParts = serviceParts;
		this.subTotal = subTotal;
		this.tax = tax;
		this.total = total;
	}

	public int getInvId() {
		return invId;
	}

	public String getOilType() {
		return oilType;
	}

	public String getOilGrade() {
		return oilGrade;
	}

	public String[] getServiceParts() {
		return serviceParts;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public double getTax() {
		return tax;
	}

	public double getTotal() {
		return total;
	}

	public void setInvId(int invId) {
		this.invId = invId;
	}

	public void setOilType(String oilType) {
		this.oilType = oilType;
	}

	public void setOilGrade(String oilGrade) {
		this.oilGrade = oilGrade;
	}

	public void setServiceParts(String[] serviceParts) {
		this.serviceParts = serviceParts;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	public void setTotal(double total) {
		this.total = total;
	}
}
