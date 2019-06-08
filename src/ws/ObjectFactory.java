
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetCompte_QNAME = new QName("http://ws/", "getCompte");
    private final static QName _ListCompteResponse_QNAME = new QName("http://ws/", "listCompteResponse");
    private final static QName _ConvertToDh_QNAME = new QName("http://ws/", "convertToDh");
    private final static QName _GetCompteResponse_QNAME = new QName("http://ws/", "getCompteResponse");
    private final static QName _ConvertToDhResponse_QNAME = new QName("http://ws/", "convertToDhResponse");
    private final static QName _ListCompte_QNAME = new QName("http://ws/", "listCompte");
    private final static QName _Compte_QNAME = new QName("http://ws/", "compte");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link ListCompteResponse }
     * 
     */
    public ListCompteResponse createListCompteResponse() {
        return new ListCompteResponse();
    }

    /**
     * Create an instance of {@link ConvertToDh }
     * 
     */
    public ConvertToDh createConvertToDh() {
        return new ConvertToDh();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ConvertToDhResponse }
     * 
     */
    public ConvertToDhResponse createConvertToDhResponse() {
        return new ConvertToDhResponse();
    }

    /**
     * Create an instance of {@link ListCompte }
     * 
     */
    public ListCompte createListCompte() {
        return new ListCompte();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listCompteResponse")
    public JAXBElement<ListCompteResponse> createListCompteResponse(ListCompteResponse value) {
        return new JAXBElement<ListCompteResponse>(_ListCompteResponse_QNAME, ListCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertToDh }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertToDh")
    public JAXBElement<ConvertToDh> createConvertToDh(ConvertToDh value) {
        return new JAXBElement<ConvertToDh>(_ConvertToDh_QNAME, ConvertToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertToDhResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertToDhResponse")
    public JAXBElement<ConvertToDhResponse> createConvertToDhResponse(ConvertToDhResponse value) {
        return new JAXBElement<ConvertToDhResponse>(_ConvertToDhResponse_QNAME, ConvertToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listCompte")
    public JAXBElement<ListCompte> createListCompte(ListCompte value) {
        return new JAXBElement<ListCompte>(_ListCompte_QNAME, ListCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

}
