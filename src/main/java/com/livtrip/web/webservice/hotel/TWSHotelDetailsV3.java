
package com.livtrip.web.webservice.hotel;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *         &lt;element name="StatusCode"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Hotel"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Location" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="searchingCity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="destinationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="destinationId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="zip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RefPoints" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="airportCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
 *                           &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Descriptions" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="VoucherRemark" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/&gt;
 *                             &lt;element name="ShortDescription" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="FreeTextShortDescription" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="LongDescription" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="FreeTextLongDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                                       &lt;element name="Description" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                               &lt;attribute name="languageID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                               &lt;attribute name="templateID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                               &lt;attribute name="textFieldType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                               &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Media" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Images" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Image" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                               &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="hotelID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                               &lt;attribute name="HotelImgID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Movies" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Movie" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="MovieId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                               &lt;attribute name="activityId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                               &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Amenities" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Amenity" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                     &lt;attribute name="amenityID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="RoomType" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="HotelRoomTypeIds" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="HotelRoomTypeId" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Facilities" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Facility" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="facilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                               &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="Discounts" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="Discount" maxOccurs="unbounded" minOccurs="0"&gt;
 *                                         &lt;complexType&gt;
 *                                           &lt;complexContent&gt;
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                               &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                               &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                             &lt;/restriction&gt;
 *                                           &lt;/complexContent&gt;
 *                                         &lt;/complexType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                           &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                           &lt;attribute name="roomId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="maxGuest" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                           &lt;attribute name="maxChild" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                           &lt;attribute name="roomCategoryID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                           &lt;attribute name="roomCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                           &lt;attribute name="roomTypeCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="DrivingDirections" maxOccurs="unbounded" minOccurs="0"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Option" maxOccurs="unbounded" minOccurs="0"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;complexContent&gt;
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                                     &lt;sequence&gt;
 *                                       &lt;element name="DrivingDirectionDesc" form="unqualified"&gt;
 *                                         &lt;simpleType&gt;
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                                             &lt;maxLength value="2147483647"/&gt;
 *                                           &lt;/restriction&gt;
 *                                         &lt;/simpleType&gt;
 *                                       &lt;/element&gt;
 *                                     &lt;/sequence&gt;
 *                                     &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                     &lt;attribute name="seqNum" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/restriction&gt;
 *                                 &lt;/complexContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="brand" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="brandId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="rooms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="checkInTime" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="checkOutTime" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="hotelPhone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="hotelFax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                 &lt;attribute name="starLevel" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
 *                 &lt;attribute name="isOpaque" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *                 &lt;attribute name="ranking" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *                 &lt;attribute name="bestValue" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Home"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="PropertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="PropertySubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *                   &lt;element name="NumOfBathrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *                   &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "statusCodeOrHotelOrHome"
})
@XmlRootElement(name = "TWS_HotelDetailsV3", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
public class TWSHotelDetailsV3 {

    @XmlElements({
        @XmlElement(name = "StatusCode", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd", type = TWSHotelDetailsV3.StatusCode.class),
        @XmlElement(name = "Hotel", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd", type = TWSHotelDetailsV3.Hotel.class),
        @XmlElement(name = "Home", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd", type = TWSHotelDetailsV3.Home.class)
    })
    protected List<Object> statusCodeOrHotelOrHome;

    /**
     * Gets the value of the statusCodeOrHotelOrHome property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusCodeOrHotelOrHome property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusCodeOrHotelOrHome().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TWSHotelDetailsV3 .StatusCode }
     * {@link TWSHotelDetailsV3 .Hotel }
     * {@link TWSHotelDetailsV3 .Home }
     *
     *
     */
    public List<Object> getStatusCodeOrHotelOrHome() {
        if (statusCodeOrHotelOrHome == null) {
            statusCodeOrHotelOrHome = new ArrayList<Object>();
        }
        return this.statusCodeOrHotelOrHome;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="PropertyType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="PropertySubType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
     *         &lt;element name="NumOfBathrooms" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
     *         &lt;element name="HotelId" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "propertyType",
        "propertySubType",
        "numOfBathrooms",
        "hotelId"
    })
    public static class Home {

        @XmlElement(name = "PropertyType", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
        protected String propertyType;
        @XmlElement(name = "PropertySubType", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
        protected String propertySubType;
        @XmlElement(name = "NumOfBathrooms", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
        protected Integer numOfBathrooms;
        @XmlElement(name = "HotelId", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
        protected int hotelId;

        /**
         * 获取propertyType属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPropertyType() {
            return propertyType;
        }

        /**
         * 设置propertyType属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPropertyType(String value) {
            this.propertyType = value;
        }

        /**
         * 获取propertySubType属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPropertySubType() {
            return propertySubType;
        }

        /**
         * 设置propertySubType属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPropertySubType(String value) {
            this.propertySubType = value;
        }

        /**
         * 获取numOfBathrooms属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getNumOfBathrooms() {
            return numOfBathrooms;
        }

        /**
         * 设置numOfBathrooms属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setNumOfBathrooms(Integer value) {
            this.numOfBathrooms = value;
        }

        /**
         * 获取hotelId属性的值。
         *
         */
        public int getHotelId() {
            return hotelId;
        }

        /**
         * 设置hotelId属性的值。
         *
         */
        public void setHotelId(int value) {
            this.hotelId = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     *
     * <p>以下模式片段指定包含在此类中的预期内容。
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Location" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="searchingCity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="destinationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="destinationId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="zip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RefPoints" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="airportCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
     *                 &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Descriptions" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="VoucherRemark" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/&gt;
     *                   &lt;element name="ShortDescription" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="FreeTextShortDescription" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="LongDescription" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="FreeTextLongDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *                             &lt;element name="Description" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="languageID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="templateID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="textFieldType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Media" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Images" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Image" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="hotelID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="HotelImgID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Movies" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Movie" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="MovieId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="activityId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Amenities" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Amenity" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="amenityID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="RoomType" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="HotelRoomTypeIds" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="HotelRoomTypeId" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Facilities" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Facility" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="facilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                                     &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="Discounts" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="Discount" maxOccurs="unbounded" minOccurs="0"&gt;
     *                               &lt;complexType&gt;
     *                                 &lt;complexContent&gt;
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                                     &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                     &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                                   &lt;/restriction&gt;
     *                                 &lt;/complexContent&gt;
     *                               &lt;/complexType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *                 &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                 &lt;attribute name="roomId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="maxGuest" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                 &lt;attribute name="maxChild" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                 &lt;attribute name="roomCategoryID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                 &lt;attribute name="roomCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                 &lt;attribute name="roomTypeCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="DrivingDirections" maxOccurs="unbounded" minOccurs="0"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Option" maxOccurs="unbounded" minOccurs="0"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;complexContent&gt;
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                           &lt;sequence&gt;
     *                             &lt;element name="DrivingDirectionDesc" form="unqualified"&gt;
     *                               &lt;simpleType&gt;
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *                                   &lt;maxLength value="2147483647"/&gt;
     *                                 &lt;/restriction&gt;
     *                               &lt;/simpleType&gt;
     *                             &lt;/element&gt;
     *                           &lt;/sequence&gt;
     *                           &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="seqNum" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/restriction&gt;
     *                       &lt;/complexContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="brand" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="brandId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="rooms" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="provider" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="checkInTime" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="checkOutTime" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="thumb" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="hotelPhone" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="hotelFax" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *       &lt;attribute name="starLevel" type="{http://www.w3.org/2001/XMLSchema}double" /&gt;
     *       &lt;attribute name="isOpaque" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
     *       &lt;attribute name="ranking" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
     *       &lt;attribute name="bestValue" type="{http://www.w3.org/2001/XMLSchema}unsignedByte" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "location",
        "refPoints",
        "descriptions",
        "media",
        "amenities",
        "roomType",
        "drivingDirections"
    })
    public static class Hotel {

        @XmlElement(name = "Location", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
        protected List<Location> location;
        @XmlElement(name = "RefPoints", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
        protected List<RefPoints> refPoints;
        @XmlElement(name = "Descriptions", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
        protected List<Descriptions> descriptions;
        @XmlElement(name = "Media", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
        protected List<Media> media;
        @XmlElement(name = "Amenities", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
        protected List<Amenities> amenities;
        @XmlElement(name = "RoomType", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
        protected List<RoomType> roomType;
        @XmlElement(name = "DrivingDirections", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
        protected List<DrivingDirections> drivingDirections;
        @XmlAttribute(name = "hotelID", required = true)
        protected int hotelID;
        @XmlAttribute(name = "name")
        protected String name;
        @XmlAttribute(name = "brand")
        protected String brand;
        @XmlAttribute(name = "brandId")
        protected Integer brandId;
        @XmlAttribute(name = "rooms")
        protected Integer rooms;
        @XmlAttribute(name = "provider")
        protected String provider;
        @XmlAttribute(name = "checkInTime")
        protected Integer checkInTime;
        @XmlAttribute(name = "checkOutTime")
        protected Integer checkOutTime;
        @XmlAttribute(name = "currency")
        protected String currency;
        @XmlAttribute(name = "thumb")
        protected String thumb;
        @XmlAttribute(name = "hotelPhone")
        protected String hotelPhone;
        @XmlAttribute(name = "hotelFax")
        protected String hotelFax;
        @XmlAttribute(name = "starLevel")
        protected Double starLevel;
        @XmlAttribute(name = "isOpaque")
        protected Boolean isOpaque;
        @XmlAttribute(name = "ranking")
        protected Integer ranking;
        @XmlAttribute(name = "bestValue")
        @XmlSchemaType(name = "unsignedByte")
        protected Short bestValue;

        /**
         * Gets the value of the location property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the location property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLocation().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.Location }
         *
         *
         */
        public List<Location> getLocation() {
            if (location == null) {
                location = new ArrayList<Location>();
            }
            return this.location;
        }

        /**
         * Gets the value of the refPoints property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the refPoints property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRefPoints().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.RefPoints }
         *
         *
         */
        public List<RefPoints> getRefPoints() {
            if (refPoints == null) {
                refPoints = new ArrayList<RefPoints>();
            }
            return this.refPoints;
        }

        /**
         * Gets the value of the descriptions property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descriptions property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescriptions().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.Descriptions }
         *
         *
         */
        public List<Descriptions> getDescriptions() {
            if (descriptions == null) {
                descriptions = new ArrayList<Descriptions>();
            }
            return this.descriptions;
        }

        /**
         * Gets the value of the media property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the media property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMedia().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.Media }
         *
         *
         */
        public List<Media> getMedia() {
            if (media == null) {
                media = new ArrayList<Media>();
            }
            return this.media;
        }

        /**
         * Gets the value of the amenities property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amenities property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmenities().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.Amenities }
         *
         *
         */
        public List<Amenities> getAmenities() {
            if (amenities == null) {
                amenities = new ArrayList<Amenities>();
            }
            return this.amenities;
        }

        /**
         * Gets the value of the roomType property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomType property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomType().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.RoomType }
         *
         *
         */
        public List<RoomType> getRoomType() {
            if (roomType == null) {
                roomType = new ArrayList<RoomType>();
            }
            return this.roomType;
        }

        /**
         * Gets the value of the drivingDirections property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the drivingDirections property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDrivingDirections().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TWSHotelDetailsV3 .Hotel.DrivingDirections }
         *
         *
         */
        public List<DrivingDirections> getDrivingDirections() {
            if (drivingDirections == null) {
                drivingDirections = new ArrayList<DrivingDirections>();
            }
            return this.drivingDirections;
        }

        /**
         * 获取hotelID属性的值。
         *
         */
        public int getHotelID() {
            return hotelID;
        }

        /**
         * 设置hotelID属性的值。
         *
         */
        public void setHotelID(int value) {
            this.hotelID = value;
        }

        /**
         * 获取name属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * 获取brand属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getBrand() {
            return brand;
        }

        /**
         * 设置brand属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setBrand(String value) {
            this.brand = value;
        }

        /**
         * 获取brandId属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getBrandId() {
            return brandId;
        }

        /**
         * 设置brandId属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setBrandId(Integer value) {
            this.brandId = value;
        }

        /**
         * 获取rooms属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getRooms() {
            return rooms;
        }

        /**
         * 设置rooms属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setRooms(Integer value) {
            this.rooms = value;
        }

        /**
         * 获取provider属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getProvider() {
            return provider;
        }

        /**
         * 设置provider属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setProvider(String value) {
            this.provider = value;
        }

        /**
         * 获取checkInTime属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getCheckInTime() {
            return checkInTime;
        }

        /**
         * 设置checkInTime属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setCheckInTime(Integer value) {
            this.checkInTime = value;
        }

        /**
         * 获取checkOutTime属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getCheckOutTime() {
            return checkOutTime;
        }

        /**
         * 设置checkOutTime属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setCheckOutTime(Integer value) {
            this.checkOutTime = value;
        }

        /**
         * 获取currency属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCurrency() {
            return currency;
        }

        /**
         * 设置currency属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCurrency(String value) {
            this.currency = value;
        }

        /**
         * 获取thumb属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getThumb() {
            return thumb;
        }

        /**
         * 设置thumb属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setThumb(String value) {
            this.thumb = value;
        }

        /**
         * 获取hotelPhone属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getHotelPhone() {
            return hotelPhone;
        }

        /**
         * 设置hotelPhone属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setHotelPhone(String value) {
            this.hotelPhone = value;
        }

        /**
         * 获取hotelFax属性的值。
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getHotelFax() {
            return hotelFax;
        }

        /**
         * 设置hotelFax属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setHotelFax(String value) {
            this.hotelFax = value;
        }

        /**
         * 获取starLevel属性的值。
         *
         * @return
         *     possible object is
         *     {@link Double }
         *
         */
        public Double getStarLevel() {
            return starLevel;
        }

        /**
         * 设置starLevel属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Double }
         *
         */
        public void setStarLevel(Double value) {
            this.starLevel = value;
        }

        /**
         * 获取isOpaque属性的值。
         *
         * @return
         *     possible object is
         *     {@link Boolean }
         *
         */
        public Boolean isIsOpaque() {
            return isOpaque;
        }

        /**
         * 设置isOpaque属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *
         */
        public void setIsOpaque(Boolean value) {
            this.isOpaque = value;
        }

        /**
         * 获取ranking属性的值。
         *
         * @return
         *     possible object is
         *     {@link Integer }
         *
         */
        public Integer getRanking() {
            return ranking;
        }

        /**
         * 设置ranking属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Integer }
         *
         */
        public void setRanking(Integer value) {
            this.ranking = value;
        }

        /**
         * 获取bestValue属性的值。
         *
         * @return
         *     possible object is
         *     {@link Short }
         *
         */
        public Short getBestValue() {
            return bestValue;
        }

        /**
         * 设置bestValue属性的值。
         *
         * @param value
         *     allowed object is
         *     {@link Short }
         *
         */
        public void setBestValue(Short value) {
            this.bestValue = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Amenity" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="amenityID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amenity"
        })
        public static class Amenities {

            @XmlElement(name = "Amenity", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
            protected List<Amenity> amenity;

            /**
             * Gets the value of the amenity property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the amenity property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAmenity().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Amenities.Amenity }
             *
             *
             */
            public List<Amenity> getAmenity() {
                if (amenity == null) {
                    amenity = new ArrayList<Amenity>();
                }
                return this.amenity;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             *
             * <p>以下模式片段指定包含在此类中的预期内容。
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="amenityID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Amenity {

                @XmlAttribute(name = "hotelID", required = true)
                protected int hotelID;
                @XmlAttribute(name = "amenityID", required = true)
                protected int amenityID;
                @XmlAttribute(name = "name")
                protected String name;

                /**
                 * 获取hotelID属性的值。
                 *
                 */
                public int getHotelID() {
                    return hotelID;
                }

                /**
                 * 设置hotelID属性的值。
                 *
                 */
                public void setHotelID(int value) {
                    this.hotelID = value;
                }

                /**
                 * 获取amenityID属性的值。
                 *
                 */
                public int getAmenityID() {
                    return amenityID;
                }

                /**
                 * 设置amenityID属性的值。
                 *
                 */
                public void setAmenityID(int value) {
                    this.amenityID = value;
                }

                /**
                 * 获取name属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * 设置name属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="VoucherRemark" type="{http://www.w3.org/2001/XMLSchema}string" form="unqualified"/&gt;
         *         &lt;element name="ShortDescription" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="FreeTextShortDescription" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="LongDescription" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="FreeTextLongDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
         *                   &lt;element name="Description" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="languageID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="templateID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="textFieldType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "voucherRemark",
            "shortDescription",
            "freeTextShortDescription",
            "longDescription"
        })
        public static class Descriptions {

            @XmlElement(name = "VoucherRemark", namespace = "", required = true)
            protected String voucherRemark;
            @XmlElement(name = "ShortDescription", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
            protected List<ShortDescription> shortDescription;
            @XmlElement(name = "FreeTextShortDescription", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
            protected List<FreeTextShortDescription> freeTextShortDescription;
            @XmlElement(name = "LongDescription", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
            protected List<LongDescription> longDescription;

            /**
             * 获取voucherRemark属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getVoucherRemark() {
                return voucherRemark;
            }

            /**
             * 设置voucherRemark属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setVoucherRemark(String value) {
                this.voucherRemark = value;
            }

            /**
             * Gets the value of the shortDescription property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the shortDescription property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getShortDescription().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Descriptions.ShortDescription }
             *
             *
             */
            public List<ShortDescription> getShortDescription() {
                if (shortDescription == null) {
                    shortDescription = new ArrayList<ShortDescription>();
                }
                return this.shortDescription;
            }

            /**
             * Gets the value of the freeTextShortDescription property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the freeTextShortDescription property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFreeTextShortDescription().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Descriptions.FreeTextShortDescription }
             *
             *
             */
            public List<FreeTextShortDescription> getFreeTextShortDescription() {
                if (freeTextShortDescription == null) {
                    freeTextShortDescription = new ArrayList<FreeTextShortDescription>();
                }
                return this.freeTextShortDescription;
            }

            /**
             * Gets the value of the longDescription property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the longDescription property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLongDescription().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription }
             *
             *
             */
            public List<LongDescription> getLongDescription() {
                if (longDescription == null) {
                    longDescription = new ArrayList<LongDescription>();
                }
                return this.longDescription;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             *
             * <p>以下模式片段指定包含在此类中的预期内容。
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class FreeTextShortDescription {

                @XmlAttribute(name = "desc")
                protected String desc;

                /**
                 * 获取desc属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDesc() {
                    return desc;
                }

                /**
                 * 设置desc属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDesc(String value) {
                    this.desc = value;
                }

            }


            /**
             * <p>anonymous complex type的 Java 类。
             *
             * <p>以下模式片段指定包含在此类中的预期内容。
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="FreeTextLongDescription" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
             *         &lt;element name="Description" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="languageID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="templateID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="textFieldType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "freeTextLongDescription",
                "description"
            })
            public static class LongDescription {

                @XmlElement(name = "FreeTextLongDescription", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd", required = true)
                protected String freeTextLongDescription;
                @XmlElement(name = "Description", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
                protected List<Description> description;

                /**
                 * 获取freeTextLongDescription属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getFreeTextLongDescription() {
                    return freeTextLongDescription;
                }

                /**
                 * 设置freeTextLongDescription属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setFreeTextLongDescription(String value) {
                    this.freeTextLongDescription = value;
                }

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
                 * {@link TWSHotelDetailsV3 .Hotel.Descriptions.LongDescription.Description }
                 *
                 *
                 */
                public List<Description> getDescription() {
                    if (description == null) {
                        description = new ArrayList<Description>();
                    }
                    return this.description;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 *
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="languageID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="templateID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="textFieldType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="category" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="categoryId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Description {

                    @XmlAttribute(name = "hotelID", required = true)
                    protected int hotelID;
                    @XmlAttribute(name = "languageID", required = true)
                    protected int languageID;
                    @XmlAttribute(name = "templateID", required = true)
                    protected int templateID;
                    @XmlAttribute(name = "textFieldType", required = true)
                    protected int textFieldType;
                    @XmlAttribute(name = "category")
                    protected String category;
                    @XmlAttribute(name = "categoryId")
                    protected Integer categoryId;
                    @XmlAttribute(name = "value")
                    protected String value;

                    /**
                     * 获取hotelID属性的值。
                     *
                     */
                    public int getHotelID() {
                        return hotelID;
                    }

                    /**
                     * 设置hotelID属性的值。
                     *
                     */
                    public void setHotelID(int value) {
                        this.hotelID = value;
                    }

                    /**
                     * 获取languageID属性的值。
                     *
                     */
                    public int getLanguageID() {
                        return languageID;
                    }

                    /**
                     * 设置languageID属性的值。
                     *
                     */
                    public void setLanguageID(int value) {
                        this.languageID = value;
                    }

                    /**
                     * 获取templateID属性的值。
                     *
                     */
                    public int getTemplateID() {
                        return templateID;
                    }

                    /**
                     * 设置templateID属性的值。
                     *
                     */
                    public void setTemplateID(int value) {
                        this.templateID = value;
                    }

                    /**
                     * 获取textFieldType属性的值。
                     *
                     */
                    public int getTextFieldType() {
                        return textFieldType;
                    }

                    /**
                     * 设置textFieldType属性的值。
                     *
                     */
                    public void setTextFieldType(int value) {
                        this.textFieldType = value;
                    }

                    /**
                     * 获取category属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCategory() {
                        return category;
                    }

                    /**
                     * 设置category属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCategory(String value) {
                        this.category = value;
                    }

                    /**
                     * 获取categoryId属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getCategoryId() {
                        return categoryId;
                    }

                    /**
                     * 设置categoryId属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setCategoryId(Integer value) {
                        this.categoryId = value;
                    }

                    /**
                     * 获取value属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * 设置value属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                }

            }


            /**
             * <p>anonymous complex type的 Java 类。
             *
             * <p>以下模式片段指定包含在此类中的预期内容。
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;attribute name="desc" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ShortDescription {

                @XmlAttribute(name = "desc")
                protected String desc;

                /**
                 * 获取desc属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDesc() {
                    return desc;
                }

                /**
                 * 设置desc属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDesc(String value) {
                    this.desc = value;
                }

            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Option" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="DrivingDirectionDesc" form="unqualified"&gt;
         *                     &lt;simpleType&gt;
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
         *                         &lt;maxLength value="2147483647"/&gt;
         *                       &lt;/restriction&gt;
         *                     &lt;/simpleType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *                 &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="seqNum" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "option"
        })
        public static class DrivingDirections {

            @XmlElement(name = "Option", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
            protected List<Option> option;

            /**
             * Gets the value of the option property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the option property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOption().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.DrivingDirections.Option }
             *
             *
             */
            public List<Option> getOption() {
                if (option == null) {
                    option = new ArrayList<Option>();
                }
                return this.option;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             *
             * <p>以下模式片段指定包含在此类中的预期内容。
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="DrivingDirectionDesc" form="unqualified"&gt;
             *           &lt;simpleType&gt;
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
             *               &lt;maxLength value="2147483647"/&gt;
             *             &lt;/restriction&gt;
             *           &lt;/simpleType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *       &lt;attribute name="hotelId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="seqNum" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "drivingDirectionDesc"
            })
            public static class Option {

                @XmlElement(name = "DrivingDirectionDesc", namespace = "", required = true)
                protected String drivingDirectionDesc;
                @XmlAttribute(name = "hotelId")
                protected Integer hotelId;
                @XmlAttribute(name = "seqNum")
                protected Integer seqNum;
                @XmlAttribute(name = "name")
                protected String name;

                /**
                 * 获取drivingDirectionDesc属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getDrivingDirectionDesc() {
                    return drivingDirectionDesc;
                }

                /**
                 * 设置drivingDirectionDesc属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setDrivingDirectionDesc(String value) {
                    this.drivingDirectionDesc = value;
                }

                /**
                 * 获取hotelId属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *
                 */
                public Integer getHotelId() {
                    return hotelId;
                }

                /**
                 * 设置hotelId属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *
                 */
                public void setHotelId(Integer value) {
                    this.hotelId = value;
                }

                /**
                 * 获取seqNum属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *
                 */
                public Integer getSeqNum() {
                    return seqNum;
                }

                /**
                 * 设置seqNum属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *
                 */
                public void setSeqNum(Integer value) {
                    this.seqNum = value;
                }

                /**
                 * 获取name属性的值。
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * 设置name属性的值。
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="country" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="state" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="city" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="searchingCity" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="destinationCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="destinationId" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="location" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="address" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="zip" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="longitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="latitude" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Location {

            @XmlAttribute(name = "country")
            protected String country;
            @XmlAttribute(name = "state")
            protected String state;
            @XmlAttribute(name = "city")
            protected String city;
            @XmlAttribute(name = "searchingCity")
            protected String searchingCity;
            @XmlAttribute(name = "destinationCode")
            protected String destinationCode;
            @XmlAttribute(name = "destinationId")
            protected String destinationId;
            @XmlAttribute(name = "location")
            protected String location;
            @XmlAttribute(name = "address")
            protected String address;
            @XmlAttribute(name = "zip")
            protected String zip;
            @XmlAttribute(name = "longitude")
            protected BigDecimal longitude;
            @XmlAttribute(name = "latitude")
            protected BigDecimal latitude;

            /**
             * 获取country属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCountry() {
                return country;
            }

            /**
             * 设置country属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCountry(String value) {
                this.country = value;
            }

            /**
             * 获取state属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getState() {
                return state;
            }

            /**
             * 设置state属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setState(String value) {
                this.state = value;
            }

            /**
             * 获取city属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCity() {
                return city;
            }

            /**
             * 设置city属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCity(String value) {
                this.city = value;
            }

            /**
             * 获取searchingCity属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getSearchingCity() {
                return searchingCity;
            }

            /**
             * 设置searchingCity属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setSearchingCity(String value) {
                this.searchingCity = value;
            }

            /**
             * 获取destinationCode属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDestinationCode() {
                return destinationCode;
            }

            /**
             * 设置destinationCode属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDestinationCode(String value) {
                this.destinationCode = value;
            }

            /**
             * 获取destinationId属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDestinationId() {
                return destinationId;
            }

            /**
             * 设置destinationId属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDestinationId(String value) {
                this.destinationId = value;
            }

            /**
             * 获取location属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLocation() {
                return location;
            }

            /**
             * 设置location属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLocation(String value) {
                this.location = value;
            }

            /**
             * 获取address属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAddress() {
                return address;
            }

            /**
             * 设置address属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAddress(String value) {
                this.address = value;
            }

            /**
             * 获取zip属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getZip() {
                return zip;
            }

            /**
             * 设置zip属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setZip(String value) {
                this.zip = value;
            }

            /**
             * 获取longitude属性的值。
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLongitude() {
                return longitude;
            }

            /**
             * 设置longitude属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLongitude(BigDecimal value) {
                this.longitude = value;
            }

            /**
             * 获取latitude属性的值。
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getLatitude() {
                return latitude;
            }

            /**
             * 设置latitude属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setLatitude(BigDecimal value) {
                this.latitude = value;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Images" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Image" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="hotelID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="HotelImgID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Movies" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Movie" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="MovieId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="activityId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "images",
            "movies"
        })
        public static class Media {

            @XmlElement(name = "Images", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
            protected List<Images> images;
            @XmlElement(name = "Movies", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
            protected List<Movies> movies;

            /**
             * Gets the value of the images property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the images property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getImages().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Media.Images }
             *
             *
             */
            public List<Images> getImages() {
                if (images == null) {
                    images = new ArrayList<Images>();
                }
                return this.images;
            }

            /**
             * Gets the value of the movies property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the movies property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getMovies().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.Media.Movies }
             *
             *
             */
            public List<Movies> getMovies() {
                if (movies == null) {
                    movies = new ArrayList<Movies>();
                }
                return this.movies;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             *
             * <p>以下模式片段指定包含在此类中的预期内容。
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Image" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="hotelID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="HotelImgID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "image"
            })
            public static class Images {

                @XmlElement(name = "Image", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
                protected List<Image> image;

                /**
                 * Gets the value of the image property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the image property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getImage().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TWSHotelDetailsV3 .Hotel.Media.Images.Image }
                 *
                 *
                 */
                public List<Image> getImage() {
                    if (image == null) {
                        image = new ArrayList<Image>();
                    }
                    return this.image;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 *
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="hotelID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="HotelImgID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Image {

                    @XmlAttribute(name = "type")
                    protected Integer type;
                    @XmlAttribute(name = "path")
                    protected String path;
                    @XmlAttribute(name = "hotelID")
                    protected Integer hotelID;
                    @XmlAttribute(name = "HotelImgID", required = true)
                    protected int hotelImgID;

                    /**
                     * 获取type属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getType() {
                        return type;
                    }

                    /**
                     * 设置type属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setType(Integer value) {
                        this.type = value;
                    }

                    /**
                     * 获取path属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPath() {
                        return path;
                    }

                    /**
                     * 设置path属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPath(String value) {
                        this.path = value;
                    }

                    /**
                     * 获取hotelID属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getHotelID() {
                        return hotelID;
                    }

                    /**
                     * 设置hotelID属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setHotelID(Integer value) {
                        this.hotelID = value;
                    }

                    /**
                     * 获取hotelImgID属性的值。
                     *
                     */
                    public int getHotelImgID() {
                        return hotelImgID;
                    }

                    /**
                     * 设置hotelImgID属性的值。
                     *
                     */
                    public void setHotelImgID(int value) {
                        this.hotelImgID = value;
                    }

                }

            }


            /**
             * <p>anonymous complex type的 Java 类。
             *
             * <p>以下模式片段指定包含在此类中的预期内容。
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Movie" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="MovieId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="activityId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "movie"
            })
            public static class Movies {

                @XmlElement(name = "Movie", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
                protected List<Movie> movie;

                /**
                 * Gets the value of the movie property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the movie property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMovie().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TWSHotelDetailsV3 .Hotel.Media.Movies.Movie }
                 *
                 *
                 */
                public List<Movie> getMovie() {
                    if (movie == null) {
                        movie = new ArrayList<Movie>();
                    }
                    return this.movie;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 *
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="MovieId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="activityId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="title" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="path" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Movie {

                    @XmlAttribute(name = "MovieId", required = true)
                    protected int movieId;
                    @XmlAttribute(name = "activityId")
                    protected Integer activityId;
                    @XmlAttribute(name = "title")
                    protected String title;
                    @XmlAttribute(name = "path")
                    protected String path;

                    /**
                     * 获取movieId属性的值。
                     *
                     */
                    public int getMovieId() {
                        return movieId;
                    }

                    /**
                     * 设置movieId属性的值。
                     *
                     */
                    public void setMovieId(int value) {
                        this.movieId = value;
                    }

                    /**
                     * 获取activityId属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *
                     */
                    public Integer getActivityId() {
                        return activityId;
                    }

                    /**
                     * 设置activityId属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *
                     */
                    public void setActivityId(Integer value) {
                        this.activityId = value;
                    }

                    /**
                     * 获取title属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getTitle() {
                        return title;
                    }

                    /**
                     * 设置title属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setTitle(String value) {
                        this.title = value;
                    }

                    /**
                     * 获取path属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getPath() {
                        return path;
                    }

                    /**
                     * 设置path属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setPath(String value) {
                        this.path = value;
                    }

                }

            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="typeId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="airportCode" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="direction" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="distance" type="{http://www.w3.org/2001/XMLSchema}decimal" /&gt;
         *       &lt;attribute name="unit" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RefPoints {

            @XmlAttribute(name = "type")
            protected String type;
            @XmlAttribute(name = "typeId")
            protected Integer typeId;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "airportCode")
            protected String airportCode;
            @XmlAttribute(name = "direction")
            protected String direction;
            @XmlAttribute(name = "distance")
            protected BigDecimal distance;
            @XmlAttribute(name = "unit")
            protected String unit;

            /**
             * 获取type属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getType() {
                return type;
            }

            /**
             * 设置type属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * 获取typeId属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getTypeId() {
                return typeId;
            }

            /**
             * 设置typeId属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setTypeId(Integer value) {
                this.typeId = value;
            }

            /**
             * 获取name属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * 获取airportCode属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAirportCode() {
                return airportCode;
            }

            /**
             * 设置airportCode属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAirportCode(String value) {
                this.airportCode = value;
            }

            /**
             * 获取direction属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDirection() {
                return direction;
            }

            /**
             * 设置direction属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDirection(String value) {
                this.direction = value;
            }

            /**
             * 获取distance属性的值。
             *
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *
             */
            public BigDecimal getDistance() {
                return distance;
            }

            /**
             * 设置distance属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *
             */
            public void setDistance(BigDecimal value) {
                this.distance = value;
            }

            /**
             * 获取unit属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUnit() {
                return unit;
            }

            /**
             * 设置unit属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUnit(String value) {
                this.unit = value;
            }

        }


        /**
         * <p>anonymous complex type的 Java 类。
         *
         * <p>以下模式片段指定包含在此类中的预期内容。
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="HotelRoomTypeIds" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="HotelRoomTypeId" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Facilities" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Facility" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="facilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="Discounts" maxOccurs="unbounded" minOccurs="0"&gt;
         *           &lt;complexType&gt;
         *             &lt;complexContent&gt;
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                 &lt;sequence&gt;
         *                   &lt;element name="Discount" maxOccurs="unbounded" minOccurs="0"&gt;
         *                     &lt;complexType&gt;
         *                       &lt;complexContent&gt;
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *                           &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                           &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *                         &lt;/restriction&gt;
         *                       &lt;/complexContent&gt;
         *                     &lt;/complexType&gt;
         *                   &lt;/element&gt;
         *                 &lt;/sequence&gt;
         *               &lt;/restriction&gt;
         *             &lt;/complexContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *       &lt;/sequence&gt;
         *       &lt;attribute name="hotelID" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *       &lt;attribute name="roomId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="description" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="maxGuest" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *       &lt;attribute name="maxChild" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *       &lt;attribute name="roomCategoryID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *       &lt;attribute name="roomCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="roomTypeCategory" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *       &lt;attribute name="roomTypeCategoryId" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hotelRoomTypeIds",
            "facilities",
            "discounts"
        })
        public static class RoomType {

            @XmlElement(name = "HotelRoomTypeIds", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
            protected List<HotelRoomTypeIds> hotelRoomTypeIds;
            @XmlElement(name = "Facilities", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
            protected List<Facilities> facilities;
            @XmlElement(name = "Discounts", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
            protected List<Discounts> discounts;
            @XmlAttribute(name = "hotelID", required = true)
            protected int hotelID;
            @XmlAttribute(name = "roomId", required = true)
            protected int roomId;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "description")
            protected String description;
            @XmlAttribute(name = "maxGuest")
            protected Integer maxGuest;
            @XmlAttribute(name = "maxChild")
            protected Integer maxChild;
            @XmlAttribute(name = "roomCategoryID")
            protected Integer roomCategoryID;
            @XmlAttribute(name = "roomCategory")
            protected String roomCategory;
            @XmlAttribute(name = "roomTypeCategory")
            protected String roomTypeCategory;
            @XmlAttribute(name = "roomTypeCategoryId")
            protected Integer roomTypeCategoryId;

            /**
             * Gets the value of the hotelRoomTypeIds property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the hotelRoomTypeIds property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getHotelRoomTypeIds().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds }
             *
             *
             */
            public List<HotelRoomTypeIds> getHotelRoomTypeIds() {
                if (hotelRoomTypeIds == null) {
                    hotelRoomTypeIds = new ArrayList<HotelRoomTypeIds>();
                }
                return this.hotelRoomTypeIds;
            }

            /**
             * Gets the value of the facilities property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the facilities property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFacilities().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.RoomType.Facilities }
             *
             *
             */
            public List<Facilities> getFacilities() {
                if (facilities == null) {
                    facilities = new ArrayList<Facilities>();
                }
                return this.facilities;
            }

            /**
             * Gets the value of the discounts property.
             *
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the discounts property.
             *
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDiscounts().add(newItem);
             * </pre>
             *
             *
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link TWSHotelDetailsV3 .Hotel.RoomType.Discounts }
             *
             *
             */
            public List<Discounts> getDiscounts() {
                if (discounts == null) {
                    discounts = new ArrayList<Discounts>();
                }
                return this.discounts;
            }

            /**
             * 获取hotelID属性的值。
             *
             */
            public int getHotelID() {
                return hotelID;
            }

            /**
             * 设置hotelID属性的值。
             *
             */
            public void setHotelID(int value) {
                this.hotelID = value;
            }

            /**
             * 获取roomId属性的值。
             *
             */
            public int getRoomId() {
                return roomId;
            }

            /**
             * 设置roomId属性的值。
             *
             */
            public void setRoomId(int value) {
                this.roomId = value;
            }

            /**
             * 获取name属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * 获取description属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * 获取maxGuest属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getMaxGuest() {
                return maxGuest;
            }

            /**
             * 设置maxGuest属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setMaxGuest(Integer value) {
                this.maxGuest = value;
            }

            /**
             * 获取maxChild属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getMaxChild() {
                return maxChild;
            }

            /**
             * 设置maxChild属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setMaxChild(Integer value) {
                this.maxChild = value;
            }

            /**
             * 获取roomCategoryID属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getRoomCategoryID() {
                return roomCategoryID;
            }

            /**
             * 设置roomCategoryID属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setRoomCategoryID(Integer value) {
                this.roomCategoryID = value;
            }

            /**
             * 获取roomCategory属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRoomCategory() {
                return roomCategory;
            }

            /**
             * 设置roomCategory属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRoomCategory(String value) {
                this.roomCategory = value;
            }

            /**
             * 获取roomTypeCategory属性的值。
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getRoomTypeCategory() {
                return roomTypeCategory;
            }

            /**
             * 设置roomTypeCategory属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setRoomTypeCategory(String value) {
                this.roomTypeCategory = value;
            }

            /**
             * 获取roomTypeCategoryId属性的值。
             *
             * @return
             *     possible object is
             *     {@link Integer }
             *
             */
            public Integer getRoomTypeCategoryId() {
                return roomTypeCategoryId;
            }

            /**
             * 设置roomTypeCategoryId属性的值。
             *
             * @param value
             *     allowed object is
             *     {@link Integer }
             *
             */
            public void setRoomTypeCategoryId(Integer value) {
                this.roomTypeCategoryId = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             *
             * <p>以下模式片段指定包含在此类中的预期内容。
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Discount" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *                 &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "discount"
            })
            public static class Discounts {

                @XmlElement(name = "Discount", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
                protected List<Discount> discount;

                /**
                 * Gets the value of the discount property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the discount property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDiscount().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TWSHotelDetailsV3 .Hotel.RoomType.Discounts.Discount }
                 *
                 *
                 */
                public List<Discount> getDiscount() {
                    if (discount == null) {
                        discount = new ArrayList<Discount>();
                    }
                    return this.discount;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 *
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="fromDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="toDate" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *       &lt;attribute name="value" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Discount {

                    @XmlAttribute(name = "type")
                    protected String type;
                    @XmlAttribute(name = "fromDate")
                    protected String fromDate;
                    @XmlAttribute(name = "toDate")
                    protected String toDate;
                    @XmlAttribute(name = "value")
                    protected String value;

                    /**
                     * 获取type属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getType() {
                        return type;
                    }

                    /**
                     * 设置type属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setType(String value) {
                        this.type = value;
                    }

                    /**
                     * 获取fromDate属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getFromDate() {
                        return fromDate;
                    }

                    /**
                     * 设置fromDate属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setFromDate(String value) {
                        this.fromDate = value;
                    }

                    /**
                     * 获取toDate属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getToDate() {
                        return toDate;
                    }

                    /**
                     * 设置toDate属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setToDate(String value) {
                        this.toDate = value;
                    }

                    /**
                     * 获取value属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getValue() {
                        return value;
                    }

                    /**
                     * 设置value属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setValue(String value) {
                        this.value = value;
                    }

                }

            }


            /**
             * <p>anonymous complex type的 Java 类。
             *
             * <p>以下模式片段指定包含在此类中的预期内容。
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="Facility" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="facilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "facility"
            })
            public static class Facilities {

                @XmlElement(name = "Facility", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
                protected List<Facility> facility;

                /**
                 * Gets the value of the facility property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the facility property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getFacility().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TWSHotelDetailsV3 .Hotel.RoomType.Facilities.Facility }
                 *
                 *
                 */
                public List<Facility> getFacility() {
                    if (facility == null) {
                        facility = new ArrayList<Facility>();
                    }
                    return this.facility;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 *
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 *
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="facilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Facility {

                    @XmlAttribute(name = "facilityId", required = true)
                    protected int facilityId;
                    @XmlAttribute(name = "name")
                    protected String name;

                    /**
                     * 获取facilityId属性的值。
                     *
                     */
                    public int getFacilityId() {
                        return facilityId;
                    }

                    /**
                     * 设置facilityId属性的值。
                     *
                     */
                    public void setFacilityId(int value) {
                        this.facilityId = value;
                    }

                    /**
                     * 获取name属性的值。
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getName() {
                        return name;
                    }

                    /**
                     * 设置name属性的值。
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setName(String value) {
                        this.name = value;
                    }

                }

            }


            /**
             * <p>anonymous complex type的 Java 类。
             *
             * <p>以下模式片段指定包含在此类中的预期内容。
             *
             * <pre>
             * &lt;complexType&gt;
             *   &lt;complexContent&gt;
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *       &lt;sequence&gt;
             *         &lt;element name="HotelRoomTypeId" maxOccurs="unbounded" minOccurs="0"&gt;
             *           &lt;complexType&gt;
             *             &lt;complexContent&gt;
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
             *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
             *               &lt;/restriction&gt;
             *             &lt;/complexContent&gt;
             *           &lt;/complexType&gt;
             *         &lt;/element&gt;
             *       &lt;/sequence&gt;
             *     &lt;/restriction&gt;
             *   &lt;/complexContent&gt;
             * &lt;/complexType&gt;
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "hotelRoomTypeId"
            })
            public static class HotelRoomTypeIds {

                @XmlElement(name = "HotelRoomTypeId", namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd")
                protected List<HotelRoomTypeId> hotelRoomTypeId;

                /**
                 * Gets the value of the hotelRoomTypeId property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the hotelRoomTypeId property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getHotelRoomTypeId().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TWSHotelDetailsV3 .Hotel.RoomType.HotelRoomTypeIds.HotelRoomTypeId }
                 *
                 *
                 */
                public List<HotelRoomTypeId> getHotelRoomTypeId() {
                    if (hotelRoomTypeId == null) {
                        hotelRoomTypeId = new ArrayList<HotelRoomTypeId>();
                    }
                    return this.hotelRoomTypeId;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType&gt;
                 *   &lt;complexContent&gt;
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
                 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
                 *     &lt;/restriction&gt;
                 *   &lt;/complexContent&gt;
                 * &lt;/complexType&gt;
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class HotelRoomTypeId {

                    @XmlAttribute(name = "ID")
                    protected Integer id;

                    /**
                     * 获取id属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getID() {
                        return id;
                    }

                    /**
                     * 设置id属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setID(Integer value) {
                        this.id = value;
                    }

                }

            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="description" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "type",
        "code",
        "description"
    })
    public static class StatusCode {

        @XmlElement(namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd", required = true)
        protected String type;
        @XmlElement(namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd", required = true)
        protected String code;
        @XmlElement(namespace = "http://tempuri.org/TWS_HotelDetailsV3.xsd", required = true)
        protected String description;

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

        /**
         * 获取description属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDescription() {
            return description;
        }

        /**
         * 设置description属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDescription(String value) {
            this.description = value;
        }

    }

}
