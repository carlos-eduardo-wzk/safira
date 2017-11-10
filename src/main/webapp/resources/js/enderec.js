function endereco_geo(results){
 	  var streetNumber;
	  var streetName;
	  var city;
	  var state;
	  var zip;
	  var country;
	  for(var i = 0; i < results[0].address_components.length; i++){
	    for(var k = 0; k < results[0].address_components[i].types.length; k++){
	        if (results[0].address_components[i].types[k] == "street_number")
	            streetNumber = results[0].address_components[i].long_name;
	        else if (results[0].address_components[i].types[k] == "route")
	            streetName = results[0].address_components[i].short_name;
	        else if (results[0].address_components[i].types[k] == "locality")
	            city = results[0].address_components[i].long_name;
	        else if (results[0].address_components[i].types[k] == "administrative_area_level_1")
	            state = results[0].address_components[i].long_name;
	        else if (results[0].address_components[i].types[k] == "postal_code")
	            zip = results[0].address_components[i].long_name;
	        else if (results[0].address_components[i].types[k] == "country")
	            country = results[0].address_components[i].long_name;
	    }
	  }
}