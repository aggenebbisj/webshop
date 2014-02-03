"use strict";

var webshop = angular.module('webshop', ['ngResource', 'webshopServices']);

webshop.controller('ProductCtrl', function($scope, ProductsService) {
    $scope.products = ProductsService.query();
});