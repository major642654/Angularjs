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
            		location.reload();
            		console.log("failed");
            		//window.location.href = '/Angularjs/test1.html';
            	}
            	//$location.path("/index" );
            }).error(function(){
            
                console.log("error");
            })
        }        
});
    app.controller('registCtr',function($scope,$http){
    	$scope.regist = function()
    	{
    		$http({
                url:'RegistController',
                method:'POST',
                data:{username:$scope.user,password:$scope.passwd}
            }).success(function(data){
            	if(data ==="200")
            	{
            		
            		window.location.href = '/Angularjs/login.html';
            		alert("注册成功，请登录!");
                	console.log("success");
            	}
            	
            	//$location.path("/index" );
            }).error(function(){
            
                console.log("error");
            })
    	}
   });
