
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.livtrip.webservice.hotel package. 
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

    private final static QName _WSFault_QNAME = new QName("http://schemas.tourico.com/webservices/faults", "WSFault");
    private final static QName _HotelPolicy_QNAME = new QName("http://tourico.com/webservices/TWS_ClxPolicies.xsd", "HotelPolicy");
    private final static QName _AuthenticationHeader_QNAME = new QName("http://schemas.tourico.com/webservices/authentication", "AuthenticationHeader");
    private final static QName _Culture_QNAME = new QName("http://schemas.tourico.com/webservices/authentication", "Culture");
    private final static QName _AuthenticationHeaderVersion_QNAME = new QName("http://schemas.tourico.com/webservices/authentication", "Version");
    private final static QName _ReservationTypeAdultsNum_QNAME = new QName("http://schemas.tourico.com/webservices/hotelv3", "AdultsNum");
    private final static QName _ReservationTypeChildNum_QNAME = new QName("http://schemas.tourico.com/webservices/hotelv3", "ChildNum");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.livtrip.webservice.hotel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 }
     * 
     */
    public TWSHotelDetailsV3 createTWSHotelDetailsV3() {
        return new TWSHotelDetailsV3();
    }

    /**
     * Create an instance of {@link GetHotelDetailsV3Response }
     * 
     */
    public GetHotelDetailsV3Response createGetHotelDetailsV3Response() {
        return new GetHotelDetailsV3Response();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel }
     * 
     */
    public TWSHotelDetailsV3 .Hotel createTWSHotelDetailsV3Hotel() {
        return new TWSHotelDetailsV3 .Hotel();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.DrivingDirections }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.DrivingDirections createTWSHotelDetailsV3HotelDrivingDirections() {
        return new TWSHotelDetailsV3 .Hotel.DrivingDirections();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.RoomType }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.RoomType createTWSHotelDetailsV3HotelRoomType() {
        return new TWSHotelDetailsV3 .Hotel.RoomType();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.RoomType.Discounts }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.RoomType.Discounts createTWSHotelDetailsV3HotelRoomTypeDiscounts() {
        return new TWSHotelDetailsV3 .Hotel.RoomType.Discounts();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.RoomType.Facilities }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.RoomType.Facilities createTWSHotelDetailsV3HotelRoomTypeFacilities() {
        return new TWSHotelDetailsV3 .Hotel.RoomType.Facilities();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds createTWSHotelDetailsV3HotelRoomTypeHotelRoomTypeIds() {
        return new TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Amenities }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Amenities createTWSHotelDetailsV3HotelAmenities() {
        return new TWSHotelDetailsV3 .Hotel.Amenities();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Media }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Media createTWSHotelDetailsV3HotelMedia() {
        return new TWSHotelDetailsV3 .Hotel.Media();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Media.Movies }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Media.Movies createTWSHotelDetailsV3HotelMediaMovies() {
        return new TWSHotelDetailsV3 .Hotel.Media.Movies();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Media.Images }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Media.Images createTWSHotelDetailsV3HotelMediaImages() {
        return new TWSHotelDetailsV3 .Hotel.Media.Images();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Descriptions }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Descriptions createTWSHotelDetailsV3HotelDescriptions() {
        return new TWSHotelDetailsV3 .Hotel.Descriptions();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription createTWSHotelDetailsV3HotelDescriptionsLongDescription() {
        return new TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription();
    }

    /**
     * Create an instance of {@link WSFault }
     * 
     */
    public WSFault createWSFault() {
        return new WSFault();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .StatusCode }
     * 
     */
    public TWSHotelDetailsV3 .StatusCode createTWSHotelDetailsV3StatusCode() {
        return new TWSHotelDetailsV3 .StatusCode();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Home }
     * 
     */
    public TWSHotelDetailsV3 .Home createTWSHotelDetailsV3Home() {
        return new TWSHotelDetailsV3 .Home();
    }

    /**
     * Create an instance of {@link SearchHotels }
     * 
     */
    public SearchHotels createSearchHotels() {
        return new SearchHotels();
    }

    /**
     * Create an instance of {@link SearchRequest }
     * 
     */
    public SearchRequest createSearchRequest() {
        return new SearchRequest();
    }

    /**
     * Create an instance of {@link ArrayOfFeature }
     * 
     */
    public ArrayOfFeature createArrayOfFeature() {
        return new ArrayOfFeature();
    }

    /**
     * Create an instance of {@link SearchHotelsResponse }
     * 
     */
    public SearchHotelsResponse createSearchHotelsResponse() {
        return new SearchHotelsResponse();
    }

    /**
     * Create an instance of {@link SearchResult }
     * 
     */
    public SearchResult createSearchResult() {
        return new SearchResult();
    }

    /**
     * Create an instance of {@link SearchHotelsById }
     * 
     */
    public SearchHotelsById createSearchHotelsById() {
        return new SearchHotelsById();
    }

    /**
     * Create an instance of {@link SearchHotelsByIdRequest }
     * 
     */
    public SearchHotelsByIdRequest createSearchHotelsByIdRequest() {
        return new SearchHotelsByIdRequest();
    }

    /**
     * Create an instance of {@link SearchHotelsByIdResponse }
     * 
     */
    public SearchHotelsByIdResponse createSearchHotelsByIdResponse() {
        return new SearchHotelsByIdResponse();
    }

    /**
     * Create an instance of {@link CheckAvailabilityAndPrices }
     * 
     */
    public CheckAvailabilityAndPrices createCheckAvailabilityAndPrices() {
        return new CheckAvailabilityAndPrices();
    }

    /**
     * Create an instance of {@link CheckAvailabilityAndPricesResponse }
     * 
     */
    public CheckAvailabilityAndPricesResponse createCheckAvailabilityAndPricesResponse() {
        return new CheckAvailabilityAndPricesResponse();
    }

    /**
     * Create an instance of {@link SearchHotelsByDestinationIds }
     * 
     */
    public SearchHotelsByDestinationIds createSearchHotelsByDestinationIds() {
        return new SearchHotelsByDestinationIds();
    }

    /**
     * Create an instance of {@link SearchHotelsByDestinationIdsRequest }
     * 
     */
    public SearchHotelsByDestinationIdsRequest createSearchHotelsByDestinationIdsRequest() {
        return new SearchHotelsByDestinationIdsRequest();
    }

    /**
     * Create an instance of {@link SearchHotelsByDestinationIdsResponse }
     * 
     */
    public SearchHotelsByDestinationIdsResponse createSearchHotelsByDestinationIdsResponse() {
        return new SearchHotelsByDestinationIdsResponse();
    }

    /**
     * Create an instance of {@link BookHotelV3 }
     * 
     */
    public BookHotelV3 createBookHotelV3() {
        return new BookHotelV3();
    }

    /**
     * Create an instance of {@link BookV3Request }
     * 
     */
    public BookV3Request createBookV3Request() {
        return new BookV3Request();
    }

    /**
     * Create an instance of {@link BookHotelV3Response }
     * 
     */
    public BookHotelV3Response createBookHotelV3Response() {
        return new BookHotelV3Response();
    }

    /**
     * Create an instance of {@link RGInfoResults }
     * 
     */
    public RGInfoResults createRGInfoResults() {
        return new RGInfoResults();
    }

    /**
     * Create an instance of {@link GetRGInfo }
     * 
     */
    public GetRGInfo createGetRGInfo() {
        return new GetRGInfo();
    }

    /**
     * Create an instance of {@link RGInfoRequest }
     * 
     */
    public RGInfoRequest createRGInfoRequest() {
        return new RGInfoRequest();
    }

    /**
     * Create an instance of {@link GetRGInfoResponse }
     * 
     */
    public GetRGInfoResponse createGetRGInfoResponse() {
        return new GetRGInfoResponse();
    }

    /**
     * Create an instance of {@link DoAmend }
     * 
     */
    public DoAmend createDoAmend() {
        return new DoAmend();
    }

    /**
     * Create an instance of {@link AmendRequest }
     * 
     */
    public AmendRequest createAmendRequest() {
        return new AmendRequest();
    }

    /**
     * Create an instance of {@link DoAmendResponse }
     * 
     */
    public DoAmendResponse createDoAmendResponse() {
        return new DoAmendResponse();
    }

    /**
     * Create an instance of {@link AmendResult }
     * 
     */
    public AmendResult createAmendResult() {
        return new AmendResult();
    }

    /**
     * Create an instance of {@link CostAmend }
     * 
     */
    public CostAmend createCostAmend() {
        return new CostAmend();
    }

    /**
     * Create an instance of {@link CostAmendRequest }
     * 
     */
    public CostAmendRequest createCostAmendRequest() {
        return new CostAmendRequest();
    }

    /**
     * Create an instance of {@link CostAmendResponse }
     * 
     */
    public CostAmendResponse createCostAmendResponse() {
        return new CostAmendResponse();
    }

    /**
     * Create an instance of {@link GetHotelDetailsV3 }
     * 
     */
    public GetHotelDetailsV3 createGetHotelDetailsV3() {
        return new GetHotelDetailsV3();
    }

    /**
     * Create an instance of {@link ArrayOfHotelID }
     * 
     */
    public ArrayOfHotelID createArrayOfHotelID() {
        return new ArrayOfHotelID();
    }

    /**
     * Create an instance of {@link GetHotelDetailsV3Response.GetHotelDetailsV3Result }
     * 
     */
    public GetHotelDetailsV3Response.GetHotelDetailsV3Result createGetHotelDetailsV3ResponseGetHotelDetailsV3Result() {
        return new GetHotelDetailsV3Response.GetHotelDetailsV3Result();
    }

    /**
     * Create an instance of {@link GetTermAndConditions }
     * 
     */
    public GetTermAndConditions createGetTermAndConditions() {
        return new GetTermAndConditions();
    }

    /**
     * Create an instance of {@link TermAndConditionsRequest }
     * 
     */
    public TermAndConditionsRequest createTermAndConditionsRequest() {
        return new TermAndConditionsRequest();
    }

    /**
     * Create an instance of {@link GetTermAndConditionsResponse }
     * 
     */
    public GetTermAndConditionsResponse createGetTermAndConditionsResponse() {
        return new GetTermAndConditionsResponse();
    }

    /**
     * Create an instance of {@link TermAndConditionsResult }
     * 
     */
    public TermAndConditionsResult createTermAndConditionsResult() {
        return new TermAndConditionsResult();
    }

    /**
     * Create an instance of {@link GetCancellationFee }
     * 
     */
    public GetCancellationFee createGetCancellationFee() {
        return new GetCancellationFee();
    }

    /**
     * Create an instance of {@link GetCancellationPolicies }
     * 
     */
    public GetCancellationPolicies createGetCancellationPolicies() {
        return new GetCancellationPolicies();
    }

    /**
     * Create an instance of {@link Feature }
     * 
     */
    public Feature createFeature() {
        return new Feature();
    }

    /**
     * Create an instance of {@link HotelID }
     * 
     */
    public HotelID createHotelID() {
        return new HotelID();
    }

    /**
     * Create an instance of {@link HotelPolicyType }
     * 
     */
    public HotelPolicyType createHotelPolicyType() {
        return new HotelPolicyType();
    }

    /**
     * Create an instance of {@link RoomTypePolicyType }
     * 
     */
    public RoomTypePolicyType createRoomTypePolicyType() {
        return new RoomTypePolicyType();
    }

    /**
     * Create an instance of {@link ArrayOfCancelPenaltyType }
     * 
     */
    public ArrayOfCancelPenaltyType createArrayOfCancelPenaltyType() {
        return new ArrayOfCancelPenaltyType();
    }

    /**
     * Create an instance of {@link CancelPenaltyType }
     * 
     */
    public CancelPenaltyType createCancelPenaltyType() {
        return new CancelPenaltyType();
    }

    /**
     * Create an instance of {@link DeadlineType }
     * 
     */
    public DeadlineType createDeadlineType() {
        return new DeadlineType();
    }

    /**
     * Create an instance of {@link AmountPercentType }
     * 
     */
    public AmountPercentType createAmountPercentType() {
        return new AmountPercentType();
    }

    /**
     * Create an instance of {@link ParagraphType }
     * 
     */
    public ParagraphType createParagraphType() {
        return new ParagraphType();
    }

    /**
     * Create an instance of {@link FormattedTextTextType }
     * 
     */
    public FormattedTextTextType createFormattedTextTextType() {
        return new FormattedTextTextType();
    }

    /**
     * Create an instance of {@link BookInfo }
     * 
     */
    public BookInfo createBookInfo() {
        return new BookInfo();
    }

    /**
     * Create an instance of {@link GetCancellationFeeResponse }
     * 
     */
    public GetCancellationFeeResponse createGetCancellationFeeResponse() {
        return new GetCancellationFeeResponse();
    }

    /**
     * Create an instance of {@link CancellationFeeInfo }
     * 
     */
    public CancellationFeeInfo createCancellationFeeInfo() {
        return new CancellationFeeInfo();
    }

    /**
     * Create an instance of {@link GetCancellationPoliciesResponse }
     * 
     */
    public GetCancellationPoliciesResponse createGetCancellationPoliciesResponse() {
        return new GetCancellationPoliciesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfRoomInfo }
     * 
     */
    public ArrayOfRoomInfo createArrayOfRoomInfo() {
        return new ArrayOfRoomInfo();
    }

    /**
     * Create an instance of {@link RoomInfo }
     * 
     */
    public RoomInfo createRoomInfo() {
        return new RoomInfo();
    }

    /**
     * Create an instance of {@link ArrayOfChildAge }
     * 
     */
    public ArrayOfChildAge createArrayOfChildAge() {
        return new ArrayOfChildAge();
    }

    /**
     * Create an instance of {@link ChildAge }
     * 
     */
    public ChildAge createChildAge() {
        return new ChildAge();
    }

    /**
     * Create an instance of {@link Room }
     * 
     */
    public Room createRoom() {
        return new Room();
    }

    /**
     * Create an instance of {@link ArrayOfHotel }
     * 
     */
    public ArrayOfHotel createArrayOfHotel() {
        return new ArrayOfHotel();
    }

    /**
     * Create an instance of {@link Hotel }
     * 
     */
    public Hotel createHotel() {
        return new Hotel();
    }

    /**
     * Create an instance of {@link HotelLocation }
     * 
     */
    public HotelLocation createHotelLocation() {
        return new HotelLocation();
    }

    /**
     * Create an instance of {@link ArrayOfRoomType }
     * 
     */
    public ArrayOfRoomType createArrayOfRoomType() {
        return new ArrayOfRoomType();
    }

    /**
     * Create an instance of {@link RoomType }
     * 
     */
    public RoomType createRoomType() {
        return new RoomType();
    }

    /**
     * Create an instance of {@link ArrayOfAvailability }
     * 
     */
    public ArrayOfAvailability createArrayOfAvailability() {
        return new ArrayOfAvailability();
    }

    /**
     * Create an instance of {@link Availability }
     * 
     */
    public Availability createAvailability() {
        return new Availability();
    }

    /**
     * Create an instance of {@link PayStayPromotion }
     * 
     */
    public PayStayPromotion createPayStayPromotion() {
        return new PayStayPromotion();
    }

    /**
     * Create an instance of {@link ProgressivePromotion }
     * 
     */
    public ProgressivePromotion createProgressivePromotion() {
        return new ProgressivePromotion();
    }

    /**
     * Create an instance of {@link ArrayOfOccupancy }
     * 
     */
    public ArrayOfOccupancy createArrayOfOccupancy() {
        return new ArrayOfOccupancy();
    }

    /**
     * Create an instance of {@link Occupancy }
     * 
     */
    public Occupancy createOccupancy() {
        return new Occupancy();
    }

    /**
     * Create an instance of {@link ArrayOfPrice }
     * 
     */
    public ArrayOfPrice createArrayOfPrice() {
        return new ArrayOfPrice();
    }

    /**
     * Create an instance of {@link Price }
     * 
     */
    public Price createPrice() {
        return new Price();
    }

    /**
     * Create an instance of {@link ArrayOfTax }
     * 
     */
    public ArrayOfTax createArrayOfTax() {
        return new ArrayOfTax();
    }

    /**
     * Create an instance of {@link Tax }
     * 
     */
    public Tax createTax() {
        return new Tax();
    }

    /**
     * Create an instance of {@link ArrayOfRoom }
     * 
     */
    public ArrayOfRoom createArrayOfRoom() {
        return new ArrayOfRoom();
    }

    /**
     * Create an instance of {@link ArrayOfSupplement }
     * 
     */
    public ArrayOfSupplement createArrayOfSupplement() {
        return new ArrayOfSupplement();
    }

    /**
     * Create an instance of {@link Supplement }
     * 
     */
    public Supplement createSupplement() {
        return new Supplement();
    }

    /**
     * Create an instance of {@link PerPersonSupplement }
     * 
     */
    public PerPersonSupplement createPerPersonSupplement() {
        return new PerPersonSupplement();
    }

    /**
     * Create an instance of {@link ArrayOfSupplementAge }
     * 
     */
    public ArrayOfSupplementAge createArrayOfSupplementAge() {
        return new ArrayOfSupplementAge();
    }

    /**
     * Create an instance of {@link SupplementAge }
     * 
     */
    public SupplementAge createSupplementAge() {
        return new SupplementAge();
    }

    /**
     * Create an instance of {@link PerRoomSupplement }
     * 
     */
    public PerRoomSupplement createPerRoomSupplement() {
        return new PerRoomSupplement();
    }

    /**
     * Create an instance of {@link ArrayOfBoardbase }
     * 
     */
    public ArrayOfBoardbase createArrayOfBoardbase() {
        return new ArrayOfBoardbase();
    }

    /**
     * Create an instance of {@link Boardbase }
     * 
     */
    public Boardbase createBoardbase() {
        return new Boardbase();
    }

    /**
     * Create an instance of {@link ArrayOfHotelIdInfo }
     * 
     */
    public ArrayOfHotelIdInfo createArrayOfHotelIdInfo() {
        return new ArrayOfHotelIdInfo();
    }

    /**
     * Create an instance of {@link HotelIdInfo }
     * 
     */
    public HotelIdInfo createHotelIdInfo() {
        return new HotelIdInfo();
    }

    /**
     * Create an instance of {@link ArrayOfDestinationIdInfo }
     * 
     */
    public ArrayOfDestinationIdInfo createArrayOfDestinationIdInfo() {
        return new ArrayOfDestinationIdInfo();
    }

    /**
     * Create an instance of {@link DestinationIdInfo }
     * 
     */
    public DestinationIdInfo createDestinationIdInfo() {
        return new DestinationIdInfo();
    }

    /**
     * Create an instance of {@link ArrayOfRoomReserveInfo }
     * 
     */
    public ArrayOfRoomReserveInfo createArrayOfRoomReserveInfo() {
        return new ArrayOfRoomReserveInfo();
    }

    /**
     * Create an instance of {@link RoomReserveInfo }
     * 
     */
    public RoomReserveInfo createRoomReserveInfo() {
        return new RoomReserveInfo();
    }

    /**
     * Create an instance of {@link ContactPassenger }
     * 
     */
    public ContactPassenger createContactPassenger() {
        return new ContactPassenger();
    }

    /**
     * Create an instance of {@link SelectedBoardBase }
     * 
     */
    public SelectedBoardBase createSelectedBoardBase() {
        return new SelectedBoardBase();
    }

    /**
     * Create an instance of {@link ArrayOfSupplementInfo }
     * 
     */
    public ArrayOfSupplementInfo createArrayOfSupplementInfo() {
        return new ArrayOfSupplementInfo();
    }

    /**
     * Create an instance of {@link SupplementInfo }
     * 
     */
    public SupplementInfo createSupplementInfo() {
        return new SupplementInfo();
    }

    /**
     * Create an instance of {@link ArrayOfSuppAges }
     * 
     */
    public ArrayOfSuppAges createArrayOfSuppAges() {
        return new ArrayOfSuppAges();
    }

    /**
     * Create an instance of {@link SuppAges }
     * 
     */
    public SuppAges createSuppAges() {
        return new SuppAges();
    }

    /**
     * Create an instance of {@link ClientCreditCardInfo }
     * 
     */
    public ClientCreditCardInfo createClientCreditCardInfo() {
        return new ClientCreditCardInfo();
    }

    /**
     * Create an instance of {@link CyberSourceParams }
     * 
     */
    public CyberSourceParams createCyberSourceParams() {
        return new CyberSourceParams();
    }

    /**
     * Create an instance of {@link ResGroup }
     * 
     */
    public ResGroup createResGroup() {
        return new ResGroup();
    }

    /**
     * Create an instance of {@link ArrayOfReservation }
     * 
     */
    public ArrayOfReservation createArrayOfReservation() {
        return new ArrayOfReservation();
    }

    /**
     * Create an instance of {@link Reservation }
     * 
     */
    public Reservation createReservation() {
        return new Reservation();
    }

    /**
     * Create an instance of {@link HotelInfo }
     * 
     */
    public HotelInfo createHotelInfo() {
        return new HotelInfo();
    }

    /**
     * Create an instance of {@link RoomExtraInfo }
     * 
     */
    public RoomExtraInfo createRoomExtraInfo() {
        return new RoomExtraInfo();
    }

    /**
     * Create an instance of {@link Passenger }
     * 
     */
    public Passenger createPassenger() {
        return new Passenger();
    }

    /**
     * Create an instance of {@link FlightPassenger }
     * 
     */
    public FlightPassenger createFlightPassenger() {
        return new FlightPassenger();
    }

    /**
     * Create an instance of {@link ArrayOfFrequentTraveller }
     * 
     */
    public ArrayOfFrequentTraveller createArrayOfFrequentTraveller() {
        return new ArrayOfFrequentTraveller();
    }

    /**
     * Create an instance of {@link FrequentTraveller }
     * 
     */
    public FrequentTraveller createFrequentTraveller() {
        return new FrequentTraveller();
    }

    /**
     * Create an instance of {@link PreferredSeat }
     * 
     */
    public PreferredSeat createPreferredSeat() {
        return new PreferredSeat();
    }

    /**
     * Create an instance of {@link PreferredMeal }
     * 
     */
    public PreferredMeal createPreferredMeal() {
        return new PreferredMeal();
    }

    /**
     * Create an instance of {@link FlightInfo }
     * 
     */
    public FlightInfo createFlightInfo() {
        return new FlightInfo();
    }

    /**
     * Create an instance of {@link ArrayOfSegment }
     * 
     */
    public ArrayOfSegment createArrayOfSegment() {
        return new ArrayOfSegment();
    }

    /**
     * Create an instance of {@link Segment }
     * 
     */
    public Segment createSegment() {
        return new Segment();
    }

    /**
     * Create an instance of {@link ArrayOfLeg }
     * 
     */
    public ArrayOfLeg createArrayOfLeg() {
        return new ArrayOfLeg();
    }

    /**
     * Create an instance of {@link Leg }
     * 
     */
    public Leg createLeg() {
        return new Leg();
    }

    /**
     * Create an instance of {@link ArrayOfReservationType }
     * 
     */
    public ArrayOfReservationType createArrayOfReservationType() {
        return new ArrayOfReservationType();
    }

    /**
     * Create an instance of {@link ReservationType }
     * 
     */
    public ReservationType createReservationType() {
        return new ReservationType();
    }

    /**
     * Create an instance of {@link ArrayOfInt }
     * 
     */
    public ArrayOfInt createArrayOfInt() {
        return new ArrayOfInt();
    }

    /**
     * Create an instance of {@link AmendRoomReserveInfo }
     * 
     */
    public AmendRoomReserveInfo createAmendRoomReserveInfo() {
        return new AmendRoomReserveInfo();
    }

    /**
     * Create an instance of {@link CciType }
     * 
     */
    public CciType createCciType() {
        return new CciType();
    }

    /**
     * Create an instance of {@link AmendInfo }
     * 
     */
    public AmendInfo createAmendInfo() {
        return new AmendInfo();
    }

    /**
     * Create an instance of {@link ResGroupType }
     * 
     */
    public ResGroupType createResGroupType() {
        return new ResGroupType();
    }

    /**
     * Create an instance of {@link ArrayOfReservationResType }
     * 
     */
    public ArrayOfReservationResType createArrayOfReservationResType() {
        return new ArrayOfReservationResType();
    }

    /**
     * Create an instance of {@link ReservationResType }
     * 
     */
    public ReservationResType createReservationResType() {
        return new ReservationResType();
    }

    /**
     * Create an instance of {@link HotelExtraInfo }
     * 
     */
    public HotelExtraInfo createHotelExtraInfo() {
        return new HotelExtraInfo();
    }

    /**
     * Create an instance of {@link AmendRoomExtraInfo }
     * 
     */
    public AmendRoomExtraInfo createAmendRoomExtraInfo() {
        return new AmendRoomExtraInfo();
    }

    /**
     * Create an instance of {@link BoardBaseType }
     * 
     */
    public BoardBaseType createBoardBaseType() {
        return new BoardBaseType();
    }

    /**
     * Create an instance of {@link CancellationPoliciesType }
     * 
     */
    public CancellationPoliciesType createCancellationPoliciesType() {
        return new CancellationPoliciesType();
    }

    /**
     * Create an instance of {@link PolicyType }
     * 
     */
    public PolicyType createPolicyType() {
        return new PolicyType();
    }

    /**
     * Create an instance of {@link HotelPolicyType2 }
     * 
     */
    public HotelPolicyType2 createHotelPolicyType2() {
        return new HotelPolicyType2();
    }

    /**
     * Create an instance of {@link RoomTypePolicyType2 }
     * 
     */
    public RoomTypePolicyType2 createRoomTypePolicyType2() {
        return new RoomTypePolicyType2();
    }

    /**
     * Create an instance of {@link ArrayOfCancelPenaltyType2 }
     * 
     */
    public ArrayOfCancelPenaltyType2 createArrayOfCancelPenaltyType2() {
        return new ArrayOfCancelPenaltyType2();
    }

    /**
     * Create an instance of {@link CancelPenaltyType2 }
     * 
     */
    public CancelPenaltyType2 createCancelPenaltyType2() {
        return new CancelPenaltyType2();
    }

    /**
     * Create an instance of {@link DeadlineType2 }
     * 
     */
    public DeadlineType2 createDeadlineType2() {
        return new DeadlineType2();
    }

    /**
     * Create an instance of {@link AmountPercentType2 }
     * 
     */
    public AmountPercentType2 createAmountPercentType2() {
        return new AmountPercentType2();
    }

    /**
     * Create an instance of {@link ArrayOfParagraphType }
     * 
     */
    public ArrayOfParagraphType createArrayOfParagraphType() {
        return new ArrayOfParagraphType();
    }

    /**
     * Create an instance of {@link ParagraphType2 }
     * 
     */
    public ParagraphType2 createParagraphType2() {
        return new ParagraphType2();
    }

    /**
     * Create an instance of {@link ArrayOfFormattedTextType }
     * 
     */
    public ArrayOfFormattedTextType createArrayOfFormattedTextType() {
        return new ArrayOfFormattedTextType();
    }

    /**
     * Create an instance of {@link FormattedTextType }
     * 
     */
    public FormattedTextType createFormattedTextType() {
        return new FormattedTextType();
    }

    /**
     * Create an instance of {@link BillingType }
     * 
     */
    public BillingType createBillingType() {
        return new BillingType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link TermAndCondition }
     * 
     */
    public TermAndCondition createTermAndCondition() {
        return new TermAndCondition();
    }

    /**
     * Create an instance of {@link AuthenticationHeader }
     * 
     */
    public AuthenticationHeader createAuthenticationHeader() {
        return new AuthenticationHeader();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Location }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Location createTWSHotelDetailsV3HotelLocation() {
        return new TWSHotelDetailsV3 .Hotel.Location();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.RefPoints }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.RefPoints createTWSHotelDetailsV3HotelRefPoints() {
        return new TWSHotelDetailsV3 .Hotel.RefPoints();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.DrivingDirections.Option }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.DrivingDirections.Option createTWSHotelDetailsV3HotelDrivingDirectionsOption() {
        return new TWSHotelDetailsV3 .Hotel.DrivingDirections.Option();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.RoomType.Discounts.Discount }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.RoomType.Discounts.Discount createTWSHotelDetailsV3HotelRoomTypeDiscountsDiscount() {
        return new TWSHotelDetailsV3 .Hotel.RoomType.Discounts.Discount();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.RoomType.Facilities.Facility }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.RoomType.Facilities.Facility createTWSHotelDetailsV3HotelRoomTypeFacilitiesFacility() {
        return new TWSHotelDetailsV3 .Hotel.RoomType.Facilities.Facility();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds.HotelRoomTypeId }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds.HotelRoomTypeId createTWSHotelDetailsV3HotelRoomTypeHotelRoomTypeIdsHotelRoomTypeId() {
        return new TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds.HotelRoomTypeId();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Amenities.Amenity }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Amenities.Amenity createTWSHotelDetailsV3HotelAmenitiesAmenity() {
        return new TWSHotelDetailsV3 .Hotel.Amenities.Amenity();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Media.Movies.Movie }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Media.Movies.Movie createTWSHotelDetailsV3HotelMediaMoviesMovie() {
        return new TWSHotelDetailsV3 .Hotel.Media.Movies.Movie();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Media.Images.Image }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Media.Images.Image createTWSHotelDetailsV3HotelMediaImagesImage() {
        return new TWSHotelDetailsV3 .Hotel.Media.Images.Image();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Descriptions.ShortDescription }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Descriptions.ShortDescription createTWSHotelDetailsV3HotelDescriptionsShortDescription() {
        return new TWSHotelDetailsV3 .Hotel.Descriptions.ShortDescription();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Descriptions.FreeTextShortDescription }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Descriptions.FreeTextShortDescription createTWSHotelDetailsV3HotelDescriptionsFreeTextShortDescription() {
        return new TWSHotelDetailsV3 .Hotel.Descriptions.FreeTextShortDescription();
    }

    /**
     * Create an instance of {@link TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription.Description }
     * 
     */
    public TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription.Description createTWSHotelDetailsV3HotelDescriptionsLongDescriptionDescription() {
        return new TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription.Description();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link WSFault }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.tourico.com/webservices/faults", name = "WSFault")
    public JAXBElement<WSFault> createWSFault(WSFault value) {
        return new JAXBElement<WSFault>(_WSFault_QNAME, WSFault.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HotelPolicyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tourico.com/webservices/TWS_ClxPolicies.xsd", name = "HotelPolicy")
    public JAXBElement<HotelPolicyType> createHotelPolicy(HotelPolicyType value) {
        return new JAXBElement<HotelPolicyType>(_HotelPolicy_QNAME, HotelPolicyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationHeader }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.tourico.com/webservices/authentication", name = "AuthenticationHeader")
    public JAXBElement<AuthenticationHeader> createAuthenticationHeader(AuthenticationHeader value) {
        return new JAXBElement<AuthenticationHeader>(_AuthenticationHeader_QNAME, AuthenticationHeader.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Culture }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.tourico.com/webservices/authentication", name = "Culture")
    public JAXBElement<Culture> createCulture(Culture value) {
        return new JAXBElement<Culture>(_Culture_QNAME, Culture.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.tourico.com/webservices/authentication", name = "Version", scope = AuthenticationHeader.class)
    public JAXBElement<String> createAuthenticationHeaderVersion(String value) {
        return new JAXBElement<String>(_AuthenticationHeaderVersion_QNAME, String.class, AuthenticationHeader.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.tourico.com/webservices/hotelv3", name = "AdultsNum", scope = ReservationType.class)
    public JAXBElement<Integer> createReservationTypeAdultsNum(Integer value) {
        return new JAXBElement<Integer>(_ReservationTypeAdultsNum_QNAME, Integer.class, ReservationType.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.tourico.com/webservices/hotelv3", name = "ChildNum", scope = ReservationType.class)
    public JAXBElement<Integer> createReservationTypeChildNum(Integer value) {
        return new JAXBElement<Integer>(_ReservationTypeChildNum_QNAME, Integer.class, ReservationType.class, value);
    }

}
