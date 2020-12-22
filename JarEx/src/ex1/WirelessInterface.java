package ex1;

public interface WirelessInterface {
	int discountRateMethod(int basePrice);//할인요금
    int communicationFeeMethod(int unitPrice, int useTime, int basePrice, int discountRate);//통신요금 
	
}
