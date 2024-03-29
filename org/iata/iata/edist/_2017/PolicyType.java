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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A data type definition for Policy.
 * 
 * <p>Java class for PolicyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PolicyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CoreBaseType">
 *       &lt;sequence>
 *         &lt;element name="Nodes">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Node" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}NodePathType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Descriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}LinkDescriptionType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Metadata" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetaBaseType">
 *                 &lt;sequence>
 *                   &lt;element name="Remarks" type="{http://www.iata.org/IATA/EDIST/2017.2}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="EncodingScheme" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}EncSchemeType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ValidPeriod" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CorePeriodGrpType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PolicyCode" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="PolicyType" use="required" type="{http://www.iata.org/IATA/EDIST/2017.2}PolicyTypeListType" />
 *       &lt;attribute name="Version" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PolicyType", propOrder = {
    "nodes",
    "descriptions",
    "metadata"
})
@XmlSeeAlso({
    org.iata.iata.edist._2017.Policies.Policy.class,
    org.iata.iata.edist._2017.InfoPolicyNoticeType.Policy.class
})
public class PolicyType
    extends CoreBaseType
{

    @XmlElement(name = "Nodes", required = true)
    protected PolicyType.Nodes nodes;
    @XmlElement(name = "Descriptions")
    protected PolicyType.Descriptions descriptions;
    @XmlElement(name = "Metadata")
    protected PolicyType.Metadata metadata;
    @XmlAttribute(name = "PolicyType", required = true)
    protected String policyType;
    @XmlAttribute(name = "Version")
    protected String version;

    /**
     * Gets the value of the nodes property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType.Nodes }
     *     
     */
    public PolicyType.Nodes getNodes() {
        return nodes;
    }

    /**
     * Sets the value of the nodes property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType.Nodes }
     *     
     */
    public void setNodes(PolicyType.Nodes value) {
        this.nodes = value;
    }

    /**
     * Gets the value of the descriptions property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType.Descriptions }
     *     
     */
    public PolicyType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * Sets the value of the descriptions property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType.Descriptions }
     *     
     */
    public void setDescriptions(PolicyType.Descriptions value) {
        this.descriptions = value;
    }

    /**
     * Gets the value of the metadata property.
     * 
     * @return
     *     possible object is
     *     {@link PolicyType.Metadata }
     *     
     */
    public PolicyType.Metadata getMetadata() {
        return metadata;
    }

    /**
     * Sets the value of the metadata property.
     * 
     * @param value
     *     allowed object is
     *     {@link PolicyType.Metadata }
     *     
     */
    public void setMetadata(PolicyType.Metadata value) {
        this.metadata = value;
    }

    /**
     * Gets the value of the policyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyType() {
        return policyType;
    }

    /**
     * Sets the value of the policyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyType(String value) {
        this.policyType = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
     *         &lt;element name="Description" type="{http://www.iata.org/IATA/EDIST/2017.2}LinkDescriptionType" maxOccurs="unbounded"/>
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
        "description"
    })
    public static class Descriptions {

        @XmlElement(name = "Description", required = true)
        protected List<LinkDescriptionType> description;

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LinkDescriptionType }
         * 
         * 
         */
        public List<LinkDescriptionType> getDescription() {
            if (description == null) {
                description = new ArrayList<LinkDescriptionType>();
            }
            return this.description;
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
     *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}MetaBaseType">
     *       &lt;sequence>
     *         &lt;element name="Remarks" type="{http://www.iata.org/IATA/EDIST/2017.2}RemarkType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="EncodingScheme" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}EncSchemeType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ValidPeriod" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CorePeriodGrpType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="PolicyCode" type="{http://www.iata.org/IATA/EDIST/2017.2}CodesetValueSimpleType" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "remarks",
        "encodingScheme",
        "validPeriod"
    })
    public static class Metadata
        extends MetaBaseType
    {

        @XmlElement(name = "Remarks")
        protected List<RemarkType> remarks;
        @XmlElement(name = "EncodingScheme")
        protected PolicyType.Metadata.EncodingScheme encodingScheme;
        @XmlElement(name = "ValidPeriod")
        protected List<PolicyType.Metadata.ValidPeriod> validPeriod;
        @XmlAttribute(name = "PolicyCode")
        protected String policyCode;

        /**
         * Gets the value of the remarks property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remarks property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemarks().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RemarkType }
         * 
         * 
         */
        public List<RemarkType> getRemarks() {
            if (remarks == null) {
                remarks = new ArrayList<RemarkType>();
            }
            return this.remarks;
        }

        /**
         * Gets the value of the encodingScheme property.
         * 
         * @return
         *     possible object is
         *     {@link PolicyType.Metadata.EncodingScheme }
         *     
         */
        public PolicyType.Metadata.EncodingScheme getEncodingScheme() {
            return encodingScheme;
        }

        /**
         * Sets the value of the encodingScheme property.
         * 
         * @param value
         *     allowed object is
         *     {@link PolicyType.Metadata.EncodingScheme }
         *     
         */
        public void setEncodingScheme(PolicyType.Metadata.EncodingScheme value) {
            this.encodingScheme = value;
        }

        /**
         * Gets the value of the validPeriod property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the validPeriod property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValidPeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PolicyType.Metadata.ValidPeriod }
         * 
         * 
         */
        public List<PolicyType.Metadata.ValidPeriod> getValidPeriod() {
            if (validPeriod == null) {
                validPeriod = new ArrayList<PolicyType.Metadata.ValidPeriod>();
            }
            return this.validPeriod;
        }

        /**
         * Gets the value of the policyCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPolicyCode() {
            return policyCode;
        }

        /**
         * Sets the value of the policyCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPolicyCode(String value) {
            this.policyCode = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}EncSchemeType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class EncodingScheme
            extends EncSchemeType
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}CorePeriodGrpType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ValidPeriod
            extends CorePeriodGrpType
        {


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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Node" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}NodePathType">
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
    @XmlType(name = "", propOrder = {
        "node"
    })
    public static class Nodes {

        @XmlElement(name = "Node", required = true)
        protected List<PolicyType.Nodes.Node> node;

        /**
         * Gets the value of the node property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the node property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PolicyType.Nodes.Node }
         * 
         * 
         */
        public List<PolicyType.Nodes.Node> getNode() {
            if (node == null) {
                node = new ArrayList<PolicyType.Nodes.Node>();
            }
            return this.node;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.iata.org/IATA/EDIST/2017.2}NodePathType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Node
            extends NodePathType
        {


        }

    }

}
