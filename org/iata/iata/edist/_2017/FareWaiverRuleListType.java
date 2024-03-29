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
 * <p>Java class for FareWaiverRuleListType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FareWaiverRuleListType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="ExchangedReissued"/>
 *     &lt;enumeration value="FareComponent"/>
 *     &lt;enumeration value="Other"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FareWaiverRuleListType")
@XmlEnum
public enum FareWaiverRuleListType {

    @XmlEnumValue("ExchangedReissued")
    EXCHANGED_REISSUED("ExchangedReissued"),
    @XmlEnumValue("FareComponent")
    FARE_COMPONENT("FareComponent"),
    @XmlEnumValue("Other")
    OTHER("Other");
    private final String value;

    FareWaiverRuleListType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FareWaiverRuleListType fromValue(String v) {
        for (FareWaiverRuleListType c: FareWaiverRuleListType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
