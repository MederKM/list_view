package com.example.meder.list_view;

/**
 * Created by Meder on 19.02.2018.
 */

class Flat {
    String id;
    String address;
    String price;
    String area;
    String floor;
    String totalFloors;
    String rooms;



    public Flat() {
    }


    public Flat(String address, String price, String area, String floor, String totalFloors, String rooms) {
        this.address = address;
        this.price = price;
        this.area = area;
        this.floor = floor;
        this.totalFloors = totalFloors;
        this.rooms = rooms;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }

    public String getTotalFloors() {
        return totalFloors;
    }

    public void setTotalFloors(String totalFloors) {
        this.totalFloors = totalFloors;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }
}
