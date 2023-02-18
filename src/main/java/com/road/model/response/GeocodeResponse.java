package com.road.model.response;

import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

/**
 * 地理编码信息
 */
@Schema()
public class GeocodeResponse {

    private AddressComponent addressComponent;
    private List<Road> roads;
    private List<Roadinter> roadinters;
    private List<Poi> pois;
    private List<Aoi> aois;

    public AddressComponent getAddressComponent() {
        return addressComponent;
    }

    public void setAddressComponent(AddressComponent addressComponent) {
        this.addressComponent = addressComponent;
    }

    public List<Road> getRoads() {
        return roads;
    }

    public void setRoads(List<Road> roads) {
        this.roads = roads;
    }

    public List<Roadinter> getRoadinters() {
        return roadinters;
    }

    public void setRoadinters(List<Roadinter> roadinters) {
        this.roadinters = roadinters;
    }

    public List<Poi> getPois() {
        return pois;
    }

    public void setPois(List<Poi> pois) {
        this.pois = pois;
    }

    public List<Aoi> getAois() {
        return aois;
    }

    public void setAois(List<Aoi> aois) {
        this.aois = aois;
    }
}
