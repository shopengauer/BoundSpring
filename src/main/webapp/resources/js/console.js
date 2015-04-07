/**
 * Created by Vasiliy on 06.04.2015.
 */
console.log("Hello Console");

var myfunc = function func(name,count){
    console.log(name);
    console.log(count);
}


myfunc("Wasiliy",10);
myfunc("Kukusa");

var myObject = {
    firstName: "Wasiliy",
    lastName: "Pavlov",

    myInfo: function(){console.log(this.firstName + this.lastName)}
};

myObject.myInfo();

for(var prop in myObject){
    console.log(myObject[prop]);
}

function MyController($scope){

    var guitar = ['prs','fender','gibson'];
    var isShow = false;
    $scope.myGuitars = guitar;
    $scope.isShow = isShow;
}

function clickController($scope){


}
//$http.get()