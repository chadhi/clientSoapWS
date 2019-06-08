import ws.BanqueServiceService;
import ws.BanqueWS;
import ws.Compte;

import java.util.ArrayList;
import java.util.List;

public class ClientWS {

    public static void main(String[] args){
        BanqueWS stub=new BanqueServiceService().getBanqueWSPort();

        double reslt=stub.convertToDh(10);
        System.out.println(reslt);

        System.out.println("/// get compte////");
        Compte ct=stub.getCompte(1L);
        System.out.println(ct.getMontant());

        List<Compte> comptes=stub.listCompte();

        for(Compte cnt:comptes){
            System.out.println(cnt.getId());
            System.out.println(cnt.getMontant());
        }

    }
}
