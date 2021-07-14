app.controller('AdminCtrl',function($scope,adminService){
    $scope.user={};
    $scope.deleteUser=function(user){
        adminService.deleteUser(user).then(function(response){
            alert("success");
        })
    }
     $scope.deleteUser=function(user){
        adminService.insertUser(user).then(function(response){
            alert("success");
        })
    }
});
app.service("adminService",function($http){
    this.deleteUser=function(user){
    	alert("login successfully");
        return $http.post(hostUrl+"insert",user);
    }
});