// This class was generated on Tue, 04 Dec 2018 17:38:27 PST by version 0.1.0-dev+904328-dirty of Braintree SDK Generator
// OrderActionRequest.java
// @version 0.1.0-dev+904328-dirty
// @type object
// @data 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
// DO NOT EDIT
package com.paypal.orders;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import com.braintreepayments.http.annotations.*;
/**
 * Completes an action for an order.
 */
@Model
public class OrderActionRequest {

    // Required default constructor
    public OrderActionRequest() {}

	/**
	* The payment source definition.
	*/
	@SerializedName("payment_source")
	private PaymentSource paymentSource;

	public PaymentSource paymentSource() { return paymentSource; }
	
	public OrderActionRequest paymentSource(PaymentSource paymentSource) {
	    this.paymentSource = paymentSource;
	    return this;
	}
}
