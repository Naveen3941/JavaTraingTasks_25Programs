package com.example;

public interface IExportData {
	void convertToJSON(Shipment[] shipmentObj);
	void convertToCSV(Shipment[] shipmentObj);
}
