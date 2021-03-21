
package com.uvt.jaxws.server.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "add", namespace = "http://server.jaxws.uvt.com/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "add", namespace = "http://server.jaxws.uvt.com/", propOrder = {
    "first",
    "second"
})
public class Add {

    @XmlElement(name = "first", namespace = "")
    private String first;
    @XmlElement(name = "second", namespace = "")
    private String second;

    /**
     * 
     * @return
     *     returns String
     */
    public String getFirst() {
        return this.first;
    }

    /**
     * 
     * @param first
     *     the value for the first property
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * 
     * @return
     *     returns String
     */
    public String getSecond() {
        return this.second;
    }

    /**
     * 
     * @param second
     *     the value for the second property
     */
    public void setSecond(String second) {
        this.second = second;
    }

}
