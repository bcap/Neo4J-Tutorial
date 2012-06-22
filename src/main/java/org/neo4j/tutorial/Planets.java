package org.neo4j.tutorial;

import org.neo4j.graphdb.GraphDatabaseService;
import org.neo4j.graphdb.Transaction;

import static org.neo4j.tutorial.PlanetBuilder.planet;

public class Planets
{

    private final GraphDatabaseService db;

    public Planets(GraphDatabaseService db)
    {
        this.db = db;
    }

    public void insert()
    {
        Transaction tx = db.beginTx();
        try
        {
            planet("4-X-Alpha-4").fact(db);
            planet("Abydos").fact(db);
            planet("Adipose 3").fact(db);
            planet("Agora").fact(db);
            planet("Alfava Metraxis").fact(db);
            planet("Algol").fact(db);
            planet("Alpha Canis One").fact(db);
            planet("Althrace").fact(db);
            planet("Alvega").fact(db);
            planet("Alzarius").fact(db);
            planet("Amanopia").fact(db);
            planet("Anagonia").fact(db);
            planet("Anathema").fact(db);
            planet("Androzani Major").fact(db);
            planet("Aneth").fact(db);
            planet("Anima Persis").fact(db);
            planet("Anura").fact(db);
            planet("Aractus").fact(db);
            planet("Arcadia").fact(db);
            planet("Arcateen V").fact(db);
            planet("Archetryx").fact(db);
            planet("Arden").fact(db);
            planet("Argolis").fact(db);
            planet("Argos").fact(db);
            planet("Aridius").fact(db);
            planet("Arkannis Major").fact(db);
            planet("Arkheon").fact(db);
            planet("Artaris").fact(db);
            planet("Asgard").fact(db);
            planet("Astra").fact(db);
            planet("Atrios").fact(db);
            planet("Augea ").fact(db);
            planet("Auros").fact(db);
            planet("Avalon").fact(db);
            planet("Axista Four").fact(db);
            planet("Azure").fact(db);
            planet("Balhoon").fact(db);
            planet("Bandraginus 5").fact(db);
            planet("Bandril").fact(db);
            planet("Bane World").fact(db);
            planet("Barcelona").fact(db);
            planet("Bel").fact(db);
            planet("Belannia II").fact(db);
            planet("Belannia IV").fact(db);
            planet("Belepheron").fact(db);
            planet("Bellaphores").fact(db);
            planet("Bessan").fact(db);
            planet("Beta Two").fact(db);
            planet("Betelgeuse").fact(db);
            planet("Betrushia").fact(db);
            planet("Bi").fact(db);
            planet("Blenhorm Ogin").fact(db);
            planet("Blestinu").fact(db);
            planet("Blini-Gaar").fact(db);
            planet("Bliss").fact(db);
            planet("Bonarcha Anarda").fact(db);
            planet("Boromeo").fact(db);
            planet("Bortresoye").fact(db);
            planet("Bruydac").fact(db);
            planet("Brus").fact(db);
            planet("Bouken").fact(db);
            planet("Calliopticon").fact(db);
            planet("Calufrax").fact(db);
            planet("Calufrax Minor").fact(db);
            planet("Carsus").fact(db);
            planet("Cassius").fact(db);
            planet("Castor 36").fact(db);
            planet("Castrovalva").fact(db);
            planet("Catastrophea").fact(db);
            planet("Catrigan Nova").fact(db);
            planet("Centauri Seven").fact(db);
            planet("Cep Cassalon").fact(db);
            planet("Chavic Five").fact(db);
            planet("Cheem").fact(db);
            planet("Cheetah Planet").fact(db);
            planet("Chelonia").fact(db);
            planet("Chimeria").fact(db);
            planet("Chimera IV").fact(db);
            planet("Chloris").fact(db);
            planet("Chronos").fact(db);
            planet("Cinethon").fact(db);
            planet("Clom").fact(db);
            planet("Colano Alpha").fact(db);
            planet("Collactin").fact(db);
            planet("Cotter Palluni's World").fact(db);
            planet("Crafe Tec Heydra").fact(db);
            planet("Crespallion").fact(db);
            planet("Crestus").fact(db);
            planet("Crinoth").fact(db);
            planet("Cyrennis Minima").fact(db);
            planet("Daemos").fact(db);
            planet("Dar").fact(db);
            planet("Darkheart").fact(db);
            planet("Darp").fact(db);
            planet("Darillium").fact(db);
            planet("Delphon").fact(db);
            planet("Delta Magna'").fact(db);
            planet("Desperus").fact(db);
            planet("Deva Loka").fact(db);
            planet("Dhakan").fact(db);
            planet("Diadem").fact(db);
            planet("Dido").fact(db);
            planet("Dioscuros").fact(db);
            planet("Diplos").fact(db);
            planet("Discurus").fact(db);
            planet("Draconia").fact(db);
            planet("Dramos").fact(db);
            planet("Drahva").fact(db);
            planet("Dravidia").fact(db);
            planet("Dronid").fact(db);
            planet("Duchamp 331").fact(db);
            planet("Dulkis").fact(db);
            planet("Earth").fact(db);
            planet("Eden").fact(db);
            planet("Ephte Major").fact(db);
            planet("Enlandia").fact(db);
            planet("Epsilon Four Zero Gamma").fact(db);
            planet("Esto").fact(db);
            planet("Eudamus").fact(db);
            planet("Exarius").fact(db);
            planet("Exxilon").fact(db);
            planet("Eye of Orion").fact(db);
            planet("Fagiros").fact(db);
            planet("Felspoon").fact(db);
            planet("The Fifth Planet").fact(db);
            planet("Fisar").fact(db);
            planet("Flane").fact(db);
            planet("Florana").fact(db);
            planet("Freytus").fact(db);
            planet("Frontios").fact(db);
            planet("Galaxis Bright").fact(db);
            planet("Gallifrey").fact(db);
            planet("Galsec Seven").fact(db);
            planet("Gameworld Gamma").fact(db);
            planet("Gauda Prime").fact(db);
            planet("Gidu").fact(db);
            planet("Glasson Minor").fact(db);
            planet("Golo").fact(db);
            planet("Gond Homeworld").fact(db);
            planet("Gotta Floco").fact(db);
            planet("Grajick Major").fact(db);
            planet("Granados").fact(db);
            planet("Gratt").fact(db);
            planet("Griffoth").fact(db);
            planet("Griophos").fact(db);
            planet("Grold Homeworld").fact(db);
            planet("Grolon").fact(db);
            planet("Grundle").fact(db);
            planet("Hakol (aka. Harkol)").fact(db);
            planet("Halcya").fact(db);
            planet("Halergan Three").fact(db);
            planet("Hastus Minor").fact(db);
            planet("Heaven").fact(db);
            planet("Hedron").fact(db);
            planet("Heiradi").fact(db);
            planet("Hell").fact(db);
            planet("Hermethica").fact(db);
            planet("Hurala").fact(db);
            planet("Hyspero").fact(db);
            planet("Hydropellica Hydroxi").fact(db);
            planet("Indigo 3").fact(db);
            planet("Inter Minor").fact(db);
            planet("Iphitus").fact(db);
            planet("Jaconda").fact(db);
            planet("Jahoo").fact(db);
            planet("Jalian 17").fact(db);
            planet("Jan Francis IX").fact(db);
            planet("Junk").fact(db);
            planet("Jupiter").fact(db);
            planet("Justicia").fact(db);
            planet("Kalakiki").fact(db);
            planet("Kalaya").fact(db);
            planet("Kaldor").fact(db);
            planet("Kantra").fact(db);
            planet("Kanval").fact(db);
            planet("Kapteyn 5").fact(db);
            planet("Kar-Charrat").fact(db);
            planet("Karfel").fact(db);
            planet("Karn").fact(db);
            planet("Karas don Kazra don Slava").fact(db);
            planet("Karris").fact(db);
            planet("Kas").fact(db);
            planet("Kastopheria").fact(db);
            planet("Kastria").fact(db);
            planet("Katakiki").fact(db);
            planet("Katuria").fact(db);
            planet("Kegron Pluva").fact(db);
            planet("Kem").fact(db);
            planet("Kinjana").fact(db);
            planet("Kirith").fact(db);
            planet("Klechton").fact(db);
            planet("Kolkokron").fact(db);
            planet("Kosnax").fact(db);
            planet("Kreme").fact(db);
            planet("Krillia").fact(db);
            planet("Krontep").fact(db);
            planet("Krop Tor").fact(db);
            planet("Kurhan").fact(db);
            planet("Kylos").fact(db);
            planet("Kyrol").fact(db);
            planet("Lakertya").fact(db);
            planet("Laylora").fact(db);
            planet("Leela's World").fact(db);
            planet("Lelex").fact(db);
            planet("Leophantos").fact(db);
            planet("Levithia").fact(db);
            planet("The Li").fact(db);
            planet("Limus 4").fact(db);
            planet("Livonia").fact(db);
            planet("Loam").fact(db);
            planet("Lo").fact(db);
            planet("Logopolis").fact(db);
            planet("Lonsis").fact(db);
            planet("Lowitelom").fact(db);
            planet("Lucifer").fact(db);
            planet("Lurma").fact(db);
            planet("Lvan (aka. Luan)").fact(db);
            planet("Magellan").fact(db);
            planet("Magla").fact(db);
            planet("Magnus").fact(db);
            planet("Malcassairo").fact(db);
            planet("Manussa").fact(db);
            planet("Marinus").fact(db);
            planet("Marpesia").fact(db);
            planet("Mars").fact(db);
            planet("Mechanus").fact(db);
            planet("Melagophon").fact(db);
            planet("Melissa Majoria").fact(db);
            planet("Mer").fact(db);
            planet("Mesmerus").fact(db);
            planet("Messaline").fact(db);
            planet("Metallurgis 5").fact(db);
            planet("Meta Sigmafolio").fact(db);
            planet("Meta Vorka 6").fact(db);
            planet("Mete").fact(db);
            planet("Metralu").fact(db);
            planet("Miasimia Goria").fact(db);
            planet("Midnight").fact(db);
            planet("Minyos").fact(db);
            planet("Mira").fact(db);
            planet("Mira").fact(db);
            planet("Mo").fact(db);
            planet("Mogar").fact(db);
            planet("Mondaran").fact(db);
            planet("Mondas").fact(db);
            planet("Morestra").fact(db);
            planet("Morok").fact(db);
            planet("Museum of the Last Ones").fact(db);
            planet("Muscolane").fact(db);
            planet("Myarr").fact(db);
            planet("Navaros").fact(db);
            planet("Necros").fact(db);
            planet("Nefrin").fact(db);
            planet("Neogorgon").fact(db);
            planet("New Alexandria").fact(db);
            planet("New Earth").fact(db);
            planet("New Savannah").fact(db);
            planet("New Venus").fact(db);
            planet("Nooma").fact(db);
            planet("Nyrruh 4").fact(db);
            planet("Oberon").fact(db);
            planet("Oblivion").fact(db);
            planet("Ockora").fact(db);
            planet("Ogros").fact(db);
            planet("Olympus").fact(db);
            planet("Omphalos").fact(db);
            planet("One").fact(db);
            planet("Oseidon").fact(db);
            planet("Oskerion").fact(db);
            planet("Othrys").fact(db);
            planet("Overod").fact(db);
            planet("Padrivole Regency 9").fact(db);
            planet("Pandatorea").fact(db);
            planet("Parakon").fact(db);
            planet("Paradost").fact(db);
            planet("Peladon").fact(db);
            planet("Pen Haxico 2").fact(db);
            planet("Peri").fact(db);
            planet("Phaester Osiris").fact(db);
            planet("Pheros").fact(db);
            planet("Phryxus").fact(db);
            planet("Pictos").fact(db);
            planet("Planet 1").fact(db);
            planet("Pluto").fact(db);
            planet("Polymos").fact(db);
            planet("Polongus").fact(db);
            planet("Poosh").fact(db);
            planet("Ponton").fact(db);
            planet("Posikar").fact(db);
            planet("Proamon").fact(db);
            planet("Proxima Centauri").fact(db);
            planet("Pyro Shika").fact(db);
            planet("Pyrovilia").fact(db);
            planet("Qualactin").fact(db);
            planet("Quinnis").fact(db);
            planet("Raaga").fact(db);
            planet("Rago Rago Five Six Rago").fact(db);
            planet("Ralafea").fact(db);
            planet("Ranx").fact(db);
            planet("Ravolox").fact(db);
            planet("Raxacoricofallapatorius").fact(db);
            planet("Re").fact(db);
            planet("Red Rocket Rising").fact(db);
            planet("Red Sky Lost").fact(db);
            planet("Refusis II").fact(db);
            planet("Reja Magnum").fact(db);
            planet("Rex Vox Jax").fact(db);
            planet("Rexel 4").fact(db);
            planet("Ri").fact(db);
            planet("Riftan Five").fact(db);
            planet("Rigel Beta 5").fact(db);
            planet("Rit").fact(db);
            planet("Ruta 3").fact(db);
            planet("Ruta Magnum").fact(db);
            planet("Ry'leh").fact(db);
            planet("S14").fact(db);
            planet("Salarius").fact(db);
            planet("Salostophus").fact(db);
            planet("Salvak").fact(db);
            planet("San Helios").fact(db);
            planet("San Kaloon").fact(db);
            planet("Santiny").fact(db);
            planet("Sant's World").fact(db);
            planet("Sarn").fact(db);
            planet("Saturnyne").fact(db);
            planet("Sava").fact(db);
            planet("Scalpor").fact(db);
            planet("Scrantek").fact(db);
            planet("Scotia").fact(db);
            planet("Segonax").fact(db);
            planet("Sense-Sphere").fact(db);
            planet("Shada").fact(db);
            planet("Shadmoch").fact(db);
            planet("Shallacatop").fact(db);
            planet("Shan Shen").fact(db);
            planet("Shantella Prime").fact(db);
            planet("Sigma").fact(db);
            planet("Siralos").fact(db);
            planet("Sireen").fact(db);
            planet("Sirius IV").fact(db);
            planet("Sirius V").fact(db);
            planet("Skaar").fact(db);
            planet("Skaro").fact(db);
            planet("Skonnos").fact(db);
            planet("Skythros").fact(db);
            planet("The Slough").fact(db);
            planet("Solos").fact(db);
            planet("Sontar").fact(db);
            planet("Spiridon").fact(db);
            planet("Splendurosa").fact(db);
            planet("Starfall").fact(db);
            planet("Stella Stora").fact(db);
            planet("Sto").fact(db);
            planet("Strepto").fact(db);
            planet("Stricium").fact(db);
            planet("Sunday").fact(db);
            planet("Svartos").fact(db);
            planet("Sycorax").fact(db);
            planet("Sylvaniar").fact(db);
            planet("Sza").fact(db);
            planet("Ta").fact(db);
            planet("Tara").fact(db);
            planet("Tarsius").fact(db);
            planet("Taurean Nomeworld").fact(db);
            planet("Telos").fact(db);
            planet("Tenten 10").fact(db);
            planet("Terileptus").fact(db);
            planet("Terra Alpha").fact(db);
            planet("Terra Beta").fact(db);
            planet("Terradon").fact(db);
            planet("Tersurus").fact(db);
            planet("Tetrapyriar").fact(db);
            planet("Thegeros").fact(db);
            planet("Thera").fact(db);
            planet("Therka").fact(db);
            planet("Therra").fact(db);
            planet("Thordon").fact(db);
            planet("Thoros Alpha").fact(db);
            planet("Thrace").fact(db);
            planet("Thuron").fact(db);
            planet("Tiermann's World").fact(db);
            planet("Tigella").fact(db);
            planet("Tigus").fact(db);
            planet("Tisar").fact(db);
            planet("Titan").fact(db);
            planet("Titan 3").fact(db);
            planet("Titania").fact(db);
            planet("Tokl").fact(db);
            planet("Toop").fact(db);
            planet("Torajii Alpha").fact(db);
            planet("Traken").fact(db);
            planet("Trieste").fact(db);
            planet("Tranquela").fact(db);
            planet("Trion").fact(db);
            planet("Triton").fact(db);
            planet("Tythonus").fact(db);
            planet("Um").fact(db);
            planet("Unicepter IV").fact(db);
            planet("Uranus").fact(db);
            planet("Ur").fact(db);
            planet("Usurius").fact(db);
            planet("Utopia").fact(db);
            planet("UX-4732").fact(db);
            planet("Uxarieus").fact(db);
            planet("Vampire Planet").fact(db);
            planet("Vandos").fact(db);
            planet("Varos").fact(db);
            planet("Vardon").fact(db);
            planet("Varnicon").fact(db);
            planet("Vasilip").fact(db);
            planet("Vel Consadine").fact(db);
            planet("Venessia").fact(db);
            planet("Venus").fact(db);
            planet("Verd").fact(db);
            planet("Verticulus").fact(db);
            planet("Veturia").fact(db);
            planet("Vij").fact(db);
            planet("Viperon").fact(db);
            planet("Vita 15").fact(db);
            planet("Voga").fact(db);
            planet("Volag-Noc").fact(db);
            planet("Vollotha").fact(db);
            planet("Voracia").fact(db);
            planet("Vortis").fact(db);
            planet("Vulcan").fact(db);
            planet("Vulpana").fact(db);
            planet("Wilson 1").fact(db);
            planet("Woldyhool").fact(db);
            planet("Woman Wept").fact(db);
            planet("Xenon").fact(db);
            planet("Xeros").fact(db);
            planet("Xeriphas").fact(db);
            planet("Yegros Alpha").fact(db);
            planet("Zaakros").fact(db);
            planet("Zamper").fact(db);
            planet("Zanak").fact(db);
            planet("Zazz").fact(db);
            planet("Zeen 4").fact(db);
            planet("Zeos").fact(db);
            planet("Zephon").fact(db);
            planet("Zeta Major").fact(db);
            planet("Zeta Minor").fact(db);
            planet("Zil").fact(db);
            planet("Zolfa Thura").fact(db);
            planet("Zom").fact(db);
            planet("Zygor").fact(db);

            tx.success();
        } finally
        {
            tx.finish();
        }
    }
}