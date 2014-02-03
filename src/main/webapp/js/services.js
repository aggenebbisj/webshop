"use strict";

var services = angular.module('webshopServices', ['ngResource']);

services.factory('ProductsService', ['$resource',
    function($resource) {
        return $resource('resources/products', {
            query: {method: 'GET', params: {}, isArray: true}
        });
    }]);
