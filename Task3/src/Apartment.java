public class Apartment {
    int apartmentNumber;
    float square;
    int floor;
    int roomNumber;
    String buildingType;
    int exploitation;

    public int getApartmentNumber( ){
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber){
        this.apartmentNumber = apartmentNumber;
    }

    public float getSquare() {
        return square;
    }

    public void setSquare(float square) {
        this.square = square;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(String buildingType) {
        this.buildingType = buildingType;
    }

    public float getExploitation() {
        return exploitation;
    }

    public void setExploitation(int exploitation) {
        this.exploitation = exploitation;
    }

    public Apartment(){

    }

    public Apartment(int apartmentNumber, float square, int floor, int roomNumber, String buildingType, int exploitation){
        this.apartmentNumber = apartmentNumber;
        this.square = square;
        this.floor = floor;
        this.roomNumber = roomNumber;
        this. buildingType = buildingType;
        this.exploitation = exploitation;
    }

    public String toString(){
        return "Apartment: " + apartmentNumber + "\t Square: " + square + "\t Floor: " + floor + "\t Number of rooms: " +
                roomNumber + "\t Building type: " + buildingType + "\t Exploitation: " + exploitation;
    }

}
