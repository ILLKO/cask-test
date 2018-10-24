window.onload = function() {
    var myImage = document.querySelector('img');
    var imgUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/American_Water_Spaniel_Puppies_01.jpg/800px-American_Water_Spaniel_Puppies_01.jpg"
    fetch(imgUrl).then(function(response) {
        return response.blob();
    }).then(function(myBlob) {
        var objectURL = URL.createObjectURL(myBlob);
        myImage.src = objectURL;
    });
};