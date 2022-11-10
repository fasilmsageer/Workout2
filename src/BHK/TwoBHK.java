package BHK;

import BHK.OneBHK;

class TwoBHK extends OneBHK {
    private double room2Area;

    TwoBHK(double roomArea, double hallArea, double price, double room2Area){
        super(roomArea, hallArea, price);
        this.room2Area = room2Area;
    }

    void show(){
        super.show();
        System.out.println("Room 2 Area: "+room2Area);
    }
}
