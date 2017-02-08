 var app = angular.module('app', ['ngRoute']);
 app.config(['$routeProvider', function ($routeProvider) {
	    //这里指定路由
	    $routeProvider
	        .when('/index', {
	            templateUrl: '/index.html',
	            controller: 'LoginCtr'
	        })
	}]);
