/**
 * Created by Vasiliy on 01.04.2015.
 */

function Hello($scope, $http) {
    $http.get('http://rest-service.guides.spring.io/greeting').
        success(function(data) {
            $scope.greeting = data;
        });
}

jQuery(document).ready(function($) {

    $('#msg').html("This is updated by jQuery")

});