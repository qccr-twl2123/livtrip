package com.livtrip.web.webservice.destination;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.FaultAction;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.8
 * 2016-12-08T17:41:16.408+08:00
 * Generated source version: 3.1.8
 * 
 */
@WebService(targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/Contracts", name = "IDestinationContracts")
@XmlSeeAlso({ObjectFactory.class})
public interface IDestinationContracts {

    @WebResult(name = "DestinationResult", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts")
    @Action(input = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetActivitiesByDestination", output = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetActivitiesByDestinationResponse", fault = {@FaultAction(className = IDestinationContractsGetActivitiesByDestinationCustomExceptionMessageFaultFaultMessage.class, value = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetActivitiesByDestinationCustomExceptionMessageFault")})
    @RequestWrapper(localName = "GetActivitiesByDestination", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts", className = "com.livtip.webservice.hotel.GetActivitiesByDestination")
    @WebMethod(operationName = "GetActivitiesByDestination", action = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetActivitiesByDestination")
    @ResponseWrapper(localName = "ActivitiesByDestinationResponse", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts", className = "com.livtip.webservice.hotel.ActivitiesByDestinationResponse")
    public DestinationResult getActivitiesByDestination(
        @WebParam(name = "Destination", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts")
                Destination destination
    ) throws IDestinationContractsGetActivitiesByDestinationCustomExceptionMessageFaultFaultMessage;

    @WebResult(name = "DestinationResult", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts")
    @Action(input = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetHotelsByDestination", output = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetHotelsByDestinationResponse", fault = {@FaultAction(className = IDestinationContractsGetHotelsByDestinationCustomExceptionMessageFaultFaultMessage.class, value = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetHotelsByDestinationCustomExceptionMessageFault")})
    @RequestWrapper(localName = "GetHotelsByDestination", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts", className = "com.livtip.webservice.hotel.GetHotelsByDestination")
    @WebMethod(operationName = "GetHotelsByDestination", action = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetHotelsByDestination")
    @ResponseWrapper(localName = "HotelsByDestinationResponse", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts", className = "com.livtip.webservice.hotel.HotelsByDestinationResponse")
    public DestinationResult getHotelsByDestination(
        @WebParam(name = "Destination", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts")
                Destination destination
    ) throws IDestinationContractsGetHotelsByDestinationCustomExceptionMessageFaultFaultMessage;

    @WebResult(name = "DestinationResult", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts")
    @Action(input = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetDestination", output = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetDestinationResponse", fault = {@FaultAction(className = IDestinationContractsGetDestinationCustomExceptionMessageFaultFaultMessage.class, value = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetDestinationCustomExceptionMessageFault")})
    @RequestWrapper(localName = "GetDestination", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts", className = "com.livtip.webservice.hotel.GetDestination")
    @WebMethod(operationName = "GetDestination", action = "http://touricoholidays.com/WSDestinations/2008/08/Contracts/IDestinationContracts/GetDestination")
    @ResponseWrapper(localName = "DestinationResponse", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts", className = "com.livtip.webservice.hotel.DestinationResponse")
    public DestinationResult getDestination(
        @WebParam(name = "Destination", targetNamespace = "http://touricoholidays.com/WSDestinations/2008/08/DataContracts")
                Destination destination
    ) throws IDestinationContractsGetDestinationCustomExceptionMessageFaultFaultMessage;
}
