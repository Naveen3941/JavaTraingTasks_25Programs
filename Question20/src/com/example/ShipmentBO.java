package com.example;

public class ShipmentBO implements IExportData {

	@Override
	public void convertToJSON(Shipment[] shipmentObj) {
		for(Shipment s:shipmentObj)
		{
		System.out.println("JSON Data:");
		System.out.println("[");
		System.out.println("{");
		System.out.println("\"id:\""+s.getId());
		System.out.println("\"name:\""+s.getName());
		System.out.println("\"arrivalName:\""+s.getArrivalPort());
		System.out.println("\"departureName:\""+s.getDeparturePort());
		System.out.println("\"shipmentCode:\""+s.getStatus().getCode());
		System.out.println("\"shipmentName:\""+s.getStatus().getName());
		System.out.println("}");
		System.out.println("]");
		}
		
	}

	@Override
	public void convertToCSV(Shipment[] shipmentObj) {
		for(Shipment shipment:shipmentObj)
		{
			System.out.println(shipment.getId()+","+shipment.getName()+","+shipment.getArrivalPort()+","+shipment.getDeparturePort()+","+shipment.getStatus().getCode()+","+shipment.getStatus().getName());
		
		}
		
	}

}
