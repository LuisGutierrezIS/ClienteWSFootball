package clientewsfootball;

import java.util.List;



public class ClienteWSFootball {
    public static void main(String[] args) {
        System.out.println("Yellow cards: "+yellowCardsTotal());
        List<TCountryInfo> h=countryNames(true).getTCountryInfo();
        for(TCountryInfo t: h){
            String country=t.getSName();
            System.out.println(t.getSName());
            System.out.println(allDefenders(country).getString());
        }
        
        
    }

    private static int yellowCardsTotal() {
        clientewsfootball.Info service = new clientewsfootball.Info();
        clientewsfootball.InfoSoapType port = service.getInfoSoap();
        return port.yellowCardsTotal();
    }

    private static ArrayOfString allDefenders(java.lang.String sCountryName) {
        clientewsfootball.Info service = new clientewsfootball.Info();
        clientewsfootball.InfoSoapType port = service.getInfoSoap();
        return port.allDefenders(sCountryName);
    }

    private static ArrayOftCountryInfo countryNames(boolean bWithCompetitors) {
        clientewsfootball.Info service = new clientewsfootball.Info();
        clientewsfootball.InfoSoapType port = service.getInfoSoap();
        return port.countryNames(bWithCompetitors);
    }
    
}
