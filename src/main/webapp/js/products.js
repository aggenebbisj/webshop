var webshop = angular.module('webshop', ['ngResource']);

function ProductCtrl($scope, $http) {
    $http.get('resources/products').success(function(data) {
        $scope.products = data;
    });
}