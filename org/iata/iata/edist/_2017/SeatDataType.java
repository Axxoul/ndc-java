//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.13 at 05:58:59 PM CEST 
//


package org.iata.iata.edist._2017;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Seat size and marketing information definition.
 * 
 * <p>Java class for SeatDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SeatDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;sequence>
 *           &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.2}Descriptions" minOccurs="0"/>
 *           &lt;element name="UOM" type="{http://www.iata.org/IATA/EDIST/2017.2}SizeUnitSimpleType" minOccurs="0"/>
 *           &lt;choice>
 *             &lt;sequence>
 *               &lt;element name="SeatPitchLow" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *               &lt;element name="SeatWidthLow" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *             &lt;/sequence>
 *             &lt;element name="Keywords" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="KeyWord" type="{http://www.iata.org/IATA/EDIST/2017.2}KeyWordType" maxOccurs="unbounded"/>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/choice>
 *         &lt;/sequence>
 *         &lt;element name="Marketing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}SeatMapMessageType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDataType", propOrder = {
    "descriptions",
    "uom",
    "seatPitchLow",
    "seatWidthLow",
    "keywords",
    "marketing"
})
@XmlSeeAlso({
    org.iata.iata.edist._2017.SeatLocationType.Row.SeatData.class
})
public class SeatDataType {

    @XmlElement(name = "Descriptions")
    protected Descriptions descriptions;
    @XmlElement(name = "UOM")
    @XmlSchemaType(name = "string")
    protected SizeUnitSimpleType uom;
    @XmlElement(name = "SeatPitchLow")
    protected BigDecimal seatPitchLow;
    @XmlElement(name = "SeatWidthLow")
    protected BigDecimal seatWidthLow;
    @XmlElement(name = "Keywords")
    protected SeatDataType.Keywords keywords;
    @XmlElement(name = "Marketing")
    protected SeatDataType.Marketing marketing;

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link Descriptions }
     *     
     */
    public Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link Descriptions }
     *     
     */
    public void setDescriptions(Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the uom property.
     * 
     * @return
     *     possible object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public SizeUnitSimpleType getUOM() {
        return uom;
    }

    /**
     * Sets the value of the uom property.
     * 
     * @param value
     *     allowed object is
     *     {@link SizeUnitSimpleType }
     *     
     */
    public void setUOM(SizeUnitSimpleType value) {
        this.uom = value;
    }

    /**
     * Gets the value of the seatPitchLow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatPitchLow() {
        return seatPitchLow;
    }

    /**
     * Sets the value of the seatPitchLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatPitchLow(BigDecimal value) {
        this.seatPitchLow = value;
    }

    /**
     * Gets the value of the seatWidthLow property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSeatWidthLow() {
        return seatWidthLow;
    }

    /**
     * Sets the value of the seatWidthLow property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSeatWidthLow(BigDecimal value) {
        this.seatWidthLow = value;
    }

    /**
     * Gets the value of the keywords property.
     * 
     * @return
     *     possible object is
     *     {@link SeatDataType.Keywords }
     *     
     */
    public SeatDataType.Keywords getKeywords() {
        return keywords;
    }

    /**
     * Sets the value of the keywords property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDataType.Keywords }
     *     
     */
    public void setKeywords(SeatDataType.Keywords value) {
        this.keywords = value;
    }

    /**
     * Gets the value of the marketing property.
     * 
     * @return
     *     possible object is
     *     {@link SeatDataType.Marketing }
     *     
     */
    public SeatDataType.Marketing getMarketing() {
        return marketing;
    }

    /**
     * Sets the value of the marketing property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDataType.Marketing }
     *     
     */
    public void setMarketing(SeatDataType.Marketing value) {
        this.marketing = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="KeyWord" type="{http://www.iata.org/IATA/EDIST/2017.2}KeyWordType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "keyWord"
    })
    public static class Keywords {

        @XmlElement(name = "KeyWord", required = true)
        protected List<KeyWordType> keyWord;

        /**
         * Gets the value of the keyWord property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the keyWord property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKeyWord().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link KeyWordType }
         * 
         * 
         */
        public List<KeyWordType> getKeyWord() {
            if (keyWord == null) {
                keyWord = new ArrayList<KeyWordType>();
            }
            return this.keyWord;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}SeatMapMessageType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Marketing
        extends SeatMapMessageType
    {


    }

}
