//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.09.13 at 05:58:59 PM CEST 
//


package org.iata.iata.edist._2017;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Associated Shopper(s) definition.
 * 
 * <p>Java class for ShopperInfoAssocType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ShopperInfoAssocType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.iata.org/IATA/EDIST/2017.2}PassengerReference" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AllShopperInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShopperInfoAssocType", propOrder = {
    "passengerReference"
})
public class ShopperInfoAssocType {

    @XmlList
    @XmlElement(name = "PassengerReference")
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> passengerReference;
    @XmlAttribute(name = "AllShopperInd")
    protected Boolean allShopperInd;

    /**
     * Gets the value of the passengerReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Object }
     * 
     * 
     */
    public List<Object> getPassengerReference() {
        if (passengerReference == null) {
            passengerReference = new ArrayList<Object>();
        }
        return this.passengerReference;
    }

    /**
     * Gets the value of the allShopperInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllShopperInd() {
        return allShopperInd;
    }

    /**
     * Sets the value of the allShopperInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllShopperInd(Boolean value) {
        this.allShopperInd = value;
    }

}
