var app = angular.module('DanceApp', ['ui.router','ngMaterial','smart-table','ngAnimate','ngMaterialDatePicker','ngSanitize']);

/*var hostUrl="http://139.162.13.215:8063/";*/
var hostUrl="http://localhost:8082/";
app.config(function($stateProvider, $urlRouterProvider,$mdDateLocaleProvider) {

    $urlRouterProvider.otherwise('/home');

    $stateProvider
    .state('home',{
        url:'/home',
        templateUrl:'resources/modules/home/home.html'
    }) 
    
    $stateProvider
    .state('about',{
        url:'/about',
        templateUrl:'resources/modules/about/about.html'
    }) 
    $stateProvider
    .state('contact',{
        url:'/contact',
        templateUrl:'resources/modules/contact/contact.html'
    }) 
    $stateProvider
    .state('login',{
        url:'/login',
        templateUrl:'resources/modules/login/login.html'
    }) 
    $stateProvider
    .state('postJob',{
        url:'/postJob',
        templateUrl:'resources/modules/postJob/postJob.html'
    }) 
    $stateProvider
    .state('findJob',{
        url:'/findJob',
        templateUrl:'resources/modules/findJob/findJob.html'
    }) 
    $stateProvider
    .state('jobListing',{
        url:'/jobListing',
        templateUrl:'resources/modules/jobListing/jobListing.html'
    }) 
     $stateProvider
    .state('admin',{
        url:'/admin',
        templateUrl:'resources/modules/admin/admin.html'
    }) 
});

