public class Stats {
    
    public double SchussweiteOhneLuft = 0;
    public double SchussweiteMitLuft = 0;
    public double SchussDauer = 0;
    public double SchussDauerLuft = 0;
    public double MaxSchussHoehe = 0;
    public double MaxSchussHoeheLuft = 0;
    public double A = 0;

    public int FinalSpeed = 0;
    public int FinalWinkel = 0;

    public int Speed = 1750;
    public int Winkel = 20;

    public static int ExtraPower = 0;
    public static int ExtraWinkel = 0;

    public static boolean Start = false;

    // Berechnung von Stats
public void rechnung(){

    // Einstellungs Stats
    FinalSpeed = Speed + ExtraPower;
    FinalWinkel = Winkel + ExtraWinkel;

    // Berechnung von allen Stats
if (Start == true){

SchussweiteOhneLuft = Math.pow(FinalSpeed, 2) * Math.sin(Math.toRadians(FinalWinkel) * 2) / 9.8;
SchussweiteOhneLuft = Math.ceil(SchussweiteOhneLuft * 100 ) / 100;

SchussweiteMitLuft = SchussweiteOhneLuft / 5.9;
SchussweiteMitLuft = Math.ceil(SchussweiteMitLuft * 100 ) / 100;

SchussDauer = (2 * FinalSpeed * Math.sin(Math.toRadians(FinalWinkel))) / 9.8;
SchussDauer = Math.ceil(SchussDauer);

SchussDauerLuft = (2 * FinalSpeed * Math.sin(Math.toRadians(FinalWinkel))) / 9.8 / 1.9;
SchussDauerLuft = Math.ceil(SchussDauerLuft);

MaxSchussHoehe = FinalSpeed * Math.sin(Math.toRadians(FinalWinkel)) / 9.8;
MaxSchussHoehe = FinalSpeed * Math.sin(Math.toRadians(FinalWinkel)) * MaxSchussHoehe / 2;
MaxSchussHoehe = Math.ceil(MaxSchussHoehe * 100 ) / 100;

MaxSchussHoeheLuft = FinalSpeed * Math.sin(Math.toRadians(FinalWinkel)) / 9.8;
MaxSchussHoeheLuft = FinalSpeed * Math.sin(Math.toRadians(FinalWinkel)) * MaxSchussHoeheLuft / 2 / 3.45;
MaxSchussHoeheLuft = Math.ceil(MaxSchussHoeheLuft * 100 ) / 100;

Start = false;
}
}

// Button Funktionen
public void MorePower(){
    ExtraPower = ExtraPower + 10;
}
public void LessPower(){
    ExtraPower = ExtraPower - 10;
}
public void MoreWinkel(){
    ExtraWinkel = ExtraWinkel + 5;
}
public void LessWinkel(){
    ExtraWinkel = ExtraWinkel - 5;
}
public void StartRechnung(){
    Start = true;
}

}
