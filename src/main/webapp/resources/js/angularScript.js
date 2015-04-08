/**
 * Created by Vasiliy on 07.04.2015.
 */

var showApp = angular.module("showing",[]);

showApp.controller("showCtrl",function($scope,$http){



    $scope.isShow = false;
    $scope.color = "white";

    //$scope.greeting = {id: 'xxx', content: 'Hello World!'}



    //$http.get('/thyme/resources').success(function(data) {
    //    $scope.greeting = data;
    //})

    $scope.showing = function(){
        $scope.isShow = !($scope.isShow);
    }

    $scope.setColor = function(color){
        $scope.color = color;
    }

    $scope.getMyData = function(){
        $http.get('/thyme/resources').success(function(data) {
            $scope.greeting = data;
        })
    }

});

$(document).ready(function() {
    $('p').animate({
        fontSize: '48px'
    }, "slow");
});
//function MController($scope){
//
//    this.inv = function(){
//        $scope.isShow = !($scope.isShow)
//    };
//     //$scope.isShow = false;
//
//
//}
//
//function inverse(isShow){
//
//    return !isShow
//}