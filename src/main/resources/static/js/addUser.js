$(document).ready(function () {

    $('#addUserForm').submit(function (e) {
        e.preventDefault();
        let formDataArray = $('#addUserForm').serializeArray();
        console.log("formData", formDataArray)
        let postData = {};
        $.each(formDataArray, function (index, field) {
            postData[field.name] = field.value
        })
        console.log("postData", postData);

        $.ajax({
            url: '/tspring/add/user',
            type: 'POST',
            data: JSON.stringify(postData),
            contentType: 'application/json',
            success: function (response) {
                alert(response);
            },
            error: function (response) {
                alert(response);
            }
        })
    })

    $('#addUserButton').click(function (e) {
        e.preventDefault();
        $('#addUserForm').submit();
    })
})