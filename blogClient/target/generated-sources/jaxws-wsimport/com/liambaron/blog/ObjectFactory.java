
package com.liambaron.blog;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.liambaron.blog package. 
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

    private final static QName _DetailsAccResponse_QNAME = new QName("http://blog.liambaron.com/", "detailsAccResponse");
    private final static QName _UpdateAcc_QNAME = new QName("http://blog.liambaron.com/", "updateAcc");
    private final static QName _CreateAcc_QNAME = new QName("http://blog.liambaron.com/", "createAcc");
    private final static QName _TestConnection_QNAME = new QName("http://blog.liambaron.com/", "testConnection");
    private final static QName _CheckPass_QNAME = new QName("http://blog.liambaron.com/", "checkPass");
    private final static QName _TestConnectionResponse_QNAME = new QName("http://blog.liambaron.com/", "testConnectionResponse");
    private final static QName _Account_QNAME = new QName("http://blog.liambaron.com/", "account");
    private final static QName _CheckPassResponse_QNAME = new QName("http://blog.liambaron.com/", "checkPassResponse");
    private final static QName _DelAccResponse_QNAME = new QName("http://blog.liambaron.com/", "delAccResponse");
    private final static QName _UpdateAccResponse_QNAME = new QName("http://blog.liambaron.com/", "updateAccResponse");
    private final static QName _CreateAccResponse_QNAME = new QName("http://blog.liambaron.com/", "createAccResponse");
    private final static QName _DelAcc_QNAME = new QName("http://blog.liambaron.com/", "delAcc");
    private final static QName _DetailsAcc_QNAME = new QName("http://blog.liambaron.com/", "detailsAcc");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.liambaron.blog
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TestConnection }
     * 
     */
    public TestConnection createTestConnection() {
        return new TestConnection();
    }

    /**
     * Create an instance of {@link CheckPass }
     * 
     */
    public CheckPass createCheckPass() {
        return new CheckPass();
    }

    /**
     * Create an instance of {@link DetailsAccResponse }
     * 
     */
    public DetailsAccResponse createDetailsAccResponse() {
        return new DetailsAccResponse();
    }

    /**
     * Create an instance of {@link UpdateAcc }
     * 
     */
    public UpdateAcc createUpdateAcc() {
        return new UpdateAcc();
    }

    /**
     * Create an instance of {@link CreateAcc }
     * 
     */
    public CreateAcc createCreateAcc() {
        return new CreateAcc();
    }

    /**
     * Create an instance of {@link DelAccResponse }
     * 
     */
    public DelAccResponse createDelAccResponse() {
        return new DelAccResponse();
    }

    /**
     * Create an instance of {@link UpdateAccResponse }
     * 
     */
    public UpdateAccResponse createUpdateAccResponse() {
        return new UpdateAccResponse();
    }

    /**
     * Create an instance of {@link CreateAccResponse }
     * 
     */
    public CreateAccResponse createCreateAccResponse() {
        return new CreateAccResponse();
    }

    /**
     * Create an instance of {@link DelAcc }
     * 
     */
    public DelAcc createDelAcc() {
        return new DelAcc();
    }

    /**
     * Create an instance of {@link DetailsAcc }
     * 
     */
    public DetailsAcc createDetailsAcc() {
        return new DetailsAcc();
    }

    /**
     * Create an instance of {@link TestConnectionResponse }
     * 
     */
    public TestConnectionResponse createTestConnectionResponse() {
        return new TestConnectionResponse();
    }

    /**
     * Create an instance of {@link Account }
     * 
     */
    public Account createAccount() {
        return new Account();
    }

    /**
     * Create an instance of {@link CheckPassResponse }
     * 
     */
    public CheckPassResponse createCheckPassResponse() {
        return new CheckPassResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailsAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "detailsAccResponse")
    public JAXBElement<DetailsAccResponse> createDetailsAccResponse(DetailsAccResponse value) {
        return new JAXBElement<DetailsAccResponse>(_DetailsAccResponse_QNAME, DetailsAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "updateAcc")
    public JAXBElement<UpdateAcc> createUpdateAcc(UpdateAcc value) {
        return new JAXBElement<UpdateAcc>(_UpdateAcc_QNAME, UpdateAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "createAcc")
    public JAXBElement<CreateAcc> createCreateAcc(CreateAcc value) {
        return new JAXBElement<CreateAcc>(_CreateAcc_QNAME, CreateAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestConnection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "testConnection")
    public JAXBElement<TestConnection> createTestConnection(TestConnection value) {
        return new JAXBElement<TestConnection>(_TestConnection_QNAME, TestConnection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPass }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "checkPass")
    public JAXBElement<CheckPass> createCheckPass(CheckPass value) {
        return new JAXBElement<CheckPass>(_CheckPass_QNAME, CheckPass.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestConnectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "testConnectionResponse")
    public JAXBElement<TestConnectionResponse> createTestConnectionResponse(TestConnectionResponse value) {
        return new JAXBElement<TestConnectionResponse>(_TestConnectionResponse_QNAME, TestConnectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Account }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "account")
    public JAXBElement<Account> createAccount(Account value) {
        return new JAXBElement<Account>(_Account_QNAME, Account.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckPassResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "checkPassResponse")
    public JAXBElement<CheckPassResponse> createCheckPassResponse(CheckPassResponse value) {
        return new JAXBElement<CheckPassResponse>(_CheckPassResponse_QNAME, CheckPassResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "delAccResponse")
    public JAXBElement<DelAccResponse> createDelAccResponse(DelAccResponse value) {
        return new JAXBElement<DelAccResponse>(_DelAccResponse_QNAME, DelAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "updateAccResponse")
    public JAXBElement<UpdateAccResponse> createUpdateAccResponse(UpdateAccResponse value) {
        return new JAXBElement<UpdateAccResponse>(_UpdateAccResponse_QNAME, UpdateAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateAccResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "createAccResponse")
    public JAXBElement<CreateAccResponse> createCreateAccResponse(CreateAccResponse value) {
        return new JAXBElement<CreateAccResponse>(_CreateAccResponse_QNAME, CreateAccResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "delAcc")
    public JAXBElement<DelAcc> createDelAcc(DelAcc value) {
        return new JAXBElement<DelAcc>(_DelAcc_QNAME, DelAcc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DetailsAcc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://blog.liambaron.com/", name = "detailsAcc")
    public JAXBElement<DetailsAcc> createDetailsAcc(DetailsAcc value) {
        return new JAXBElement<DetailsAcc>(_DetailsAcc_QNAME, DetailsAcc.class, null, value);
    }

}
