package Visitor1;

public interface Vehicle {
//every vehicle goes under full service and the vehicle inspector calculates the total service charge   
    int accept(VehicleInspector vehicleInspector);  
} 