//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.13 at 05:58:59 PM CEST 
//


package org.iata.iata.edist._2017;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SecureTransactionListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SecureTransactionListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Authorize"/>
 *     &lt;enumeration value="CheckEnrollment"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Purchase"/>
 *     &lt;enumeration value="Refund"/>
 *     &lt;enumeration value="Validate"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SecureTransactionListType")
@XmlEnum
public enum SecureTransactionListType {


    /**
     * Amount is authorized. No funds are transferred.
     * 
     */
    @XmlEnumValue("Authorize")
    AUTHORIZE("Authorize"),
    @XmlEnumValue("CheckEnrollment")
    CHECK_ENROLLMENT("CheckEnrollment"),

    /**
     * 
     *             Complete a previous authorization. Funds are transferred.
     *           
     * 
     */
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),

    /**
     * Purchase. Funds are transferred immediately.
     * 
     */
    @XmlEnumValue("Purchase")
    PURCHASE("Purchase"),

    /**
     * Refund. Funds transferred immediately.
     * 
     */
    @XmlEnumValue("Refund")
    REFUND("Refund"),

    /**
     * 
     *             Validation Transaction. Effects a $1.00 Authorization to validate card details including expiry date, address.
     *           
     * 
     */
    @XmlEnumValue("Validate")
    VALIDATE("Validate");
    private final String value;

    SecureTransactionListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SecureTransactionListType fromValue(String v) {
        for (SecureTransactionListType c: SecureTransactionListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
