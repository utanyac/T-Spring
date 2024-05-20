users = {
   usersList : []
}

$(document).ready(function(){

    $.ajax({
        url: "/tspring/list/users",
        method: "GET",
        contentType: 'application/json',
        success: function(data){
            users.usersList =data.data;
            console.log(users.usersList);
        },error: function (xhr, status, error) {
            alert(xhr.responseText);
        }
    })

})