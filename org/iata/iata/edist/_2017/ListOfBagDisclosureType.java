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
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Select a value from the enumerated list or enter a string value.
 *  =enumerated values=
 * N = NOT SUBJECT TO US DOT RESERVATION OR DISCLOSURE
 * Y = SUBJECT TO US DOT RESERVATION AND DISCLOSURE
 * D = SUBJECT TO DISCLOSURE BUT NOT TO US DOT RESERVATION
 * 
 * <p>Java class for ListOfBagDisclosureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ListOfBagDisclosureType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BagDisclosure" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BagRule" type="{http://www.iata.org/IATA/EDIST/2017.2}BagDiscloseRuleSimpleType"/>
 *                   &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.2}Descriptions" minOccurs="0"/>
 *                   &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}BaggageDeterminingCarrierType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
 *                 &lt;attribute name="CheckInTFC_ApplicableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="DeferralInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CommercialAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FixedPrePaidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
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
@XmlType(name = "ListOfBagDisclosureType", propOrder = {
    "bagDisclosure"
})
public class ListOfBagDisclosureType {

    @XmlElement(name = "BagDisclosure", required = true)
    protected List<ListOfBagDisclosureType.BagDisclosure> bagDisclosure;

    /**
     * Gets the value of the bagDisclosure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bagDisclosure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBagDisclosure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ListOfBagDisclosureType.BagDisclosure }
     * 
     * 
     */
    public List<ListOfBagDisclosureType.BagDisclosure> getBagDisclosure() {
        if (bagDisclosure == null) {
            bagDisclosure = new ArrayList<ListOfBagDisclosureType.BagDisclosure>();
        }
        return this.bagDisclosure;
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
     *         &lt;element name="BagRule" type="{http://www.iata.org/IATA/EDIST/2017.2}BagDiscloseRuleSimpleType"/>
     *         &lt;element name="Descriptions" type="{http://www.iata.org/IATA/EDIST/2017.2}Descriptions" minOccurs="0"/>
     *         &lt;element name="BaggageDeterminingCarrier" type="{http://www.iata.org/IATA/EDIST/2017.2}BaggageDeterminingCarrierType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.iata.org/IATA/EDIST/2017.2}DataListObjAttrGroup"/>
     *       &lt;attribute name="CheckInTFC_ApplicableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="DeferralInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CommercialAgreementID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FixedPrePaidInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bagRule",
        "descriptions",
        "baggageDeterminingCarrier"
    })
    public static class BagDisclosure {

        @XmlElement(name = "BagRule", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String bagRule;
        @XmlElement(name = "Descriptions")
        protected Descriptions descriptions;
        @XmlElement(name = "BaggageDeterminingCarrier")
        protected BaggageDeterminingCarrierType baggageDeterminingCarrier;
        @XmlAttribute(name = "CheckInTFC_ApplicableInd")
        protected Boolean checkInTFCApplicableInd;
        @XmlAttribute(name = "DeferralInd")
        protected Boolean deferralInd;
        @XmlAttribute(name = "CommercialAgreementID")
        protected String commercialAgreementID;
        @XmlAttribute(name = "FixedPrePaidInd")
        protected Boolean fixedPrePaidInd;
        @XmlAttribute(name = "refs")
        @XmlIDREF
        protected List<Object> refs;
        @XmlAttribute(name = "ListKey", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String listKey;

        /**
         * Gets the value of the bagRule property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBagRule() {
            return bagRule;
        }

        /**
         * Sets the value of the bagRule property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBagRule(String value) {
            this.bagRule = value;
        }

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
         * Gets the value of the baggageDeterminingCarrier property.
         * 
         * @return
         *     possible object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public BaggageDeterminingCarrierType getBaggageDeterminingCarrier() {
            return baggageDeterminingCarrier;
        }

        /**
         * Sets the value of the baggageDeterminingCarrier property.
         * 
         * @param value
         *     allowed object is
         *     {@link BaggageDeterminingCarrierType }
         *     
         */
        public void setBaggageDeterminingCarrier(BaggageDeterminingCarrierType value) {
            this.baggageDeterminingCarrier = value;
        }

        /**
         * Gets the value of the checkInTFCApplicableInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCheckInTFCApplicableInd() {
            return checkInTFCApplicableInd;
        }

        /**
         * Sets the value of the checkInTFCApplicableInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCheckInTFCApplicableInd(Boolean value) {
            this.checkInTFCApplicableInd = value;
        }

        /**
         * Gets the value of the deferralInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDeferralInd() {
            return deferralInd;
        }

        /**
         * Sets the value of the deferralInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDeferralInd(Boolean value) {
            this.deferralInd = value;
        }

        /**
         * Gets the value of the commercialAgreementID property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCommercialAgreementID() {
            return commercialAgreementID;
        }

        /**
         * Sets the value of the commercialAgreementID property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCommercialAgreementID(String value) {
            this.commercialAgreementID = value;
        }

        /**
         * Gets the value of the fixedPrePaidInd property.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFixedPrePaidInd() {
            return fixedPrePaidInd;
        }

        /**
         * Sets the value of the fixedPrePaidInd property.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFixedPrePaidInd(Boolean value) {
            this.fixedPrePaidInd = value;
        }

        /**
         * Gets the value of the refs property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refs property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefs().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Object }
         * 
         * 
         */
        public List<Object> getRefs() {
            if (refs == null) {
                refs = new ArrayList<Object>();
            }
            return this.refs;
        }

        /**
         * Gets the value of the listKey property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getListKey() {
            return listKey;
        }

        /**
         * Sets the value of the listKey property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setListKey(String value) {
            this.listKey = value;
        }

    }

}
