var app = angular.module('myApp', []);
    app.controller('loginCtr', function($scope,$http,$location) {
        $scope.login=function()     
        {
            $http({
                url:'LoginController',
                method:'POST',
                data:{username:$scope.username,password:$scope.password}
            }).success(function(data){
            	if(data ==="200")
            	{
            		window.location.href = '/Angularjs/index.html';
                	console.log("success");
            	}
            	else
            	{
            		
            		console.log("failed");
            		window.location.href = '/Angularjs/test1.html';
            	}
            	//$location.path("/index" );
            }).error(function(){
            
                console.log("error");
            })
        }
});
