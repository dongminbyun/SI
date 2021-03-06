//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.06 at 03:14:07 오후 KST 
//


package net.herit.iot.onem2m.resource;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.onem2m.org/xml/protocols}announcedResource">
 *       &lt;sequence>
 *         &lt;element name="cseType" type="{http://www.onem2m.org/xml/protocols}cseTypeID" minOccurs="0"/>
 *         &lt;element name="pointOfAccess" type="{http://www.onem2m.org/xml/protocols}poaList" minOccurs="0"/>
 *         &lt;element name="CSEBase" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="CSE-ID" type="{http://www.onem2m.org/xml/protocols}ID" minOccurs="0"/>
 *         &lt;element name="requestReachability" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="nodeLink" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="childResource" type="{http://www.onem2m.org/xml/protocols}childResourceRef" maxOccurs="unbounded"/>
 *           &lt;choice maxOccurs="unbounded">
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}nodeAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}container"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}containerAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}group"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}groupAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}accessControlPolicy"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}accessControlPolicyAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}subscription"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}pollingChannel"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}scheduleAnnc"/>
 *             &lt;element ref="{http://www.onem2m.org/xml/protocols}locationPolicyAnnc"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cseType",
    "pointOfAccess",
    "cseBase",
    "cseid",
    "requestReachability",
    "nodeLink",
    "childResource",
    "nodeAnncOrContainerOrContainerAnnc"
})
//@XmlRootElement(name = "remoteCSEAnnc")
@XmlRootElement(name = "csrA")
public class RemoteCSEAnnc
    extends AnnouncedResource
{
	public final static String SCHEMA_LOCATION = "CDT-remoteCSE-v1_2_0.xsd";
	
	public static final List<String> MA = new ArrayList<String>(
			Arrays.asList(Naming.RESOURCEID_SN,
							Naming.RESOURCENAME_SN,
							Naming.EXPIRATIONTIME_SN,
							Naming.ACCESSCONTROLPOLICYIDS_SN,
							Naming.LABELS_SN
			)
		);
		public static final Set<String> OA = new HashSet<String>(
			Arrays.asList(Naming.CSETYPE_SN,
							Naming.POINTOFACCESS_SN,
							Naming.CSEBASE_SN,
							Naming.CSEID_SN,
							Naming.REQUESTREACHABILITY_SN,
							Naming.NODELINK_SN
			)
		);
	

    @XmlElement(name = Naming.CSETYPE_SN)
    protected Integer cseType;
    @XmlElement(name = Naming.POINTOFACCESS_SN)
    @XmlList
    protected List<String> pointOfAccess;
    //@XmlElement(name = "CSEBase")
    @XmlElement(name = Naming.CSEBASE_SN)
    @XmlSchemaType(name = "anyURI")
    protected String cseBase;
    //@XmlElement(name = "CSE-ID")
    @XmlElement(name = Naming.CSEID_SN)
    protected String cseid;
    @XmlElement(name = Naming.REQUESTREACHABILITY_SN)
    protected Boolean requestReachability;
    @XmlElement(name = Naming.NODELINK_SN)
    @XmlSchemaType(name = "anyURI")
    protected String nodeLink;
    @XmlElement(name = Naming.CHILDRESOURCE_SN)
    protected List<ChildResourceRef> childResource;
    @XmlElements({
        @XmlElement(name = "locationPolicyAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = LocationPolicyAnnc.class),
        @XmlElement(name = "containerAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = ContainerAnnc.class),
        @XmlElement(name = "groupAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = GroupAnnc.class),
        @XmlElement(name = "scheduleAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = ScheduleAnnc.class),
        @XmlElement(name = "container", namespace = "http://www.onem2m.org/xml/protocols", type = Container.class),
        @XmlElement(name = "pollingChannel", namespace = "http://www.onem2m.org/xml/protocols", type = PollingChannel.class),
        @XmlElement(name = "accessControlPolicyAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicyAnnc.class),
        @XmlElement(name = "nodeAnnc", namespace = "http://www.onem2m.org/xml/protocols", type = NodeAnnc.class),
        @XmlElement(name = "group", namespace = "http://www.onem2m.org/xml/protocols", type = Group.class),
        @XmlElement(name = "accessControlPolicy", namespace = "http://www.onem2m.org/xml/protocols", type = AccessControlPolicy.class),
        @XmlElement(name = "subscription", namespace = "http://www.onem2m.org/xml/protocols", type = Subscription.class)
    })
    protected List<Resource> nodeAnncOrContainerOrContainerAnnc;

    /**
     * Gets the value of the cseType property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCseType() {
        return cseType;
    }

    /**
     * Sets the value of the cseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCseType(Integer value) {
        this.cseType = value;
    }

    /**
     * Gets the value of the pointOfAccess property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pointOfAccess property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPointOfAccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPointOfAccess() {
//    	if (pointOfAccess == null) {
//    		pointOfAccess = new ArrayList<String>();
//        }
    	return this.pointOfAccess;
    }

    public void addPointOfAccess(String poa) {
    	if (pointOfAccess == null) {
    		pointOfAccess = new ArrayList<String>();
        }
    	this.pointOfAccess.add(poa);
    }
    
    /**
     * Gets the value of the cseBase property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSEBase() {
        return cseBase;
    }

    /**
     * Sets the value of the cseBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSEBase(String value) {
        this.cseBase = value;
    }

    /**
     * Gets the value of the cseid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCSEID() {
        return cseid;
    }

    /**
     * Sets the value of the cseid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCSEID(String value) {
        this.cseid = value;
    }

    /**
     * Gets the value of the requestReachability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRequestReachability() {
        return requestReachability;
    }

    /**
     * Sets the value of the requestReachability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequestReachability(Boolean value) {
        this.requestReachability = value;
    }

    /**
     * Gets the value of the nodeLink property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNodeLink() {
        return nodeLink;
    }

    /**
     * Sets the value of the nodeLink property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNodeLink(String value) {
        this.nodeLink = value;
    }

    /**
     * Gets the value of the childResource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the childResource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChildResource().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChildResourceRef }
     * 
     * 
     */
    public List<ChildResourceRef> getChildResource() {
//    	if (childResource == null) {
//    		childResource = new ArrayList<ChildResourceRef>();
//        }
    	return this.childResource;
    }

    public void addChildResource(ChildResourceRef ch) {
    	if (childResource == null) {
    		childResource = new ArrayList<ChildResourceRef>();
        }
    	this.childResource.add(ch);
    }
    
    /**
     * Gets the value of the nodeAnncOrContainerOrContainerAnnc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodeAnncOrContainerOrContainerAnnc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodeAnncOrContainerOrContainerAnnc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LocationPolicyAnnc }
     * {@link ContainerAnnc }
     * {@link GroupAnnc }
     * {@link ScheduleAnnc }
     * {@link Container }
     * {@link PollingChannel }
     * {@link AccessControlPolicyAnnc }
     * {@link NodeAnnc }
     * {@link Group }
     * {@link AccessControlPolicy }
     * {@link Subscription }
     * 
     * 
     */
    public List<Resource> getNodeAnncOrContainerOrContainerAnnc() {
//    	if (nodeAnncOrContainerOrContainerAnnc == null) {
//    		nodeAnncOrContainerOrContainerAnnc = new ArrayList<Resource>();
//        }
    	return this.nodeAnncOrContainerOrContainerAnnc;
    }

    public void addNodeAnncOrContainerOrContainerAnnc(Resource res) {
    	if (nodeAnncOrContainerOrContainerAnnc == null) {
    		nodeAnncOrContainerOrContainerAnnc = new ArrayList<Resource>();
        }
    	this.nodeAnncOrContainerOrContainerAnnc.add(res);
    }
    
}
