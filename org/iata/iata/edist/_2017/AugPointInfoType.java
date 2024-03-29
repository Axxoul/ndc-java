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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type definition for Augmentation Point Definition and List.
 * 
 * <p>Java class for AugPointInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AugPointInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AugPoint" type="{http://www.iata.org/IATA/EDIST/2017.2}AugPointType" maxOccurs="unbounded"/>
 *         &lt;element name="Lists" type="{http://www.iata.org/IATA/EDIST/2017.2}AugPointListType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AugPointInfoType", propOrder = {
    "augPoint",
    "lists"
})
public class AugPointInfoType {

    @XmlElement(name = "AugPoint", required = true)
    protected List<AugPointType> augPoint;
    @XmlElement(name = "Lists")
    protected AugPointListType lists;

    /**
     * Gets the value of the augPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the augPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAugPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AugPointType }
     * 
     * 
     */
    public List<AugPointType> getAugPoint() {
        if (augPoint == null) {
            augPoint = new ArrayList<AugPointType>();
        }
        return this.augPoint;
    }

    /**
     * Gets the value of the lists property.
     * 
     * @return
     *     possible object is
     *     {@link AugPointListType }
     *     
     */
    public AugPointListType getLists() {
        return lists;
    }

    /**
     * Sets the value of the lists property.
     * 
     * @param value
     *     allowed object is
     *     {@link AugPointListType }
     *     
     */
    public void setLists(AugPointListType value) {
        this.lists = value;
    }

}
