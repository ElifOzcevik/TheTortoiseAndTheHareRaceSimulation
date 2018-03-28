import java.util.Random;
public class Yarýþ {
private int T; // T=Kaplumbaða
private int H; //H=Tavþan 

//constructor oluþturulur.
public Yarýþ()
{
	T=1;
	H=1;
	}

public void Process()  //iþlemlerin yapýldýðý metot
{
	int sumT=1; //kaplumbaðanýn her adýmýný toplar. Bulunduðu kareyi gösteriri
	int sumH=1; ////tavþanýn her adýmýný toplar. Bulunduðu kareyi gösterir.
	//tavþan veya kaplumbaða baþlangýç noktasý olan 1 de deðilse baþlangýç noktasý 1'e getirilir
	if ((T!=1) || (H!=1)) { 
							H=1;
							T=1;
								}
	Random r=new Random();  
	System.out.print("\n BANG !!!!!"); //Yarýþ baþlama iþareti
	
	for(;;) //sonsuz döngü yarýþýn her saniyesini ifade eder. Yarýþýn süresi belli olmadýðý için sonsuz döngü kullanýlýr.
	{
		T=r.nextInt(10)+1;  //T'ye random ile rasgele percentage of the time atanýr.
		H=r.nextInt(10)+1;  ///T'ye random ile rasgele percentage of the time atanýr.
		
		
		//1<=i<=5 olduðunda fast flod. Kaplumbaðanýn toplam adýmýna gerekli adým eklenir
		if ((T>=1) && (T<=5))  {
									//System.out.print("\n Kaplubaða için fast flod");
									sumT=sumT+3;
									if (sumT<0) sumT=1; //kaplumbaða baþlangýç noktasýndan geri giderse baþlangýç noktasýna getirilir.
									if (sumT>70) sumT=70; // 70. kare son karedir daha ileri gidilmez.
										}
		
		
		//6<=i<=7 olduðunda kaygan zemin. Kaplumbaðanýn toplam adýmýna gerekli adým eklenir
		if ((T>=6) && (T<=7))  {
									//System.out.print("\n Kaplubaða için slip");
									sumT=sumT-6;
									if (sumT<0) sumT=1;
									if (sumT>70) sumT=70; 
								}
		
		
		//8<=i<=10 olduðunda slow flod. Kaplumbaðanýn toplam adýmýna gerekli adým eklenir
		if ((T>=8) && (T<=10))  {
									//System.out.print("\n Kaplubaða için slow plod");
									sumT=sumT+1;
									if (sumT<0) sumT=1;
								}
		
		
		//1<=i<=2 olduðunda Sleep. Tavþanýn toplam adýmýna gerekli adým eklenir.
		if ((H>=1) && (H<=2))  {
								//	System.out.print("\n Tavþan için  Sleep");
									sumH=sumH;
									if (sumH<0) sumH=1;
									if (sumT>70) sumT=70;
								}
		
		
		//3<=i<=4 olduðunda big Hop. Tavþanýn toplam adýmýna gerekli adým eklenir.
		if ((H>=3) && (H<=4))  {
									//System.out.print("\n Tavþan big hop");
									sumH=sumH+9;
									if (sumH<0) sumH=1;
									if (sumH>70) sumH=70;
								}
		
		
		//i=2 olduðunda big Slip. Tavþanýn toplam adýmýna gerekli adým eklenir.
		if (H==5)  {
						//System.out.print("\n Tavþan big slip");
						sumH=sumH-12;
						if (sumH<0) sumH=1;
						if (sumH>70) sumH=70;
					}
		
		
		//6<=i<=8 olduðunda small hop. Tavþanýn toplam adýmýna gerekli adým eklenir.
		if ((H>=6) && (H<=8))  {
									//System.out.print("\n Tavþan small hop");
									sumH=sumH+1;
									if (sumH<0) sumH=1;
									if (sumH>70) sumH=70;
								}
		
		
		//9<=i<=10 olduðunda small Slip. Tavþanýn toplam adýmýna gerekli adým eklenir.
		if ((H>=9) && (H<=10))  {
									//System.out.print("\n Tavþan small slip");
									sumH=sumH-2;
									if (sumH<0) sumH=1;
									if (sumH>70) sumH=70;
								}
		
		//hayvanlarýn yerlerini bildirir.
		System.out.printf("\n Kaplumbaða %d. karede 	Tavþan %d. karede", sumT, sumH);
		
		
		//Ayný hizada olurlarsa kaplumbaða tavþaný ýsýrýr ve ekrane OUCH uyarýsý verir.
		if (sumT==sumH) System.out.print("\n OUCH!!!");
		
		
		//ikisi de 70. karedelerse beraberlik olur.
		if ((sumT==70) && (sumH==70)) {
									System.out.print("\n  AND THEY'RE OFF !!!!! \n It's a tie. ");
									return;
								}
		
		//Kaplumbaða 70. kareye ulaþýrsa yarýþý o kazanýr
		else if (sumT==70)  {	
							System.out.print("\n  AND THEY'RE OFF !!!!! \n TORTOISE WINS!!! YAY!!!");
							return;
						}
		
		
		//Tavþan 70. kareye ulaþýrsa yarýþý o kazanýr.
		else if (sumH==70) {
							System.out.print(" \n AND THEY'RE OFF !!!!! \n Hare wins. Yuch.");
							return;
						}
		
	}
	
	
	}
}
