var app = angular.module("myApp", []);
app.controller("productController",function($scope,$http) {
	$http({
		url:'IndexController',
		method:'POST'
	}).success(function(response){
		$scope.products = response;
	})
	//$scope.products = products; //Angular自动注入
	//排序条件
	$scope.order = "-"; //默认是升序,-表示降序
	$scope.orderType = "id"; //以id来排序,不能直接在页面以id这个字段排序
	$scope.changeOrder = function(type) {
		$scope.orderType = type;
		//如果本来是降序，就变为升序，如果是升序，就变为降序
		if ($scope.order === '') {
			$scope.order = '-';
		} else {
			$scope.order = '';
		}
	}
});