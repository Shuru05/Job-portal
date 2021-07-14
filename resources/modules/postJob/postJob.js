app.controller('postJobController',function($scope,postJobService){
	$scope.job={};
	$scope.saveJob=function(job){
		postJobService.insertJob(job).then(function(response){
			alert("success");
		})
	}
});
app.service("postJobService",function($http){
	this.insertJob=function(job){
		return $http.post(hostUrl+"addJob",job);
	}
});