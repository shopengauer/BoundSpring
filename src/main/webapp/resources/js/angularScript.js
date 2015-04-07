/**
 * Created by Vasiliy on 07.04.2015.
 */
var showApp = angular.module("showing",[]);

showApp.controller("showCtrl",function($scope){
    $scope.isShow = false;
    $scope.show = function(){
        $scope.isShow = !($scope.isShow);
    }

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