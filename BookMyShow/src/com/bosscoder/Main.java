package com.bosscoder;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //Register user



        ISearchService searchService = new SearchService();
        String city = "abc";
        List<Movie> restList = searchService.searchMovieByCity(city);



        // take input
        // fetch ur rest --->
        OrderingService orderingService = new OrderServiceImpl()

        orderingService.placeOrder(restaurant, order);

    }
}
