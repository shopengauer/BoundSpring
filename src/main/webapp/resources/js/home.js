/**
 * Created by Vasiliy on 01.04.2015.
 */
//var app = angular.module('StarterApp',['ngMaterial']);

//app.controller()

angular.module('StarterApp',[]).controller('Hello',function Hello($scope, $http) {
        $http.get('http://rest-service.guides.spring.io/greeting').
            success(function(data) {
                $scope.greeting = data;
            });
    }
)


//function Hello($scope, $http) {
//    $http.get('http://rest-service.guides.spring.io/greeting').
//        success(function(data) {
//            $scope.greeting = data;
//        });
//}

jQuery(document).ready(function($) {

    $('#msg').html("This is updated by jQuery")
    alert(!"Attention");
});