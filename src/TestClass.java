public class TestClass {

	public static void main(String[] args) {
		
		TownDatabase tData = TownDatabase.getDatabase();
		
		PlaceFactory pFactory = new PlaceFactory();
		
		Town t1 = new Town("DUBLIN");
		Town t2 = new Town("CORK");
		Town t3 = new Town("GALWAY");
		Town t4 = new Town("WICKLOW");
		
		
		t1.setImage("dublin.png");
		t2.setImage("cork2.png");
		t3.setImage("galway2.png");
		t4.setImage("wicklow2.png");
		
		t1.setDescription("Dublin, capital of the Republic of Ireland, is on Ireland’s east coast at the\n"
				+ "mouth of the River Liffey. Its historic buildings include Dublin Castle, dating\n"
				+ "to the 13th century, and imposing St Patrick’s Cathedral, founded in 1191.\n"
				+ "City parks include landscaped St Stephen’s Green and huge Phoenix Park,\n"
				+ "containing Dublin Zoo. The National Museum of Ireland explores Irish\n"
				+ "heritage and culture.\n");
		
		t2.setDescription("Cork, just inland from Ireland’s southwest coast, is a university city\n"
				+ "with its centre on an island in the River Lee, connected to the sea by\n"
				+ "Cork Harbour. The castlelike 1824 Cork City Gaol once held prisoners\n"
				+ "bound for Australia, and exhibitions relay the building’s history.");
		
		t3.setDescription("Galway, a harbour city on Ireland’s west coast, sits where the River\n"
				+ "Corrib meets the Atlantic Ocean. The city’s hub is 18th-century Eyre\n"
				+ "Square a popular meeting spot surrounded by shops and traditional\n"
				+ "pubs that often offer live Irish folk music.");
		
		t4.setDescription("Wicklow is the county town of County Wicklow and the capital of the\n"
				+ "Mid-East Region in Ireland. Located south of Dublin on the east coast of\n"
				+ "the island, it has a population of 10,356 according to the 2011 census.");
		
		/////////////////////////////////////////DUBLIN//////////////////////////////////////////////////
		
		Place dhotel1 = pFactory.getPlace("Hotel");
		dhotel1.setName("The Westin Dublin\n");
		dhotel1.setDescription("Chic, modern rooms in a grand hotel with a sleek\n"
				+ "restaurant, meeting space and atrium lounge.\n");
		dhotel1.setLocation("College Green, Westmoreland Street, Dublin");
		
		Place dhotel2 = pFactory.getPlace("Hotel");
		dhotel2.setName("Dublin Skylon Hotel\n");
		dhotel2.setDescription("Chic, modern rooms in a grand hotel with a sleek\n"
				+ "restaurant, meeting space and atrium lounge.\n");
		dhotel2.setLocation("Upper Drumcondra Road Drumcondra Rd Upper,\n"
				+ "Drumcondra, Dublin 9, D09 V1Y2");
		
		
		Place drest1 = pFactory.getPlace("Restaurant");
		drest1.setName("The Vintage Kitchen\n");
		drest1.setDescription("Modern Irish dishes in a relaxed, vintage-style BYOB\n"
				+ "restaurant, plus BYO vinyl records to play.\n");
		drest1.setLocation("7 Poolbeg St, Dublin 2");
		
		Place drest2 = pFactory.getPlace("Restaurant");
		drest2.setName("Bleecker Street Cafe Bar\n");
		drest2.setDescription("Modern Irish dishes in a relaxed, vintage-style BYOB\n"
				+ "restaurant, plus BYO vinyl records to play.\n");
		drest2.setLocation("7 Poolbeg St, Dublin 2");
		
		Place dThingsToDo1 = pFactory.getPlace("Things To Do");
		dThingsToDo1.setName("The National Concert Hall\n");
		dThingsToDo1.setDescription("Elaborately fitted out venue mainly used for\n"
				+ "classical performance but also hosting opera and jazz.\n");
		dThingsToDo1.setLocation("Earlsfort Terrace, Saint Kevin's, Dublin 2");
		
		Place dThingsToDo2 = pFactory.getPlace("Things To Do");
		dThingsToDo2.setName("Dublin Zoo\n");
		dThingsToDo2.setDescription("Elaborately fitted out venue mainly used for\n"
				+ "classical performance but also hosting opera and jazz.\n");
		dThingsToDo2.setLocation("Phoenix Park, Dublin 8");
		
		Place dThingsToDo3 = pFactory.getPlace("Things To Do");
		dThingsToDo3.setName("National Aquatic Centre\n");
		dThingsToDo3.setDescription("Elaborately fitted out venue mainly used for\n"
				+ "classical performance but also hosting opera and jazz.\n");
		dThingsToDo3.setLocation("Snugborough Rd, Deanestown, Dublin 15, D15 A6WR");
		
		Place dplaceOfInterest1 = pFactory.getPlace("Places Of Interest");
		dplaceOfInterest1.setName("Guinness Storehouse\n");
		dplaceOfInterest1.setDescription("Brewery experience telling the tale of Ireland's\n"
				+ "famous beer, with tastings and a rooftop bar.\n");
		dplaceOfInterest1.setLocation("St James's Gate, Ushers, Dublin 8");
		
		///////////////////////////////////////////////CORK//////////////////////////////////////
		
		Place chotel1 = pFactory.getPlace("Hotel");
		chotel1.setName("The River Lee\n");
		chotel1.setDescription("Chic, modern rooms in a grand hotel with a sleek\n"
				+ "restaurant, meeting space and atrium lounge.\n");
		chotel1.setLocation("Western Rd, The Lough, Cork");
		
		Place chotel2 = pFactory.getPlace("Hotel");
		chotel2.setName("Maldron Hotel Cork\n");
		chotel2.setDescription("Chic, modern rooms in a grand hotel with a sleek\n"
				+ "restaurant, meeting space and atrium lounge.\n");
		chotel2.setLocation("UJohn Redmond St, Shandon, Cork");
		
		
		Place crest1 = pFactory.getPlace("Restaurant");
		crest1.setName("The Vintage Kitchen\n");
		crest1.setDescription("Modern Irish dishes in a relaxed, vintage-style BYOB\n"
				+ "restaurant, plus BYO vinyl records to play.\n");
		crest1.setLocation("7 Poolbeg St, Cork");
		
		Place crest2 = pFactory.getPlace("Restaurant");
		crest2.setName("Bleecker Street Cafe Bar\n");
		crest2.setDescription("Modern Irish dishes in a relaxed, vintage-style BYOB\n"
				+ "restaurant, plus BYO vinyl records to play.\n");
		crest2.setLocation("7 Poolbeg St, Cork");
		
		Place cThingsToDo1 = pFactory.getPlace("Things To Do");
		cThingsToDo1.setName("The National Concert Hall\n");
		cThingsToDo1.setDescription("Elaborately fitted out venue mainly used for\n"
				+ "classical performance but also hosting opera and jazz.\n");
		cThingsToDo1.setLocation("Earlsfort Terrace, Saint Kevin's, Cork");
		
		Place cThingsToDo2 = pFactory.getPlace("Things To Do");
		cThingsToDo2.setName("Dublin Zoo\n");
		cThingsToDo2.setDescription("Elaborately fitted out venue mainly used for\n"
				+ "classical performance but also hosting opera and jazz.\n");
		cThingsToDo2.setLocation("John Redmond St, Shandon, Cork");
		
		Place cThingsToDo3 = pFactory.getPlace("Things To Do");
		cThingsToDo3.setName("National Aquatic Centre\n");
		cThingsToDo3.setDescription("Elaborately fitted out venue mainly used for\n"
				+ "classical performance but also hosting opera and jazz.\n");
		cThingsToDo3.setLocation("Snugborough Rd, Deanestown, Cork");
		
		t1.addPlace(dhotel1);
		t1.addPlace(dhotel2);
		t1.addPlace(drest1);
		t1.addPlace(drest2);
		t1.addPlace(dThingsToDo1);
		t1.addPlace(dplaceOfInterest1);
		
		t2.addPlace(chotel1);
		t2.addPlace(chotel2);
		t2.addPlace(crest1);
		t2.addPlace(crest2);
		t2.addPlace(cThingsToDo1);
		
		
		
		tData.addTown(t1);
		tData.addTown(t2);
		tData.addTown(t3);
		tData.addTown(t4);
		
		
		
		BaseFrame.getMainFrame();
		
			
	}

}
