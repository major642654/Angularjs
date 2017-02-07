var app = angular.module('myApp', []);
    app.controller('loginCtr', function($scope,$http) {
        $scope.login=function()     
        {
            $http({
                url:'LoginController',
                method:'POST',
               
                data:{username:$scope.username,password:$scope.password}
                //dataType:'json'
            }).success(function(data){
                if(data == "123aaaa")
                {
                	 alert("登录成功");
                }
                
            }).error(function(){
                console.log("error");
            })
        }


        /*   {
    	var formData = {
    			"name":$scope.username,
    			"password":$scope.password
    	};
    	var response = $http.post('/LoginController',formData);
    	response.success(function(data){
    		console.log(data);
    	});
    	response.error(function(){
    		console.log("error");
    	});
    }
    */
        
        
  /*     $scope.reset = function(){
                  //alert($username);
        $scope.resetInfo = function()
        {
            $scope.username="";
            $scope.password="";
        }
        $scope.submit = function()
        {
            var postData = "?username="+$scope.username+"$"+"password="+$scope.password;
            var url = "LoginServlet"+postData;
            $http.post(url).success(function(postData){
                alert(postData);
            })
        }
   }*/
});