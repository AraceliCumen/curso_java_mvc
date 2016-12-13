package com.openwebinars.inyecciondependencias;

public class VehiculoV2 {
	
    private Motor m;

    public VehiculoV2(Motor motorVehiculo) {
        m = motorVehiculo;
    }

    public int getRevolucionesMotor() {
        return m.getRevoluciones();
    }
}
