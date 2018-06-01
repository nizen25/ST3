
package com.transformer.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for addLearner complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="addLearner">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="learnerXML" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addLearner", propOrder = {
    "learnerXML"
})
public class AddLearner {

    protected String learnerXML;

    /**
     * Gets the value of the learnerXML property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLearnerXML() {
        return learnerXML;
    }

    /**
     * Sets the value of the learnerXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLearnerXML(String value) {
        this.learnerXML = value;
    }

}
