app.controller('registerCtrl',function($scope,registerService){
    $scope.user={};
    $scope.register=function(user){
		registerService.insertUser(user).then(function(response){
			alert("success");
		})
	}
});
app.service("registerService",function($http){
	this.insertUser=function(user){
		return $http.post(hostUrl+"insert",user);
	}
});