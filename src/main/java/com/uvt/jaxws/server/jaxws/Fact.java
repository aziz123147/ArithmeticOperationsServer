
package com.uvt.jaxws.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "Factorielle", namespace = "http://server.jaxws.uvt.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Factorielle", namespace = "http://server.jaxws.uvt.com/")
public class Fact {

    @XmlElement(name = "operande", namespace = "")
    private String operande;

    /**
     * 
     * @return
     *     returns String
     */
    public String getOperande() {
        return this.operande;
    }

    /**
     * 
     * @param operande
     *     the value for the operande property
     */
    public void setOperande(String operande) {
        this.operande = operande;
    }

}
