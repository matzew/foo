package org.jboss.aerogear.integration.service;

import org.jboss.aerogear.integration.model.Developer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/team")
public class TeamService {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/developers")
    public List<Developer> team() {
        List<Developer> team = new ArrayList<Developer>();

        Developer abstractj = new Developer("Bruno Oliveira", "abstractj", "https://pbs.twimg.com/profile_images/1864227872/avatar.png");
        team.add(abstractj);

        Developer balunasj = new Developer("Jay Balunas", "tech4j", "https://pbs.twimg.com/profile_images/1822424039/bio_photo_130x160.jpg");
        team.add(balunasj);

        Developer corinnekrych = new Developer("Corinne Krych", "corinnekrych", "https://pbs.twimg.com/profile_images/1804433301/corinne_1_.png");
        team.add(corinnekrych);

        Developer cvasilak = new Developer("Christos Vasilakis", "cvasilak", "https://pbs.twimg.com/profile_images/3303764456/a6476bc06717ad4c4d8eba1a9afa7c37.jpeg");
        team.add(cvasilak);

        Developer dbevenius = new Developer("Daniel Bevenius", "dbevenius", "https://pbs.twimg.com/profile_images/1129481589/Photo_on_2010-07-29_at_10.11__2.jpg");
        team.add(dbevenius);

        Developer edewit = new Developer("Erik Jan de Wit", "edewit", "https://pbs.twimg.com/profile_images/205447871/Photo_19.jpg");
        team.add(edewit);

        Developer lholmquist = new Developer("Lucas Holmquist", "sienaluke", "https://pbs.twimg.com/profile_images/3026702973/a29460575807a55269b34cb96acbe0f6.jpeg");
        team.add(lholmquist);

        Developer matzew = new Developer("Matthias Wessendorf", "mwessendorf", "https://pbs.twimg.com/profile_images/1884456959/aefd9a4b-fdb6-419a-92fe-31ddd40c860e.png");
        team.add(matzew);

        Developer passos = new Developer("Daniel Passos", "passos", "https://pbs.twimg.com/profile_images/378800000054312650/2ed585582b38130e65b772b9ff787c09.jpeg");
        team.add(passos);

        Developer qmx = new Developer("Douglas Campos", "qmx", "https://pbs.twimg.com/profile_images/378800000802700429/05ee67897e2cd187c0d5fe782b389a23.jpeg");
        team.add(qmx);

        Developer sblanc = new Developer("Sébastien Blanc", "sebi2706", "https://pbs.twimg.com/profile_images/3240490512/fbd3d9c47191ea5805deb788934680e8.jpeg");
        team.add(sblanc);

        Developer summersp = new Developer("Summers Pittman", "summerspittman", "https://pbs.twimg.com/profile_images/2936447891/ebe9da7e1797936b921fa056404d52a3.jpeg");
        team.add(summersp);

        return team;
    }

}
