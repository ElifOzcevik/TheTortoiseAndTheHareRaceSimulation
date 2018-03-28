import java.util.Random;
public class Yar�� {
private int T; // T=Kaplumba�a
private int H; //H=Tav�an 

//constructor olu�turulur.
public Yar��()
{
	T=1;
	H=1;
	}

public void Process()  //i�lemlerin yap�ld��� metot
{
	int sumT=1; //kaplumba�an�n her ad�m�n� toplar. Bulundu�u kareyi g�steriri
	int sumH=1; ////tav�an�n her ad�m�n� toplar. Bulundu�u kareyi g�sterir.
	//tav�an veya kaplumba�a ba�lang�� noktas� olan 1 de de�ilse ba�lang�� noktas� 1'e getirilir
	if ((T!=1) || (H!=1)) { 
							H=1;
							T=1;
								}
	Random r=new Random();  
	System.out.print("\n BANG !!!!!"); //Yar�� ba�lama i�areti
	
	for(;;) //sonsuz d�ng� yar���n her saniyesini ifade eder. Yar���n s�resi belli olmad��� i�in sonsuz d�ng� kullan�l�r.
	{
		T=r.nextInt(10)+1;  //T'ye random ile rasgele percentage of the time atan�r.
		H=r.nextInt(10)+1;  ///T'ye random ile rasgele percentage of the time atan�r.
		
		
		//1<=i<=5 oldu�unda fast flod. Kaplumba�an�n toplam ad�m�na gerekli ad�m eklenir
		if ((T>=1) && (T<=5))  {
									//System.out.print("\n Kapluba�a i�in fast flod");
									sumT=sumT+3;
									if (sumT<0) sumT=1; //kaplumba�a ba�lang�� noktas�ndan geri giderse ba�lang�� noktas�na getirilir.
									if (sumT>70) sumT=70; // 70. kare son karedir daha ileri gidilmez.
										}
		
		
		//6<=i<=7 oldu�unda kaygan zemin. Kaplumba�an�n toplam ad�m�na gerekli ad�m eklenir
		if ((T>=6) && (T<=7))  {
									//System.out.print("\n Kapluba�a i�in slip");
									sumT=sumT-6;
									if (sumT<0) sumT=1;
									if (sumT>70) sumT=70; 
								}
		
		
		//8<=i<=10 oldu�unda slow flod. Kaplumba�an�n toplam ad�m�na gerekli ad�m eklenir
		if ((T>=8) && (T<=10))  {
									//System.out.print("\n Kapluba�a i�in slow plod");
									sumT=sumT+1;
									if (sumT<0) sumT=1;
								}
		
		
		//1<=i<=2 oldu�unda Sleep. Tav�an�n toplam ad�m�na gerekli ad�m eklenir.
		if ((H>=1) && (H<=2))  {
								//	System.out.print("\n Tav�an i�in  Sleep");
									sumH=sumH;
									if (sumH<0) sumH=1;
									if (sumT>70) sumT=70;
								}
		
		
		//3<=i<=4 oldu�unda big Hop. Tav�an�n toplam ad�m�na gerekli ad�m eklenir.
		if ((H>=3) && (H<=4))  {
									//System.out.print("\n Tav�an big hop");
									sumH=sumH+9;
									if (sumH<0) sumH=1;
									if (sumH>70) sumH=70;
								}
		
		
		//i=2 oldu�unda big Slip. Tav�an�n toplam ad�m�na gerekli ad�m eklenir.
		if (H==5)  {
						//System.out.print("\n Tav�an big slip");
						sumH=sumH-12;
						if (sumH<0) sumH=1;
						if (sumH>70) sumH=70;
					}
		
		
		//6<=i<=8 oldu�unda small hop. Tav�an�n toplam ad�m�na gerekli ad�m eklenir.
		if ((H>=6) && (H<=8))  {
									//System.out.print("\n Tav�an small hop");
									sumH=sumH+1;
									if (sumH<0) sumH=1;
									if (sumH>70) sumH=70;
								}
		
		
		//9<=i<=10 oldu�unda small Slip. Tav�an�n toplam ad�m�na gerekli ad�m eklenir.
		if ((H>=9) && (H<=10))  {
									//System.out.print("\n Tav�an small slip");
									sumH=sumH-2;
									if (sumH<0) sumH=1;
									if (sumH>70) sumH=70;
								}
		
		//hayvanlar�n yerlerini bildirir.
		System.out.printf("\n Kaplumba�a %d. karede 	Tav�an %d. karede", sumT, sumH);
		
		
		//Ayn� hizada olurlarsa kaplumba�a tav�an� �s�r�r ve ekrane OUCH uyar�s� verir.
		if (sumT==sumH) System.out.print("\n OUCH!!!");
		
		
		//ikisi de 70. karedelerse beraberlik olur.
		if ((sumT==70) && (sumH==70)) {
									System.out.print("\n  AND THEY'RE OFF !!!!! \n It's a tie. ");
									return;
								}
		
		//Kaplumba�a 70. kareye ula��rsa yar��� o kazan�r
		else if (sumT==70)  {	
							System.out.print("\n  AND THEY'RE OFF !!!!! \n TORTOISE WINS!!! YAY!!!");
							return;
						}
		
		
		//Tav�an 70. kareye ula��rsa yar��� o kazan�r.
		else if (sumH==70) {
							System.out.print(" \n AND THEY'RE OFF !!!!! \n Hare wins. Yuch.");
							return;
						}
		
	}
	
	
	}
}
