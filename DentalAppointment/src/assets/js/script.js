 
// Initializes the map
function initMap() {
  // The location of the Dentists (actually Bigfoot's location)
  var Barnsley = {lat: 53.555306, lng: -1.479083};
  // The map, centered at Bigfoot's location
  var map = new google.maps.Map(
      document.getElementById('map'), {zoom: 11, center: Barnsley});
  // The marker, positioned at Bigfoot's location
  var marker = new google.maps.Marker({position: Barnsley, map: map});
}

// Code below allows the modal to appear in front of the menu as it's hidden on a mobile device preventing a user from entering information.

 $("form :input").each(function(index, elem) {
    var eId = $(elem).attr("id");
    var label = null;
    if (eId && (label = $(elem).parents("form").find("label[for="+eId+"]")).length == 1) {
        $(elem).attr("placeholder", $(label).html());
        $(label).remove();
    }
 });

 $("#login-modal", context).appendTo("body").css("z-index", "2000").focus();
   
        jQuery(document).ready(function($) {
        	$("#login-modal").modal('show').focus();
        });
      