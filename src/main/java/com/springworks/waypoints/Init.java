package com.springworks.waypoints;

import com.springworks.waypoints.lib.InsuranceCalculator;
import com.springworks.waypoints.lib.JSONFileReader;
import com.springworks.waypoints.model.CategoryDataPoints;
import com.springworks.waypoints.model.Points;

import java.io.IOException;

import java.util.List;

public class Init {
  public static void main(String[] args) throws IOException {
    JSONFileReader fileReader=new JSONFileReader();
    List<Points> PointsList = FileReader.fileReader();
    InsuranceCalculator insuranceCalculator= new InsuranceCalculator();
    List <CategoryDataPoints> dp= insuranceCalculator.map(pointsList);
    CategoryDataPoints categoryDataPoints = insuranceCalculator.reduce(dp).getCategoryDataPoints();
    System.out.println(categoryDataPoints);
  }
}
