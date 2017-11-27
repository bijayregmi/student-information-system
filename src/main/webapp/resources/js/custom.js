//"use strict";

$(function() {
	
});

function updateStudent(URL) {
    $.ajax({
        type: 'PUT',
        contentType: 'application/json',
        url: URL+"/students",
        dataType: "json",
        data: formToJSON(),
        success: function(data, textStatus, jqXHR){
            window.location.replace(URL);
        },
        error: function(jqXHR, textStatus, errorThrown){
            alert('updateStudent error: ' + textStatus);
        }
    });
}

//Helper function to serialize all the form fields into a JSON string
function formToJSON() {
    return JSON.stringify({
	        "id": $('#id').val(),
	        "firstName": $('#firstName').val(),
	        "lastName": $('#lastName').val()
        });
}