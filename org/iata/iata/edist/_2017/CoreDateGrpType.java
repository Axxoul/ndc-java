//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.13 at 05:58:59 PM CEST 
//


package org.iata.iata.edist._2017;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A data type definition for Commonly Used Date Representation Formats: Short Date, Date and Time, Timestamp
 * 
 * <p>Java class for CoreDateGrpType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoreDateGrpType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ShortDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Timestamp" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Time" type="{http://www.iata.org/IATA/EDIST/2017.2}TimeSimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoreDateGrpType")
@XmlSeeAlso({
    org.iata.iata.edist._2017.ServiceQualifierPriceType.Fulfillment.OfferValidDates.Start.class,
    org.iata.iata.edist._2017.ServiceQualifierPriceType.Fulfillment.OfferValidDates.End.class,
    org.iata.iata.edist._2017.TimeLimits.PaymentTimeLimit.class,
    org.iata.iata.edist._2017.InvGuaranteeType.InvGuaranteeTimeLimit.class,
    org.iata.iata.edist._2017.ServiceFulfillmentType.OfferValidDates.Start.class,
    org.iata.iata.edist._2017.ServiceFulfillmentType.OfferValidDates.End.class,
    org.iata.iata.edist._2017.OfferValidPeriodType.Earliest.class,
    org.iata.iata.edist._2017.OfferValidPeriodType.Latest.class,
    org.iata.iata.edist._2017.FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.Start.class,
    org.iata.iata.edist._2017.FulfillmentPartnerType.Fulfillments.Fulfillment.OfferValidDates.End.class,
    org.iata.iata.edist._2017.CouponFlightSegmentType.DepartureDateTime.class,
    org.iata.iata.edist._2017.OfferTimeLimitSetType.OfferExpiration.class,
    org.iata.iata.edist._2017.OfferIncentiveType.Incentive.ExpirationDate.class,
    org.iata.iata.edist._2017.OrderType.TimeLimits.PaymentTimeLimit.class,
    org.iata.iata.edist._2017.CouponSoldAirlineType.DepartureDateTime.class,
    org.iata.iata.edist._2017.CouponSoldAirlineType.ArrivalDateTime.class,
    InventoryGuaranteeTimeLimits.class
})
public class CoreDateGrpType {

    @XmlAttribute(name = "DateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateTime;
    @XmlAttribute(name = "ShortDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar shortDate;
    @XmlAttribute(name = "Timestamp")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timestamp;
    @XmlAttribute(name = "Time")
    protected String time;

    /**
     * Gets the value of the dateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateTime() {
        return dateTime;
    }

    /**
     * Sets the value of the dateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateTime(XMLGregorianCalendar value) {
        this.dateTime = value;
    }

    /**
     * Gets the value of the shortDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getShortDate() {
        return shortDate;
    }

    /**
     * Sets the value of the shortDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setShortDate(XMLGregorianCalendar value) {
        this.shortDate = value;
    }

    /**
     * Gets the value of the timestamp property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTimestamp() {
        return timestamp;
    }

    /**
     * Sets the value of the timestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTimestamp(XMLGregorianCalendar value) {
        this.timestamp = value;
    }

    /**
     * Gets the value of the time property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTime() {
        return time;
    }

    /**
     * Sets the value of the time property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTime(String value) {
        this.time = value;
    }

}
